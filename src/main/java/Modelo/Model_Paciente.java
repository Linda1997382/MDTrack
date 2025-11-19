package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mdtrack.Conexion;

public class Model_Paciente {

    // ==================== GUARDAR PACIENTE ====================
    public static boolean guardarPaciente(Map<String, Object> datos) {
        String sql = "INSERT INTO paciente (id_empresa, nombres, apellido_paterno, apellido_materno, " +
                     "fecha_nacimiento, sexo, direccion, telefono, correo_electronico, curp, estado) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'Activo')";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Empresa (puede ser nula)
            setNullableInt(stmt, 1, datos.get("id_empresa"));

            // Datos personales
            stmt.setString(2, safe(datos.get("nombres")));
            stmt.setString(3, safe(datos.get("apellido_paterno")));
            stmt.setString(4, safe(datos.get("apellido_materno")));

            // Fecha de nacimiento
            String fechaNac = safe(datos.get("fecha_nacimiento"));
            if (!fechaNac.isEmpty()) {
                stmt.setDate(5, java.sql.Date.valueOf(fechaNac));
            } else {
                stmt.setNull(5, Types.DATE);
            }

            // Demográficos
            stmt.setString(6, safe(datos.get("sexo")));
            stmt.setString(7, safe(datos.get("direccion")));

            // Contacto
            stmt.setString(8, safe(datos.get("telefono")));
            stmt.setString(9, safe(datos.get("correo_electronico")));
            stmt.setString(10, safe(datos.get("curp")));

            int affected = stmt.executeUpdate();
            if (affected > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int idPaciente = rs.getInt(1);
                    datos.put("id_paciente", idPaciente);
                    
                    // Crear historial médico automáticamente
                    crearHistorialMedico(idPaciente);
                    return true;
                }
            }
            return false;

        } catch (SQLException e) {
            System.err.println("Error guardarPaciente: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.err.println("Error inesperado guardarPaciente: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            // Cerrar recursos
            cerrarRecursos(rs, stmt, conn);
        }
    }

    // ==================== GUARDAR PACIENTE AUTO (NUEVO MÉTODO) ====================
    public static boolean guardarPacienteAuto(String tipoAntecedente, Map<String, Object> datos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.conectar();
            
            // Crear una tabla temporal si no existe
            String crearTabla = "CREATE TABLE IF NOT EXISTS temp_antecedentes (" +
                               "id INT AUTO_INCREMENT PRIMARY KEY, " +
                               "tipo_antecedente VARCHAR(100), " +
                               "id_paciente INT, " +
                               "id_empleado INT, " +
                               "medico VARCHAR(255), " +
                               "fecha_creacion VARCHAR(50), " +
                               "datos TEXT, " +
                               "fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            
            stmt = conn.prepareStatement(crearTabla);
            stmt.execute();
            stmt.close();
            
            // Insertar los datos
            String sql = "INSERT INTO temp_antecedentes (tipo_antecedente, id_paciente, id_empleado, " +
                        "medico, fecha_creacion, datos) VALUES (?, ?, ?, ?, ?, ?)";
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipoAntecedente);
            
            // Manejar los IDs como enteros
            Integer pacienteId = (Integer) datos.get("PacienteId");
            Integer empleadoId = (Integer) datos.get("EmpleadoId");
            
            if (pacienteId != null) {
                stmt.setInt(2, pacienteId);
            } else {
                stmt.setNull(2, Types.INTEGER);
            }
            
            if (empleadoId != null) {
                stmt.setInt(3, empleadoId);
            } else {
                stmt.setNull(3, Types.INTEGER);
            }
            
            stmt.setString(4, safe(datos.get("Medico")));
            stmt.setString(5, safe(datos.get("FechaCreacion")));
            
            // Convertir el Map a string para almacenar todos los datos
            StringBuilder datosStr = new StringBuilder();
            for (Map.Entry<String, Object> entry : datos.entrySet()) {
                if (!entry.getKey().equals("PacienteId") && !entry.getKey().equals("EmpleadoId") && 
                    !entry.getKey().equals("Medico") && !entry.getKey().equals("FechaCreacion")) {
                    datosStr.append(entry.getKey()).append(": ").append(safe(entry.getValue())).append("; ");
                }
            }
            stmt.setString(6, datosStr.toString());
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println("Error guardarPacienteAuto: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.err.println("Error inesperado guardarPacienteAuto: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ==================== CREAR HISTORIAL MÉDICO ====================
    private static void crearHistorialMedico(int idPaciente) {
        String sql = "INSERT INTO historial_medico (id_paciente) VALUES (?)";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPaciente);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error crearHistorialMedico: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ==================== CARGAR TABLA PACIENTES ====================
    public static void cargarTablaPacientes(JTable table) {
        String sql = "SELECT p.id_paciente, p.nombres, p.apellido_paterno, p.apellido_materno, " +
                     "p.correo_electronico, p.fecha_nacimiento, p.telefono, e.nombre AS empresa_nombre " +
                     "FROM paciente p " +
                     "LEFT JOIN empresa e ON p.id_empresa = e.id_empresa " +
                     "WHERE p.estado = 'Activo' " +
                     "ORDER BY p.apellido_paterno, p.apellido_materno, p.nombres";

        new Thread(() -> {
            List<Object[]> datos = new ArrayList<>();
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                conn = Conexion.conectar();
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                while (rs.next()) {
                    String nombreCompleto = construirNombreCompleto(
                        rs.getString("nombres"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno")
                    );

                    // Formatear fecha
                    String fechaNac = "";
                    java.sql.Date fechaSql = rs.getDate("fecha_nacimiento");
                    if (fechaSql != null) {
                        fechaNac = dateFormat.format(fechaSql);
                    }

                    datos.add(new Object[]{
                        rs.getInt("id_paciente"),
                        nombreCompleto,
                        rs.getString("empresa_nombre"),
                        rs.getString("correo_electronico"),
                        fechaNac,
                        rs.getString("telefono")
                    });
                }

            } catch (SQLException e) {
                System.err.println("Error cargarTablaPacientes: " + e.getMessage());
                e.printStackTrace();
            } finally {
                cerrarRecursos(rs, stmt, conn);
            }

            SwingUtilities.invokeLater(() -> actualizarTablaConDatos(table, datos));
        }).start();
    }

    // ==================== OBTENER PACIENTE POR ID ====================
    public static Map<String, Object> obtenerPacientePorId(int idPaciente) {
        String sql = "SELECT p.*, e.nombre AS empresa_nombre " +
                     "FROM paciente p " +
                     "LEFT JOIN empresa e ON p.id_empresa = e.id_empresa " +
                     "WHERE p.id_paciente = ?";

        Map<String, Object> out = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPaciente);
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Intentar construir el Map con metadata; si falla, usar un fallback por columnas conocidas
                try {
                    ResultSetMetaData meta = rs.getMetaData();
                    int cols = meta.getColumnCount();
                    for (int i = 1; i <= cols; i++) {
                        String label = meta.getColumnLabel(i);
                        if (label == null || label.isEmpty()) {
                            label = meta.getColumnName(i);
                        }
                        Object value = rs.getObject(i);
                        out.put(label.toLowerCase(), value);
                    }
                } catch (Exception metaEx) {
                    System.err.println("Error leyendo metadata en obtenerPacientePorId: " + metaEx.getMessage());
                    metaEx.printStackTrace();
                    // Fallback: leer columnas conocidas de forma segura
                    try {
                        safePut(out, "id_paciente", rs);
                        safePut(out, "id_empresa", rs);
                        safePut(out, "nombres", rs);
                        safePut(out, "apellido_paterno", rs);
                        safePut(out, "apellido_materno", rs);
                        safePut(out, "fecha_nacimiento", rs);
                        safePut(out, "sexo", rs);
                        safePut(out, "direccion", rs);
                        safePut(out, "telefono", rs);
                        safePut(out, "correo_electronico", rs);
                        safePut(out, "curp", rs);
                        safePut(out, "empresa_nombre", rs);
                        safePut(out, "estado", rs);
                    } catch (Exception readEx) {
                        System.err.println("Error fallback leer columnas en obtenerPacientePorId: " + readEx.getMessage());
                        readEx.printStackTrace();
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerPacientePorId: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        // Añadir aliases/keys legadas y formatos amistosos para compatibilidad con formularios
        if (!out.isEmpty()) {
            String nombres = safe(out.get("nombres"));
            String ap = safe(out.get("apellido_paterno"));
            String am = safe(out.get("apellido_materno"));
            String nombreCompleto = (nombres + " " + ap + " " + am).trim().replaceAll(" +", " ");
            out.put("nombre", nombreCompleto);
            out.put("Nombre", nombreCompleto);
            out.put("nombre completo", nombreCompleto);
            out.put("Nombre completo", nombreCompleto);

            out.put("apellido paterno", ap);
            out.put("Apellido paterno", ap);
            out.put("apellido materno", am);
            out.put("Apellido materno", am);

            Object fechaObj = out.get("fecha_nacimiento");
            String fechaFmt = "";
            try {
                if (fechaObj instanceof java.sql.Date) {
                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    fechaFmt = df.format((java.sql.Date) fechaObj);
                } else if (fechaObj != null) {
                    fechaFmt = fechaObj.toString();
                }
            } catch (Exception ex) {
                fechaFmt = "";
            }
            out.put("fecha de nacimiento", fechaFmt);
            out.put("Fecha de nacimiento", fechaFmt);

            String empresa = safe(out.get("empresa_nombre"));
            out.put("empresa", empresa);
            out.put("Empresa", empresa);
            out.put("EmpresaNombre", empresa);

            String telefono = safe(out.get("telefono"));
            out.put("Telefono", telefono);
            out.put("telefono", telefono);
        }

        // Debug: imprimir las claves y valores devueltos (útil para diagnosticar cargas intermitentes)
        try {
            System.err.println("[DEBUG] obtenerPacientePorId - valores devueltos para id=" + idPaciente + ":");
            for (Map.Entry<String, Object> e : out.entrySet()) {
                System.err.println("  key='" + e.getKey() + "' -> '" + String.valueOf(e.getValue()) + "'");
            }
        } catch (Exception dbg) {
            // no bloquear por debug
        }

        return out.isEmpty() ? null : out;
    }

    // ==================== VERIFICAR SEXO DEL PACIENTE ====================
    public static String checarSexoPaciente(int pacienteId) {
        String sql = "SELECT sexo FROM paciente WHERE id_paciente = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("sexo");
            }

        } catch (SQLException e) {
            System.err.println("Error checarSexoPaciente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        
        return "Otro"; // Valor por defecto
    }

    // ==================== ACTUALIZAR PACIENTE ====================
    public static boolean actualizarPaciente(int idPaciente, Map<String, Object> datos) {
        String sql = "UPDATE paciente SET id_empresa = ?, nombres = ?, apellido_paterno = ?, apellido_materno = ?, " +
                     "fecha_nacimiento = ?, sexo = ?, direccion = ?, telefono = ?, correo_electronico = ?, curp = ? " +
                     "WHERE id_paciente = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            setNullableInt(stmt, 1, datos.get("id_empresa"));
            stmt.setString(2, safe(datos.get("nombres")));
            stmt.setString(3, safe(datos.get("apellido_paterno")));
            stmt.setString(4, safe(datos.get("apellido_materno")));

            String fechaNac = safe(datos.get("fecha_nacimiento"));
            if (!fechaNac.isEmpty()) {
                stmt.setDate(5, java.sql.Date.valueOf(fechaNac));
            } else {
                stmt.setNull(5, Types.DATE);
            }

            stmt.setString(6, safe(datos.get("sexo")));
            stmt.setString(7, safe(datos.get("direccion")));
            stmt.setString(8, safe(datos.get("telefono")));
            stmt.setString(9, safe(datos.get("correo_electronico")));
            stmt.setString(10, safe(datos.get("curp")));
            stmt.setInt(11, idPaciente);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error actualizarPaciente: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.err.println("Error inesperado actualizarPaciente: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ==================== ELIMINAR PACIENTE (BAJA LÓGICA) ====================
    public static boolean eliminarPaciente(int idPaciente) {
        String sql = "UPDATE paciente SET estado = 'Inactivo' WHERE id_paciente = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPaciente);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error eliminarPaciente: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ==================== BÚSQUEDA DE PACIENTES ====================
    public static List<Map<String, Object>> buscarPacientesPorNombre(String criterio) {
        List<Map<String, Object>> lista = new ArrayList<>();

        String sql = "SELECT p.id_paciente, p.nombres, p.apellido_paterno, p.apellido_materno, " +
                     "p.fecha_nacimiento, p.telefono, e.nombre AS empresa_nombre " +
                     "FROM paciente p " +
                     "LEFT JOIN empresa e ON p.id_empresa = e.id_empresa " +
                     "WHERE (p.nombres LIKE ? OR p.apellido_paterno LIKE ? OR p.apellido_materno LIKE ?) " +
                     "AND p.estado = 'Activo' " +
                     "ORDER BY p.apellido_paterno, p.apellido_materno, p.nombres";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            String likeCriterio = "%" + criterio + "%";
            stmt.setString(1, likeCriterio);
            stmt.setString(2, likeCriterio);
            stmt.setString(3, likeCriterio);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> paciente = new HashMap<>();
                paciente.put("id_paciente", rs.getInt("id_paciente"));
                paciente.put("nombres", rs.getString("nombres"));
                paciente.put("apellido_paterno", rs.getString("apellido_paterno"));
                paciente.put("apellido_materno", rs.getString("apellido_materno"));
                paciente.put("fecha_nacimiento", rs.getDate("fecha_nacimiento"));
                paciente.put("telefono", rs.getString("telefono"));
                paciente.put("empresa_nombre", rs.getString("empresa_nombre"));
                lista.add(paciente);
            }

        } catch (SQLException e) {
            System.err.println("Error buscarPacientesPorNombre: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }

        return lista;
    }

    // ==================== OBTENER ID DE HISTORIAL MÉDICO ====================
    public static Integer obtenerIdHistorialPorPaciente(int idPaciente) {
        String sql = "SELECT id_historial FROM historial_medico WHERE id_paciente = ?";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPaciente);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_historial");
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerIdHistorialPorPaciente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return null;
    }

    // ==================== VALIDACIÓN DE EMAIL ÚNICO ====================
    public static boolean emailExiste(String email, Integer idExcluir) {
        String sql = "SELECT COUNT(*) as count FROM paciente WHERE correo_electronico = ? AND estado = 'Activo'";
        if (idExcluir != null) {
            sql += " AND id_paciente != ?";
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, email.trim().toLowerCase());
            if (idExcluir != null) {
                stmt.setInt(2, idExcluir);
            }

            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("count") > 0;
            }

        } catch (SQLException e) {
            System.err.println("Error emailExiste: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return false;
    }

    // ==================== OBTENER LISTA DE PACIENTES PARA COMBOBOX ====================
    public static List<PacienteItem> obtenerPacientesParaCombo() {
        List<PacienteItem> pacientes = new ArrayList<>();
        String sql = "SELECT id_paciente, nombres, apellido_paterno, apellido_materno " +
                     "FROM paciente WHERE estado = 'Activo' ORDER BY apellido_paterno, nombres";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String nombreCompleto = construirNombreCompleto(
                    rs.getString("nombres"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno")
                );
                pacientes.add(new PacienteItem(
                    rs.getInt("id_paciente"),
                    nombreCompleto
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerPacientesParaCombo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return pacientes;
    }

    // ==================== MÉTODOS AUXILIARES ====================

    private static void actualizarTablaConDatos(JTable table, List<Object[]> datos) {
        String[] columnas = {"ID", "Nombre completo", "Empresa", "Correo electrónico", "Fecha de nacimiento", "Teléfono"};
        
        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            @Override 
            public boolean isCellEditable(int row, int column) { 
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
        } catch (Exception ignored) {}
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

    private static void safePut(Map<String, Object> out, String columnLabel, ResultSet rs) {
        try {
            Object v = rs.getObject(columnLabel);
            out.put(columnLabel.toLowerCase(), v);
        } catch (Exception e) {
            // Ignorar si la columna no existe o falla al leer
        }
    }

    private static String safe(Object obj) {
        if (obj == null) return "";
        String str = obj.toString().trim();
        return str.equals("null") ? "" : str;
    }

    private static String construirNombreCompleto(String nombres, String apellidoPaterno, String apellidoMaterno) {
        StringBuilder sb = new StringBuilder();
        
        if (nombres != null && !nombres.isBlank()) 
            sb.append(nombres.trim()).append(" ");
        if (apellidoPaterno != null && !apellidoPaterno.isBlank()) 
            sb.append(apellidoPaterno.trim()).append(" ");
        if (apellidoMaterno != null && !apellidoMaterno.isBlank()) 
            sb.append(apellidoMaterno.trim());
            
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

    // ==================== CLASE PARA ITEMS DE COMBOBOX ====================
    public static class PacienteItem {
        private final int id;
        private final String nombreCompleto;

        public PacienteItem(int id, String nombreCompleto) {
            this.id = id;
            this.nombreCompleto = nombreCompleto;
        }

        public int getId() { return id; }
        public String getNombreCompleto() { return nombreCompleto; }

        @Override
        public String toString() {
            return nombreCompleto;
        }
    }
}