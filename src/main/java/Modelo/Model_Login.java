package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.mdtrack.Conexion;

public class Model_Login {

    public static Integer USUARIO_LOGUEADO_ID = null;
    public static String USUARIO_LOGUEADO_ROL = null;

    public static String verificarUsuario(String usuario, String password) {
        String u = safe(usuario);
        String p = safe(password);

        if (u.isEmpty() || p.isEmpty()) 
            return null;

        // Consulta CORREGIDA: Buscar en tabla usuario por username O en empleado por correo
        String sql = "SELECT u.id_usuario, u.id_empleado, u.rol, u.password_hash, " +
                    "e.nombres, e.apellido_paterno, e.apellido_materno, e.correo_electronico " +
                    "FROM usuario u " +
                    "INNER JOIN empleado e ON u.id_empleado = e.id_empleado " +
                    "WHERE (u.username = ? OR e.correo_electronico = ?) " +
                    "AND e.estado = 'Activo' LIMIT 1";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, u);
            stmt.setString(2, u);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password_hash");
                System.out.println("DEBUG: Password ingresado: " + p);
                System.out.println("DEBUG: Password en BD: " + storedPassword);

                // Para testing: comparación directa (en producción usar BCrypt)
                boolean valid = storedPassword != null && storedPassword.equals(p);

                if (valid) {
                    USUARIO_LOGUEADO_ID = rs.getInt("id_empleado");
                    USUARIO_LOGUEADO_ROL = safe(rs.getString("rol"));
                    System.out.println("DEBUG: Login exitoso. ID: " + USUARIO_LOGUEADO_ID + ", Rol: " + USUARIO_LOGUEADO_ROL);
                    return String.valueOf(USUARIO_LOGUEADO_ID);
                } else {
                    System.out.println("DEBUG: Contraseña incorrecta");
                }
            } else {
                System.out.println("DEBUG: Usuario no encontrado: " + u);
            }

        } catch (SQLException e) {
            System.err.println("Error verificarUsuario: " + e.getMessage());
            e.printStackTrace();
        }

        USUARIO_LOGUEADO_ID = null;
        USUARIO_LOGUEADO_ROL = null;
        return null;
    }

    public static String obtenerRolPorId(int idEmpleado) {
        String sql = "SELECT u.rol FROM usuario u WHERE u.id_empleado = ? LIMIT 1";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEmpleado);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("rol");
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerRolPorId: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    private static String safe(String s) {
        return s == null ? "" : s.trim();
    }
}