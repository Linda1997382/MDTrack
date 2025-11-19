package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.mycompany.mdtrack.Conexion;

public class Model_Reportes {

    public static class ItemCombo {
        public final String id;
        public final String label;
        public ItemCombo(String id, String label) { 
            this.id = id; 
            this.label = label; 
        }
        @Override public String toString() { return label; }
    }

    // ===================== Combos =====================

    public static List<ItemCombo> listarEmpresas() {
        List<ItemCombo> out = new ArrayList<>();
        out.add(new ItemCombo(null, "Todas"));

        String sql = "SELECT id_empresa, nombre FROM empresa WHERE estado = 'Activa' ORDER BY nombre";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                out.add(new ItemCombo(
                    String.valueOf(rs.getInt("id_empresa")), 
                    rs.getString("nombre")
                ));
            }
            
        } catch (SQLException e) {
            System.err.println("Error al listar empresas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return out;
    }

    public static List<Integer> aniosDisponibles() {
        TreeSet<Integer> years = new TreeSet<>(Comparator.reverseOrder());

        String sql = "SELECT YEAR(con.fecha_registro) as anio FROM consulta con " +
                    "GROUP BY YEAR(con.fecha_registro) " +
                    "ORDER BY anio DESC";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                years.add(rs.getInt("anio"));
            }
            
        } catch (SQLException e) {
            System.err.println("Error al obtener años disponibles: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        if (years.isEmpty()) {
            int currentYear = Year.now().getValue();
            for (int i = 0; i < 5; i++) {
                years.add(currentYear - i);
            }
        }
        
        return new ArrayList<>(years);
    }

    // ===================== Tabla de Reportes =====================

    public static List<Map<String, Object>> consultasFiltradas(String empresaId, Integer mes, Integer anio) {
        List<Map<String, Object>> rows = new ArrayList<>();
        
        System.out.println("=== DEBUG Model_Reportes.consultasFiltradas ===");
        System.out.println("Parámetros - Empresa: " + empresaId + ", Mes: " + mes + ", Año: " + anio);
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT con.fecha_registro as fecha, ");
        sql.append("p.nombres as paciente_nombre, p.apellido_paterno, p.apellido_materno, ");
        sql.append("emp.nombre as empresa_nombre, ");
        sql.append("e.nombres as medico_nombre, e.apellido_paterno as med_ap_pat, e.apellido_materno as med_ap_mat ");
        sql.append("FROM consulta con ");
        sql.append("JOIN cita cit ON con.id_cita = cit.id_cita ");
        sql.append("JOIN paciente p ON cit.id_paciente = p.id_paciente ");
        sql.append("LEFT JOIN empresa emp ON p.id_empresa = emp.id_empresa ");
        sql.append("LEFT JOIN empleado e ON con.id_medico = e.id_empleado ");
        sql.append("WHERE 1=1 ");
        
        if (empresaId != null && !empresaId.isEmpty()) {
            sql.append("AND p.id_empresa = ? ");
        }
        if (mes != null && anio != null) {
            sql.append("AND MONTH(con.fecha_registro) = ? AND YEAR(con.fecha_registro) = ? ");
        }
        sql.append("ORDER BY con.fecha_registro DESC ");
        sql.append("LIMIT 100");
        
        System.out.println("SQL: " + sql.toString());
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            // ✅ Cargar driver MySQL primero
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println(" Driver MySQL cargado");
            } catch (ClassNotFoundException e) {
                System.err.println(" Error cargando driver MySQL: " + e.getMessage());
                throw new SQLException("Driver MySQL no encontrado");
            }
            
            //  Conexión INDEPENDIENTE para este método
            String url = "jdbc:mysql://localhost:3306/medtrack?" +
                        "useUnicode=true&characterEncoding=UTF-8&useSSL=false&" +
                        "allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&" +
                        "useLegacyDatetimeCode=false&serverTimezone=UTC&nullNamePatternMatchesAll=true";
            
            conn = DriverManager.getConnection(url, "medtrack_user", "medtrack123");
            System.out.println(" Conexión establecida (independiente)");
            
            stmt = conn.prepareStatement(sql.toString());
            
            int paramIndex = 1;
            if (empresaId != null && !empresaId.isEmpty()) {
                stmt.setInt(paramIndex++, Integer.parseInt(empresaId));
                System.out.println(" Filtro empresa: " + empresaId);
            }
            if (mes != null && anio != null) {
                stmt.setInt(paramIndex++, mes);
                stmt.setInt(paramIndex++, anio);
                System.out.println(" Filtro fecha: Mes " + mes + ", Año " + anio);
            }
            
            rs = stmt.executeQuery();
            System.out.println(" Query ejecutada exitosamente");
            
            int count = 0;
            while (rs.next()) {
                count++;
                Map<String, Object> row = new HashMap<>();
                
                // Fecha
                row.put("fecha", rs.getTimestamp("fecha"));
                System.out.println(" Fecha: " + rs.getTimestamp("fecha"));
                
                // Paciente
                String pacienteNombre = fullName(
                    rs.getString("paciente_nombre"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno")
                );
                row.put("paciente", pacienteNombre);
                System.out.println(" Paciente: " + pacienteNombre);
                
                // Empresa
                String empresa = rs.getString("empresa_nombre");
                row.put("empresa", empresa != null ? empresa : "Sin empresa");
                System.out.println(" Empresa: " + empresa);
                
                // Médico
                String medicoNombre = fullName(
                    rs.getString("medico_nombre"),
                    rs.getString("med_ap_pat"),
                    rs.getString("med_ap_mat")
                );
                row.put("medico", medicoNombre != null ? medicoNombre : "No asignado");
                System.out.println(" Médico: " + medicoNombre);
                
                rows.add(row);
                System.out.println("---");
            }
            
            System.out.println(" " + count + " registros encontrados y procesados");
            
        } catch (SQLException e) {
            System.err.println(" Error SQL en consultasFiltradas: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(" Error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            //  Cerrar recursos de ESTA conexión independiente
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println("Error cerrando ResultSet: " + e.getMessage());
            }
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                System.err.println("Error cerrando PreparedStatement: " + e.getMessage());
            }
            try {
                if (conn != null) conn.close();
                System.out.println(" Conexión independiente cerrada");
            } catch (SQLException e) {
                System.err.println("Error cerrando Connection: " + e.getMessage());
            }
        }
        
        return rows;
    }

    // ===================== Cards/Estadísticas =====================

    public static long contarHoy(String empresaId) {
        String sql = "SELECT COUNT(*) as total FROM consulta con " +
                    "JOIN cita cit ON con.id_cita = cit.id_cita " +
                    "JOIN paciente p ON cit.id_paciente = p.id_paciente " +
                    "WHERE DATE(con.fecha_registro) = CURDATE() ";
        
        if (empresaId != null && !empresaId.isEmpty()) {
            sql += "AND p.id_empresa = ?";
        }
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            //  Usar conexión independiente también aquí
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver MySQL no encontrado");
            }
            
            String url = "jdbc:mysql://localhost:3306/medtrack?" +
                        "useUnicode=true&characterEncoding=UTF-8&useSSL=false&" +
                        "allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&" +
                        "useLegacyDatetimeCode=false&serverTimezone=UTC&nullNamePatternMatchesAll=true";
            
            conn = DriverManager.getConnection(url, "medtrack_user", "medtrack123");
            
            stmt = conn.prepareStatement(sql);
            
            if (empresaId != null && !empresaId.isEmpty()) {
                stmt.setInt(1, Integer.parseInt(empresaId));
            }
            
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getLong("total");
            }
            
        } catch (SQLException e) {
            System.err.println("Error al contar consultas de hoy: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursosIndependientes(rs, stmt, conn);
        }
        return 0;
    }

    public static long contarMes(String empresaId, Integer mes, Integer anio) {
        if (mes == null || anio == null) {
            LocalDate now = LocalDate.now();
            mes = now.getMonthValue();
            anio = now.getYear();
        }
        
        String sql = "SELECT COUNT(*) as total FROM consulta con " +
                    "JOIN cita cit ON con.id_cita = cit.id_cita " +
                    "JOIN paciente p ON cit.id_paciente = p.id_paciente " +
                    "WHERE MONTH(con.fecha_registro) = ? AND YEAR(con.fecha_registro) = ? ";
        
        if (empresaId != null && !empresaId.isEmpty()) {
            sql += "AND p.id_empresa = ?";
        }
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            //  Usar conexión independiente también aquí
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver MySQL no encontrado");
            }
            
            String url = "jdbc:mysql://localhost:3306/medtrack?" +
                        "useUnicode=true&characterEncoding=UTF-8&useSSL=false&" +
                        "allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&" +
                        "useLegacyDatetimeCode=false&serverTimezone=UTC&nullNamePatternMatchesAll=true";
            
            conn = DriverManager.getConnection(url, "medtrack_user", "medtrack123");
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, mes);
            stmt.setInt(2, anio);
            
            if (empresaId != null && !empresaId.isEmpty()) {
                stmt.setInt(3, Integer.parseInt(empresaId));
            }
            
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getLong("total");
            }
            
        } catch (SQLException e) {
            System.err.println("Error al contar consultas del mes: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursosIndependientes(rs, stmt, conn);
        }
        return 0;
    }

    // ===================== Métodos Auxiliares =====================

    private static String fullName(String... parts) {
        if (parts == null || parts.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (part != null && !part.trim().isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(part.trim());
            }
        }
        return sb.toString();
    }

    //  Método ORIGINAL para conexiones compartidas (usado en combos)
    private static void cerrarRecursos(ResultSet rs, PreparedStatement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando ResultSet: " + e.getMessage());
        }
        
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando PreparedStatement: " + e.getMessage());
        }
        
        //  NO cerrar Connection aquí para conexiones compartidas
        // try {
        //     if (conn != null) conn.close();
        // } catch (SQLException e) {
        //     System.err.println("Error cerrando Connection: " + e.getMessage());
        // }
    }

    //  NUEVO método para conexiones INDEPENDIENTES (usado en consultas principales)
    private static void cerrarRecursosIndependientes(ResultSet rs, PreparedStatement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando ResultSet: " + e.getMessage());
        }
        
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando PreparedStatement: " + e.getMessage());
        }
        
        try {
            if (conn != null) conn.close();
            System.out.println(" Conexión independiente cerrada");
        } catch (SQLException e) {
            System.err.println("Error cerrando Connection: " + e.getMessage());
        }
    }
}