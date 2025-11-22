package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mdtrack.Conexion;

public class Model_Citas {

    // ===================== GUARDAR CITA =====================
    public static boolean guardarCita(Map<String,Object> datos) {
        String sql = "INSERT INTO cita (id_paciente, id_empleado, fecha_hora, estado, motivo) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, toInt(datos.get("id_paciente")));
            setNullableInt(stmt, 2, datos.get("id_empleado"));

            // Manejo de fecha_hora
            Object fechaHoraObj = datos.get("fecha_hora");
            if (fechaHoraObj != null) {
                if (fechaHoraObj instanceof Timestamp) {
                    stmt.setTimestamp(3, (Timestamp) fechaHoraObj);
                } else if (fechaHoraObj instanceof LocalDateTime) {
                    stmt.setTimestamp(3, Timestamp.valueOf((LocalDateTime) fechaHoraObj));
                } else {
                    String fechaHoraStr = safe(fechaHoraObj);
                    if (!fechaHoraStr.isEmpty()) {
                        stmt.setTimestamp(3, Timestamp.valueOf(fechaHoraStr.replace("T", " ")));
                    } else {
                        stmt.setNull(3, Types.TIMESTAMP);
                    }
                }
            } else {
                stmt.setNull(3, Types.TIMESTAMP);
            }

            stmt.setString(4, safe(datos.get("estado"), "Programada"));
            stmt.setString(5, safe(datos.get("motivo")));

            int aff = stmt.executeUpdate();
            if (aff > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) datos.put("id_cita", rs.getInt(1));
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error guardarCita: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return false;
    }

    // ===================== OBTENER CITAS DEL DÍA =====================
    public static List<Object[]> obtenerCitasDelDia(int empleadoId) {
        List<Object[]> citas = new ArrayList<>();
        String sql = "SELECT " +
                     "c.id_cita, " +
                     "c.id_paciente, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "c.fecha_hora, " +
                     "CASE WHEN con.id_consulta IS NOT NULL THEN 'Sí' ELSE 'No' END as asistencia " +
                     "FROM cita c " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN consulta con ON c.id_cita = con.id_cita " +
                     "WHERE c.id_empleado = ? " +
                     "AND DATE(c.fecha_hora) = CURDATE() " +
                     "ORDER BY c.fecha_hora ASC";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, empleadoId);
            rs = stmt.executeQuery();

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            while (rs.next()) {
                Timestamp fechaHora = rs.getTimestamp("fecha_hora");
                String fecha = "";
                String hora = "";
                
                if (fechaHora != null) {
                    LocalDateTime ldt = fechaHora.toLocalDateTime();
                    fecha = ldt.format(dateFormatter);
                    hora = ldt.format(timeFormatter);
                }

                Object[] row = {
                    rs.getInt("id_cita"),
                    rs.getInt("id_paciente"),
                    rs.getString("paciente_nombre"),
                    fecha,
                    hora,
                    rs.getString("asistencia")
                };
                citas.add(row);
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCitasDelDia: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return citas;
    }

    // ===================== OBTENER TODAS LAS CITAS DEL DÍA (SIN FILTRO POR EMPLEADO) =====================
    public static List<Object[]> obtenerCitasDelDiaTodos() {
        List<Object[]> citas = new ArrayList<>();
        String sql = "SELECT " +
                     "c.id_cita, " +
                     "c.id_paciente, " +
                     "CONCAT(p.nombres, ' ', COALESCE(p.apellido_paterno, ''), ' ', COALESCE(p.apellido_materno, '')) as paciente_nombre, " +
                     "c.fecha_hora, " +
                     "CASE WHEN con.id_consulta IS NOT NULL THEN 'Sí' ELSE 'No' END as asistencia " +
                     "FROM cita c " +
                     "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                     "LEFT JOIN consulta con ON c.id_cita = con.id_cita " +
                     "WHERE DATE(c.fecha_hora) = CURDATE() " +
                     "ORDER BY c.fecha_hora ASC";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            while (rs.next()) {
                Timestamp fechaHora = rs.getTimestamp("fecha_hora");
                String fecha = "";
                String hora = "";
                
                if (fechaHora != null) {
                    LocalDateTime ldt = fechaHora.toLocalDateTime();
                    fecha = ldt.format(dateFormatter);
                    hora = ldt.format(timeFormatter);
                }

                Object[] row = {
                    rs.getInt("id_cita"),
                    rs.getInt("id_paciente"),
                    rs.getString("paciente_nombre"),
                    fecha,
                    hora,
                    rs.getString("asistencia")
                };
                citas.add(row);
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCitasDelDiaTodos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return citas;
    }

    // ===================== HORAS OCUPADAS =====================
    public static List<Time> obtenerHorasOcupadas(LocalDate fecha, Integer idEmpleado) {
        List<Time> horas = new ArrayList<>();
        String sql = "SELECT TIME(fecha_hora) AS hora " +
                    "FROM cita WHERE DATE(fecha_hora) = ? AND estado != 'Cancelada'";
        
        if (idEmpleado != null) {
            sql += " AND id_empleado = ?";
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, java.sql.Date.valueOf(fecha));
            
            if (idEmpleado != null) {
                stmt.setInt(2, idEmpleado);
            }
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                horas.add(rs.getTime("hora"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerHorasOcupadas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return horas;
    }

    // ===================== OBTENER CITA POR ID =====================
    public static Map<String,Object> obtenerCitaPorId(int idCita) {
        String sql = "SELECT c.*, " +
                    "p.nombres AS paciente_n, p.apellido_paterno AS paciente_ap, p.apellido_materno AS paciente_am, " +
                    "e.nombres AS medico_n, e.apellido_paterno AS medico_ap, e.apellido_materno AS medico_am " +
                    "FROM cita c " +
                    "LEFT JOIN paciente p ON c.id_paciente = p.id_paciente " +
                    "LEFT JOIN empleado e ON c.id_empleado = e.id_empleado " +
                    "WHERE c.id_cita = ?";

        Map<String,Object> out = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idCita);
            rs = stmt.executeQuery();

            if (rs.next()) {
                out.put("id_cita", rs.getInt("id_cita"));
                out.put("id_paciente", rs.getInt("id_paciente"));
                out.put("id_empleado", rs.getObject("id_empleado"));
                out.put("fecha_hora", rs.getTimestamp("fecha_hora"));
                out.put("estado", rs.getString("estado"));
                out.put("motivo", rs.getString("motivo"));
                out.put("created_at", rs.getTimestamp("created_at"));

                out.put("paciente_nombre",
                    fullName(rs.getString("paciente_n"), rs.getString("paciente_ap"), rs.getString("paciente_am"))
                );

                out.put("medico_nombre",
                    fullName(rs.getString("medico_n"), rs.getString("medico_ap"), rs.getString("medico_am"))
                );
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCitaPorId: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return out.isEmpty() ? null : out;
    }

    // ===================== CARGAR TABLA CITAS =====================
    public static void cargarTablaCitas(JTable table) {
        String sql = "SELECT c.id_cita, c.fecha_hora, c.estado, c.motivo, " +
                    "p.nombres AS paciente_n, p.apellido_paterno AS paciente_ap, p.apellido_materno AS paciente_am, " +
                    "e.nombres AS medico_n, e.apellido_paterno AS medico_ap, e.apellido_materno AS medico_am " +
                    "FROM cita c " +
                    "LEFT JOIN paciente p ON c.id_paciente = p.id_paciente " +
                    "LEFT JOIN empleado e ON c.id_empleado = e.id_empleado " +
                    "WHERE c.estado != 'Cancelada' " +
                    "ORDER BY c.fecha_hora DESC";

        new Thread(() -> {
            List<Object[]> datos = new ArrayList<>();
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                conn = Conexion.conectar();
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();

                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

                while (rs.next()) {
                    String paciente = fullName(rs.getString("paciente_n"), rs.getString("paciente_ap"), rs.getString("paciente_am"));

                    Timestamp ts = rs.getTimestamp("fecha_hora");
                    String fecha = "";
                    String hora = "";
                    
                    if (ts != null) {
                        LocalDateTime ldt = ts.toLocalDateTime();
                        fecha = ldt.format(dateFormatter);
                        hora = ldt.format(timeFormatter);
                    }

                    boolean asistio = "Completada".equals(rs.getString("estado"));

                    datos.add(new Object[]{
                        rs.getInt("id_cita"),
                        paciente,
                        fecha,
                        hora,
                        asistio ? "Sí" : "No",
                        fullName(rs.getString("medico_n"), rs.getString("medico_ap"), rs.getString("medico_am")),
                        rs.getString("motivo"),
                        rs.getString("estado")
                    });
                }

            } catch (SQLException e) {
                System.err.println("Error cargarTablaCitas: " + e.getMessage());
                e.printStackTrace();
            } finally {
                cerrarRecursos(rs, stmt, conn);
            }

            SwingUtilities.invokeLater(() -> actualizarTablaConDatos(table, datos));
        }).start();
    }

    // ===================== ACTUALIZAR CITA =====================
    public static boolean actualizarCita(int idCita, Map<String,Object> datos) {
        String sql = "UPDATE cita SET id_paciente = ?, id_empleado = ?, fecha_hora = ?, estado = ?, motivo = ? " +
                    "WHERE id_cita = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, toInt(datos.get("id_paciente")));
            setNullableInt(stmt, 2, datos.get("id_empleado"));

            // Manejo de fecha_hora
            Object fechaHoraObj = datos.get("fecha_hora");
            if (fechaHoraObj != null) {
                if (fechaHoraObj instanceof Timestamp) {
                    stmt.setTimestamp(3, (Timestamp) fechaHoraObj);
                } else if (fechaHoraObj instanceof LocalDateTime) {
                    stmt.setTimestamp(3, Timestamp.valueOf((LocalDateTime) fechaHoraObj));
                } else {
                    String fechaHoraStr = safe(fechaHoraObj);
                    if (!fechaHoraStr.isEmpty()) {
                        stmt.setTimestamp(3, Timestamp.valueOf(fechaHoraStr.replace("T", " ")));
                    } else {
                        stmt.setNull(3, Types.TIMESTAMP);
                    }
                }
            } else {
                stmt.setNull(3, Types.TIMESTAMP);
            }

            stmt.setString(4, safe(datos.get("estado"), "Programada"));
            stmt.setString(5, safe(datos.get("motivo")));
            stmt.setInt(6, idCita);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error actualizarCita: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== ELIMINAR CITA =====================
    public static boolean eliminarCita(int idCita) {
        String sql = "UPDATE cita SET estado = 'Cancelada' WHERE id_cita = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idCita);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error eliminarCita: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== MARCAR ASISTENCIA =====================
    public static boolean marcarAsistencia(int idCita) {
        String sql = "UPDATE cita SET estado = 'Completada' WHERE id_cita = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idCita);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error marcarAsistencia: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== OBTENER CITAS POR PACIENTE =====================
    public static List<Map<String, Object>> obtenerCitasPorPaciente(int idPaciente) {
        List<Map<String, Object>> citas = new ArrayList<>();
        String sql = "SELECT c.*, " +
                    "CONCAT(e.nombres, ' ', COALESCE(e.apellido_paterno, ''), ' ', COALESCE(e.apellido_materno, '')) as medico_nombre " +
                    "FROM cita c " +
                    "LEFT JOIN empleado e ON c.id_empleado = e.id_empleado " +
                    "WHERE c.id_paciente = ? " +
                    "ORDER BY c.fecha_hora DESC";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPaciente);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> cita = new HashMap<>();
                cita.put("id_cita", rs.getInt("id_cita"));
                cita.put("fecha_hora", rs.getTimestamp("fecha_hora"));
                cita.put("estado", rs.getString("estado"));
                cita.put("motivo", rs.getString("motivo"));
                cita.put("medico_nombre", rs.getString("medico_nombre"));
                citas.add(cita);
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCitasPorPaciente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return citas;
    }

    // ===================== OBTENER CITAS PENDIENTES =====================
    public static List<Object[]> obtenerCitasPendientes() {
        List<Object[]> citas = new ArrayList<>();
        String sql = "SELECT c.id_cita, " +
                    "CONCAT(p.nombres, ' ', p.apellido_paterno, ' ', p.apellido_materno) as paciente_nombre, " +
                    "c.fecha_hora, c.motivo " +
                    "FROM cita c " +
                    "JOIN paciente p ON c.id_paciente = p.id_paciente " +
                    "WHERE c.estado = 'Programada' AND c.fecha_hora >= CURDATE() " +
                    "ORDER BY c.fecha_hora ASC " +
                    "LIMIT 10";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            while (rs.next()) {
                Timestamp fechaHora = rs.getTimestamp("fecha_hora");
                String fechaHoraStr = "";
                if (fechaHora != null) {
                    fechaHoraStr = fechaHora.toLocalDateTime().format(formatter);
                }

                citas.add(new Object[]{
                    rs.getInt("id_cita"),
                    rs.getString("paciente_nombre"),
                    fechaHoraStr,
                    rs.getString("motivo")
                });
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCitasPendientes: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return citas;
    }

    // ===================== AUXILIARES =====================
    private static void actualizarTablaConDatos(JTable table, List<Object[]> datos) {
        String[] cols = {"ID", "Paciente", "Fecha", "Hora", "Asistencia", "Médico", "Motivo", "Estado"};
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
        ocultarColumnaId(table);
    }

    public static void ocultarColumnaId(JTable table) {
        try {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(0);
        } catch (Exception e) {
            System.err.println("Error ocultando columna ID: " + e.getMessage());
        }
    }

    private static void setNullableInt(PreparedStatement stmt, int index, Object value) throws SQLException {
        if (value == null || value.toString().isEmpty()) {
            stmt.setNull(index, Types.INTEGER);
        } else {
            try {
                stmt.setInt(index, Integer.parseInt(value.toString()));
            } catch (NumberFormatException e) {
                stmt.setNull(index, Types.INTEGER);
            }
        }
    }

    private static String safe(Object obj) {
        return safe(obj, "");
    }

    private static String safe(Object obj, String defaultValue) {
        if (obj == null) return defaultValue;
        String str = obj.toString().trim();
        return str.equals("null") ? defaultValue : str;
    }

    private static int toInt(Object obj) {
        if (obj == null) return 0;
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static String fullName(String nombres, String apePat, String apeMat) {
        StringBuilder sb = new StringBuilder();
        if (nombres != null && !nombres.isBlank()) sb.append(nombres.trim()).append(" ");
        if (apePat != null && !apePat.isBlank()) sb.append(apePat.trim()).append(" ");
        if (apeMat != null && !apeMat.isBlank()) sb.append(apeMat.trim());
        return sb.toString().trim();
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