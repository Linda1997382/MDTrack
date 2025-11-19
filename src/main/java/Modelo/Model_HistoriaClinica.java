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

import com.mycompany.mdtrack.Conexion;

public class Model_HistoriaClinica {

    // ================= CREAR O ACTUALIZAR HISTORIAL MÉDICO =================
    public static boolean guardarHistorialMedico(int idPaciente, Map<String, Object> datos) {
        Integer idHist = obtenerIdHistorialPorPaciente(idPaciente);
        if (idHist != null) {
            return actualizarHistorialMedico(idHist, datos);
        } else {
            return crearNuevoHistorialMedico(idPaciente, datos);
        }
    }

    private static boolean crearNuevoHistorialMedico(int idPaciente, Map<String, Object> datos) {
        String sql = "INSERT INTO historial_medico (id_paciente, tipo_sangre, peso, altura, imc) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1, idPaciente);
            stmt.setString(2, safe(datos.getOrDefault("tipo_sangre", "")));
            setNullableDouble(stmt, 3, datos.get("peso"));
            setNullableDouble(stmt, 4, datos.get("altura"));
            setNullableDouble(stmt, 5, datos.get("imc"));

            int aff = stmt.executeUpdate();
            if (aff > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int idHist = rs.getInt(1);
                    calcularYActualizarIMC(idHist);
                }
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error crearNuevoHistorialMedico: " + e.getMessage());
        }
        return false;
    }

    private static boolean actualizarHistorialMedico(int idHistorial, Map<String, Object> datos) {
        String sql = "UPDATE historial_medico SET tipo_sangre = ?, peso = ?, altura = ?, imc = ? WHERE id_historial = ?";
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, safe(datos.getOrDefault("tipo_sangre", "")));
            setNullableDouble(stmt, 2, datos.get("peso"));
            setNullableDouble(stmt, 3, datos.get("altura"));
            setNullableDouble(stmt, 4, datos.get("imc"));
            stmt.setInt(5, idHistorial);

            boolean res = stmt.executeUpdate() > 0;
            if (res) calcularYActualizarIMC(idHistorial);
            return res;

        } catch (SQLException e) {
            System.err.println("Error actualizarHistorialMedico: " + e.getMessage());
        }
        return false;
    }

    // ================= GESTIÓN DE ANTECEDENTES (NUEVO SISTEMA) =================
    
    public static boolean guardarAntecedente(int idPaciente, int idCondicion, boolean presente, String detalle) {
        Integer idHist = obtenerIdHistorialPorPaciente(idPaciente);
        if (idHist == null) return false;

        String sql = "INSERT INTO antecedente_registro (id_historial, id_condicion, presente, detalle) " +
                     "VALUES (?, ?, ?, ?) ON DUPLICATE KEY UPDATE presente = ?, detalle = ?";
        
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idHist);
            stmt.setInt(2, idCondicion);
            stmt.setBoolean(3, presente);
            stmt.setString(4, safe(detalle));
            stmt.setBoolean(5, presente);
            stmt.setString(6, safe(detalle));

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error guardarAntecedente: " + e.getMessage());
        }
        return false;
    }

    public static Map<String, List<Map<String, Object>>> obtenerAntecedentesPorPaciente(int idPaciente) {
        Map<String, List<Map<String, Object>>> antecedentesPorTipo = new HashMap<>();
        Integer idHist = obtenerIdHistorialPorPaciente(idPaciente);
        if (idHist == null) return antecedentesPorTipo;

        String sql = "SELECT ar.id_condicion, ca.nombre, ca.codigo, ar.presente, ar.detalle, ta.nombre as tipo " +
                     "FROM antecedente_registro ar " +
                     "JOIN catalogo_antecedente ca ON ar.id_condicion = ca.id_condicion " +
                     "JOIN tipo_antecedente ta ON ca.id_tipo = ta.id_tipo " +
                     "WHERE ar.id_historial = ? " +
                     "ORDER BY ta.nombre, ca.nombre";
        
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idHist);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String tipo = rs.getString("tipo");
                Map<String, Object> antecedente = new HashMap<>();
                antecedente.put("id_condicion", rs.getInt("id_condicion"));
                antecedente.put("nombre", rs.getString("nombre"));
                antecedente.put("codigo", rs.getString("codigo"));
                antecedente.put("presente", rs.getBoolean("presente"));
                antecedente.put("detalle", rs.getString("detalle"));
                
                antecedentesPorTipo
                    .computeIfAbsent(tipo, k -> new ArrayList<>())
                    .add(antecedente);
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerAntecedentesPorPaciente: " + e.getMessage());
        }
        return antecedentesPorTipo;
    }

    // ================= OBTENER CATÁLOGO COMPLETO =================
    
    public static List<Map<String, Object>> obtenerCatalogoCompleto() {
        List<Map<String, Object>> catalogo = new ArrayList<>();
        String sql = "SELECT ca.id_condicion, ca.nombre, ca.codigo, ta.nombre as tipo " +
                     "FROM catalogo_antecedente ca " +
                     "JOIN tipo_antecedente ta ON ca.id_tipo = ta.id_tipo " +
                     "ORDER BY ta.nombre, ca.nombre";
        
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Map<String, Object> item = new HashMap<>();
                item.put("id_condicion", rs.getInt("id_condicion"));
                item.put("nombre", rs.getString("nombre"));
                item.put("codigo", rs.getString("codigo"));
                item.put("tipo", rs.getString("tipo"));
                catalogo.add(item);
            }

        } catch (SQLException e) {
            System.err.println("Error obtenerCatalogoCompleto: " + e.getMessage());
        }
        return catalogo;
    }

    // ================= MÉTODOS AUXILIARES =================
    
    private static void calcularYActualizarIMC(int idHistorial) {
        String sqlSelect = "SELECT peso, altura FROM historial_medico WHERE id_historial = ?";
        String sqlUpdate = "UPDATE historial_medico SET imc = ? WHERE id_historial = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sqlSelect)) {

            ps.setInt(1, idHistorial);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double peso = rs.getDouble("peso");
                double altura = rs.getDouble("altura");

                if (peso > 0 && altura > 0) {
                    double imc = peso / (altura * altura);
                    try (PreparedStatement pu = conn.prepareStatement(sqlUpdate)) {
                        pu.setDouble(1, imc);
                        pu.setInt(2, idHistorial);
                        pu.executeUpdate();
                    }
                }
            }
            rs.close();

        } catch (SQLException e) {
            System.err.println("Error calcularYActualizarIMC: " + e.getMessage());
        }
    }

    public static Map<String, Object> obtenerHistorialMedico(int idPaciente) {
        String sql = "SELECT * FROM historial_medico WHERE id_paciente = ?";
        Map<String, Object> out = new HashMap<>();

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                out.put("id_historial", rs.getInt("id_historial"));
                out.put("id_paciente", rs.getInt("id_paciente"));
                out.put("tipo_sangre", rs.getString("tipo_sangre"));
                out.put("peso", rs.getObject("peso"));
                out.put("altura", rs.getObject("altura"));
                out.put("imc", rs.getObject("imc"));
                out.put("fecha_actualizacion", rs.getTimestamp("fecha_actualizacion"));
            }
            rs.close();

        } catch (SQLException e) {
            System.err.println("Error obtenerHistorialMedico: " + e.getMessage());
        }
        return out.isEmpty() ? null : out;
    }

    public static Integer obtenerIdHistorialPorPaciente(int idPaciente) {
        String sql = "SELECT id_historial FROM historial_medico WHERE id_paciente = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) return rs.getInt("id_historial");

        } catch (SQLException e) {
            System.err.println("Error obtenerIdHistorialPorPaciente: " + e.getMessage());
        }
        return null;
    }

    // ================= ELIMINAR ANTECEDENTES =================
    
    public static boolean eliminarAntecedentesPaciente(int idPaciente) {
        Integer idHist = obtenerIdHistorialPorPaciente(idPaciente);
        if (idHist == null) return false;

        String sql = "DELETE FROM antecedente_registro WHERE id_historial = ?";
        
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idHist);
            return stmt.executeUpdate() >= 0;

        } catch (SQLException e) {
            System.err.println("Error eliminarAntecedentesPaciente: " + e.getMessage());
        }
        return false;
    }

    // ================= AUXILIARES =================
    
    private static void setNullableDouble(PreparedStatement stmt, int idx, Object v) throws SQLException {
        if (v == null || v.toString().isEmpty()) {
            stmt.setNull(idx, Types.DECIMAL);
        } else {
            try {
                stmt.setDouble(idx, Double.parseDouble(v.toString()));
            } catch (NumberFormatException e) {
                stmt.setNull(idx, Types.DECIMAL);
            }
        }
    }

    private static String safe(Object obj) {
        return obj == null ? "" : obj.toString().trim();
    }
}