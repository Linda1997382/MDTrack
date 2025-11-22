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

public class Form_Formulario_HCLaborales extends javax.swing.JPanel {
    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HCLaborales(int pacienteId, int empleadoId) {
        initComponents();
        this.pacienteId = pacienteId;
        this.empleadoId = empleadoId;
        sbAntHere.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        sbAntHere.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        verificarCheckBox();
        cargarNombreMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sbAntHere = new javax.swing.JScrollPane();
        panelBorder2 = new Swing.PanelBorder();
        chbxActividad = new javax.swing.JCheckBox();
        txtActividad = new javax.swing.JTextField();
        chbxDuracion = new javax.swing.JCheckBox();
        txtDuracion = new javax.swing.JTextField();
        chbxExposicionRuido = new javax.swing.JCheckBox();
        txtExposicionRuido = new javax.swing.JTextField();
        chbxExposicionQuimicos = new javax.swing.JCheckBox();
        txtExposicionQuimicos = new javax.swing.JTextField();
        chbxExposicionRadioactividad = new javax.swing.JCheckBox();
        txtExposicionRadioactividad = new javax.swing.JTextField();
        chbxDermatitisContacto = new javax.swing.JCheckBox();
        txtDermatitisContacto = new javax.swing.JTextField();
        chbxRiesgosSufridos = new javax.swing.JCheckBox();
        txtRiesgosSufidos = new javax.swing.JTextField();
        chbxIncapacidades = new javax.swing.JCheckBox();
        txtIncapacidades = new javax.swing.JTextField();
        chbxOtros = new javax.swing.JCheckBox();
        txtOtros = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        panelBorder2.setMaximumSize(new java.awt.Dimension(1025, 32767));

        chbxActividad.setBackground(new java.awt.Color(255, 255, 255));
        chbxActividad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxActividad.setText("Actividad desempeñada");
        chbxActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxActividadMouseClicked(evt);
            }
        });

        txtActividad.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtActividad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDuracion.setBackground(new java.awt.Color(255, 255, 255));
        chbxDuracion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDuracion.setText("Duración (años)");
        chbxDuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDuracionMouseClicked(evt);
            }
        });

        txtDuracion.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDuracion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxExposicionRuido.setBackground(new java.awt.Color(255, 255, 255));
        chbxExposicionRuido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxExposicionRuido.setText("Exposición al ruido");
        chbxExposicionRuido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxExposicionRuidoMouseClicked(evt);
            }
        });

        txtExposicionRuido.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtExposicionRuido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxExposicionQuimicos.setBackground(new java.awt.Color(255, 255, 255));
        chbxExposicionQuimicos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxExposicionQuimicos.setText("Exposición a quimicos");
        chbxExposicionQuimicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxExposicionQuimicosMouseClicked(evt);
            }
        });

        txtExposicionQuimicos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtExposicionQuimicos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxExposicionRadioactividad.setBackground(new java.awt.Color(255, 255, 255));
        chbxExposicionRadioactividad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxExposicionRadioactividad.setText("Exposición a radioactividad");
        chbxExposicionRadioactividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxExposicionRadioactividadMouseClicked(evt);
            }
        });

        txtExposicionRadioactividad.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtExposicionRadioactividad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDermatitisContacto.setBackground(new java.awt.Color(255, 255, 255));
        chbxDermatitisContacto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDermatitisContacto.setText("Dermatitis por contacto");
        chbxDermatitisContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDermatitisContactoMouseClicked(evt);
            }
        });

        txtDermatitisContacto.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDermatitisContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxRiesgosSufridos.setBackground(new java.awt.Color(255, 255, 255));
        chbxRiesgosSufridos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxRiesgosSufridos.setText("Riesgos sufridos");
        chbxRiesgosSufridos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxRiesgosSufridosMouseClicked(evt);
            }
        });

        txtRiesgosSufidos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtRiesgosSufidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxIncapacidades.setBackground(new java.awt.Color(255, 255, 255));
        chbxIncapacidades.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxIncapacidades.setText("Incapacidades");
        chbxIncapacidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxIncapacidadesMouseClicked(evt);
            }
        });

        txtIncapacidades.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtIncapacidades.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxOtros.setBackground(new java.awt.Color(255, 255, 255));
        chbxOtros.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxOtros.setText("Otros");
        chbxOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxOtrosMouseClicked(evt);
            }
        });

        txtOtros.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtOtros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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

        jPanel1.setBackground(new java.awt.Color(97, 152, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblAntecedentesHeredoFam.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblAntecedentesHeredoFam.setForeground(new java.awt.Color(255, 255, 255));
        lblAntecedentesHeredoFam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAntecedentesHeredoFam.setText("Antecedentes Laborales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));
        lblAviso.setText("**Marca el tipo de padecimiento para poder registrar cual es el que tiene**");

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblAviso))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxOtros)
                            .addComponent(chbxIncapacidades)
                            .addComponent(chbxRiesgosSufridos)
                            .addComponent(chbxDermatitisContacto)
                            .addComponent(chbxExposicionRadioactividad)
                            .addComponent(chbxDuracion)
                            .addComponent(chbxActividad)
                            .addComponent(chbxExposicionQuimicos)
                            .addComponent(chbxExposicionRuido))
                        .addGap(50, 50, 50)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIncapacidades, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExposicionRadioactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDermatitisContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExposicionRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRiesgosSufidos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExposicionQuimicos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblDoctor)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblAviso)
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxActividad))
                    .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDuracion))
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxExposicionRuido))
                    .addComponent(txtExposicionRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxExposicionQuimicos))
                    .addComponent(txtExposicionQuimicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxExposicionRadioactividad))
                    .addComponent(txtExposicionRadioactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDermatitisContacto))
                    .addComponent(txtDermatitisContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxRiesgosSufridos))
                    .addComponent(txtRiesgosSufidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxIncapacidades))
                    .addComponent(txtIncapacidades, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxOtros))
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if (navigator != null) {
            // Validar casillas marcadas con su texto asociado antes de guardar
            if (chbxActividad.isSelected() && txtActividad.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Actividad asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtActividad.requestFocus();
                return;
            }
            if (chbxDuracion.isSelected() && txtDuracion.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Duración asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDuracion.requestFocus();
                return;
            }
            if (chbxExposicionRuido.isSelected() && txtExposicionRuido.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Exposición a ruido asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtExposicionRuido.requestFocus();
                return;
            }
            if (chbxExposicionQuimicos.isSelected() && txtExposicionQuimicos.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Exposición a químicos asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtExposicionQuimicos.requestFocus();
                return;
            }
            if (chbxExposicionRadioactividad.isSelected() && txtExposicionRadioactividad.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Exposición a radioactividad asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtExposicionRadioactividad.requestFocus();
                return;
            }
            if (chbxDermatitisContacto.isSelected() && txtDermatitisContacto.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Dermatitis por contacto asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDermatitisContacto.requestFocus();
                return;
            }
            if (chbxRiesgosSufridos.isSelected() && txtRiesgosSufidos.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Riesgos sufridos asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtRiesgosSufidos.requestFocus();
                return;
            }
            if (chbxIncapacidades.isSelected() && txtIncapacidades.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Incapacidades asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtIncapacidades.requestFocus();
                return;
            }
            if (chbxOtros.isSelected() && txtOtros.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo 'Otros' asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtOtros.requestFocus();
                return;
            }

            guardar();
            Form_Pacientes back = new Form_Pacientes(empleadoId);
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void chbxActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxActividadMouseClicked
        if (chbxActividad.isSelected() == false) {
            txtActividad.setEnabled(false);
        }
        if (chbxActividad.isSelected() == true) {
            txtActividad.setEnabled(true);
        }
    }//GEN-LAST:event_chbxActividadMouseClicked

    private void chbxDuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDuracionMouseClicked
        if (chbxDuracion.isSelected() == false) {
            txtDuracion.setEnabled(false);
        }
        if (chbxDuracion.isSelected() == true) {
            txtDuracion.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDuracionMouseClicked

    private void chbxExposicionRadioactividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxExposicionRadioactividadMouseClicked
        if (chbxExposicionRadioactividad.isSelected() == false) {
            txtExposicionRadioactividad.setEnabled(false);
        }
        if (chbxExposicionRadioactividad.isSelected() == true) {
            txtExposicionRadioactividad.setEnabled(true);
        }
    }//GEN-LAST:event_chbxExposicionRadioactividadMouseClicked

    private void chbxDermatitisContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDermatitisContactoMouseClicked
        if (chbxDermatitisContacto.isSelected() == false) {
            txtDermatitisContacto.setEnabled(false);
        }
        if (chbxDermatitisContacto.isSelected() == true) {
            txtDermatitisContacto.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDermatitisContactoMouseClicked

    private void chbxRiesgosSufridosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxRiesgosSufridosMouseClicked
        if (chbxRiesgosSufridos.isSelected() == false) {
            txtRiesgosSufidos.setEnabled(false);
        }
        if (chbxRiesgosSufridos.isSelected() == true) {
            txtRiesgosSufidos.setEnabled(true);
        }
    }//GEN-LAST:event_chbxRiesgosSufridosMouseClicked

    private void chbxIncapacidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxIncapacidadesMouseClicked
        if (chbxIncapacidades.isSelected() == false) {
            txtIncapacidades.setEnabled(false);
        }
        if (chbxIncapacidades.isSelected() == true) {
            txtIncapacidades.setEnabled(true);
        }
    }//GEN-LAST:event_chbxIncapacidadesMouseClicked

    private void chbxOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxOtrosMouseClicked
        if (chbxOtros.isSelected() == false) {
            txtOtros.setEnabled(false);
        }
        if (chbxOtros.isSelected() == true) {
            txtOtros.setEnabled(true);
        }
    }//GEN-LAST:event_chbxOtrosMouseClicked

    private void chbxExposicionRuidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxExposicionRuidoMouseClicked
        if (chbxExposicionRuido.isSelected() == false) {
            txtExposicionRuido.setEnabled(false);
        }
        if (chbxExposicionRuido.isSelected() == true) {
            txtExposicionRuido.setEnabled(true);
        }
    }//GEN-LAST:event_chbxExposicionRuidoMouseClicked

    private void chbxExposicionQuimicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxExposicionQuimicosMouseClicked
        if (chbxExposicionQuimicos.isSelected() == false) {
            txtExposicionQuimicos.setEnabled(false);
        }
        if (chbxExposicionQuimicos.isSelected() == true) {
            txtExposicionQuimicos.setEnabled(true);
        }
    }//GEN-LAST:event_chbxExposicionQuimicosMouseClicked
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
            datos.put("ActividadDesempeñada", txtActividad.getText());
            datos.put("Duracion", txtDuracion.getText()); // Cambiado a texto
            datos.put("ExposicionRuido", txtExposicionRuido.getText());
            datos.put("ExposicionQuimicos", txtExposicionQuimicos.getText());
            datos.put("ExposicionRadioactividad", txtExposicionRadioactividad.getText());
            datos.put("DermatitisPorContacto", txtDermatitisContacto.getText());
            datos.put("RiesgosSufridos", txtRiesgosSufidos.getText());
            datos.put("Incapacidades", txtIncapacidades.getText());
            datos.put("Otro", txtOtros.getText());
            Modelo.Model_Paciente.guardarPacienteAuto("AntecedentesLaborales", datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (HeadlessException e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    private void verificarCheckBox() {
        if (chbxActividad.isSelected() == false) {
            txtActividad.setEnabled(false); 
        }
        if (chbxDuracion.isSelected() == false) {
            txtDuracion.setEnabled(false); 
        }
        if (chbxExposicionRuido.isSelected() == false) {
            txtExposicionRuido.setEnabled(false); 
        }
        if (chbxExposicionQuimicos.isSelected() == false) {
            txtExposicionQuimicos.setEnabled(false); 
        }
        if (chbxExposicionRadioactividad.isSelected() == false) {
            txtExposicionRadioactividad.setEnabled(false); 
        }
        if (chbxDermatitisContacto.isSelected() == false) {
            txtDermatitisContacto.setEnabled(false); 
        }
        if (chbxRiesgosSufridos.isSelected() == false) {
            txtRiesgosSufidos.setEnabled(false); 
        }
        if (chbxIncapacidades.isSelected() == false) {
            txtIncapacidades.setEnabled(false); 
        }
        if (chbxOtros.isSelected() == false) {
            txtOtros.setEnabled(false); 
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
                        javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCLaborales.this, "Empleado no encontrado.");
                        return;
                    }
                    lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                        empleado.getApellidoPaterno() + " " + 
                        empleado.getApellidoMaterno());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCLaborales.this, "No se pudo cargar el empleado.");
                }
            }
        }.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JCheckBox chbxActividad;
    private javax.swing.JCheckBox chbxDermatitisContacto;
    private javax.swing.JCheckBox chbxDuracion;
    private javax.swing.JCheckBox chbxExposicionQuimicos;
    private javax.swing.JCheckBox chbxExposicionRadioactividad;
    private javax.swing.JCheckBox chbxExposicionRuido;
    private javax.swing.JCheckBox chbxIncapacidades;
    private javax.swing.JCheckBox chbxOtros;
    private javax.swing.JCheckBox chbxRiesgosSufridos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblGuardar;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtDermatitisContacto;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtExposicionQuimicos;
    private javax.swing.JTextField txtExposicionRadioactividad;
    private javax.swing.JTextField txtExposicionRuido;
    private javax.swing.JTextField txtIncapacidades;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtRiesgosSufidos;
    // End of variables declaration//GEN-END:variables
}