package Modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.draw.LineSeparator;
import com.mycompany.mdtrack.Conexion;

public class CrearPDFHistorialMedico {

    private static final String s(Object v) {
        return v == null ? "" : String.valueOf(v).trim();
    }

    /**
     * Crea el PDF del historial médico del paciente y lo guarda en destinoPdf.
     */
    public File crearParaPaciente(int pacienteId, File destinoPdf) throws Exception {
        if (pacienteId <= 0) throw new IllegalArgumentException("ID de paciente inválido");

        if (destinoPdf == null) destinoPdf = defaultPathFor(String.valueOf(pacienteId));

        Map<String, Object> paciente = obtenerPacientePorId(pacienteId);
        if (paciente == null) throw new IllegalStateException("Paciente no encontrado: " + pacienteId);

        // Obtener datos según tu nueva estructura de BD
        Map<String, Object> historial = obtenerHistorialPorPaciente(pacienteId);
        List<Map<String, Object>> antHeredofamiliares = obtenerAntecedentesPorTipo(pacienteId, 1); // Heredofamiliar
        List<Map<String, Object>> antPersonales = obtenerAntecedentesPorTipo(pacienteId, 2); // Personal Patológico
        List<Map<String, Object>> antUltimoAnio = obtenerAntecedentesPorTipo(pacienteId, 3); // Último Año
        List<Map<String, Object>> consultas = obtenerConsultasPorPaciente(pacienteId);

        Document doc = new Document(PageSize.LETTER, 36, 36, 48, 36);
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream(destinoPdf);
            PdfWriter.getInstance(doc, fos);
            doc.open();

            Font fTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Font fSeccion = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            Font fTexto = FontFactory.getFont(FontFactory.HELVETICA, 10);

            // Título
            Paragraph titulo = new Paragraph("Historial Médico", fTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            doc.add(titulo);
            doc.add(new Paragraph(" "));

            // Datos del paciente
            doc.add(new Paragraph("Datos del paciente", fSeccion));
            PdfPTable tPac = new PdfPTable(2);
            tPac.setWidthPercentage(100);
            tPac.setSpacingBefore(6f);
            tPac.setSpacingAfter(10f);

            String nombreCompleto = s(paciente.get("nombres")) + " " + 
                                   s(paciente.get("apellido_paterno")) + " " + 
                                   s(paciente.get("apellido_materno"));
            
            addKV(tPac, "Nombre", nombreCompleto.replaceAll(" +", " ").trim(), fTexto);
            addKV(tPac, "Fecha de nacimiento", formatDate(paciente.get("fecha_nacimiento")), fTexto);
            addKV(tPac, "Sexo", s(paciente.get("sexo")), fTexto);
            addKV(tPac, "Correo", s(paciente.get("correo_electronico")), fTexto);
            addKV(tPac, "Teléfono", s(paciente.get("telefono")), fTexto);
            addKV(tPac, "Empresa", s(paciente.get("empresa_nombre")), fTexto);
            doc.add(tPac);

            // Historial médico
            doc.add(new Paragraph("Historial médico", fSeccion));
            if (historial != null && !historial.isEmpty()) {
                PdfPTable th = new PdfPTable(2);
                th.setWidthPercentage(100);
                addKV(th, "Tipo de sangre", s(historial.get("tipo_sangre")), fTexto);
                addKV(th, "Peso (kg)", formatDecimal(historial.get("peso")), fTexto);
                addKV(th, "Altura (m)", formatDecimal(historial.get("altura")), fTexto);
                addKV(th, "IMC", formatDecimal(historial.get("imc")), fTexto);
                doc.add(th);
            } else {
                doc.add(new Paragraph("Sin historial médico registrado.", fTexto));
            }
            doc.add(new Paragraph(" "));

            // Antecedentes según tu nueva estructura
            addSeccionAntecedentesNormalizados(doc, "Antecedentes Heredofamiliares", antHeredofamiliares, fSeccion, fTexto);
            addSeccionAntecedentesNormalizados(doc, "Antecedentes Personales Patológicos", antPersonales, fSeccion, fTexto);
            addSeccionAntecedentesNormalizados(doc, "Antecedentes - Último Año", antUltimoAnio, fSeccion, fTexto);

            // Consultas
            doc.add(new Paragraph("Historial de Consultas", fSeccion));
            doc.add(new Paragraph(" "));

            if (consultas.isEmpty()) {
                doc.add(new Paragraph("Sin consultas registradas.", fTexto));
            } else {
                for (int i = 0; i < consultas.size(); i++) {
                    Map<String, Object> c = consultas.get(i);
                    String fecha = formatDate(c.get("fecha_registro"));
                    Paragraph ph = new Paragraph("Consulta " + (i + 1) + " - " + (fecha.isEmpty() ? "(Sin fecha)" : fecha), fSeccion);
                    ph.setSpacingBefore(12f);
                    ph.setSpacingAfter(6f);
                    doc.add(ph);

                    PdfPTable tc = new PdfPTable(2);
                    tc.setWidthPercentage(100);

                    addKV(tc, "Motivo", s(c.get("motivo")), fTexto);
                    addKV(tc, "Síntomas", s(c.get("sintomas")), fTexto);
                    addKV(tc, "Signos vitales", s(c.get("signos_vitales")), fTexto);
                    addKV(tc, "Exploración física", s(c.get("exploracion_fisica")), fTexto);
                    addKV(tc, "Diagnóstico", s(c.get("diagnostico")), fTexto);
                    addKV(tc, "Tratamiento/Medicación", s(c.get("medicacion_prescrita")), fTexto);
                    addKV(tc, "Indicaciones médicas", s(c.get("indicaciones_medicas")), fTexto);
                    addKV(tc, "Restricciones médicas", s(c.get("restricciones_medicas")), fTexto);
                    addKV(tc, "Pronóstico", s(c.get("pronostico")), fTexto);
                    addKV(tc, "Médico", s(c.get("medico_nombre")), fTexto);

                    doc.add(tc);

                    if (i < consultas.size() - 1) {
                        LineSeparator ls = new LineSeparator();
                        ls.setLineColor(new java.awt.Color(200, 200, 200));
                        doc.add(new Chunk(ls));
                        doc.add(new Paragraph(" "));
                    }
                }
            }

            doc.close();
            return destinoPdf;
            
        } catch (Exception e) {
            if (doc.isOpen()) {
                doc.close();
            }
            if (fos != null) {
                try { fos.close(); } catch (Exception ex) { }
            }
            throw e;
        }
    }

    // -------------------- Métodos que consultan la BD (NUEVA ESTRUCTURA) --------------------

    private Map<String, Object> obtenerPacientePorId(int pacienteId) {
        String sql = "SELECT p.*, e.nombre as empresa_nombre FROM paciente p " +
                     "LEFT JOIN empresa e ON p.id_empresa = e.id_empresa WHERE p.id_paciente = ?";
        Map<String, Object> out = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();
            if (rs.next()) {
                out.put("nombres", rs.getString("nombres"));
                out.put("apellido_paterno", rs.getString("apellido_paterno"));
                out.put("apellido_materno", rs.getString("apellido_materno"));
                out.put("fecha_nacimiento", rs.getDate("fecha_nacimiento"));
                out.put("sexo", rs.getString("sexo"));
                out.put("correo_electronico", rs.getString("correo_electronico"));
                out.put("telefono", rs.getString("telefono"));
                out.put("empresa_nombre", rs.getString("empresa_nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error obtenerPacientePorId: " + e.getMessage());
            return null;
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return out.isEmpty() ? null : out;
    }

    private Map<String, Object> obtenerHistorialPorPaciente(int pacienteId) {
        String sql = "SELECT * FROM historial_medico WHERE id_paciente = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Map<String,Object> m = new HashMap<>();
                m.put("tipo_sangre", rs.getString("tipo_sangre"));
                m.put("peso", rs.getObject("peso"));
                m.put("altura", rs.getObject("altura"));
                m.put("imc", rs.getObject("imc"));
                return m;
            }
        } catch (SQLException e) {
            System.err.println("Error obtenerHistorialPorPaciente: " + e.getMessage());
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return null;
    }

    // NUEVO MÉTODO: Obtener antecedentes por tipo según tu estructura normalizada
    private List<Map<String, Object>> obtenerAntecedentesPorTipo(int pacienteId, int idTipo) {
        List<Map<String, Object>> list = new ArrayList<>();
        Integer idHist = obtenerIdHistorial(pacienteId);
        if (idHist == null) return list;
        
        String sql = "SELECT ca.nombre, ar.presente, ar.detalle " +
                     "FROM antecedente_registro ar " +
                     "JOIN catalogo_antecedente ca ON ar.id_condicion = ca.id_condicion " +
                     "WHERE ar.id_historial = ? AND ca.id_tipo = ? " +
                     "ORDER BY ca.nombre";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idHist);
            stmt.setInt(2, idTipo);
            rs = stmt.executeQuery();
            
            Map<String, Object> antecedentes = new HashMap<>();
            while (rs.next()) {
                String nombreCondicion = rs.getString("nombre");
                boolean presente = rs.getBoolean("presente");
                String detalle = s(rs.getString("detalle"));
                
                String valor = presente ? "Sí" : "No";
                if (presente && !detalle.isEmpty()) {
                    valor += " - " + detalle;
                }
                
                antecedentes.put(nombreCondicion, valor);
            }
            
            if (!antecedentes.isEmpty()) {
                list.add(antecedentes);
            }
            
        } catch (SQLException e) {
            System.err.println("Error obtenerAntecedentesPorTipo: " + e.getMessage());
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return list;
    }

    private List<Map<String, Object>> obtenerConsultasPorPaciente(int pacienteId) {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT con.*, " +
                     "CONCAT(e.nombres, ' ', COALESCE(e.apellido_paterno, ''), ' ', COALESCE(e.apellido_materno, '')) as medico_nombre " +
                     "FROM consulta con " +
                     "JOIN cita c ON con.id_cita = c.id_cita " +
                     "LEFT JOIN empleado e ON con.id_medico = e.id_empleado " +
                     "WHERE c.id_paciente = ? " +
                     "ORDER BY con.fecha_registro DESC";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Map<String,Object> m = new HashMap<>();
                m.put("fecha_registro", rs.getTimestamp("fecha_registro"));
                m.put("motivo", rs.getString("motivo"));
                m.put("sintomas", rs.getString("sintomas"));
                m.put("signos_vitales", rs.getString("signos_vitales"));
                m.put("exploracion_fisica", rs.getString("exploracion_fisica"));
                m.put("diagnostico", rs.getString("diagnostico"));
                m.put("indicaciones_medicas", rs.getString("indicaciones_medicas"));
                m.put("restricciones_medicas", rs.getString("restricciones_medicas"));
                m.put("medicacion_prescrita", rs.getString("medicacion_prescrita"));
                m.put("pronostico", rs.getString("pronostico"));
                m.put("medico_nombre", rs.getString("medico_nombre"));
                list.add(m);
            }
        } catch (SQLException e) {
            System.err.println("Error obtenerConsultasPorPaciente: " + e.getMessage());
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return list;
    }

    private Integer obtenerIdHistorial(int pacienteId) {
        String sql = "SELECT id_historial FROM historial_medico WHERE id_paciente = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pacienteId);
            rs = stmt.executeQuery();
            if (rs.next()) return rs.getInt("id_historial");
        } catch (SQLException e) {
            System.err.println("Error obtenerIdHistorial: " + e.getMessage());
        } finally {
            cerrarRecursos(rs, stmt, conn);
        }
        return null;
    }

    // -------------------- Helpers PDF --------------------

    private static void addKV(PdfPTable table, String k, String v, Font f) {
        if (v == null || v.isEmpty() || v.equals("No")) return; // No mostrar "No"
        PdfPCell ck = new PdfPCell(new Phrase(k, f));
        PdfPCell cv = new PdfPCell(new Phrase(v, f));
        ck.setBorderColor(new java.awt.Color(220, 220, 220));
        cv.setBorderColor(new java.awt.Color(220, 220, 220));
        ck.setPadding(5f);
        cv.setPadding(5f);
        table.addCell(ck);
        table.addCell(cv);
    }

    private static void addSeccionAntecedentesNormalizados(Document doc, String titulo, 
            List<Map<String,Object>> antecedentes, Font fSeccion, Font fTexto) throws DocumentException {
        if (antecedentes == null || antecedentes.isEmpty() || antecedentes.get(0).isEmpty()) {
            return;
        }
        
        Paragraph ph = new Paragraph(titulo, fSeccion);
        ph.setSpacingBefore(10f);
        ph.setSpacingAfter(6f);
        doc.add(ph);
        
        for (Map<String,Object> mapa : antecedentes) {
            PdfPTable t = new PdfPTable(2);
            t.setWidthPercentage(100);
            
            for (Map.Entry<String, Object> entry : mapa.entrySet()) {
                String valor = s(entry.getValue());
                if (!valor.isEmpty() && !valor.equals("No")) {
                    addKV(t, entry.getKey(), valor, fTexto);
                }
            }
            
            if (t.getRows().size() > 0) {
                doc.add(t);
                doc.add(new Paragraph(" "));
            }
        }
    }

    private static String formatDate(Object date) {
        if (date == null) return "";
        try {
            if (date instanceof java.sql.Date) {
                return new SimpleDateFormat("dd/MM/yyyy").format((java.sql.Date) date);
            } else if (date instanceof java.sql.Timestamp) {
                return new SimpleDateFormat("dd/MM/yyyy HH:mm").format((java.sql.Timestamp) date);
            } else if (date instanceof java.util.Date) {
                return new SimpleDateFormat("dd/MM/yyyy").format((java.util.Date) date);
            }
        } catch (Exception e) {
            // Ignorar errores de formato
        }
        return s(date);
    }

    private static String formatDecimal(Object number) {
        if (number == null) return "";
        try {
            double value = Double.parseDouble(number.toString());
            if (value == 0) return "";
            return String.format("%.2f", value);
        } catch (Exception e) {
            return s(number);
        }
    }

    private static File defaultPathFor(String pacienteId) {
        String home = System.getProperty("user.home");
        String fileName = "Historial_Medico_" + pacienteId + "_" + 
                         new SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date()) + ".pdf";
        return new File(home, fileName);
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