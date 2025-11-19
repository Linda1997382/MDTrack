package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mdtrack.Conexion;

public class Model_Consultas {

    // ===================== LISTAR CONSULTAS DE PACIENTE =====================
    public static List<Object[]> listarConsultasDePaciente(int pacienteId) {
        List<Object[]> consultas = new ArrayList<>();
        String sql = "SELECT " +
                     "con.id_consulta, " +
                     "p.id_paciente, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "emp.nombre as empresa_nombre, " +
                     "con.fecha_registro, " +
                     "con.motivo " +
                     "FROM consulta con " +
                     "JOIN cita c ON con.id_cita = c.id_cita " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN empresa emp ON p.id_empresa = emp.id_empresa " +
                     "WHERE p.id_paciente = ? " +
                     "ORDER BY con.fecha_registro DESC";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            while (rs.next()) {
                String fechaFormateada = "";
                java.sql.Timestamp fechaSql = rs.getTimestamp("fecha_registro");
                if (fechaSql != null) {
                    fechaFormateada = dateFormat.format(fechaSql);
                }

                Object[] row = {
                    rs.getInt("id_consulta"),
                    rs.getInt("id_paciente"),
                    rs.getString("paciente_nombre"),
                    rs.getString("empresa_nombre"),
                    fechaFormateada,
                    rs.getString("motivo")
                };
                consultas.add(row);
            }

        } catch (SQLException e) {
            System.err.println("Error listarConsultasDePaciente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return consultas;
    }

    // ===================== OBTENER DETALLES DE CONSULTA =====================
    public static Map<String, Object> obtenerDetallesConsulta(int consultaId) {
        String sql = "SELECT " +
                     "con.*, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "CONCAT(e.nombres, ' ', COALESCE(e.apellido_paterno, ''), ' ', COALESCE(e.apellido_materno, '')) as medico_nombre, " +
                     "p.id_paciente " +
                     "FROM consulta con " +
                     "JOIN cita c ON con.id_cita = c.id_cita " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN empleado e ON con.id_medico = e.id_empleado " +
                     "WHERE con.id_consulta = ?";

        Map<String, Object> detalles = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, consultaId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                detalles.put("id_consulta", rs.getInt("id_consulta"));
                detalles.put("id_paciente", rs.getInt("id_paciente"));
                detalles.put("paciente_nombre", rs.getString("paciente_nombre"));
                detalles.put("medico_nombre", rs.getString("medico_nombre"));
                detalles.put("fecha_registro", rs.getTimestamp("fecha_registro"));
                detalles.put("motivo", rs.getString("motivo"));
                detalles.put("sintomas", rs.getString("sintomas"));
                detalles.put("signos_vitales", rs.getString("signos_vitales"));
                detalles.put("exploracion_fisica", rs.getString("exploracion_fisica"));
                detalles.put("diagnostico", rs.getString("diagnostico"));
                detalles.put("indicaciones_medicas", rs.getString("indicaciones_medicas"));
                detalles.put("restricciones_medicas", rs.getString("restricciones_medicas"));
                detalles.put("medicacion_prescrita", rs.getString("medicacion_prescrita"));
                detalles.put("pronostico", rs.getString("pronostico"));
                detalles.put("id_cita", rs.getInt("id_cita"));
                detalles.put("id_medico", rs.getInt("id_medico"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerDetallesConsulta: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return detalles.isEmpty() ? null : detalles;
    }

    // ===================== OBTENER CONSULTA POR ID (COMPLETA) =====================
    public static Map<String, Object> obtenerConsultaPorId(int consultaId) {
        String sql = "SELECT " +
                     "con.*, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "CONCAT(e.nombres, ' ', COALESCE(e.apellido_paterno, ''), ' ', COALESCE(e.apellido_materno, '')) as medico_nombre, " +
                     "p.id_paciente, " +
                     "hm.peso, hm.altura, hm.tipo_sangre " +
                     "FROM consulta con " +
                     "JOIN cita c ON con.id_cita = c.id_cita " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN empleado e ON con.id_medico = e.id_empleado " +
                     "LEFT JOIN historial_medico hm ON p.id_paciente = hm.id_paciente " +
                     "WHERE con.id_consulta = ?";

        Map<String, Object> detalles = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, consultaId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Campos básicos de consulta
                detalles.put("id_consulta", rs.getInt("id_consulta"));
                detalles.put("id_paciente", rs.getInt("id_paciente"));
                detalles.put("paciente_nombre", rs.getString("paciente_nombre"));
                detalles.put("medico_nombre", rs.getString("medico_nombre"));
                detalles.put("fecha_registro", rs.getTimestamp("fecha_registro"));
                detalles.put("motivo", rs.getString("motivo"));
                detalles.put("sintomas", rs.getString("sintomas"));
                detalles.put("signos_vitales", rs.getString("signos_vitales"));
                detalles.put("exploracion_fisica", rs.getString("exploracion_fisica"));
                detalles.put("diagnostico", rs.getString("diagnostico"));
                detalles.put("indicaciones_medicas", rs.getString("indicaciones_medicas"));
                detalles.put("restricciones_medicas", rs.getString("restricciones_medicas"));
                detalles.put("medicacion_prescrita", rs.getString("medicacion_prescrita"));
                detalles.put("pronostico", rs.getString("pronostico"));
                detalles.put("id_cita", rs.getInt("id_cita"));
                detalles.put("id_medico", rs.getInt("id_medico"));
                
                // Campos del historial médico
                detalles.put("peso", rs.getObject("peso"));
                detalles.put("altura", rs.getObject("altura"));
                detalles.put("tipo_sangre", rs.getString("tipo_sangre"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerConsultaPorId: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return detalles.isEmpty() ? null : detalles;
    }

    // ===================== GUARDAR CONSULTA =====================
    public static boolean guardarConsulta(Map<String, Object> datos) {
        String sql = "INSERT INTO consulta (id_cita, motivo, sintomas, signos_vitales, exploracion_fisica, " +
                     "diagnostico, indicaciones_medicas, restricciones_medicas, medicacion_prescrita, pronostico, id_medico) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, toInt(datos.get("id_cita")));
            stmt.setString(2, safe(datos.get("motivo")));
            stmt.setString(3, safe(datos.get("sintomas")));
            stmt.setString(4, safe(datos.get("signos_vitales")));
            stmt.setString(5, safe(datos.get("exploracion_fisica")));
            stmt.setString(6, safe(datos.get("diagnostico")));
            stmt.setString(7, safe(datos.get("indicaciones_medicas")));
            stmt.setString(8, safe(datos.get("restricciones_medicas")));
            stmt.setString(9, safe(datos.get("medicacion_prescrita")));
            stmt.setString(10, safe(datos.get("pronostico")));
            stmt.setInt(11, toInt(datos.get("id_medico")));

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error guardarConsulta: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== GUARDAR CONSULTA COMPLETA =====================
    public static boolean guardarConsultaCompleta(Map<String, Object> datos) {
        // Primero crear una cita
        int idCita = crearCitaParaConsulta(datos);
        if (idCita == -1) return false;
        
        // Luego crear la consulta
        String sql = "INSERT INTO consulta (id_cita, motivo, sintomas, signos_vitales, exploracion_fisica, " +
                     "diagnostico, indicaciones_medicas, restricciones_medicas, medicacion_prescrita, pronostico, id_medico) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idCita);
            stmt.setString(2, safe(datos.get("motivo")));
            stmt.setString(3, safe(datos.get("sintomas")));
            stmt.setString(4, safe(datos.get("signos_vitales")));
            stmt.setString(5, safe(datos.get("exploracion_fisica")));
            stmt.setString(6, safe(datos.get("diagnostico")));
            stmt.setString(7, safe(datos.get("indicaciones_medicas")));
            stmt.setString(8, safe(datos.get("restricciones_medicas")));
            stmt.setString(9, safe(datos.get("medicacion_prescrita")));
            stmt.setString(10, safe(datos.get("pronostico")));
            stmt.setInt(11, toInt(datos.get("id_medico")));

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error guardarConsultaCompleta: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== CREAR CITA PARA CONSULTA =====================
    private static int crearCitaParaConsulta(Map<String, Object> datos) {
        String sql = "INSERT INTO cita (id_paciente, id_empleado, fecha_hora, estado, motivo) " +
                     "VALUES (?, ?, NOW(), 'Completada', ?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, toInt(datos.get("id_paciente")));
            stmt.setInt(2, toInt(datos.get("id_medico")));
            stmt.setString(3, safe(datos.get("motivo")));

            int affected = stmt.executeUpdate();
            if (affected > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
            return -1;

        } catch (SQLException e) {
            System.err.println("Error crearCitaParaConsulta: " + e.getMessage());
            e.printStackTrace();
            return -1;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
    }

    // ===================== ACTUALIZAR CONSULTA =====================
    public static boolean actualizarConsulta(int consultaId, Map<String, Object> datos) {
        String sql = "UPDATE consulta SET motivo = ?, sintomas = ?, signos_vitales = ?, exploracion_fisica = ?, " +
                     "diagnostico = ?, indicaciones_medicas = ?, restricciones_medicas = ?, medicacion_prescrita = ?, " +
                     "pronostico = ?, id_medico = ? WHERE id_consulta = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, safe(datos.get("motivo")));
            stmt.setString(2, safe(datos.get("sintomas")));
            stmt.setString(3, safe(datos.get("signos_vitales")));
            stmt.setString(4, safe(datos.get("exploracion_fisica")));
            stmt.setString(5, safe(datos.get("diagnostico")));
            stmt.setString(6, safe(datos.get("indicaciones_medicas")));
            stmt.setString(7, safe(datos.get("restricciones_medicas")));
            stmt.setString(8, safe(datos.get("medicacion_prescrita")));
            stmt.setString(9, safe(datos.get("pronostico")));
            stmt.setInt(10, toInt(datos.get("id_medico")));
            stmt.setInt(11, consultaId);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error actualizarConsulta: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== CARGAR TABLA DE CONSULTAS =====================
    public static void cargarTablaConsultasPaciente(JTable table, int pacienteId) {
        String sql = "SELECT " +
                     "con.id_consulta, " +
                     "p.id_paciente, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "emp.nombre as empresa_nombre, " +
                     "con.fecha_registro, " +
                     "con.motivo " +
                     "FROM consulta con " +
                     "JOIN cita c ON con.id_cita = c.id_cita " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN empresa emp ON p.id_empresa = emp.id_empresa " +
                     "WHERE p.id_paciente = ? " +
                     "ORDER BY con.fecha_registro DESC";

        new Thread(() -> {
            List<Object[]> datos = new ArrayList<>();
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                conn = Conexion.conectar();
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, pacienteId);
                rs = stmt.executeQuery();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

                while (rs.next()) {
                    String fechaFormateada = "";
                    java.sql.Timestamp fechaSql = rs.getTimestamp("fecha_registro");
                    if (fechaSql != null) {
                        fechaFormateada = dateFormat.format(fechaSql);
                    }

                    datos.add(new Object[]{
                        rs.getInt("id_consulta"),
                        rs.getInt("id_paciente"),
                        rs.getString("paciente_nombre"),
                        rs.getString("empresa_nombre"),
                        fechaFormateada,
                        rs.getString("motivo")
                    });
                }

            } catch (SQLException e) {
                System.err.println("Error cargarTablaConsultasPaciente: " + e.getMessage());
                e.printStackTrace();
            } finally {
                cerrarRecursos(rs, stmt, conn);
            }

            SwingUtilities.invokeLater(() -> actualizarTablaConDatos(table, datos));
        }).start();
    }

    // ===================== MÉTODOS AUXILIARES =====================

    private static void actualizarTablaConDatos(JTable table, List<Object[]> datos) {
        String[] cols = {
            "ID Consulta",
            "ID Paciente", 
            "Paciente",
            "Empresa",
            "Fecha de consulta",
            "Motivo de consulta"
        };

        DefaultTableModel model = new DefaultTableModel(cols, 0) {
            @Override 
            public boolean isCellEditable(int r, int c) { 
                return false; 
            }
        };

        for (Object[] fila : datos) {
            model.addRow(fila);
        }
        
        table.setModel(model);

        // Ocultar columnas ID
        ocultarColumnaId(table, 0); // ID Consulta
        ocultarColumnaId(table, 1); // ID Paciente
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

    private static int toInt(Object obj) {
        if (obj == null) return 0;
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
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