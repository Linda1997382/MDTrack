package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.mdtrack.Conexion;

public class Model_Home {

    public static Contadores contarConsultasDeEmpleado(int empleadoId) {
        int consultasHoy = 0;
        int consultasMes = 0;

        String sqlHoy = "SELECT COUNT(*) as total FROM consulta con "
                + "JOIN cita c ON con.id_cita = c.id_cita "
                + "WHERE con.id_medico = ? AND DATE(c.fecha_hora) = CURDATE()";

        String sqlMes = "SELECT COUNT(*) as total FROM consulta con "
                + "JOIN cita c ON con.id_cita = c.id_cita "
                + "WHERE con.id_medico = ? AND YEAR(c.fecha_hora) = YEAR(CURDATE()) "
                + "AND MONTH(c.fecha_hora) = MONTH(CURDATE())";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ph = conn.prepareStatement(sqlHoy);
             PreparedStatement pm = conn.prepareStatement(sqlMes)) {

            ph.setInt(1, empleadoId);
            ResultSet r1 = ph.executeQuery();
            if (r1.next()) consultasHoy = r1.getInt("total");

            pm.setInt(1, empleadoId);
            ResultSet r2 = pm.executeQuery();
            if (r2.next()) consultasMes = r2.getInt("total");

        } catch (SQLException e) {
            System.err.println("Error contarConsultasDeEmpleado: " + e.getMessage());
        }

        return new Contadores(consultasHoy, consultasMes);
    }

    public static int contarCitasHoy(int empleadoId) {
        String sql = "SELECT COUNT(*) as total FROM cita "
                + "WHERE id_empleado = ? AND DATE(fecha_hora) = CURDATE() AND estado = 'Programada'";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, empleadoId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) return rs.getInt("total");

        } catch (SQLException e) {
            System.err.println("Error contarCitasHoy: " + e.getMessage());
        }

        return 0;
    }

    public static int contarPacientesMes(int empleadoId) {
        String sql = "SELECT COUNT(DISTINCT c.id_paciente) as total FROM consulta con "
                + "JOIN cita c ON con.id_cita = c.id_cita "
                + "WHERE con.id_medico = ? AND YEAR(c.fecha_hora) = YEAR(CURDATE()) "
                + "AND MONTH(c.fecha_hora) = MONTH(CURDATE())";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, empleadoId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) return rs.getInt("total");

        } catch (SQLException e) {
            System.err.println("Error contarPacientesMes: " + e.getMessage());
        }
        return 0;
    }

    public static EstadisticasGenerales obtenerEstadisticasGenerales() {
        int totalPacientes = 0, totalEmpleados = 0, totalConsultasHoy = 0, totalCitasProgramadas = 0;

        try (Connection conn = Conexion.conectar()) {

            try (PreparedStatement p = conn.prepareStatement(
                    "SELECT COUNT(*) as total FROM paciente WHERE estado = 'Activo'")) {
                ResultSet r = p.executeQuery();
                if (r.next()) totalPacientes = r.getInt("total");
            }

            try (PreparedStatement p = conn.prepareStatement(
                    "SELECT COUNT(*) as total FROM empleado WHERE estado = 'Activo'")) {
                ResultSet r = p.executeQuery();
                if (r.next()) totalEmpleados = r.getInt("total");
            }

            try (PreparedStatement p = conn.prepareStatement(
                    "SELECT COUNT(*) as total FROM consulta con "
                  + "JOIN cita c ON con.id_cita = c.id_cita "
                  + "WHERE DATE(c.fecha_hora) = CURDATE()")) {
                ResultSet r = p.executeQuery();
                if (r.next()) totalConsultasHoy = r.getInt("total");
            }

            try (PreparedStatement p = conn.prepareStatement(
                    "SELECT COUNT(*) as total FROM cita WHERE estado = 'Programada'")) {
                ResultSet r = p.executeQuery();
                if (r.next()) totalCitasProgramadas = r.getInt("total");
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerEstadisticasGenerales: " + e.getMessage());
        }

        return new EstadisticasGenerales(totalPacientes, totalEmpleados,
                totalConsultasHoy, totalCitasProgramadas);
    }

    public static List<Object[]> obtenerProximasCitasHoy(int empleadoId) {
        List<Object[]> list = new ArrayList<>();

        String sql = "SELECT c.id_cita, p.nombres, p.apellido_paterno, p.apellido_materno, "
                + "c.fecha_hora, c.motivo "
                + "FROM cita c JOIN paciente p ON c.id_paciente = p.id_paciente "
                + "WHERE c.id_empleado = ? AND DATE(c.fecha_hora) = CURDATE() "
                + "AND c.estado = 'Programada' "
                + "ORDER BY c.fecha_hora ASC LIMIT 5";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, empleadoId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombreCompleto = fullName(
                        rs.getString("nombres"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno")
                );

                list.add(new Object[]{
                        rs.getInt("id_cita"),
                        nombreCompleto,
                        rs.getTimestamp("fecha_hora"),
                        rs.getString("motivo")
                });
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerProximasCitasHoy: " + e.getMessage());
        }

        return list;
    }

    // ================= CLASES =================

    public static class Contadores {
        public final int hoy;
        public final int mes;

        public Contadores(int h, int m) {
            this.hoy = h;
            this.mes = m;
        }
    }

    public static class EstadisticasGenerales {
        public final int totalPacientes, totalEmpleados, totalConsultasHoy, totalCitasProgramadas;

        public EstadisticasGenerales(int a, int b, int c, int d) {
            this.totalPacientes = a;
            this.totalEmpleados = b;
            this.totalConsultasHoy = c;
            this.totalCitasProgramadas = d;
        }
    }

    // ================= MÉTODO AUXILIAR =================

    private static String fullName(String nombres, String apellidoPaterno, String apellidoMaterno) {
        StringBuilder sb = new StringBuilder();

        if (nombres != null && !nombres.isBlank())
            sb.append(nombres.trim()).append(" ");
        if (apellidoPaterno != null && !apellidoPaterno.isBlank())
            sb.append(apellidoPaterno.trim()).append(" ");
        if (apellidoMaterno != null && !apellidoMaterno.isBlank())
            sb.append(apellidoMaterno.trim());

        return sb.toString().trim();
    }
}
