package Form;

import Swing.ScrollBar;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Formulario_HCPatologicos extends javax.swing.JPanel {

    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HCPatologicos(int pacienteId, int empleadoId) {
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
        chbxDiabetes = new javax.swing.JCheckBox();
        txtDiabetes = new javax.swing.JTextField();
        chbxAsmaBronquial = new javax.swing.JCheckBox();
        txtAsmaBronquial = new javax.swing.JTextField();
        chbxHipertension = new javax.swing.JCheckBox();
        txtHipertension = new javax.swing.JTextField();
        chbxCardiopatias = new javax.swing.JCheckBox();
        txtCardiopatias = new javax.swing.JTextField();
        chbxHernias = new javax.swing.JCheckBox();
        txtHernias = new javax.swing.JTextField();
        chbxProblemasOftalmologicos = new javax.swing.JCheckBox();
        txtProblemasOftalmologicos = new javax.swing.JTextField();
        chbxProblemasOidos = new javax.swing.JCheckBox();
        txtProblemasOidos = new javax.swing.JTextField();
        chbxObstruccionNasal = new javax.swing.JCheckBox();
        txtObstruccionNasal = new javax.swing.JTextField();
        chbxProblemasPiel = new javax.swing.JCheckBox();
        txtProblemasPiel = new javax.swing.JTextField();
        chbxDesmayos = new javax.swing.JCheckBox();
        txtDesmayos = new javax.swing.JTextField();
        chbxDolorCabeza = new javax.swing.JCheckBox();
        chbxLesiones = new javax.swing.JCheckBox();
        txtLesiones = new javax.swing.JTextField();
        chbxAmputaciones = new javax.swing.JCheckBox();
        txtAmputaciones = new javax.swing.JTextField();
        chbxInfeccionesUrinarias = new javax.swing.JCheckBox();
        txtInfeccionesUrinarias = new javax.swing.JTextField();
        chbxFracturas = new javax.swing.JCheckBox();
        txtFracturas = new javax.swing.JTextField();
        chbxCirugias = new javax.swing.JCheckBox();
        txtCirugias = new javax.swing.JTextField();
        chbxETS = new javax.swing.JCheckBox();
        txtETS = new javax.swing.JTextField();
        chbxTranstornosMentales = new javax.swing.JCheckBox();
        txtTranstornosMentales = new javax.swing.JTextField();
        chbxToxicomanias = new javax.swing.JCheckBox();
        txtToxicomanias = new javax.swing.JTextField();
        chbxTabaquismo = new javax.swing.JCheckBox();
        txtTabaquismo = new javax.swing.JTextField();
        chbxAlcoholismo = new javax.swing.JCheckBox();
        txtAlcoholismo = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        txtDolorCabeza = new javax.swing.JTextField();
        lblDoctor = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDiabetes.setBackground(new java.awt.Color(255, 255, 255));
        chbxDiabetes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDiabetes.setText("Diabetes");
        chbxDiabetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDiabetesMouseClicked(evt);
            }
        });

        txtDiabetes.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDiabetes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxAsmaBronquial.setBackground(new java.awt.Color(255, 255, 255));
        chbxAsmaBronquial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxAsmaBronquial.setText("Asma bronquial");
        chbxAsmaBronquial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAsmaBronquialMouseClicked(evt);
            }
        });

        txtAsmaBronquial.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAsmaBronquial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxHipertension.setBackground(new java.awt.Color(255, 255, 255));
        chbxHipertension.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxHipertension.setText("Hipertension");
        chbxHipertension.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxHipertensionMouseClicked(evt);
            }
        });

        txtHipertension.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHipertension.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxCardiopatias.setBackground(new java.awt.Color(255, 255, 255));
        chbxCardiopatias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxCardiopatias.setText("Cardiopatias");
        chbxCardiopatias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxCardiopatiasMouseClicked(evt);
            }
        });

        txtCardiopatias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtCardiopatias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxHernias.setBackground(new java.awt.Color(255, 255, 255));
        chbxHernias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxHernias.setText("Hernias");
        chbxHernias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxHerniasMouseClicked(evt);
            }
        });

        txtHernias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHernias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxProblemasOftalmologicos.setBackground(new java.awt.Color(255, 255, 255));
        chbxProblemasOftalmologicos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxProblemasOftalmologicos.setText("Problemas oftalmologicos");
        chbxProblemasOftalmologicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxProblemasOftalmologicosMouseClicked(evt);
            }
        });

        txtProblemasOftalmologicos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtProblemasOftalmologicos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxProblemasOidos.setBackground(new java.awt.Color(255, 255, 255));
        chbxProblemasOidos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxProblemasOidos.setText("Problemas en los oidos");
        chbxProblemasOidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxProblemasOidosMouseClicked(evt);
            }
        });

        txtProblemasOidos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtProblemasOidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxObstruccionNasal.setBackground(new java.awt.Color(255, 255, 255));
        chbxObstruccionNasal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxObstruccionNasal.setText("Obstrucción nasal");
        chbxObstruccionNasal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxObstruccionNasalMouseClicked(evt);
            }
        });

        txtObstruccionNasal.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtObstruccionNasal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxProblemasPiel.setBackground(new java.awt.Color(255, 255, 255));
        chbxProblemasPiel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxProblemasPiel.setText("Problemas en la piel");
        chbxProblemasPiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxProblemasPielMouseClicked(evt);
            }
        });

        txtProblemasPiel.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtProblemasPiel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDesmayos.setBackground(new java.awt.Color(255, 255, 255));
        chbxDesmayos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDesmayos.setText("Desmayos");
        chbxDesmayos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDesmayosMouseClicked(evt);
            }
        });

        txtDesmayos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDesmayos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxDolorCabeza.setBackground(new java.awt.Color(255, 255, 255));
        chbxDolorCabeza.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxDolorCabeza.setText("Dolor de cabeza");
        chbxDolorCabeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxDolorCabezaMouseClicked(evt);
            }
        });

        chbxLesiones.setBackground(new java.awt.Color(255, 255, 255));
        chbxLesiones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxLesiones.setText("Lesiones en la espalda, columna o cadera");
        chbxLesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxLesionesMouseClicked(evt);
            }
        });

        txtLesiones.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtLesiones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxAmputaciones.setBackground(new java.awt.Color(255, 255, 255));
        chbxAmputaciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxAmputaciones.setText("Amputaciones");
        chbxAmputaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAmputacionesMouseClicked(evt);
            }
        });

        txtAmputaciones.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAmputaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxInfeccionesUrinarias.setBackground(new java.awt.Color(255, 255, 255));
        chbxInfeccionesUrinarias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxInfeccionesUrinarias.setText("Infecciones urinarias");
        chbxInfeccionesUrinarias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxInfeccionesUrinariasMouseClicked(evt);
            }
        });

        txtInfeccionesUrinarias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtInfeccionesUrinarias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxFracturas.setBackground(new java.awt.Color(255, 255, 255));
        chbxFracturas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxFracturas.setText("Fracturas o luxaciones");
        chbxFracturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxFracturasMouseClicked(evt);
            }
        });

        txtFracturas.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtFracturas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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

        chbxETS.setBackground(new java.awt.Color(255, 255, 255));
        chbxETS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxETS.setText("Enfermedades de transmisión sexual");
        chbxETS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxETSMouseClicked(evt);
            }
        });

        txtETS.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtETS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxTranstornosMentales.setBackground(new java.awt.Color(255, 255, 255));
        chbxTranstornosMentales.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxTranstornosMentales.setText("Transtornos mentales o nerviosos");
        chbxTranstornosMentales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxTranstornosMentalesMouseClicked(evt);
            }
        });

        txtTranstornosMentales.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTranstornosMentales.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxToxicomanias.setBackground(new java.awt.Color(255, 255, 255));
        chbxToxicomanias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxToxicomanias.setText("Toxicomanías (drogas)");
        chbxToxicomanias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxToxicomaniasMouseClicked(evt);
            }
        });

        txtToxicomanias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtToxicomanias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxTabaquismo.setBackground(new java.awt.Color(255, 255, 255));
        chbxTabaquismo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxTabaquismo.setText("Tabaquismo");
        chbxTabaquismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxTabaquismoMouseClicked(evt);
            }
        });

        txtTabaquismo.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTabaquismo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxAlcoholismo.setBackground(new java.awt.Color(255, 255, 255));
        chbxAlcoholismo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxAlcoholismo.setText("Alcoholismo");
        chbxAlcoholismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxAlcoholismoMouseClicked(evt);
            }
        });

        txtAlcoholismo.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAlcoholismo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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
        lblAntecedentesHeredoFam.setText("Antecedentes Personales Patologicos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));
        lblAviso.setText("**Marca el tipo de padecimiento para poder registrar cual es el que tiene**");

        txtDolorCabeza.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtDolorCabeza.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblAviso)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chbxAlcoholismo)
                                .addComponent(chbxTabaquismo)
                                .addComponent(chbxToxicomanias)
                                .addComponent(chbxTranstornosMentales)
                                .addComponent(chbxETS)
                                .addComponent(chbxCirugias)
                                .addComponent(chbxFracturas)
                                .addComponent(chbxInfeccionesUrinarias)
                                .addComponent(chbxAmputaciones)
                                .addComponent(chbxLesiones)
                                .addComponent(chbxDolorCabeza)
                                .addComponent(chbxDesmayos)
                                .addComponent(chbxProblemasPiel)
                                .addComponent(chbxObstruccionNasal)
                                .addComponent(chbxProblemasOidos)
                                .addComponent(chbxProblemasOftalmologicos)
                                .addComponent(chbxHernias)
                                .addComponent(chbxAsmaBronquial)
                                .addComponent(chbxDiabetes)
                                .addComponent(chbxCardiopatias)
                                .addComponent(chbxHipertension))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtProblemasPiel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtToxicomanias, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtFracturas, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtObstruccionNasal, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtLesiones, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtHernias, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtTabaquismo, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtETS, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtCirugias, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtInfeccionesUrinarias, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtTranstornosMentales, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtAlcoholismo, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtProblemasOftalmologicos, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtHipertension, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtProblemasOidos, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtCardiopatias, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtDesmayos, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtAmputaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtAsmaBronquial, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtDiabetes, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(txtDolorCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder2Layout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
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
                        .addComponent(chbxDiabetes))
                    .addComponent(txtDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxAsmaBronquial))
                    .addComponent(txtAsmaBronquial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxHipertension))
                    .addComponent(txtHipertension, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxCardiopatias))
                    .addComponent(txtCardiopatias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxHernias))
                    .addComponent(txtHernias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxProblemasOftalmologicos))
                    .addComponent(txtProblemasOftalmologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxProblemasOidos))
                    .addComponent(txtProblemasOidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxObstruccionNasal))
                    .addComponent(txtObstruccionNasal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxProblemasPiel))
                    .addComponent(txtProblemasPiel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDesmayos))
                    .addComponent(txtDesmayos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDolorCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxDolorCabeza))
                .addGap(14, 14, 14)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxLesiones))
                    .addComponent(txtLesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxAmputaciones))
                    .addComponent(txtAmputaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxInfeccionesUrinarias))
                    .addComponent(txtInfeccionesUrinarias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxFracturas))
                    .addComponent(txtFracturas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(chbxETS))
                    .addComponent(txtETS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxTranstornosMentales))
                    .addComponent(txtTranstornosMentales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxToxicomanias))
                    .addComponent(txtToxicomanias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxTabaquismo))
                    .addComponent(txtTabaquismo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxAlcoholismo))
                    .addComponent(txtAlcoholismo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            Form_Formulario_HCUltimoAnio next = new Form_Formulario_HCUltimoAnio(pacienteId, empleadoId);
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

    private void chbxDiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDiabetesMouseClicked
        if (chbxDiabetes.isSelected() == false) {
            txtDiabetes.disable();
        }
        if (chbxDiabetes.isSelected() == true) {
            txtDiabetes.enable();
        }
    }//GEN-LAST:event_chbxDiabetesMouseClicked

    private void chbxHerniasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxHerniasMouseClicked
        if (chbxHernias.isSelected() == false) {
            txtHernias.disable();
        }
        if (chbxHernias.isSelected() == true) {
            txtHernias.enable();
        }
    }//GEN-LAST:event_chbxHerniasMouseClicked

    private void chbxProblemasOftalmologicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxProblemasOftalmologicosMouseClicked
        if (chbxProblemasOftalmologicos.isSelected() == false) {
            txtProblemasOftalmologicos.disable();
        }
        if (chbxProblemasOftalmologicos.isSelected() == true) {
            txtProblemasOftalmologicos.enable();
        }
    }//GEN-LAST:event_chbxProblemasOftalmologicosMouseClicked

    private void chbxProblemasOidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxProblemasOidosMouseClicked
        if (chbxProblemasOidos.isSelected() == false) {
            txtProblemasOidos.disable();
        }
        if (chbxProblemasOidos.isSelected() == true) {
            txtProblemasOidos.enable();
        }
    }//GEN-LAST:event_chbxProblemasOidosMouseClicked

    private void chbxObstruccionNasalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxObstruccionNasalMouseClicked
        if (chbxObstruccionNasal.isSelected() == false) {
            txtObstruccionNasal.disable();
        }
        if (chbxObstruccionNasal.isSelected() == true) {
            txtObstruccionNasal.enable();
        }
    }//GEN-LAST:event_chbxObstruccionNasalMouseClicked

    private void chbxProblemasPielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxProblemasPielMouseClicked
        if (chbxProblemasPiel.isSelected() == false) {
            txtProblemasPiel.disable();
        }
        if (chbxProblemasPiel.isSelected() == true) {
            txtProblemasPiel.enable();
        }
    }//GEN-LAST:event_chbxProblemasPielMouseClicked

    private void chbxDesmayosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDesmayosMouseClicked
        if (chbxDesmayos.isSelected() == false) {
            txtDesmayos.disable();
        }
        if (chbxDesmayos.isSelected() == true) {
            txtDesmayos.enable();
        }
    }//GEN-LAST:event_chbxDesmayosMouseClicked

    private void chbxDolorCabezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxDolorCabezaMouseClicked
        if (chbxDolorCabeza.isSelected() == false) {
            txtDolorCabeza.disable();
        }
        if (chbxDolorCabeza.isSelected() == true) {
            txtDolorCabeza.enable();
        }
    }//GEN-LAST:event_chbxDolorCabezaMouseClicked

    private void chbxLesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxLesionesMouseClicked
        if (chbxLesiones.isSelected() == false) {
            txtLesiones.disable();
        }
        if (chbxLesiones.isSelected() == true) {
            txtLesiones.enable();
        }
    }//GEN-LAST:event_chbxLesionesMouseClicked

    private void chbxAmputacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAmputacionesMouseClicked
        if (chbxAmputaciones.isSelected() == false) {
            txtAmputaciones.disable();
        }
        if (chbxAmputaciones.isSelected() == true) {
            txtAmputaciones.enable();
        }
    }//GEN-LAST:event_chbxAmputacionesMouseClicked

    private void chbxInfeccionesUrinariasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxInfeccionesUrinariasMouseClicked
        if (chbxInfeccionesUrinarias.isSelected() == false) {
            txtInfeccionesUrinarias.disable();
        }
        if (chbxInfeccionesUrinarias.isSelected() == true) {
            txtInfeccionesUrinarias.enable();
        }
    }//GEN-LAST:event_chbxInfeccionesUrinariasMouseClicked

    private void chbxFracturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxFracturasMouseClicked
        if (chbxFracturas.isSelected() == false) {
            txtFracturas.disable();
        }
        if (chbxFracturas.isSelected() == true) {
            txtFracturas.enable();
        }
    }//GEN-LAST:event_chbxFracturasMouseClicked

    private void chbxCirugiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxCirugiasMouseClicked
        if (chbxCirugias.isSelected() == false) {
            txtCirugias.disable();
        }
        if (chbxCirugias.isSelected() == true) {
            txtCirugias.enable();
        }
    }//GEN-LAST:event_chbxCirugiasMouseClicked

    private void chbxETSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxETSMouseClicked
        if (chbxETS.isSelected() == false) {
            txtETS.disable();
        }
        if (chbxETS.isSelected() == true) {
            txtETS.enable();
        }
    }//GEN-LAST:event_chbxETSMouseClicked

    private void chbxTranstornosMentalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxTranstornosMentalesMouseClicked
        if (chbxTranstornosMentales.isSelected() == false) {
            txtTranstornosMentales.disable();
        }
        if (chbxTranstornosMentales.isSelected() == true) {
            txtTranstornosMentales.enable();
        }
    }//GEN-LAST:event_chbxTranstornosMentalesMouseClicked

    private void chbxToxicomaniasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxToxicomaniasMouseClicked
        if (chbxToxicomanias.isSelected() == false) {
            txtToxicomanias.disable();
        }
        if (chbxToxicomanias.isSelected() == true) {
            txtToxicomanias.enable();
        }
    }//GEN-LAST:event_chbxToxicomaniasMouseClicked

    private void chbxTabaquismoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxTabaquismoMouseClicked
        if (chbxTabaquismo.isSelected() == false) {
            txtTabaquismo.disable();
        }
        if (chbxTabaquismo.isSelected() == true) {
            txtTabaquismo.enable();
        }
    }//GEN-LAST:event_chbxTabaquismoMouseClicked

    private void chbxAlcoholismoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAlcoholismoMouseClicked
        if (chbxAlcoholismo.isSelected() == false) {
            txtAlcoholismo.disable();
        }
        if (chbxAlcoholismo.isSelected() == true) {
            txtAlcoholismo.enable();
        }
    }//GEN-LAST:event_chbxAlcoholismoMouseClicked

    private void chbxHipertensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxHipertensionMouseClicked
        if (chbxHipertension.isSelected() == false) {
            txtHipertension.disable();
        }
        if (chbxHipertension.isSelected() == true) {
            txtHipertension.enable();
        }
    }//GEN-LAST:event_chbxHipertensionMouseClicked

    private void chbxCardiopatiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxCardiopatiasMouseClicked
        if (chbxCardiopatias.isSelected() == false) {
            txtCardiopatias.disable();
        }
        if (chbxCardiopatias.isSelected() == true) {
            txtCardiopatias.enable();
        }
    }//GEN-LAST:event_chbxCardiopatiasMouseClicked

    private void chbxAsmaBronquialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxAsmaBronquialMouseClicked
        if (chbxAsmaBronquial.isSelected() == false) {
            txtAsmaBronquial.disable();
        }
        if (chbxAsmaBronquial.isSelected() == true) {
            txtAsmaBronquial.enable();
        }
    }//GEN-LAST:event_chbxAsmaBronquialMouseClicked
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
        
        // CORREGIR: Estás usando txtDesmayos para todos los campos
        datos.put("Diabetes", txtDiabetes.getText());
        datos.put("AsmaBronquial", txtAsmaBronquial.getText());
        datos.put("Hipertension", txtHipertension.getText());
        datos.put("Cardiopatias", txtCardiopatias.getText());
        datos.put("ProblemasOftalmologicos", txtProblemasOftalmologicos.getText());
        datos.put("ProblemasOidos", txtProblemasOidos.getText());
        datos.put("ObstruccionNasal", txtObstruccionNasal.getText());
        datos.put("ProblemasPiel", txtProblemasPiel.getText());
        datos.put("Desmayos", txtDesmayos.getText());
        datos.put("DolorCabeza", txtDolorCabeza.getText()); // Cambiar a txtDolorCabeza
        datos.put("Lesiones", txtLesiones.getText()); // Cambiar a txtLesiones
        datos.put("Amputaciones", txtAmputaciones.getText()); // Cambiar a txtAmputaciones
        datos.put("InfeccionesUrinarias", txtInfeccionesUrinarias.getText()); // Cambiar
        datos.put("Fracturas", txtFracturas.getText()); // Cambiar
        datos.put("Cirugias", txtCirugias.getText()); // Cambiar
        datos.put("ETS", txtETS.getText()); // Cambiar
        datos.put("TranstornosMentales", txtTranstornosMentales.getText()); // Cambiar
        datos.put("Toxicomanias", txtToxicomanias.getText()); // Cambiar
        datos.put("Tabaquismo", txtTabaquismo.getText()); // Cambiar
        datos.put("Alcoholismo", txtAlcoholismo.getText()); // Cambiar
        
        Modelo.Model_Paciente.guardarPacienteAuto("AntecedentePatologicos", datos);
        JOptionPane.showMessageDialog(null, "Guardado con éxito");
    } catch (HeadlessException e) {
        System.err.println("Error: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar");
    }
}

    private void verificarCheckBox() {
        if (chbxDiabetes.isSelected() == false) {
            txtDiabetes.disable();
        }
        if (chbxAsmaBronquial.isSelected() == false) {
            txtAsmaBronquial.disable();
        }
        if (chbxHipertension.isSelected() == false) {
            txtHipertension.disable();
        }
        if (chbxCardiopatias.isSelected() == false) {
            txtCardiopatias.disable();
        }
        if (chbxHernias.isSelected() == false) {
            txtHernias.disable();
        }
        if (chbxProblemasOftalmologicos.isSelected() == false) {
            txtProblemasOftalmologicos.disable();
        }
        if (chbxProblemasOidos.isSelected() == false) {
            txtProblemasOidos.disable();
        }
        if (chbxObstruccionNasal.isSelected() == false) {
            txtObstruccionNasal.disable();
        }
        if (chbxProblemasPiel.isSelected() == false) {
            txtProblemasPiel.disable();
        }
        if (chbxDesmayos.isSelected() == false) {
            txtDesmayos.disable();
        }
        if (chbxDolorCabeza.isSelected() == false) {
            txtDolorCabeza.disable();
        }
        if (chbxLesiones.isSelected() == false) {
            txtLesiones.disable();
        }
        if (chbxAmputaciones.isSelected() == false) {
            txtAmputaciones.disable();
        }
        if (chbxInfeccionesUrinarias.isSelected() == false) {
            txtInfeccionesUrinarias.disable();
        }
        if (chbxFracturas.isSelected() == false) {
            txtFracturas.disable();
        }
        if (chbxCirugias.isSelected() == false) {
            txtCirugias.disable();
        }
        if (chbxETS.isSelected() == false) {
            txtETS.disable();
        }
        if (chbxTranstornosMentales.isSelected() == false) {
            txtTranstornosMentales.disable();
        }
        if (chbxToxicomanias.isSelected() == false) {
            txtToxicomanias.disable();
        }
        if (chbxTabaquismo.isSelected() == false) {
            txtTabaquismo.disable();
        }
        if (chbxAlcoholismo.isSelected() == false) {
            txtAlcoholismo.disable();
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
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCPatologicos.this, "Empleado no encontrado.");
                    return;
                }
                lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                    empleado.getApellidoPaterno() + " " + 
                    empleado.getApellidoMaterno());
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HCPatologicos.this, "No se pudo cargar el empleado.");
            }
        }
    }.execute();
}

    private static String val(Map<String, Object> m, String k) {
        Object v = m.get(k);
        return v == null ? "" : v.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JCheckBox chbxAlcoholismo;
    private javax.swing.JCheckBox chbxAmputaciones;
    private javax.swing.JCheckBox chbxAsmaBronquial;
    private javax.swing.JCheckBox chbxCardiopatias;
    private javax.swing.JCheckBox chbxCirugias;
    private javax.swing.JCheckBox chbxDesmayos;
    private javax.swing.JCheckBox chbxDiabetes;
    private javax.swing.JCheckBox chbxDolorCabeza;
    private javax.swing.JCheckBox chbxETS;
    private javax.swing.JCheckBox chbxFracturas;
    private javax.swing.JCheckBox chbxHernias;
    private javax.swing.JCheckBox chbxHipertension;
    private javax.swing.JCheckBox chbxInfeccionesUrinarias;
    private javax.swing.JCheckBox chbxLesiones;
    private javax.swing.JCheckBox chbxObstruccionNasal;
    private javax.swing.JCheckBox chbxProblemasOftalmologicos;
    private javax.swing.JCheckBox chbxProblemasOidos;
    private javax.swing.JCheckBox chbxProblemasPiel;
    private javax.swing.JCheckBox chbxTabaquismo;
    private javax.swing.JCheckBox chbxToxicomanias;
    private javax.swing.JCheckBox chbxTranstornosMentales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblSiguiente;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtAlcoholismo;
    private javax.swing.JTextField txtAmputaciones;
    private javax.swing.JTextField txtAsmaBronquial;
    private javax.swing.JTextField txtCardiopatias;
    private javax.swing.JTextField txtCirugias;
    private javax.swing.JTextField txtDesmayos;
    private javax.swing.JTextField txtDiabetes;
    private javax.swing.JTextField txtDolorCabeza;
    private javax.swing.JTextField txtETS;
    private javax.swing.JTextField txtFracturas;
    private javax.swing.JTextField txtHernias;
    private javax.swing.JTextField txtHipertension;
    private javax.swing.JTextField txtInfeccionesUrinarias;
    private javax.swing.JTextField txtLesiones;
    private javax.swing.JTextField txtObstruccionNasal;
    private javax.swing.JTextField txtProblemasOftalmologicos;
    private javax.swing.JTextField txtProblemasOidos;
    private javax.swing.JTextField txtProblemasPiel;
    private javax.swing.JTextField txtTabaquismo;
    private javax.swing.JTextField txtToxicomanias;
    private javax.swing.JTextField txtTranstornosMentales;
    // End of variables declaration//GEN-END:variables
}
