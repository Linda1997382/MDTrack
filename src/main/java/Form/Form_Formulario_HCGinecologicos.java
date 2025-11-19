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

public class Form_Formulario_HCGinecologicos extends javax.swing.JPanel {
    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HCGinecologicos(int pacienteId, int empleadoId) {
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
        chbxPrimeraMenstruacion = new javax.swing.JCheckBox();
        txtPrimeraMenstruacion = new javax.swing.JTextField();
        chbxVidaSexualActiva = new javax.swing.JCheckBox();
        txtVidaSexualActiva = new javax.swing.JTextField();
        chbxFechaUltimaMenstruacion = new javax.swing.JCheckBox();
        txtFechaUltimaMenstruacion = new javax.swing.JTextField();
        chbxHemorragias = new javax.swing.JCheckBox();
        txtHemorragias = new javax.swing.JTextField();
        chbxSangradoAnormal = new javax.swing.JCheckBox();
        txtSangradoAnormal = new javax.swing.JTextField();
        chbxCuantosEmbarazos = new javax.swing.JCheckBox();
        txtCuantosEmbarazos = new javax.swing.JTextField();
        chbxPartos = new javax.swing.JCheckBox();
        txtPartos = new javax.swing.JTextField();
        chbxCesareas = new javax.swing.JCheckBox();
        txtCesareas = new javax.swing.JTextField();
        chbxAbortos = new javax.swing.JCheckBox();
        txtAbortos = new javax.swing.JTextField();
        chbxOtros = new javax.swing.JCheckBox();
        txtOtros = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxPrimeraMenstruacion.setBackground(new java.awt.Color(255, 255, 255));
        chbxPrimeraMenstruacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxPrimeraMenstruacion.setText("A que edad fue tu primera menstruación");
        chbxPrimeraMenstruacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxPrimeraMenstruacionMouseClicked(evt);
            }
        });

        txtPrimeraMenstruacion.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPrimeraMenstruacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxVidaSexualActiva.setBackground(new java.awt.Color(255, 255, 255));
        chbxVidaSexualActiva.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxVidaSexualActiva.setText("A que edad iniciaste tu vida sexual activa");
        chbxVidaSexualActiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxVidaSexualActivaMouseClicked(evt);
            }
        });

        txtVidaSexualActiva.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtVidaSexualActiva.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxFechaUltimaMenstruacion.setBackground(new java.awt.Color(255, 255, 255));
        chbxFechaUltimaMenstruacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxFechaUltimaMenstruacion.setText("Fecha de ultima menstruación");
        chbxFechaUltimaMenstruacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxFechaUltimaMenstruacionMouseClicked(evt);
            }
        });

        txtFechaUltimaMenstruacion.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtFechaUltimaMenstruacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxHemorragias.setBackground(new java.awt.Color(255, 255, 255));
        chbxHemorragias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxHemorragias.setText("Has tenido hemorragias");
        chbxHemorragias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxHemorragiasMouseClicked(evt);
            }
        });

        txtHemorragias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHemorragias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxSangradoAnormal.setBackground(new java.awt.Color(255, 255, 255));
        chbxSangradoAnormal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxSangradoAnormal.setText("Sangrado o flujo anormal");
        chbxSangradoAnormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxSangradoAnormalMouseClicked(evt);
            }
        });

        txtSangradoAnormal.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtSangradoAnormal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxCuantosEmbarazos.setBackground(new java.awt.Color(255, 255, 255));
        chbxCuantosEmbarazos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxCuantosEmbarazos.setText("Cuantos embarazos has tenido");
        chbxCuantosEmbarazos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxCuantosEmbarazosMouseClicked(evt);
            }
        });

        txtCuantosEmbarazos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtCuantosEmbarazos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxPartos.setBackground(new java.awt.Color(255, 255, 255));
        chbxPartos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxPartos.setText("Partos");
        chbxPartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxPartosMouseClicked(evt);
            }
        });

        txtPartos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPartos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxCesareas.setBackground(new java.awt.Color(255, 255, 255));
        chbxCesareas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxCesareas.setText("Cesareas");
        chbxCesareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxCesareasMouseClicked(evt);
            }
        });

        txtCesareas.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtCesareas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxAbortos.setBackground(new java.awt.Color(255, 255, 255));
        chbxAbortos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxAbortos.setText("Abortos");
        chbxAbortos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAbortosMouseClicked(evt);
            }
        });

        txtAbortos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAbortos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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
        lblAntecedentesHeredoFam.setText("Antecedentes Ginecologicos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chbxOtros)
                                .addComponent(chbxAbortos)
                                .addComponent(chbxCesareas)
                                .addComponent(chbxPartos)
                                .addComponent(chbxCuantosEmbarazos)
                                .addComponent(chbxSangradoAnormal)
                                .addComponent(chbxVidaSexualActiva)
                                .addComponent(chbxPrimeraMenstruacion)
                                .addComponent(chbxHemorragias)
                                .addComponent(chbxFechaUltimaMenstruacion))
                            .addGap(50, 50, 50)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCesareas, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSangradoAnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCuantosEmbarazos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaUltimaMenstruacion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHemorragias, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVidaSexualActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrimeraMenstruacion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblAviso))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblDoctor)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblAviso)
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxPrimeraMenstruacion))
                    .addComponent(txtPrimeraMenstruacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxVidaSexualActiva))
                    .addComponent(txtVidaSexualActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxFechaUltimaMenstruacion))
                    .addComponent(txtFechaUltimaMenstruacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxHemorragias))
                    .addComponent(txtHemorragias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxSangradoAnormal))
                    .addComponent(txtSangradoAnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxCuantosEmbarazos))
                    .addComponent(txtCuantosEmbarazos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxPartos))
                    .addComponent(txtPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxCesareas))
                    .addComponent(txtCesareas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxAbortos))
                    .addComponent(txtAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxOtros))
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(sbAntHere, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (navigator != null) {
            guardar();
            Form_Formulario_HCExploracionFisica next = new Form_Formulario_HCExploracionFisica(pacienteId, empleadoId);
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

    private void chbxPrimeraMenstruacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxPrimeraMenstruacionMouseClicked
        if (chbxPrimeraMenstruacion.isSelected() == false) {
            txtPrimeraMenstruacion.setEnabled(false);
        }
        if (chbxPrimeraMenstruacion.isSelected() == true) {
            txtPrimeraMenstruacion.setEnabled(true);
        }
    }//GEN-LAST:event_chbxPrimeraMenstruacionMouseClicked

    private void chbxVidaSexualActivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxVidaSexualActivaMouseClicked
        if (chbxVidaSexualActiva.isSelected() == false) {
            txtVidaSexualActiva.setEnabled(false);
        }
        if (chbxVidaSexualActiva.isSelected() == true) {
            txtVidaSexualActiva.setEnabled(true);
        }
    }//GEN-LAST:event_chbxVidaSexualActivaMouseClicked

    private void chbxSangradoAnormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxSangradoAnormalMouseClicked
        if (chbxSangradoAnormal.isSelected() == false) {
            txtSangradoAnormal.setEnabled(false);
        }
        if (chbxSangradoAnormal.isSelected() == true) {
            txtSangradoAnormal.setEnabled(true);
        }
    }//GEN-LAST:event_chbxSangradoAnormalMouseClicked

    private void chbxCuantosEmbarazosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxCuantosEmbarazosMouseClicked
        if (chbxCuantosEmbarazos.isSelected() == false) {
            txtCuantosEmbarazos.setEnabled(false);
        }
        if (chbxCuantosEmbarazos.isSelected() == true) {
            txtCuantosEmbarazos.setEnabled(true);
        }
    }//GEN-LAST:event_chbxCuantosEmbarazosMouseClicked

    private void chbxPartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxPartosMouseClicked
        if (chbxPartos.isSelected() == false) {
            txtPartos.setEnabled(false);
        }
        if (chbxPartos.isSelected() == true) {
            txtPartos.setEnabled(true);
        }
    }//GEN-LAST:event_chbxPartosMouseClicked

    private void chbxCesareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxCesareasMouseClicked
        if (chbxCesareas.isSelected() == false) {
            txtCesareas.setEnabled(false);
        }
        if (chbxCesareas.isSelected() == true) {
            txtCesareas.setEnabled(true);
        }
    }//GEN-LAST:event_chbxCesareasMouseClicked

    private void chbxAbortosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAbortosMouseClicked
        if (chbxAbortos.isSelected() == false) {
            txtAbortos.setEnabled(false);
        }
        if (chbxAbortos.isSelected() == true) {
            txtAbortos.setEnabled(true);
        }
    }//GEN-LAST:event_chbxAbortosMouseClicked

    private void chbxOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxOtrosMouseClicked
        if (chbxOtros.isSelected() == false) {
            txtOtros.setEnabled(false);
        }
        if (chbxOtros.isSelected() == true) {
            txtOtros.setEnabled(true);
        }
    }//GEN-LAST:event_chbxOtrosMouseClicked

    private void chbxFechaUltimaMenstruacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxFechaUltimaMenstruacionMouseClicked
        if (chbxFechaUltimaMenstruacion.isSelected() == false) {
            txtFechaUltimaMenstruacion.setEnabled(false);
        }
        if (chbxFechaUltimaMenstruacion.isSelected() == true) {
            txtFechaUltimaMenstruacion.setEnabled(true);
        }
    }//GEN-LAST:event_chbxFechaUltimaMenstruacionMouseClicked

    private void chbxHemorragiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxHemorragiasMouseClicked
        if (chbxHemorragias.isSelected() == false) {
            txtHemorragias.setEnabled(false);
        }
        if (chbxHemorragias.isSelected() == true) {
            txtHemorragias.setEnabled(true);
        }
    }//GEN-LAST:event_chbxHemorragiasMouseClicked
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
            datos.put("EdadPrimeraMenstruacion", txtPrimeraMenstruacion.getText());
            datos.put("EdadInicioVidaSexualActiva", txtVidaSexualActiva.getText());
            datos.put("FechaUltimaMenstruacion", txtFechaUltimaMenstruacion.getText());
            datos.put("Hemorragias", txtHemorragias.getText());
            datos.put("SangradoOFlujoAnormal", txtSangradoAnormal.getText());
            datos.put("Embarazos", txtCuantosEmbarazos.getText());
            datos.put("Partos", txtPartos.getText());
            datos.put("Cesareas", txtCesareas.getText());
            datos.put("Abortos", txtAbortos.getText());
            datos.put("Otros", txtOtros.getText());
            Modelo.Model_Paciente.guardarPacienteAuto("AntecedentesGinecologicos", datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (HeadlessException e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    private void verificarCheckBox() {
        if (chbxPrimeraMenstruacion.isSelected() == false) {
            txtPrimeraMenstruacion.setEnabled(false);
        }
        if (chbxVidaSexualActiva.isSelected() == false) {
            txtVidaSexualActiva.setEnabled(false);
        }
        if (chbxFechaUltimaMenstruacion.isSelected() == false) {
            txtFechaUltimaMenstruacion.setEnabled(false);
        }
        if (chbxHemorragias.isSelected() == false) {
            txtHemorragias.setEnabled(false);
        }
        if (chbxSangradoAnormal.isSelected() == false) {
            txtSangradoAnormal.setEnabled(false);
        }
        if (chbxCuantosEmbarazos.isSelected() == false) {
            txtCuantosEmbarazos.setEnabled(false);
        }
        if (chbxPartos.isSelected() == false) {
            txtPartos.setEnabled(false);
        }
        if (chbxCesareas.isSelected() == false) {
            txtCesareas.setEnabled(false);
        }
        if (chbxAbortos.isSelected() == false) {
            txtAbortos.setEnabled(false);
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
                        javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCGinecologicos.this, "Empleado no encontrado.");
                        return;
                    }
                    lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                        empleado.getApellidoPaterno() + " " + 
                        empleado.getApellidoMaterno());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCGinecologicos.this, "No se pudo cargar el empleado.");
                }
            }
        }.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JCheckBox chbxAbortos;
    private javax.swing.JCheckBox chbxCesareas;
    private javax.swing.JCheckBox chbxCuantosEmbarazos;
    private javax.swing.JCheckBox chbxFechaUltimaMenstruacion;
    private javax.swing.JCheckBox chbxHemorragias;
    private javax.swing.JCheckBox chbxOtros;
    private javax.swing.JCheckBox chbxPartos;
    private javax.swing.JCheckBox chbxPrimeraMenstruacion;
    private javax.swing.JCheckBox chbxSangradoAnormal;
    private javax.swing.JCheckBox chbxVidaSexualActiva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblSiguiente;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtAbortos;
    private javax.swing.JTextField txtCesareas;
    private javax.swing.JTextField txtCuantosEmbarazos;
    private javax.swing.JTextField txtFechaUltimaMenstruacion;
    private javax.swing.JTextField txtHemorragias;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtPartos;
    private javax.swing.JTextField txtPrimeraMenstruacion;
    private javax.swing.JTextField txtSangradoAnormal;
    private javax.swing.JTextField txtVidaSexualActiva;
    // End of variables declaration//GEN-END:variables
}