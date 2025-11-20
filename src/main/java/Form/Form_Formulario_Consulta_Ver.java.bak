*** End Patch

        pDatosContacto.setBackground(new java.awt.Color(97, 152, 220));

        lblDatosContacto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblDatosContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosContacto.setText("Datos contacto");

        javax.swing.GroupLayout pDatosContactoLayout = new javax.swing.GroupLayout(pDatosContacto);
        pDatosContacto.setLayout(pDatosContactoLayout);
        pDatosContactoLayout.setHorizontalGroup(
            pDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pDatosContactoLayout.setVerticalGroup(
            pDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lblPaciente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblPaciente.setText("Paciente:");

        txtPaciente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblSexo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblSexo.setText("Sexo:");

        txtSexo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento:");

        txtFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEdad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEdad.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        txtEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEmpresa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEmpresa.setText("Empresa:");

        lblTel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblTel.setText("Tel.:");

        txtTel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEmail.setText("E-mail:");
package Form;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * Versión ligera y segura de visualización de consulta.
 * Evita duplicar el gran NetBeans-generated UI y reusa el formulario existente.
 * Esta clase actúa como un envoltorio (wrapper) alrededor de `Form_Formulario_Consulta`.
 */
public class Form_Formulario_Consulta_Ver extends javax.swing.JPanel {

    private final Form_Formulario_Consulta delegate;

    public Form_Formulario_Consulta_Ver(String pacienteId, String empleadoId, String consultaId) {
        // Convertir ids de cadena a int (si fallan, usar -1)
        int p = parseIntSafe(pacienteId);
        int e = parseIntSafe(empleadoId);

        // Reusar el formulario que ya contiene la UI generada por NetBeans.
        delegate = new Form_Formulario_Consulta(p, e);

        setLayout(new BorderLayout());
        add(delegate, BorderLayout.CENTER);

        // Nota: El formulario original carga datos del paciente en su constructor.
        // Cargar la consulta por id (consultaId) se implementará después si hace falta.
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        delegate.setNavigator(nav);
    }

    private int parseIntSafe(String s) {
        try {
            return Integer.parseInt(String.valueOf(s));
        } catch (Exception ex) {
            return -1;
        }
    }
}
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(pSignosYSomatometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(spMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pExploracionFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblHabitusExterior)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCraneo)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCuello)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblTorax)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblAbdomen)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblGenitales)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMiembros)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pPEEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short_MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        spFormularioConsultas.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spFormularioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short_MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spFormularioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short_MAX_VALUE)
                .addContainerGap())
        );
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

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // Formulario "Ver" es de solo lectura; no realizar acción de guardado aquí.
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        if (btnGuardar != null) btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        if (btnGuardar != null) btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

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
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel lblGuardar;
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
        // Algunos builds pueden tener el método initComponents generado ausente
        // (o la variable spFormularioConsultas no inicializada). Protegemos
        // contra NPE mostrando un mensaje y evitando llamar a métodos sobre
        // un componente nulo.
        if (spFormularioConsultas != null) {
            spFormularioConsultas.setVerticalScrollBar(new ScrollBar());
            JPanel p = new JPanel();
            spFormularioConsultas.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        } else {
            System.err.println("[WARN] spFormularioConsultas es null en Form_Formulario_Consulta_Ver - initComponents puede estar incompleto.");
            javax.swing.JOptionPane.showMessageDialog(this, "Formulario incompleto: componente de scroll no inicializado. Revisa el archivo .form o regenera el initComponents.");
        }

        // Cargar datos aunque el scroll no esté disponible
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
        
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblTel)
                .addGap(8, 8, 8)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmail)
                .addGap(8, 8, 8)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(lblConsultaMedica))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpresa)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblPaciente))
                        .addGap(8, 8, 8)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblSexo)
                            .addComponent(lblFecha))
                        .addGap(8, 8, 8)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblHabitusExterior))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pPEEA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane1)
                        .addComponent(spMotivoConsulta)
                        .addComponent(pFichaIdentificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pDatosContacto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pSignosYSomatometria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pSignosYSomatometria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pMotivoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pExploracionFisica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCraneo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTorax, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMiembros, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGenitales, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAbdomen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCuello, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(pDiagnostico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pObservaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pPronostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pTratamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOximetria)
                                .addComponent(lblFrecuenciaCardiaca))
                            .addGap(8, 8, 8)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFrecuenciaCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOximetria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblEstatura)
                            .addGap(8, 8, 8)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(lblPeso)
                            .addGap(8, 8, 8)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblFrecuenciaRespiratoria)
                            .addGap(8, 8, 8)
                            .addComponent(txtFrecuenciaRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblTensionArterial)
                            .addGap(8, 8, 8)
                            .addComponent(txtTensionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        txtFecha = new javax.swing.JTextField();
        pMotivoConsulta = new javax.swing.JPanel();
        lblMotivoConsulta = new javax.swing.JLabel();
        spMotivoConsulta = new javax.swing.JScrollPane();
        jepMotivoConsulta = new javax.swing.JEditorPane();
        pExploracionFisica = new javax.swing.JPanel();
        lblExploracionFisica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jepHabitusExterior = new javax.swing.JEditorPane();
        lblHabitusExterior = new javax.swing.JLabel();
        lblCraneo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jepCraneo = new javax.swing.JEditorPane();
        lblCuello = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jepCuello = new javax.swing.JEditorPane();
        lblTorax = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jepTorax = new javax.swing.JEditorPane();
        lblAbdomen = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jepAbdomen = new javax.swing.JEditorPane();
        lblGenitales = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jepGenitales = new javax.swing.JEditorPane();
        lblMiembros = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jepMiembros = new javax.swing.JEditorPane();
        pPEEA = new javax.swing.JPanel();
        lblExploracionFisica2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jepPEEA = new javax.swing.JEditorPane();
        pDiagnostico = new javax.swing.JPanel();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jepDiagnostico = new javax.swing.JEditorPane();
        pObservaciones = new javax.swing.JPanel();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jepObservaciones = new javax.swing.JEditorPane();
        pPronostico = new javax.swing.JPanel();
        lblPronostico = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jepPronostico = new javax.swing.JEditorPane();
        pTratamiento = new javax.swing.JPanel();
        lblTratamiento = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jepTratamiento = new javax.swing.JEditorPane();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblcancelar = new javax.swing.JLabel();
        btnReceta = new javax.swing.JPanel();
        lblReceta = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        lblDoctor = new javax.swing.JLabel();
        lblCedulaProfesional = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        lblConsultaMedica.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblConsultaMedica.setForeground(new java.awt.Color(22, 94, 183));
        lblConsultaMedica.setText("Consulta Médica");

        pFichaIdentificacion.setBackground(new java.awt.Color(97, 152, 220));

        lblFichaIdentificacion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblFichaIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblFichaIdentificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFichaIdentificacion.setText("Ficha de identificación");

        javax.swing.GroupLayout pFichaIdentificacionLayout = new javax.swing.GroupLayout(pFichaIdentificacion);
        pFichaIdentificacion.setLayout(pFichaIdentificacionLayout);
        pFichaIdentificacionLayout.setHorizontalGroup(
            pFichaIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFichaIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pFichaIdentificacionLayout.setVerticalGroup(
            pFichaIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFichaIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pDatosContacto.setBackground(new java.awt.Color(97, 152, 220));

        lblDatosContacto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblDatosContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosContacto.setText("Datos contacto");

        javax.swing.GroupLayout pDatosContactoLayout = new javax.swing.GroupLayout(pDatosContacto);
        pDatosContacto.setLayout(pDatosContactoLayout);
        pDatosContactoLayout.setHorizontalGroup(
            pDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pDatosContactoLayout.setVerticalGroup(
            pDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lblPaciente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblPaciente.setText("Paciente:");

        txtPaciente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblSexo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblSexo.setText("Sexo:");

        txtSexo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento:");

        txtFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEdad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEdad.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        txtEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEmpresa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEmpresa.setText("Empresa:");

        lblTel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblTel.setText("Tel.:");

        txtTel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        pSignosYSomatometria.setBackground(new java.awt.Color(97, 152, 220));

        lblSignosYSomatometria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblSignosYSomatometria.setForeground(new java.awt.Color(255, 255, 255));
        lblSignosYSomatometria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignosYSomatometria.setText("Signos vitales y somatometria");

        javax.swing.GroupLayout pSignosYSomatometriaLayout = new javax.swing.GroupLayout(pSignosYSomatometria);
        pSignosYSomatometria.setLayout(pSignosYSomatometriaLayout);
        pSignosYSomatometriaLayout.setHorizontalGroup(
            pSignosYSomatometriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSignosYSomatometria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        pSignosYSomatometriaLayout.setVerticalGroup(
            pSignosYSomatometriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSignosYSomatometria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        pSignosYSomatometria1.setBackground(new java.awt.Color(97, 152, 220));

        lblDatosConsulta.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblDatosConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosConsulta.setText("Datos consulta");

        javax.swing.GroupLayout pSignosYSomatometria1Layout = new javax.swing.GroupLayout(pSignosYSomatometria1);
        pSignosYSomatometria1.setLayout(pSignosYSomatometria1Layout);
        pSignosYSomatometria1Layout.setHorizontalGroup(
            pSignosYSomatometria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        pSignosYSomatometria1Layout.setVerticalGroup(
            pSignosYSomatometria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatosConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        lblFrecuenciaCardiaca.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblFrecuenciaCardiaca.setText("Frecuencia cardiaca.:");

        txtFrecuenciaCardiaca.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFrecuenciaCardiaca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFrecuenciaRespiratoria.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblFrecuenciaRespiratoria.setText("Frecuencia respiratoria:");

        txtFrecuenciaRespiratoria.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFrecuenciaRespiratoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblTensionArterial.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblTensionArterial.setText("Tensión Arterial:");

        txtTensionArterial.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTensionArterial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblOximetria.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblOximetria.setText("Oximetría:");

        txtOximetria.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtOximetria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEstatura.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEstatura.setText("Estatura:");

        txtEstatura.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEstatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblPeso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblPeso.setText("Peso:");

        txtPeso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFecha.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblFecha.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        pMotivoConsulta.setBackground(new java.awt.Color(166, 198, 236));

        lblMotivoConsulta.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblMotivoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblMotivoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMotivoConsulta.setText("Motivo consulta");

        javax.swing.GroupLayout pMotivoConsultaLayout = new javax.swing.GroupLayout(pMotivoConsulta);
        pMotivoConsulta.setLayout(pMotivoConsultaLayout);
        pMotivoConsultaLayout.setHorizontalGroup(
            pMotivoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMotivoConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMotivoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pMotivoConsultaLayout.setVerticalGroup(
            pMotivoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMotivoConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jepMotivoConsulta.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        spMotivoConsulta.setViewportView(jepMotivoConsulta);

        pExploracionFisica.setBackground(new java.awt.Color(166, 198, 236));

        lblExploracionFisica.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblExploracionFisica.setForeground(new java.awt.Color(255, 255, 255));
        lblExploracionFisica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblExploracionFisica.setText("Exploración fisica");

        javax.swing.GroupLayout pExploracionFisicaLayout = new javax.swing.GroupLayout(pExploracionFisica);
        pExploracionFisica.setLayout(pExploracionFisicaLayout);
        pExploracionFisicaLayout.setHorizontalGroup(
            pExploracionFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExploracionFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExploracionFisica, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        pExploracionFisicaLayout.setVerticalGroup(
            pExploracionFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExploracionFisica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jepHabitusExterior.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jepHabitusExterior);

        lblHabitusExterior.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblHabitusExterior.setText("Habitus Exterior:");

        lblCraneo.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblCraneo.setText("Creaneo:");

        jepCraneo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(jepCraneo);

        lblCuello.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblCuello.setText("Cuello:");

        jepCuello.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(jepCuello);

        lblTorax.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblTorax.setText("Torax:");

        jepTorax.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane4.setViewportView(jepTorax);

        lblAbdomen.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblAbdomen.setText("Abdomen:");

        jepAbdomen.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane5.setViewportView(jepAbdomen);

        lblGenitales.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblGenitales.setText("Genitales:");

        jepGenitales.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane6.setViewportView(jepGenitales);

        lblMiembros.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lblMiembros.setText("Miembros:");

        jepMiembros.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane7.setViewportView(jepMiembros);

        pPEEA.setBackground(new java.awt.Color(166, 198, 236));

        lblExploracionFisica2.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblExploracionFisica2.setForeground(new java.awt.Color(255, 255, 255));
        lblExploracionFisica2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblExploracionFisica2.setText("PEEA (Principio, Evolución y Estado Actual)");

        javax.swing.GroupLayout pPEEALayout = new javax.swing.GroupLayout(pPEEA);
        pPEEA.setLayout(pPEEALayout);
        pPEEALayout.setHorizontalGroup(
            pPEEALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPEEALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExploracionFisica2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPEEALayout.setVerticalGroup(
            pPEEALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExploracionFisica2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jepPEEA.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane8.setViewportView(jepPEEA);

        pDiagnostico.setBackground(new java.awt.Color(166, 198, 236));

        lblDiagnostico.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        lblDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiagnostico.setText("Diagnostico:");

        javax.swing.GroupLayout pDiagnosticoLayout = new javax.swing.GroupLayout(pDiagnostico);
        pDiagnostico.setLayout(pDiagnosticoLayout);
        pDiagnosticoLayout.setHorizontalGroup(
            pDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDiagnosticoLayout.setVerticalGroup(
            pDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jepDiagnostico.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane9.setViewportView(jepDiagnostico);

        pObservaciones.setBackground(new java.awt.Color(166, 198, 236));

        lblObservaciones.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblObservaciones.setText("Observaciones:");

        javax.swing.GroupLayout pObservacionesLayout = new javax.swing.GroupLayout(pObservaciones);
        pObservaciones.setLayout(pObservacionesLayout);
        pObservacionesLayout.setHorizontalGroup(
            pObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pObservacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pObservacionesLayout.setVerticalGroup(
            pObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblObservaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jepObservaciones.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane10.setViewportView(jepObservaciones);

        pPronostico.setBackground(new java.awt.Color(166, 198, 236));

        lblPronostico.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblPronostico.setForeground(new java.awt.Color(255, 255, 255));
        lblPronostico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPronostico.setText("Pronóstico");

        javax.swing.GroupLayout pPronosticoLayout = new javax.swing.GroupLayout(pPronostico);
        pPronostico.setLayout(pPronosticoLayout);
        pPronosticoLayout.setHorizontalGroup(
            pPronosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPronosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPronostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPronosticoLayout.setVerticalGroup(
            pPronosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPronostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jepPronostico.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane11.setViewportView(jepPronostico);

        pTratamiento.setBackground(new java.awt.Color(166, 198, 236));

        lblTratamiento.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        lblTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTratamiento.setText("Tratamiento");

        javax.swing.GroupLayout pTratamientoLayout = new javax.swing.GroupLayout(pTratamiento);
        pTratamiento.setLayout(pTratamientoLayout);
        pTratamientoLayout.setHorizontalGroup(
            pTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTratamientoLayout.setVerticalGroup(
            pTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jepTratamiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane12.setViewportView(jepTratamiento);

        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));

        lblGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));

        lblcancelar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblcancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcancelar.setText("Regresar");
        lblcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btnReceta.setBackground(new java.awt.Color(30, 103, 201));

        lblReceta.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblReceta.setForeground(new java.awt.Color(255, 255, 255));
        lblReceta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReceta.setText("Imprimir receta");
        lblReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecetaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRecetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRecetaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRecetaLayout = new javax.swing.GroupLayout(btnReceta);
        btnReceta.setLayout(btnRecetaLayout);
        btnRecetaLayout.setHorizontalGroup(
            btnRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRecetaLayout.setVerticalGroup(
            btnRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReceta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        lblTemperatura.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblTemperatura.setText("T°:");

        txtTemperatura.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblCedulaProfesional.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCedulaProfesional.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblTel)
                .addGap(8, 8, 8)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                .addComponent(lblEmail)
                .addGap(8, 8, 8)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(lblConsultaMedica))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpresa)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblPaciente))
                        .addGap(8, 8, 8)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblSexo)
                            .addComponent(lblFecha))
                        .addGap(8, 8, 8)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblHabitusExterior))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(18, Short_MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pPEEA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane1)
                        .addComponent(spMotivoConsulta)
                        .addComponent(pFichaIdentificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pDatosContacto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pSignosYSomatometria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pSignosYSomatometria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pMotivoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(pExploracionFisica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCraneo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTorax, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMiembros, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGenitales, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAbdomen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCuello, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(pDiagnostico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pObservaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pPronostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addComponent(pTratamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short_MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short_MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOximetria)
                                .addComponent(lblFrecuenciaCardiaca))
                            .addGap(8, 8, 8)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOximetria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFrecuenciaCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFrecuenciaRespiratoria)
                                .addComponent(lblEstatura))
                            .addGap(8, 8, 8)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(lblPeso))
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(txtFrecuenciaRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(lblTensionArterial)))
                            .addGap(8, 8, 8)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(txtTensionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(lblTemperatura)
                                    .addGap(8, 8, 8)
                                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCedulaProfesional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblConsultaMedica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoctor)
                    .addComponent(lblCedulaProfesional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFichaIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaciente)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(pDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTel)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(pSignosYSomatometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrecuenciaCardiaca)
                    .addComponent(txtFrecuenciaCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFrecuenciaRespiratoria)
                    .addComponent(txtFrecuenciaRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTensionArterial)
                    .addComponent(txtTensionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperatura)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOximetria)
                    .addComponent(txtOximetria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstatura)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(pSignosYSomatometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(spMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pExploracionFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblHabitusExterior)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCraneo)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCuello)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblTorax)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblAbdomen)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblGenitales)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblMiembros)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pPEEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short_MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        spFormularioConsultas.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spFormularioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short_MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spFormularioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short_MAX_VALUE)
                .addContainerGap())
        );
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

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // Formulario "Ver" es de solo lectura; no realizar acción de guardado aquí.
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        if (btnGuardar != null) btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        if (btnGuardar != null) btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

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
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel lblGuardar;
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