package Form;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import Swing.ScrollBar;

public class Form_Formulario_Consulta_Ver extends javax.swing.JPanel {

    private final String pacienteId;
    private final String empleadoId;
    private final String consultaId;

    public Form_Formulario_Consulta_Ver(String pacienteId, String empleadoId, String consultaId) {
        initComponents();
        this.pacienteId = pacienteId;
        this.empleadoId = empleadoId;
        this.consultaId = consultaId;
        spFormularioConsultas.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spFormularioConsultas.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        cargarConsultaEnFormulario(pacienteId, empleadoId);
    }

    // ===================== MÉTODOS AUXILIARES PARA PARSEAR =====================

    /**
     * Parsea el campo signos_vitales de la BD a campos individuales
     */
    private void parsearSignosVitales(String signosVitales) {
        if (signosVitales == null || signosVitales.isEmpty()) return;
        
        // Buscar patrones comunes en el texto
        String texto = signosVitales.toLowerCase();
        
        // Frecuencia cardiaca (buscar "fc", "cardíaca", "pulso", etc.)
        if (texto.contains("fc:") || texto.contains("frecuencia cardiaca:") || texto.contains("pulso:")) {
            String valor = extraerValor(texto, "fc:", "frecuencia cardiaca:", "pulso:");
            txtFrecuenciaCardiaca.setText(valor);
        }
        
        // Frecuencia respiratoria
        if (texto.contains("fr:") || texto.contains("frecuencia respiratoria:")) {
            String valor = extraerValor(texto, "fr:", "frecuencia respiratoria:");
            txtFrecuenciaRespiratoria.setText(valor);
        }
        
        // Tensión arterial
        if (texto.contains("ta:") || texto.contains("tensión arterial:") || texto.contains("presión:")) {
            String valor = extraerValor(texto, "ta:", "tensión arterial:", "presión:");
            txtTensionArterial.setText(valor);
        }
        
        // Temperatura
        if (texto.contains("temp:") || texto.contains("temperatura:") || texto.contains("t°:")) {
            String valor = extraerValor(texto, "temp:", "temperatura:", "t°:");
            txtTemperatura.setText(valor);
        }
        
        // Oximetría
        if (texto.contains("oxi:") || texto.contains("oximetría:") || texto.contains("saturación:")) {
            String valor = extraerValor(texto, "oxi:", "oximetría:", "saturación:");
            txtOximetria.setText(valor);
        }
    }

    /**
     * Parsea el campo exploracion_fisica de la BD a campos individuales
     */
    private void parsearExploracionFisica(String exploracionFisica) {
        if (exploracionFisica == null || exploracionFisica.isEmpty()) return;
        
        String texto = exploracionFisica.toLowerCase();
        
        // Habitus exterior
        if (texto.contains("habitus:") || texto.contains("habitus exterior:") || texto.contains("aspecto general:")) {
            String valor = extraerValor(texto, "habitus:", "habitus exterior:", "aspecto general:");
            jepHabitusExterior.setText(capitalize(valor));
        }
        
        // Cráneo
        if (texto.contains("cráneo:") || texto.contains("craneo:") || texto.contains("cabeza:")) {
            String valor = extraerValor(texto, "cráneo:", "craneo:", "cabeza:");
            jepCraneo.setText(capitalize(valor));
        }
        
        // Cuello
        if (texto.contains("cuello:")) {
            String valor = extraerValor(texto, "cuello:");
            jepCuello.setText(capitalize(valor));
        }
        
        // Tórax
        if (texto.contains("tórax:") || texto.contains("torax:") || texto.contains("pecho:")) {
            String valor = extraerValor(texto, "tórax:", "torax:", "pecho:");
            jepTorax.setText(capitalize(valor));
        }
        
        // Abdomen
        if (texto.contains("abdomen:") || texto.contains("vientre:") || texto.contains("barriga:")) {
            String valor = extraerValor(texto, "abdomen:", "vientre:", "barriga:");
            jepAbdomen.setText(capitalize(valor));
        }
        
        // Genitales
        if (texto.contains("genitales:") || texto.contains("genital:")) {
            String valor = extraerValor(texto, "genitales:", "genital:");
            jepGenitales.setText(capitalize(valor));
        }
        
        // Miembros
        if (texto.contains("miembros:") || texto.contains("extremidades:") || texto.contains("brazos") || texto.contains("piernas")) {
            String valor = extraerValor(texto, "miembros:", "extremidades:");
            jepMiembros.setText(capitalize(valor));
        }
    }

    /**
     * Extrae el valor después de una clave en el texto
     */
    private String extraerValor(String texto, String... claves) {
        for (String clave : claves) {
            int index = texto.indexOf(clave);
            if (index != -1) {
                int start = index + clave.length();
                int end = texto.indexOf(",", start);
                if (end == -1) end = texto.length();
                
                String valor = texto.substring(start, end).trim();
                // Limpiar el valor (quitar puntos finales, etc.)
                if (valor.endsWith(".")) {
                    valor = valor.substring(0, valor.length() - 1);
                }
                return valor;
            }
        }
        return "";
    }

    /**
     * Convierte la primera letra a mayúscula
     */
    private String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // ... (TODO EL CÓDIGO GENERADO POR NETBEANS SE MANTIENE IGUAL)
        // NO MODIFICAR NADA DENTRO DE ESTA SECCIÓN
        // ...

    }// </editor-fold>//GEN-END:initComponents

    private void lblcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseClicked
        if (navigator != null) {
            Form_Consultas back = new Form_Consultas(Integer.parseInt(empleadoId));
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }//GEN-LAST:event_lblcancelarMouseClicked

    private void lblcancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseEntered
        btnCancelar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblcancelarMouseEntered

    private void lblcancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseExited
        btnCancelar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblcancelarMouseExited

    private void lblRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecetaMouseClicked

        try {
            // Nombre de archivo: Receta_Nombre_YYYYMMDD.pdf
            String nombre = txtPaciente.getText().trim();
            String fecha = txtFecha.getText().replace("/", "");
            if (nombre.isEmpty()) {
                nombre = "Paciente";
            }
            if (fecha.isEmpty()) {
                fecha = "fecha";
            }

            String safeNombre = nombre.replaceAll("[^\\p{L}\\p{N}_\\- ]", "").replace(" ", "_");
            File destino = new File(System.getProperty("user.home"),
                    "Receta_" + safeNombre + "_" + fecha + ".pdf");

            generarRecetaPDF(destino);
            JOptionPane.showMessageDialog(this, "Receta generada:\n" + destino.getAbsolutePath());
            // Si quieres abrirla automáticamente en el visor del sistema:
            try {
                java.awt.Desktop.getDesktop().open(destino);
            } catch (Exception ignore) {
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al generar la receta: " + ex.getMessage());
        }

    }//GEN-LAST:event_lblRecetaMouseClicked

    private void lblRecetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecetaMouseEntered
        btnReceta.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblRecetaMouseEntered

    private void lblRecetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecetaMouseExited
        btnReceta.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblRecetaMouseExited

    private void cargarConsultaEnFormulario(String id, String empleadoId) {
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    // Cargar datos del paciente
    new javax.swing.SwingWorker<Map<String, Object>, Void>() {
        @Override
        protected Map<String, Object> doInBackground() throws Exception {
            return Modelo.Model_Paciente.obtenerPacientePorId(Integer.parseInt(id));
        }

        @Override
        protected void done() {
            try {
                Map<String, Object> d = get();
                if (d == null) {
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "Paciente no encontrado.");
                    return;
                }
                txtPaciente.setText(val(d, "nombres") + " " + val(d, "apellido_paterno") + " " + val(d, "apellido_materno"));
                txtFechaNacimiento.setText(val(d, "fecha_nacimiento"));
                LocalDate fechaNacimiento = LocalDate.parse(val(d, "fecha_nacimiento"), formatter);
                Period periodo = Period.between(fechaNacimiento, fechaActual);
                int edad = periodo.getYears();
                txtEdad.setText(Integer.toString(edad));
                txtEmpresa.setText(val(d, "empresa_nombre"));
                txtSexo.setText(val(d, "sexo"));
                txtTel.setText(val(d, "telefono"));
                txtEmail.setText(val(d, "correo_electronico"));
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "No se pudo cargar paciente.");
            }
        }
    }.execute();

    // Cargar datos del médico - VERSIÓN CORREGIDA
    new javax.swing.SwingWorker<Modelo.Model_Empleado.Empleado, Void>() {
        @Override
        protected Modelo.Model_Empleado.Empleado doInBackground() throws Exception {
            return Modelo.Model_Empleado.obtenerEmpleadoPorId(Integer.parseInt(empleadoId));
        }

        @Override
        protected void done() {
            try {
                Modelo.Model_Empleado.Empleado empleado = get();
                if (empleado == null) {
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "Empleado no encontrado.");
                    return;
                }
                
                // Usar los getters del objeto Empleado
                String cedula = empleado.getCedulaProfesional();
                if (cedula != null && !cedula.isEmpty()) {
                    lblCedulaProfesional.setText("Cédula Profesional " + cedula);
                } else {
                    lblCedulaProfesional.setText(""); // O mostrar algo por defecto
                }
                
                lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                    empleado.getApellidoPaterno() + " " + 
                    empleado.getApellidoMaterno());
                    
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "No se pudo cargar el empleado.");
            }
        }
    }.execute();

    // Cargar datos de la consulta - VERSIÓN CORREGIDA
    new javax.swing.SwingWorker<Map<String, Object>, Void>() {
        @Override
        protected Map<String, Object> doInBackground() throws Exception {
            return Modelo.Model_Consultas.obtenerConsultaPorId(Integer.parseInt(consultaId));
        }

        @Override
        protected void done() {
            try {
                Map<String, Object> d = get();
                if (d == null) {
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "Consulta no encontrada.");
                    return;
                }
                
                // Campos que SÍ existen en tu BD
                txtFecha.setText(val(d, "fecha_registro"));
                jepMotivoConsulta.setText(val(d, "motivo"));
                
                // Signos vitales - parsear del campo TEXT
                String signosVitales = val(d, "signos_vitales");
                parsearSignosVitales(signosVitales);
                
                // Exploración física - parsear del campo TEXT
                String exploracionFisica = val(d, "exploracion_fisica");
                parsearExploracionFisica(exploracionFisica);
                
                // PEEA - usar sintomas que sí existe en tu BD
                jepPEEA.setText(val(d, "sintomas"));
                
                // Diagnóstico - sí existe
                jepDiagnostico.setText(val(d, "diagnostico"));
                
                // Observaciones - usar indicaciones_medicas que sí existe
                jepObservaciones.setText(val(d, "indicaciones_medicas"));
                
                // Pronóstico - sí existe
                jepPronostico.setText(val(d, "pronostico"));
                
                // Tratamiento - usar medicacion_prescrita que sí existe
                jepTratamiento.setText(val(d, "medicacion_prescrita"));
                
                // Datos del historial médico
                txtPeso.setText(val(d, "peso"));
                txtEstatura.setText(val(d, "altura"));
                
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_Consulta_Ver.this, "No se pudo cargar la consulta.");
            }
        }
    }.execute();
}

    private static String val(Map<String, Object> m, String k) {
        Object v = m.get(k);
        return v == null ? "" : v.toString();
    }
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void generarRecetaPDF(File destino) throws IOException {
        // Configuración base
        PDRectangle pageSize = PDRectangle.LETTER;  // Carta vertical
        float margin = 36f;
        float y = pageSize.getHeight() - margin;
        float lineGap = 16f;        // salto entre renglones
        float sectionGap = 22f;     // salto entre secciones
        float labelWidth = 120f;    // ancho de etiqueta al dibujar par Label: Valor
        float contentMaxWidth = pageSize.getWidth() - margin * 2;

        // Obtener datos desde el formulario
        String medico = lblDoctor.getText();
        String cedula = lblCedulaProfesional.getText();
        String nombre = txtPaciente.getText();
        String fecha = txtFecha.getText();
        String dx = jepDiagnostico.getText();
        String meds = jepTratamiento.getText();
        String edad = txtEdad.getText();
        String peso = txtPeso.getText();
        String estatura = txtEstatura.getText();
        String ta = txtTensionArterial.getText();
        String temp = txtTemperatura.getText();

        // Limpia nulos
        if (nombre == null) nombre = "";
        if (fecha == null) fecha = "";
        if (dx == null) dx = "";
        if (meds == null) meds = "";
        if (edad == null) edad = "";
        if (peso == null) peso = "";
        if (estatura == null) estatura = "";
        if (ta == null) ta = "";
        if (temp == null) temp = "";

        try (PDDocument doc = new PDDocument()) {
            PDPage page = new PDPage(pageSize);
            doc.addPage(page);

            try (PDPageContentStream cs = new PDPageContentStream(doc, page)) {
                // Encabezado
                cs.setLineWidth(1.2f);
                cs.moveTo(margin, y - 30);
                cs.lineTo(pageSize.getWidth() - margin, y - 30);
                cs.stroke();

                drawText(cs, "GeneralMed", margin, y, PDType1Font.HELVETICA_BOLD, 26);
                drawText(cs, "URGENT CARE SG", margin, y - 18, PDType1Font.HELVETICA, 12);

                float rightX = pageSize.getWidth() - margin - 260f;
                drawParagraph(cs, medico, rightX, y + 12f, 260f, PDType1Font.HELVETICA_BOLD, 11, lineGap);
                drawParagraph(cs, cedula, rightX, y, 260f, PDType1Font.HELVETICA_BOLD, 11, lineGap);

                y -= 42f;

                // Línea superior
                cs.moveTo(margin, y);
                cs.lineTo(pageSize.getWidth() - margin, y);
                cs.stroke();
                y -= sectionGap;

                // Bloque: Nombre y Fecha
                drawLabelValue(cs, "Nombre del paciente:", nombre, margin, y, labelWidth, contentMaxWidth - 220f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                drawLabelValue(cs, "Fecha:", fecha, pageSize.getWidth() - margin - 200f, y, 50f, 150f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                y -= sectionGap;

                // Bloque: Signos/medidas (edad, peso, estatura, TA, temp)
                float colW = (pageSize.getWidth() - margin * 2) / 5f;
                drawLabelValue(cs, "Edad:", edad, margin + colW * 0, y, 45f, colW - 50f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                drawLabelValue(cs, "Peso:", peso + " kg", margin + colW * 1, y, 45f, colW - 50f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                drawLabelValue(cs, "Estatura:", estatura + " m", margin + colW * 2, y, 60f, colW - 65f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                drawLabelValue(cs, "T/A:", ta + " mmHG", margin + colW * 3, y, 30f, colW - 35f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                drawLabelValue(cs, "T°:", temp + " °C", margin + colW * 4, y, 25f, colW - 30f, PDType1Font.HELVETICA_BOLD, PDType1Font.HELVETICA, 12);
                y -= sectionGap + 6f;

                // Sección Diagnóstico (DX)
                drawSectionTitle(cs, "Diagnóstico", margin, y, pageSize.getWidth() - margin * 2);
                y -= lineGap + 4f;
                y = drawMultilineBox(cs, dx, margin, y, pageSize.getWidth() - margin * 2, 140f, PDType1Font.HELVETICA, 12, lineGap);
                y -= sectionGap;

                // Sección Medicamentos
                drawSectionTitle(cs, "Medicamentos", margin, y, pageSize.getWidth() - margin * 2);
                y -= lineGap + 4f;
                y = drawMultilineBox(cs, meds, margin, y, pageSize.getWidth() - margin * 2, 220f, PDType1Font.HELVETICA, 12, lineGap);
                y -= sectionGap;

                // Firma (línea)
                float firmaY = y - 40f;
                cs.moveTo(pageSize.getWidth() / 2f - 140f, firmaY);
                cs.lineTo(pageSize.getWidth() / 2f + 140f, firmaY);
                cs.stroke();
                drawText(cs, "Firma", pageSize.getWidth() / 2f - 15f, firmaY - 14f, PDType1Font.HELVETICA, 12);

                // Pie con dirección y teléfono
                float bottomY = margin + 18f;
                cs.moveTo(margin, bottomY + 20f);
                cs.lineTo(pageSize.getWidth() - margin, bottomY + 20f);
                cs.stroke();

                String footerNombre = "GENERALMED URGENT CARE SG";
                String footerDireccion = "Av. De Las Industrias 300-8, Parque Industrial Escobedo, "
                        + "C.P. 66062, Gral Escobedo, N.L. Tel.: 81 3588 7370";
                drawCentered(cs, footerNombre, pageSize.getWidth() / 2f, bottomY + 12f, PDType1Font.HELVETICA, 10);
                drawCentered(cs, footerDireccion, pageSize.getWidth() / 2f, bottomY, PDType1Font.HELVETICA, 10);

            }

            doc.save(destino);
        }
    }

    /**
     * Utilidades de dibujo
     */
    private void drawText(PDPageContentStream cs, String text, float x, float y, org.apache.pdfbox.pdmodel.font.PDFont font, float size) throws IOException {
        cs.beginText();
        cs.setFont(font, size);
        cs.newLineAtOffset(x, y);
        cs.showText(normalize(text));
        cs.endText();
    }

    private void drawCentered(PDPageContentStream cs, String text, float centerX, float y, org.apache.pdfbox.pdmodel.font.PDFont font, float size) throws IOException {
        float textWidth = font.getStringWidth(normalize(text)) / 1000f * size;
        float startX = centerX - textWidth / 2f;
        drawText(cs, text, startX, y, font, size);
    }

    private void drawSectionTitle(PDPageContentStream cs, String title, float x, float y, float width) throws IOException {
        drawText(cs, title, x, y, PDType1Font.HELVETICA_BOLD, 14f);
        cs.moveTo(x, y - 4f);
        cs.lineTo(x + width, y - 4f);
        cs.stroke();
    }

    private void drawLabelValue(
            PDPageContentStream cs, String label, String value,
            float x, float y, float labelW, float valueW,
            org.apache.pdfbox.pdmodel.font.PDFont labelFont,
            org.apache.pdfbox.pdmodel.font.PDFont valueFont,
            float fontSize) throws IOException {

        drawText(cs, label, x, y, labelFont, fontSize);
        drawText(cs, value == null ? "" : value, x + labelW, y, valueFont, fontSize);
    }

    private float drawParagraph(PDPageContentStream cs, String text, float x, float y, float width,
            org.apache.pdfbox.pdmodel.font.PDFont font, float fontSize, float lineGap) throws IOException {
        String[] lines = (text == null ? "" : text).split("\\R");
        float curY = y;
        for (String ln : lines) {
            drawText(cs, ln, x, curY, font, fontSize);
            curY -= lineGap;
        }
        return curY;
    }

    private float drawMultilineBox(PDPageContentStream cs, String text, float x, float yTop,
            float width, float height, org.apache.pdfbox.pdmodel.font.PDFont font,
            float fontSize, float lineGap) throws IOException {
        // Caja
        cs.addRect(x, yTop - height, width, height);
        cs.stroke();

        // Texto envuelto simple por líneas
        float usableWidth = width - 10f;
        float cursorY = yTop - 8f;
        float cursorX = x + 6f;

        String content = (text == null ? "" : text).replace("\r", "");
        for (String rawLine : content.split("\\R")) {
            for (String wrapped : wrapLine(rawLine, font, fontSize, usableWidth)) {
                if (cursorY - lineGap < yTop - height) {
                    return yTop - height; // Sin espacio
                }
                drawText(cs, wrapped, cursorX, cursorY, font, fontSize);
                cursorY -= lineGap;
            }
        }
        return yTop - height;
    }

    // Wrapper muy sencillo por ancho
    private java.util.List<String> wrapLine(String line, org.apache.pdfbox.pdmodel.font.PDFont font, float size, float maxWidth) throws IOException {
        java.util.List<String> out = new java.util.ArrayList<>();
        String[] words = (line == null ? "" : line).split("\\s+");
        StringBuilder cur = new StringBuilder();
        for (String w : words) {
            String next = (cur.length() == 0) ? w : cur + " " + w;
            float wpx = font.getStringWidth(normalize(next)) / 1000f * size;
            if (wpx <= maxWidth) {
                cur.setLength(0);
                cur.append(next);
            } else {
                if (cur.length() > 0) {
                    out.add(cur.toString());
                }
                cur.setLength(0);
                cur.append(w);
            }
        }
        if (cur.length() > 0) {
            out.add(cur.toString());
        }
        return out;
    }

    // Normaliza para evitar problemas con tildes en algunas fuentes
    private String normalize(String s) {
        if (s == null) {
            return "";
        }
        return Normalizer.normalize(s, Normalizer.Form.NFC);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // ... (LAS VARIABLES SE MANTIENEN IGUAL)
    // ...
    // End of variables declaration//GEN-END:variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnReceta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JEditorPane jepAbdomen;
    private javax.swing.JEditorPane jepCraneo;
    private javax.swing.JEditorPane jepCuello;
    private javax.swing.JEditorPane jepDiagnostico;
    private javax.swing.JEditorPane jepGenitales;
    private javax.swing.JEditorPane jepHabitusExterior;
    private javax.swing.JEditorPane jepMiembros;
    private javax.swing.JEditorPane jepMotivoConsulta;
    private javax.swing.JEditorPane jepObservaciones;
    private javax.swing.JEditorPane jepPEEA;
    private javax.swing.JEditorPane jepPronostico;
    private javax.swing.JEditorPane jepTorax;
    private javax.swing.JEditorPane jepTratamiento;
    private javax.swing.JLabel lblAbdomen;
    private javax.swing.JLabel lblCedulaProfesional;
    private javax.swing.JLabel lblConsultaMedica;
    private javax.swing.JLabel lblCraneo;
    private javax.swing.JLabel lblCuello;
    private javax.swing.JLabel lblDatosConsulta;
    private javax.swing.JLabel lblDatosContacto;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblExploracionFisica;
    private javax.swing.JLabel lblExploracionFisica2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFichaIdentificacion;
    private javax.swing.JLabel lblFrecuenciaCardiaca;
    private javax.swing.JLabel lblFrecuenciaRespiratoria;
    private javax.swing.JLabel lblGenitales;
    private javax.swing.JLabel lblHabitusExterior;
    private javax.swing.JLabel lblMiembros;
    private javax.swing.JLabel lblMotivoConsulta;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblOximetria;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPronostico;
    private javax.swing.JLabel lblReceta;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSignosYSomatometria;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTensionArterial;
    private javax.swing.JLabel lblTorax;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JLabel lblcancelar;
    private javax.swing.JPanel pDatosContacto;
    private javax.swing.JPanel pDiagnostico;
    private javax.swing.JPanel pExploracionFisica;
    private javax.swing.JPanel pFichaIdentificacion;
    private javax.swing.JPanel pMotivoConsulta;
    private javax.swing.JPanel pObservaciones;
    private javax.swing.JPanel pPEEA;
    private javax.swing.JPanel pPronostico;
    private javax.swing.JPanel pSignosYSomatometria;
    private javax.swing.JPanel pSignosYSomatometria1;
    private javax.swing.JPanel pTratamiento;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spFormularioConsultas;
    private javax.swing.JScrollPane spMotivoConsulta;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtFrecuenciaCardiaca;
    private javax.swing.JTextField txtFrecuenciaRespiratoria;
    private javax.swing.JTextField txtOximetria;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtTensionArterial;
    // End of variables declaration//GEN-END:variables
}