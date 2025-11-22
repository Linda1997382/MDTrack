package Form;

import Swing.ScrollBar;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Formulario_HCExploracionFisica extends javax.swing.JPanel {
    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HCExploracionFisica(int pacienteId, int empleadoId) {
        initComponents();
        this.pacienteId = pacienteId;
        this.empleadoId = empleadoId;
        sbAntHere.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        sbAntHere.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        cargarNombreMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sbAntHere = new javax.swing.JScrollPane();
        panelBorder2 = new Swing.PanelBorder();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        lblTA = new javax.swing.JLabel();
        txtTA = new javax.swing.JTextField();
        lblGlucosaCapilar = new javax.swing.JLabel();
        txtGlucosaCapilar = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblFResp = new javax.swing.JLabel();
        txtFResp = new javax.swing.JTextField();
        lblPulso = new javax.swing.JLabel();
        txtPulso = new javax.swing.JTextField();
        lblSPO2 = new javax.swing.JLabel();
        txtSPO2 = new javax.swing.JTextField();
        lblNeurologico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jepNeurologico = new javax.swing.JEditorPane();
        lblTorax = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jepTorax = new javax.swing.JEditorPane();
        lblAbdomen = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jepAbdomen = new javax.swing.JEditorPane();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblPeso.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPeso.setText("Peso:");

        txtPeso.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblTemperatura.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTemperatura.setText("Temperatura:");

        txtTemperatura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblTA.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTA.setText("TA:");

        txtTA.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblGlucosaCapilar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblGlucosaCapilar.setText("Glucosa capilar:");

        txtGlucosaCapilar.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtGlucosaCapilar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblAltura.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblAltura.setText("Altura:");

        txtAltura.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFResp.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblFResp.setText("F. Resp.:");

        txtFResp.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtFResp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblPulso.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPulso.setText("Pulso:");

        txtPulso.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPulso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblSPO2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblSPO2.setText("SPO2:");

        txtSPO2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtSPO2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblNeurologico.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblNeurologico.setText("Neurologico:");

        jepNeurologico.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jepNeurologico);

        lblTorax.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTorax.setText("Torax:");

        jepTorax.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(jepTorax);

        lblAbdomen.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblAbdomen.setText("Abdomen:");

        jepAbdomen.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(jepAbdomen);

        btnSiguiente.setBackground(new java.awt.Color(30, 103, 201));

        lblSiguiente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        lblSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSiguienteLayout = new javax.swing.GroupLayout(btnSiguiente);
        btnSiguiente.setLayout(btnSiguienteLayout);
        btnSiguienteLayout.setHorizontalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSiguienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSiguienteLayout.setVerticalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(97, 152, 220));

        lblAntecedentesHeredoFam.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblAntecedentesHeredoFam.setForeground(new java.awt.Color(255, 255, 255));
        lblAntecedentesHeredoFam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAntecedentesHeredoFam.setText("Exploración Fisica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addGap(567, 567, 567)
                            .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNeurologico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder2Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBorder2Layout.createSequentialGroup()
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblFResp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFResp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblGlucosaCapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSPO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGlucosaCapilar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtSPO2)))))
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblDoctor)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblTemperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblGlucosaCapilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGlucosaCapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblFResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFResp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblPulso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblSPO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(lblNeurologico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTorax)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAbdomen)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        sbAntHere.setViewportView(panelBorder2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sbAntHere)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sbAntHere, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (navigator != null) {
            if (!validarCamposNumericos()) return;
            guardar();
            Form_Formulario_HCLaborales next = new Form_Formulario_HCLaborales(pacienteId, empleadoId);
            next.setNavigator(navigator);
            navigator.accept(next);
        }
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseEntered
        btnSiguiente.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblSiguienteMouseEntered

    private void lblSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseExited
        btnSiguiente.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblSiguienteMouseExited
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardar() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("EmpleadoId", empleadoId); // Ahora es int
            datos.put("Medico", lblDoctor.getText());
            datos.put("PacienteId", pacienteId); // Ahora es int
            datos.put("FechaCreacion", fechaActual.format(formatter));
            datos.put("Peso", txtPeso.getText());
            datos.put("Altura", txtAltura.getText());
            datos.put("Temperatura", txtTemperatura.getText());
            datos.put("FResp", txtFResp.getText());
            datos.put("TA", txtTA.getText());
            datos.put("Pulso", txtPulso.getText());
            datos.put("GlucosaCapilar", txtGlucosaCapilar.getText());
            datos.put("SPO2", txtSPO2.getText());
            datos.put("Neurologico", jepNeurologico.getText());
            datos.put("Torax", jepTorax.getText());
            datos.put("Abdomen", jepAbdomen.getText());
            Modelo.Model_Paciente.guardarPacienteAuto("AntecedentesExploracionFisica", datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (HeadlessException e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    private void cargarNombreMedico() {
        new javax.swing.SwingWorker<Modelo.Model_Empleado.Empleado, Void>() {
            @Override
            protected Modelo.Model_Empleado.Empleado doInBackground() throws Exception {
                return Modelo.Model_Empleado.obtenerEmpleadoPorId(empleadoId); // Ahora empleadoId es int
            }

            @Override
            protected void done() {
                try {
                    Modelo.Model_Empleado.Empleado empleado = get();
                    if (empleado == null) {
                        javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCExploracionFisica.this, "Empleado no encontrado.");
                        return;
                    }
                    lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                        empleado.getApellidoPaterno() + " " + 
                        empleado.getApellidoMaterno());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCExploracionFisica.this, "No se pudo cargar el empleado.");
                }
            }
        }.execute();
    }

    // Valida que determinados campos, si no están vacíos, contengan números válidos
    private boolean validarCamposNumericos() {
        // Campos a validar: Peso, Altura, TA, Pulso, SPO2, GlucosaCapilar
        java.util.List<javax.swing.JTextField> campos = java.util.Arrays.asList(
            txtPeso, txtAltura, txtTA, txtPulso, txtSPO2, txtGlucosaCapilar
        );

        java.util.List<String> nombres = java.util.Arrays.asList(
            "Peso", "Altura", "TA", "Pulso", "SPO2", "Glucosa capilar"
        );

        for (int i = 0; i < campos.size(); i++) {
            javax.swing.JTextField campo = campos.get(i);
            String valor = campo.getText() == null ? "" : campo.getText().trim();
            if (!valor.isEmpty()) {
                if (!esNumero(valor)) {
                    String msg = "El campo '" + nombres.get(i) + "' debe contener sólo números.";
                    JOptionPane.showMessageDialog(this, msg, "Formato inválido", JOptionPane.WARNING_MESSAGE);
                    campo.requestFocusInWindow();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean esNumero(String s) {
        // Acepta números enteros o decimales con punto o coma
        if (s == null) return false;
        s = s.trim();
        if (s.isEmpty()) return false;
        // Reemplazar coma por punto para parseo
        s = s.replace(',', '.');
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JEditorPane jepAbdomen;
    private javax.swing.JEditorPane jepNeurologico;
    private javax.swing.JEditorPane jepTorax;
    private javax.swing.JLabel lblAbdomen;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFResp;
    private javax.swing.JLabel lblGlucosaCapilar;
    private javax.swing.JLabel lblNeurologico;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPulso;
    private javax.swing.JLabel lblSPO2;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTA;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTorax;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtFResp;
    private javax.swing.JTextField txtGlucosaCapilar;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPulso;
    private javax.swing.JTextField txtSPO2;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}