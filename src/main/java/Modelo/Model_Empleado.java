package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mdtrack.Conexion;

public class Model_Empleado {

    // ===================== CLASE EMPLEADO =====================
    public static class Empleado {
        private final int id;
        private final Integer idEmpresa;
        private final String nombres;
        private final String apellidoPaterno;
        private final String apellidoMaterno;
        private final String fechaNacimiento;        // formato YYYY-MM-DD o null
        private final String telefono;
        private final String correoElectronico;
        private final String curp;
        private final String rfc;
        private final String puesto;
        private final String sexo;                  // 'M','F','Otro'
        private final String horario;
        private final String cedulaProfesional;
        private final String estado;

        /**
         * Constructor completo (útil para detalles)
         */
        public Empleado(int id, Integer idEmpresa, String nombres, String apellidoPaterno, String apellidoMaterno,
                        String fechaNacimiento, String telefono, String correoElectronico, String curp, String rfc,
                        String puesto, String sexo, String horario, String cedulaProfesional, String estado) {
            this.id = id;
            this.idEmpresa = idEmpresa;
            this.nombres = nombres;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.fechaNacimiento = fechaNacimiento;
            this.telefono = telefono;
            this.correoElectronico = correoElectronico;
            this.curp = curp;
            this.rfc = rfc;
            this.puesto = puesto;
            this.sexo = sexo;
            this.horario = horario;
            this.cedulaProfesional = cedulaProfesional;
            this.estado = estado;
        }

        /**
         * Constructor ligero (útil para listas donde no necesitamos todo)
         */
        public Empleado(int id, String nombres, String apellidoPaterno, String apellidoMaterno,
                        String puesto, String correoElectronico, String telefono, String estado) {
            this(id, null, nombres, apellidoPaterno, apellidoMaterno, null, telefono, correoElectronico,
                 null, null, puesto, null, null, null, estado);
        }

        // Getters con nombres que usa tu formulario
        public int getId() { return id; }
        public int getIdEmpleado() { return id; } // comodidad
        public Integer getIdEmpresa() { return idEmpresa; }
        public String getNombres() { return nombres; }
        public String getApellidoPaterno() { return apellidoPaterno; }
        public String getApellidoMaterno() { return apellidoMaterno; }
        public String getFechaNacimiento() { return fechaNacimiento; } // devuelve String (YYYY-MM-DD) o null
        public String getTelefono() { return telefono; }
        public String getCorreoElectronico() { return correoElectronico; }
        public String getCorreo() { return correoElectronico; } // compatibilidad
        public String getCurp() { return curp; }
        public String getRfc() { return rfc; }
        public String getPuesto() { return puesto; }
        public String getSexo() { return sexo; }
        public String getHorario() { return horario; }
        public String getCedulaProfesional() { return cedulaProfesional; }
        public String getEstado() { return estado; }

        public String getNombreCompleto() {
            return (safePart(nombres) + " " + safePart(apellidoPaterno) + " " + safePart(apellidoMaterno))
                    .replaceAll(" +", " ").trim();
        }

        private String safePart(String s) {
            return s == null ? "" : s.trim();
        }
    }

    // ===================== GUARDAR EMPLEADO =====================
    public static boolean guardarEmpleado(Map<String, Object> datos) {
        String sql = "INSERT INTO empleado (id_empresa, nombres, apellido_paterno, apellido_materno, " +
                     "fecha_nacimiento, telefono, correo_electronico, curp, rfc, puesto, sexo, horario, password_hash) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // ID Empresa (puede ser nulo)
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

            // Contacto
            stmt.setString(6, safe(datos.get("telefono")));
            stmt.setString(7, safe(datos.get("correo_electronico")));
            stmt.setString(8, safe(datos.get("curp")));
            stmt.setString(9, safe(datos.get("rfc")));

            // Información laboral
            stmt.setString(10, safe(datos.get("puesto")));
            stmt.setString(11, safe(datos.get("sexo")));
            stmt.setString(12, safe(datos.get("horario")));

            // Password
            String password = safe(datos.get("password_hash"));
            stmt.setString(13, password);

            int affected = stmt.executeUpdate();

            if (affected > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    datos.put("id_empleado", rs.getInt(1));
                }
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error guardarEmpleado: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.err.println("Error inesperado guardarEmpleado: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return false;
    }

    // ===================== OBTENER EMPLEADO POR ID =====================
public static Empleado obtenerEmpleadoPorId(int idEmpleado) {
    System.out.println("=== DEBUG Model_Empleado.obtenerEmpleadoPorId ===");
    System.out.println("Buscando empleado con ID: " + idEmpleado);
    
    String sql = "SELECT id_empleado, nombres, apellido_paterno, apellido_materno, " +
                 "puesto, correo_electronico, telefono, estado " +
                 "FROM empleado WHERE id_empleado = ? AND estado = 'Activo'";

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idEmpleado);
        rs = stmt.executeQuery();

        if (rs.next()) {
            // Crear empleado con constructor ligero
            Empleado empleado = new Empleado(
                rs.getInt("id_empleado"),
                rs.getString("nombres"),
                rs.getString("apellido_paterno"),
                rs.getString("apellido_materno"),
                rs.getString("puesto"),
                rs.getString("correo_electronico"),
                rs.getString("telefono"),
                rs.getString("estado")
            );
            return empleado;
        }

    } catch (SQLException e) {
        System.err.println("Error obtenerEmpleadoPorId: " + e.getMessage());
        e.printStackTrace();
    } finally {
        // Cerrar recursos manualmente
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println("Error cerrando recursos: " + e.getMessage());
        }
    }
    return null;
}
    // ===================== OBTENER DETALLES COMPLETOS (MAP) =====================
    public static Map<String, Object> obtenerDetallesEmpleadoPorId(int idEmpleado) {
        String sql = "SELECT e.*, em.nombre as empresa_nombre " +
                     "FROM empleado e " +
                     "LEFT JOIN empresa em ON e.id_empresa = em.id_empresa " +
                     "WHERE e.id_empleado = ?";
        Map<String, Object> out = new HashMap<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idEmpleado);
            rs = stmt.executeQuery();

            if (rs.next()) {
                out.put("id_empleado", rs.getInt("id_empleado"));
                out.put("id_empresa", rs.getObject("id_empresa"));
                out.put("empresa_nombre", rs.getString("empresa_nombre"));
                out.put("nombres", rs.getString("nombres"));
                out.put("apellido_paterno", rs.getString("apellido_paterno"));
                out.put("apellido_materno", rs.getString("apellido_materno"));
                out.put("fecha_nacimiento", rs.getDate("fecha_nacimiento"));
                out.put("telefono", rs.getString("telefono"));
                out.put("correo_electronico", rs.getString("correo_electronico"));
                out.put("curp", rs.getString("curp"));
                out.put("rfc", rs.getString("rfc"));
                out.put("puesto", rs.getString("puesto"));
                out.put("sexo", rs.getString("sexo"));
                out.put("horario", rs.getString("horario"));
                out.put("cedula_profesional", rs.getString("cedula_profesional"));
                out.put("estado", rs.getString("estado"));
                out.put("created_at", rs.getTimestamp("created_at"));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerDetallesEmpleadoPorId: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return out.isEmpty() ? null : out;
    }

    // ===================== CARGAR TABLA EMPLEADOS =====================
    public static void cargarTablaEmpleados(JTable table) {
        String sql = "SELECT e.id_empleado, e.nombres, e.apellido_paterno, e.apellido_materno, " +
                     "e.puesto, e.telefono, e.horario, em.nombre AS empresa_nombre " +
                     "FROM empleado e " +
                     "LEFT JOIN empresa em ON e.id_empresa = em.id_empresa " +
                     "WHERE e.estado = 'Activo' " +
                     "ORDER BY e.apellido_paterno, e.apellido_materno, e.nombres";

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
                    String nombreCompleto = construirNombreCompleto(
                        rs.getString("nombres"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno")
                    );

                    datos.add(new Object[]{
                        rs.getInt("id_empleado"),
                        nombreCompleto,
                        rs.getString("puesto"),
                        rs.getString("horario"),
                        rs.getString("telefono"),
                        rs.getString("empresa_nombre")
                    });
                }

            } catch (SQLException e) {
                System.err.println("Error cargarTablaEmpleados: " + e.getMessage());
                e.printStackTrace();
            } finally {
                cerrarRecursos(rs, stmt, conn);
            }

            SwingUtilities.invokeLater(() -> actualizarTablaConDatos(table, datos));
        }).start();
    }

    // ===================== ACTUALIZAR EMPLEADO =====================
    public static boolean actualizarEmpleado(int idEmpleado, Map<String, Object> datos) {
        String sql = "UPDATE empleado SET id_empresa = ?, nombres = ?, apellido_paterno = ?, apellido_materno = ?, " +
                     "fecha_nacimiento = ?, telefono = ?, correo_electronico = ?, curp = ?, rfc = ?, puesto = ?, sexo = ?, horario = ?, cedula_profesional = ? " +
                     "WHERE id_empleado = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            // ID Empresa
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

            // Contacto
            stmt.setString(6, safe(datos.get("telefono")));
            stmt.setString(7, safe(datos.get("correo_electronico")));
            stmt.setString(8, safe(datos.get("curp")));
            stmt.setString(9, safe(datos.get("rfc")));

            // Información laboral
            stmt.setString(10, safe(datos.get("puesto")));
            stmt.setString(11, safe(datos.get("sexo")));
            stmt.setString(12, safe(datos.get("horario")));
            stmt.setString(13, safe(datos.get("cedula_profesional")));

            // WHERE
            stmt.setInt(14, idEmpleado);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error actualizarEmpleado: " + e.getMessage());
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.err.println("Error inesperado actualizarEmpleado: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== ELIMINAR EMPLEADO =====================
    public static boolean eliminarEmpleado(int idEmpleado) {
        String sql = "UPDATE empleado SET estado = 'Inactivo' WHERE id_empleado = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idEmpleado);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error eliminarEmpleado: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(null, stmt, conn);
        }
    }

    // ===================== LOGIN =====================
    public static Integer obtenerIdEmpleadoPorEmail(String email) {
        String sql = "SELECT id_empleado FROM empleado WHERE correo_electronico = ? AND estado = 'Activo' LIMIT 1";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email.trim().toLowerCase());
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_empleado");
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerIdEmpleadoPorEmail: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return null;
    }

    // ===================== VERIFICAR CREDENCIALES =====================
    public static boolean verificarCredenciales(String email, String password) {
        String sql = "SELECT id_empleado FROM empleado WHERE correo_electronico = ? AND password_hash = ? AND estado = 'Activo'";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email.trim().toLowerCase());
            stmt.setString(2, password);

            rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.err.println("Error verificarCredenciales: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
    }

    // ===================== OBTENER EMPLEADOS POR PUESTO =====================
    public static List<Empleado> obtenerEmpleadosPorPuesto(String puesto) {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT id_empleado, nombres, apellido_paterno, apellido_materno, " +
                     "puesto, correo_electronico, telefono, estado " +
                     "FROM empleado WHERE puesto = ? AND estado = 'Activo' ORDER BY apellido_paterno, nombres";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, puesto);
            rs = stmt.executeQuery();

            while (rs.next()) {
                empleados.add(new Empleado(
                    rs.getInt("id_empleado"),
                    rs.getString("nombres"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno"),
                    rs.getString("puesto"),
                    rs.getString("correo_electronico"),
                    rs.getString("telefono"),
                    rs.getString("estado")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerEmpleadosPorPuesto: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return empleados;
    }

    // ===================== OBTENER EMPLEADOS PARA COMBOBOX =====================
    public static List<EmpleadoItem> obtenerEmpleadosParaCombo() {
        List<EmpleadoItem> empleados = new ArrayList<>();
        String sql = "SELECT id_empleado, nombres, apellido_paterno, apellido_materno, puesto " +
                     "FROM empleado WHERE estado = 'Activo' ORDER BY apellido_paterno, nombres";

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
                empleados.add(new EmpleadoItem(
                    rs.getInt("id_empleado"),
                    nombreCompleto,
                    rs.getString("puesto")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerEmpleadosParaCombo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return empleados;
    }

    // ===================== BUSCAR EMPLEADOS =====================
    public static List<Map<String, Object>> buscarEmpleados(String criterio) {
        List<Map<String, Object>> empleados = new ArrayList<>();
        String sql = "SELECT e.id_empleado, e.nombres, e.apellido_paterno, e.apellido_materno, " +
                     "e.puesto, e.telefono, e.correo_electronico, em.nombre as empresa_nombre " +
                     "FROM empleado e " +
                     "LEFT JOIN empresa em ON e.id_empresa = em.id_empresa " +
                     "WHERE (e.nombres LIKE ? OR e.apellido_paterno LIKE ? OR e.apellido_materno LIKE ?) " +
                     "AND e.estado = 'Activo' " +
                     "ORDER BY e.apellido_paterno, e.nombres";

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
                Map<String, Object> empleado = new HashMap<>();
                empleado.put("id_empleado", rs.getInt("id_empleado"));
                empleado.put("nombres", rs.getString("nombres"));
                empleado.put("apellido_paterno", rs.getString("apellido_paterno"));
                empleado.put("apellido_materno", rs.getString("apellido_materno"));
                empleado.put("puesto", rs.getString("puesto"));
                empleado.put("telefono", rs.getString("telefono"));
                empleado.put("correo_electronico", rs.getString("correo_electronico"));
                empleado.put("empresa_nombre", rs.getString("empresa_nombre"));
                empleados.add(empleado);
            }

        } catch (SQLException e) {
            System.err.println("Error buscarEmpleados: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return empleados;
    }

    // ===================== VALIDACIÓN DE EMAIL ÚNICO =====================
    public static boolean emailExiste(String email, Integer idExcluir) {
        String sql = "SELECT COUNT(*) as count FROM empleado WHERE correo_electronico = ? AND estado = 'Activo'";
        if (idExcluir != null) {
            sql += " AND id_empleado != ?";
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

    // ===================== CLASE PARA ITEMS DE COMBOBOX =====================
    public static class EmpleadoItem {
        private final int id;
        private final String nombreCompleto;
        private final String puesto;

        public EmpleadoItem(int id, String nombreCompleto, String puesto) {
            this.id = id;
            this.nombreCompleto = nombreCompleto;
            this.puesto = puesto;
        }

        public int getId() { return id; }
        public String getNombreCompleto() { return nombreCompleto; }
        public String getPuesto() { return puesto; }

        @Override
        public String toString() {
            return nombreCompleto + " - " + puesto;
        }
    }

    // ===================== MÉTODOS AUXILIARES =====================
    private static void actualizarTablaConDatos(JTable table, List<Object[]> datos) {
        String[] columnas = {"ID", "Nombre completo", "Puesto", "Horario", "Teléfono", "Empresa"};
        
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
}
