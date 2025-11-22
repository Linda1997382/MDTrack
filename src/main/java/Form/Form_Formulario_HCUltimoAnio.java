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

public class Form_Formulario_HCUltimoAnio extends javax.swing.JPanel {

    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HCUltimoAnio(int pacienteId, int empleadoId) {
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
        chbxAlteracionesVista = new javax.swing.JCheckBox();
        txtAlteracionesVista = new javax.swing.JTextField();
        chbxDificultadRespirar = new javax.swing.JCheckBox();
        txtDificultadRespirar = new javax.swing.JTextField();
        chbxProblemasAudicion = new javax.swing.JCheckBox();
        txtProblemasAudicion = new javax.swing.JTextField();
        chbxDolorPecho = new javax.swing.JCheckBox();
        txtDolorPecho = new javax.swing.JTextField();
        chbxPerdidaPeso = new javax.swing.JCheckBox();
        txtPerdidaPeso = new javax.swing.JTextField();
        chbxTransfucionesSangre = new javax.swing.JCheckBox();
        txtTransfusionSangre = new javax.swing.JTextField();
        chbxCirugias = new javax.swing.JCheckBox();
        txtCirugias = new javax.swing.JTextField();
        chbxDiarrea = new javax.swing.JCheckBox();
        txtDiarrea = new javax.swing.JTextField();
        chbxOrinaRojizaOSangre = new javax.swing.JCheckBox();
        txtOrinaRojizaOSangre = new javax.swing.JTextField();
        chbxHecesNegroOSangre = new javax.swing.JCheckBox();
        txtHecesNegroOSangre = new javax.swing.JTextField();
        chbxLumbalgia = new javax.swing.JCheckBox();
        txtLumbalgia = new javax.swing.JTextField();
        chbxDepresion = new javax.swing.JCheckBox();
        txtDepresion = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxAlteracionesVista.setBackground(new java.awt.Color(255, 255, 255));
        chbxAlteracionesVista.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxAlteracionesVista.setText("Alteraciones de la vista");
        chbxAlteracionesVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAlteracionesVistaMouseClicked(evt);
            }
        });

        txtAlteracionesVista.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAlteracionesVista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDificultadRespirar.setBackground(new java.awt.Color(255, 255, 255));
        chbxDificultadRespirar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDificultadRespirar.setText("Dificultad para respirar");
        chbxDificultadRespirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDificultadRespirarMouseClicked(evt);
            }
        });

        txtDificultadRespirar.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDificultadRespirar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxProblemasAudicion.setBackground(new java.awt.Color(255, 255, 255));
        chbxProblemasAudicion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxProblemasAudicion.setText("Problemas de audición");
        chbxProblemasAudicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxProblemasAudicionMouseClicked(evt);
            }
        });

        txtProblemasAudicion.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtProblemasAudicion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDolorPecho.setBackground(new java.awt.Color(255, 255, 255));
        chbxDolorPecho.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDolorPecho.setText("Dolor o presión en el pecho");
        chbxDolorPecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDolorPechoMouseClicked(evt);
            }
        });

        txtDolorPecho.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDolorPecho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxPerdidaPeso.setBackground(new java.awt.Color(255, 255, 255));
        chbxPerdidaPeso.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxPerdidaPeso.setText("Perdida de peso");
        chbxPerdidaPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxPerdidaPesoMouseClicked(evt);
            }
        });

        txtPerdidaPeso.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPerdidaPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxTransfucionesSangre.setBackground(new java.awt.Color(255, 255, 255));
        chbxTransfucionesSangre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxTransfucionesSangre.setText("Transfusiones de sangre");
        chbxTransfucionesSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxTransfucionesSangreMouseClicked(evt);
            }
        });

        txtTransfusionSangre.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTransfusionSangre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxCirugias.setBackground(new java.awt.Color(255, 255, 255));
        chbxCirugias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxCirugias.setText("Cirugias");
        chbxCirugias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxCirugiasMouseClicked(evt);
            }
        });

        txtCirugias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtCirugias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDiarrea.setBackground(new java.awt.Color(255, 255, 255));
        chbxDiarrea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDiarrea.setText("Diarrea o estreñimiento");
        chbxDiarrea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDiarreaMouseClicked(evt);
            }
        });

        txtDiarrea.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDiarrea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxOrinaRojizaOSangre.setBackground(new java.awt.Color(255, 255, 255));
        chbxOrinaRojizaOSangre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxOrinaRojizaOSangre.setText("Orina color rojiza o con sangre");
        chbxOrinaRojizaOSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxOrinaRojizaOSangreMouseClicked(evt);
            }
        });

        txtOrinaRojizaOSangre.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtOrinaRojizaOSangre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxHecesNegroOSangre.setBackground(new java.awt.Color(255, 255, 255));
        chbxHecesNegroOSangre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxHecesNegroOSangre.setText("Heces color negro o con sangre");
        chbxHecesNegroOSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxHecesNegroOSangreMouseClicked(evt);
            }
        });

        txtHecesNegroOSangre.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHecesNegroOSangre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxLumbalgia.setBackground(new java.awt.Color(255, 255, 255));
        chbxLumbalgia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxLumbalgia.setText("Lumbalgía");
        chbxLumbalgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxLumbalgiaMouseClicked(evt);
            }
        });

        txtLumbalgia.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtLumbalgia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDepresion.setBackground(new java.awt.Color(255, 255, 255));
        chbxDepresion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDepresion.setText("Preocupaciones o depresión");
        chbxDepresion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDepresionMouseClicked(evt);
            }
        });

        txtDepresion.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDepresion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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
        lblAntecedentesHeredoFam.setText("Antecedentes Del Último Año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));
        lblAviso.setText("**Marca el tipo de padecimiento para poder registrar cual es el que tiene**");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBorder2Layout.createSequentialGroup()
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxDepresion)
                                        .addComponent(chbxLumbalgia)
                                        .addComponent(chbxHecesNegroOSangre)
                                        .addComponent(chbxOrinaRojizaOSangre)
                                        .addComponent(chbxDiarrea)
                                        .addComponent(chbxCirugias)
                                        .addComponent(chbxTransfucionesSangre)
                                        .addComponent(chbxPerdidaPeso)
                                        .addComponent(chbxDificultadRespirar)
                                        .addComponent(chbxAlteracionesVista)
                                        .addComponent(chbxDolorPecho)
                                        .addComponent(chbxProblemasAudicion))
                                    .addGap(50, 50, 50)
                                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOrinaRojizaOSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiarrea, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDepresion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPerdidaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTransfusionSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLumbalgia, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProblemasAudicion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDolorPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHecesNegroOSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDificultadRespirar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAlteracionesVista, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblAviso))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
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
                        .addComponent(chbxAlteracionesVista))
                    .addComponent(txtAlteracionesVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDificultadRespirar))
                    .addComponent(txtDificultadRespirar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxProblemasAudicion))
                    .addComponent(txtProblemasAudicion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDolorPecho))
                    .addComponent(txtDolorPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxPerdidaPeso))
                    .addComponent(txtPerdidaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxTransfucionesSangre))
                    .addComponent(txtTransfusionSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxCirugias))
                    .addComponent(txtCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDiarrea))
                    .addComponent(txtDiarrea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxOrinaRojizaOSangre))
                    .addComponent(txtOrinaRojizaOSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxHecesNegroOSangre))
                    .addComponent(txtHecesNegroOSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxLumbalgia))
                    .addComponent(txtLumbalgia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDepresion))
                    .addComponent(txtDepresion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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

    private void lblSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseExited
        btnSiguiente.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblSiguienteMouseExited

    private void lblSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseEntered
        btnSiguiente.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblSiguienteMouseEntered

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (navigator != null) {
            // Validar casillas marcadas con su texto asociado
            if (chbxAlteracionesVista.isSelected() && txtAlteracionesVista.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Alteraciones de la vista asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtAlteracionesVista.requestFocus();
                return;
            }
            if (chbxDificultadRespirar.isSelected() && txtDificultadRespirar.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Dificultad para respirar asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDificultadRespirar.requestFocus();
                return;
            }
            if (chbxProblemasAudicion.isSelected() && txtProblemasAudicion.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Problemas de audición asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtProblemasAudicion.requestFocus();
                return;
            }
            if (chbxDolorPecho.isSelected() && txtDolorPecho.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Dolor en el pecho asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDolorPecho.requestFocus();
                return;
            }
            if (chbxPerdidaPeso.isSelected() && txtPerdidaPeso.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Pérdida de peso asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtPerdidaPeso.requestFocus();
                return;
            }
            if (chbxTransfucionesSangre.isSelected() && txtTransfusionSangre.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Transfusiones asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtTransfusionSangre.requestFocus();
                return;
            }
            if (chbxCirugias.isSelected() && txtCirugias.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Cirugías asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtCirugias.requestFocus();
                return;
            }
            if (chbxDiarrea.isSelected() && txtDiarrea.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Diarrea asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDiarrea.requestFocus();
                return;
            }
            if (chbxOrinaRojizaOSangre.isSelected() && txtOrinaRojizaOSangre.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Orina rojiza o con sangre asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtOrinaRojizaOSangre.requestFocus();
                return;
            }
            if (chbxHecesNegroOSangre.isSelected() && txtHecesNegroOSangre.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Heces negro o con sangre asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtHecesNegroOSangre.requestFocus();
                return;
            }
            if (chbxLumbalgia.isSelected() && txtLumbalgia.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Lumbalgia asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtLumbalgia.requestFocus();
                return;
            }
            if (chbxDepresion.isSelected() && txtDepresion.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Depresión asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDepresion.requestFocus();
                return;
            }

            // Si pasa validación, guardar y seguir según sexo
            guardar();
            // CORREGIR: Cambiar a int en la llamada
            String sexo = Modelo.Model_Paciente.checarSexoPaciente(pacienteId);
            if ("M".equals(sexo)) { // Cambiar a "M" según tu base de datos
                Form_Formulario_HCExploracionFisica next = new Form_Formulario_HCExploracionFisica(pacienteId, empleadoId);
                next.setNavigator(navigator);
                navigator.accept(next);
            }
            if ("F".equals(sexo)) { // Cambiar a "F" según tu base de datos
                Form_Formulario_HCGinecologicos next = new Form_Formulario_HCGinecologicos(pacienteId, empleadoId);
                next.setNavigator(navigator);
                navigator.accept(next);
            }
        }
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void chbxDepresionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDepresionMouseClicked
        if (chbxDepresion.isSelected() == false) {
            txtDepresion.setEnabled(false);
        }
        if (chbxDepresion.isSelected() == true) {
            txtDepresion.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDepresionMouseClicked

    private void chbxLumbalgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxLumbalgiaMouseClicked
        if (chbxLumbalgia.isSelected() == false) {
            txtLumbalgia.setEnabled(false);
        }
        if (chbxLumbalgia.isSelected() == true) {
            txtLumbalgia.setEnabled(true);
        }
    }//GEN-LAST:event_chbxLumbalgiaMouseClicked

    private void chbxHecesNegroOSangreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxHecesNegroOSangreMouseClicked
        if (chbxHecesNegroOSangre.isSelected() == false) {
            txtHecesNegroOSangre.setEnabled(false);
        }
        if (chbxHecesNegroOSangre.isSelected() == true) {
            txtHecesNegroOSangre.setEnabled(true);
        }
    }//GEN-LAST:event_chbxHecesNegroOSangreMouseClicked

    private void chbxOrinaRojizaOSangreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxOrinaRojizaOSangreMouseClicked
        if (chbxOrinaRojizaOSangre.isSelected() == false) {
            txtOrinaRojizaOSangre.setEnabled(false);
        }
        if (chbxOrinaRojizaOSangre.isSelected() == true) {
            txtOrinaRojizaOSangre.setEnabled(true);
        }
    }//GEN-LAST:event_chbxOrinaRojizaOSangreMouseClicked

    private void chbxDiarreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDiarreaMouseClicked
        if (chbxDiarrea.isSelected() == false) {
            txtDiarrea.setEnabled(false);
        }
        if (chbxDiarrea.isSelected() == true) {
            txtDiarrea.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDiarreaMouseClicked

    private void chbxCirugiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxCirugiasMouseClicked
        if (chbxCirugias.isSelected() == false) {
            txtCirugias.setEnabled(false);
        }
        if (chbxCirugias.isSelected() == true) {
            txtCirugias.setEnabled(true);
        }
    }//GEN-LAST:event_chbxCirugiasMouseClicked

    private void chbxTransfucionesSangreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxTransfucionesSangreMouseClicked
        if (chbxTransfucionesSangre.isSelected() == false) {
            txtTransfusionSangre.setEnabled(false);
        }
        if (chbxTransfucionesSangre.isSelected() == true) {
            txtTransfusionSangre.setEnabled(true);
        }
    }//GEN-LAST:event_chbxTransfucionesSangreMouseClicked

    private void chbxPerdidaPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxPerdidaPesoMouseClicked
        if (chbxPerdidaPeso.isSelected() == false) {
            txtPerdidaPeso.setEnabled(false);
        }
        if (chbxPerdidaPeso.isSelected() == true) {
            txtPerdidaPeso.setEnabled(true);
        }
    }//GEN-LAST:event_chbxPerdidaPesoMouseClicked

    private void chbxDolorPechoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDolorPechoMouseClicked
        if (chbxDolorPecho.isSelected() == false) {
            txtDolorPecho.setEnabled(false);
        }
        if (chbxDolorPecho.isSelected() == true) {
            txtDolorPecho.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDolorPechoMouseClicked

    private void chbxProblemasAudicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxProblemasAudicionMouseClicked
        if (chbxProblemasAudicion.isSelected() == false) {
            txtProblemasAudicion.setEnabled(false);
        }
        if (chbxProblemasAudicion.isSelected() == true) {
            txtProblemasAudicion.setEnabled(true);
        }
    }//GEN-LAST:event_chbxProblemasAudicionMouseClicked

    private void chbxDificultadRespirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDificultadRespirarMouseClicked
        if (chbxDificultadRespirar.isSelected() == false) {
            txtDificultadRespirar.setEnabled(false);
        }
        if (chbxDificultadRespirar.isSelected() == true) {
            txtDificultadRespirar.setEnabled(true);
        }
    }//GEN-LAST:event_chbxDificultadRespirarMouseClicked

    private void chbxAlteracionesVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAlteracionesVistaMouseClicked
        if (chbxAlteracionesVista.isSelected() == false) {
            txtAlteracionesVista.setEnabled(false);
        }
        if (chbxAlteracionesVista.isSelected() == true) {
            txtAlteracionesVista.setEnabled(true);
        }
    }//GEN-LAST:event_chbxAlteracionesVistaMouseClicked
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
            datos.put("AlteracionesVista", txtAlteracionesVista.getText());
            datos.put("DificultadRespirar", txtDificultadRespirar.getText());
            datos.put("ProblemasAudicion", txtProblemasAudicion.getText());
            datos.put("DolorPecho", txtDolorPecho.getText());
            datos.put("PerdidaPeso", txtPerdidaPeso.getText());
            datos.put("TransfusionesSangre", txtTransfusionSangre.getText());
            datos.put("Cirugias", txtCirugias.getText());
            datos.put("DiarreaEstreñimiento", txtDiarrea.getText());
            datos.put("OrinaRojizaOSangre", txtOrinaRojizaOSangre.getText());
            datos.put("HecesNegroOSangre", txtHecesNegroOSangre.getText());
            datos.put("Lumbalgia", txtLumbalgia.getText());
            datos.put("PreocupacionesDepresion", txtDepresion.getText());
            Modelo.Model_Paciente.guardarPacienteAuto("AntecedentesUltimoAño", datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (HeadlessException e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    private void verificarCheckBox() {
        if (chbxAlteracionesVista.isSelected() == false) {
            txtAlteracionesVista.setEnabled(false);
        }
        if (chbxDificultadRespirar.isSelected() == false) {
            txtDificultadRespirar.setEnabled(false);
        }
        if (chbxProblemasAudicion.isSelected() == false) {
            txtProblemasAudicion.setEnabled(false);
        }
        if (chbxDolorPecho.isSelected() == false) {
            txtDolorPecho.setEnabled(false);
        }
        if (chbxPerdidaPeso.isSelected() == false) {
            txtPerdidaPeso.setEnabled(false);
        }
        if (chbxTransfucionesSangre.isSelected() == false) {
            txtTransfusionSangre.setEnabled(false);
        }
        if (chbxCirugias.isSelected() == false) {
            txtCirugias.setEnabled(false);
        }
        if (chbxDiarrea.isSelected() == false) {
            txtDiarrea.setEnabled(false);
        }
        if (chbxOrinaRojizaOSangre.isSelected() == false) {
            txtOrinaRojizaOSangre.setEnabled(false);
        }
        if (chbxHecesNegroOSangre.isSelected() == false) {
            txtHecesNegroOSangre.setEnabled(false);
        }
        if (chbxLumbalgia.isSelected() == false) {
            txtLumbalgia.setEnabled(false);
        }
        if (chbxDepresion.isSelected() == false) {
            txtDepresion.setEnabled(false);
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
                        javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCUltimoAnio.this, "Empleado no encontrado.");
                        return;
                    }
                    lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                        empleado.getApellidoPaterno() + " " + 
                        empleado.getApellidoMaterno());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCUltimoAnio.this, "No se pudo cargar el empleado.");
                }
            }
        }.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JCheckBox chbxAlteracionesVista;
    private javax.swing.JCheckBox chbxCirugias;
    private javax.swing.JCheckBox chbxDepresion;
    private javax.swing.JCheckBox chbxDiarrea;
    private javax.swing.JCheckBox chbxDificultadRespirar;
    private javax.swing.JCheckBox chbxDolorPecho;
    private javax.swing.JCheckBox chbxHecesNegroOSangre;
    private javax.swing.JCheckBox chbxLumbalgia;
    private javax.swing.JCheckBox chbxOrinaRojizaOSangre;
    private javax.swing.JCheckBox chbxPerdidaPeso;
    private javax.swing.JCheckBox chbxProblemasAudicion;
    private javax.swing.JCheckBox chbxTransfucionesSangre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblSiguiente;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtAlteracionesVista;
    private javax.swing.JTextField txtCirugias;
    private javax.swing.JTextField txtDepresion;
    private javax.swing.JTextField txtDiarrea;
    private javax.swing.JTextField txtDificultadRespirar;
    private javax.swing.JTextField txtDolorPecho;
    private javax.swing.JTextField txtHecesNegroOSangre;
    private javax.swing.JTextField txtLumbalgia;
    private javax.swing.JTextField txtOrinaRojizaOSangre;
    private javax.swing.JTextField txtPerdidaPeso;
    private javax.swing.JTextField txtProblemasAudicion;
    private javax.swing.JTextField txtTransfusionSangre;
    // End of variables declaration//GEN-END:variables
}