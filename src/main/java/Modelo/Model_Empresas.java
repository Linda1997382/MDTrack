package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mdtrack.Conexion;

public class Model_Empresas {

    // ===================== GUARDAR EMPRESA =====================
    public static boolean guardarEmpresa(Map<String,Object> datos) {
        // VALIDACIONES ANTES de insertar
        String nombre = safe(datos.get("nombre"));
        String responsable = safe(datos.get("nombre_responsable"));
        String correo = safe(datos.get("correo_responsable"));
        
        // Validar campos obligatorios
        if (nombre.isEmpty()) {
            System.err.println("Error: El nombre de la empresa es obligatorio");
            return false;
        }
        
        if (responsable.isEmpty()) {
            System.err.println("Error: El nombre del responsable es obligatorio");
            return false;
        }
        
        // Validar que el nombre no exista
        if (nombreEmpresaExiste(nombre, null)) {
            System.err.println("Error: Ya existe una empresa con ese nombre");
            return false;
        }
        
        // Validar email si se proporcionó
        if (!correo.isEmpty() && !validarEmail(correo)) {
            System.err.println("Error: Formato de correo inválido");
            return false;
        }

        String sql = "INSERT INTO empresa (nombre, correo_responsable, nombre_responsable, telefono_responsable, direccion) " +
                     "VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            stmt.setString(3, responsable);
            stmt.setString(4, safe(datos.get("telefono_responsable")));
            stmt.setString(5, safe(datos.get("direccion")));

            int aff = stmt.executeUpdate();
            if (aff > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) datos.put("id_empresa", rs.getInt(1));
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error guardarEmpresa: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return false;
    }

    // ===================== VALIDAR EMAIL =====================
    private static boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) return true; // Email vacío es válido (no obligatorio)
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(emailRegex);
    }

    // ===================== OBTENER EMPRESA POR ID =====================
    public static Map<String,Object> obtenerEmpresaPorId(int idEmpresa) {
        String sql = "SELECT * FROM empresa WHERE id_empresa = ?";
        Map<String,Object> out = new HashMap<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idEmpresa);
            rs = stmt.executeQuery();

            if (rs.next()) {
                out.put("id_empresa", rs.getInt("id_empresa"));
                out.put("nombre", rs.getString("nombre"));
                out.put("correo_responsable", rs.getString("correo_responsable"));
                out.put("nombre_responsable", rs.getString("nombre_responsable"));
                out.put("telefono_responsable", rs.getString("telefono_responsable"));
                out.put("direccion", rs.getString("direccion"));
                out.put("estado", rs.getString("estado"));
                out.put("created_at", rs.getTimestamp("created_at"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerEmpresaPorId: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return out.isEmpty() ? null : out;
    }

    // ===================== LISTA PARA COMBOBOX =====================
    public static List<EmpresaItem> traerEmpresas() {
        List<EmpresaItem> list = new ArrayList<>();
        String sql = "SELECT id_empresa, nombre FROM empresa WHERE estado = 'Activa' ORDER BY nombre";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(new EmpresaItem(rs.getInt("id_empresa"), rs.getString("nombre")));
            }

        } catch (SQLException e) {
            System.err.println("Error traerEmpresas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return list;
    }

    // ===================== SOLO NOMBRES (STRINGS) =====================
    public static List<String> traerNombresEmpresas() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT nombre FROM empresa WHERE estado = 'Activa' ORDER BY nombre";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                if (nombre != null) list.add(nombre);
            }

        } catch (SQLException e) {
            System.err.println("Error traerNombresEmpresas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return list;
    }

    // ===================== CARGAR TABLA =====================
    public static void cargarTablaEmpresas(JTable table) {
        String sql = "SELECT id_empresa, nombre, nombre_responsable, telefono_responsable, correo_responsable " +
                     "FROM empresa WHERE estado = 'Activa' ORDER BY nombre";

        new Thread(() -> {
            List<Object[]> datos = new ArrayList<>();
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                conn = Conexion.conectar();
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    datos.add(new Object[]{
                        rs.getInt("id_empresa"),
                        rs.getString("nombre"),
                        rs.getString("nombre_responsable"),
                        rs.getString("telefono_responsable"),
                        rs.getString("correo_responsable")
                    });
                }

            } catch (SQLException e) {
                System.err.println("Error cargarTablaEmpresas: " + e.getMessage());
                e.printStackTrace();
            } finally {
                cerrarRecursos(rs, stmt, conn);
            }

            SwingUtilities.invokeLater(() -> actualizarTablaConDatos(table, datos));
        }).start();
    }

    // ===================== ACTUALIZAR EMPRESA =====================
    public static boolean actualizarEmpresa(int idEmpresa, Map<String,Object> datos) {
        // Validaciones para actualización
        String nombre = safe(datos.get("nombre"));
        String responsable = safe(datos.get("nombre_responsable"));
        String correo = safe(datos.get("correo_responsable"));
        
        if (nombre.isEmpty()) {
            System.err.println("Error: El nombre de la empresa es obligatorio");
            return false;
        }
        
        if (responsable.isEmpty()) {
            System.err.println("Error: El nombre del responsable es obligatorio");
            return false;
        }
        
        if (nombreEmpresaExiste(nombre, idEmpresa)) {
            System.err.println("Error: Ya existe una empresa con ese nombre");
            return false;
        }
        
        if (!correo.isEmpty() && !validarEmail(correo)) {
            System.err.println("Error: Formato de correo inválido");
            return false;
        }

        String sql = "UPDATE empresa SET nombre = ?, correo_responsable = ?, nombre_responsable = ?, telefono_responsable = ?, direccion = ? " +
                     "WHERE id_empresa = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            stmt.setString(3, responsable);
            stmt.setString(4, safe(datos.get("telefono_responsable")));
            stmt.setString(5, safe(datos.get("direccion")));
            stmt.setInt(6, idEmpresa);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error actualizarEmpresa: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== BAJA LÓGICA =====================
    public static boolean eliminarEmpresa(int idEmpresa) {
        String sql = "UPDATE empresa SET estado = 'Inactiva' WHERE id_empresa = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idEmpresa);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error eliminarEmpresa: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== BUSCAR EMPRESAS =====================
    public static List<Map<String, Object>> buscarEmpresas(String criterio) {
        List<Map<String, Object>> empresas = new ArrayList<>();
        String sql = "SELECT id_empresa, nombre, nombre_responsable, telefono_responsable, correo_responsable " +
                     "FROM empresa WHERE (nombre LIKE ? OR nombre_responsable LIKE ?) AND estado = 'Activa' " +
                     "ORDER BY nombre";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            String likeCriterio = "%" + criterio + "%";
            stmt.setString(1, likeCriterio);
            stmt.setString(2, likeCriterio);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> empresa = new HashMap<>();
                empresa.put("id_empresa", rs.getInt("id_empresa"));
                empresa.put("nombre", rs.getString("nombre"));
                empresa.put("nombre_responsable", rs.getString("nombre_responsable"));
                empresa.put("telefono_responsable", rs.getString("telefono_responsable"));
                empresa.put("correo_responsable", rs.getString("correo_responsable"));
                empresas.add(empresa);
            }

        } catch (SQLException e) {
            System.err.println("Error buscarEmpresas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return empresas;
    }

    // ===================== VALIDAR NOMBRE ÚNICO =====================
    public static boolean nombreEmpresaExiste(String nombre, Integer idExcluir) {
        String sql = "SELECT COUNT(*) as count FROM empresa WHERE nombre = ? AND estado = 'Activa'";
        if (idExcluir != null) {
            sql += " AND id_empresa != ?";
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, nombre.trim());
            if (idExcluir != null) {
                stmt.setInt(2, idExcluir);
            }

            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("count") > 0;
            }

        } catch (SQLException e) {
            System.err.println("Error nombreEmpresaExiste: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return false;
    }

    // ===================== OBTENER ESTADÍSTICAS =====================
    public static Map<String, Object> obtenerEstadisticasEmpresas() {
        Map<String, Object> stats = new HashMap<>();
        String sql = "SELECT " +
                     "COUNT(*) as total_empresas, " +
                     "COUNT(DISTINCT p.id_paciente) as total_pacientes, " +
                     "COUNT(DISTINCT e.id_empleado) as total_empleados " +
                     "FROM empresa emp " +
                     "LEFT JOIN paciente p ON emp.id_empresa = p.id_empresa " +
                     "LEFT JOIN empleado e ON emp.id_empresa = e.id_empresa " +
                     "WHERE emp.estado = 'Activa'";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs.next()) {
                stats.put("total_empresas", rs.getInt("total_empresas"));
                stats.put("total_pacientes", rs.getInt("total_pacientes"));
                stats.put("total_empleados", rs.getInt("total_empleados"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerEstadisticasEmpresas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return stats;
    }

    // ===================== OBJETO PARA COMBOBOX =====================
    public static class EmpresaItem {
        private final int id;
        private final String nombre;

        public EmpresaItem(int id, String nombre) {
            this.id = id;
            this.nombre = nombre == null ? "" : nombre;
        }

        public int getId() { return id; }
        public String getNombre() { return nombre; }

        @Override
        public String toString() { return nombre; }
    }

    // ===================== AUXILIARES =====================
    private static void actualizarTablaConDatos(JTable table, List<Object[]> datos) {
        String[] cols = {
            "ID",
            "Nombre de la empresa",
            "Responsable",
            "Teléfono",
            "Correo electrónico"
        };

        DefaultTableModel model = new DefaultTableModel(cols, 0) {
            @Override 
            public boolean isCellEditable(int r, int c){ 
                return false; 
            }
        };

        for (Object[] fila : datos) {
            model.addRow(fila);
        }
        
        table.setModel(model);

        // Ocultar ID como en tus otros modelos
        ocultarColumnaId(table, 0);
    }

    private static void ocultarColumnaId(JTable table, int columna) {
        try {
            table.getColumnModel().getColumn(columna).setMinWidth(0);
            table.getColumnModel().getColumn(columna).setMaxWidth(0);
            table.getColumnModel().getColumn(columna).setPreferredWidth(0);
        } catch (Exception e) {
            System.err.println("Error ocultando columna: " + e.getMessage());
        }
    }

    private static String safe(Object obj) {
        if (obj == null) return "";
        String str = obj.toString().trim();
        return str.equals("null") ? "" : str;
    }

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
        
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando Connection: " + e.getMessage());
        }
    }
}