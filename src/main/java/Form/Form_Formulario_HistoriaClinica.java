package Form;

import Swing.ScrollBar;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Formulario_HistoriaClinica extends javax.swing.JPanel {

    private final int pacienteId;  // Cambiar a int
    private final int empleadoId;  // Cambiar a int

    // Cambiar constructor para aceptar int
    public Form_Formulario_HistoriaClinica(int pacienteId, int empleadoId) {
        this.pacienteId = pacienteId;
        this.empleadoId = empleadoId;
        initComponents();
        sbAntHere.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        sbAntHere.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        verificarCheckBox();
        cargarPacienteEnFormulario(String.valueOf(pacienteId)); // Convertir a String para el método existente
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sbAntHere = new javax.swing.JScrollPane();
        panelBorder2 = new Swing.PanelBorder();
        pHistoriaClinica = new javax.swing.JPanel();
        lblHistoriaClinica = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblFechaHora = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        lblAbuelos = new javax.swing.JLabel();
        txtAbuelos = new javax.swing.JTextField();
        lblPadres = new javax.swing.JLabel();
        txtPadres = new javax.swing.JTextField();
        lblHermanos = new javax.swing.JLabel();
        txtHermanos = new javax.swing.JTextField();
        lblHijos = new javax.swing.JLabel();
        txtHijos = new javax.swing.JTextField();
        chbxDiabetes = new javax.swing.JCheckBox();
        txtDiabetes = new javax.swing.JTextField();
        chbxHipertension = new javax.swing.JCheckBox();
        txtHipertension = new javax.swing.JTextField();
        chbxCardiopatias = new javax.swing.JCheckBox();
        txtCardiopatias = new javax.swing.JTextField();
        chbxNeuropatias = new javax.swing.JCheckBox();
        txtNeuropatias = new javax.swing.JTextField();
        chbxOncologicos = new javax.swing.JCheckBox();
        txtOncologicos = new javax.swing.JTextField();
        chbxHematologicos = new javax.swing.JCheckBox();
        txtHematologicos = new javax.swing.JTextField();
        chbxTranstornosPsiquiatricos = new javax.swing.JCheckBox();
        txtTranstornosPsiquiatricos = new javax.swing.JTextField();
        chbxOtros = new javax.swing.JCheckBox();
        txtOtros = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        pAntecedentesHeredofamiliares = new javax.swing.JPanel();
        lblAntecedentesHeredoFam = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();

        sbAntHere.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        pHistoriaClinica.setBackground(new java.awt.Color(24, 102, 200));

        lblHistoriaClinica.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblHistoriaClinica.setForeground(new java.awt.Color(255, 255, 255));
        lblHistoriaClinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoriaClinica.setText("Formulario Historia Clinica");

        javax.swing.GroupLayout pHistoriaClinicaLayout = new javax.swing.GroupLayout(pHistoriaClinica);
        pHistoriaClinica.setLayout(pHistoriaClinicaLayout);
        pHistoriaClinicaLayout.setHorizontalGroup(
            pHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pHistoriaClinicaLayout.setVerticalGroup(
            pHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEdad.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblEdad.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblTel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTel.setText("Telefono:");

        txtTel.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFechaNacimiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento:");

        txtFechaNacimiento.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblFechaHora.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblFechaHora.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblEmpresa.setText("Empresa:");

        txtEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpresa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblAbuelos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblAbuelos.setText("Abuelos:");

        txtAbuelos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAbuelos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbuelos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblPadres.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPadres.setText("Padres:");

        txtPadres.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtPadres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPadres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblHermanos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblHermanos.setText("Hermanos:");

        txtHermanos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHermanos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHermanos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblHijos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblHijos.setText("Hijos:");

        txtHijos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHijos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHijos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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

        chbxNeuropatias.setBackground(new java.awt.Color(255, 255, 255));
        chbxNeuropatias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxNeuropatias.setText("Neuropatias");
        chbxNeuropatias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxNeuropatiasMouseClicked(evt);
            }
        });

        txtNeuropatias.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtNeuropatias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxOncologicos.setBackground(new java.awt.Color(255, 255, 255));
        chbxOncologicos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxOncologicos.setText("Oncologicos");
        chbxOncologicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxOncologicosMouseClicked(evt);
            }
        });

        txtOncologicos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtOncologicos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxHematologicos.setBackground(new java.awt.Color(255, 255, 255));
        chbxHematologicos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxHematologicos.setText("Hematologicos");
        chbxHematologicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxHematologicosMouseClicked(evt);
            }
        });

        txtHematologicos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtHematologicos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        chbxTranstornosPsiquiatricos.setBackground(new java.awt.Color(255, 255, 255));
        chbxTranstornosPsiquiatricos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chbxTranstornosPsiquiatricos.setText("Transtornos psiquiatricos");
        chbxTranstornosPsiquiatricos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxTranstornosPsiquiatricosMouseClicked(evt);
            }
        });

        txtTranstornosPsiquiatricos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtTranstornosPsiquiatricos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

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

        pAntecedentesHeredofamiliares.setBackground(new java.awt.Color(97, 152, 220));

        lblAntecedentesHeredoFam.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblAntecedentesHeredoFam.setForeground(new java.awt.Color(255, 255, 255));
        lblAntecedentesHeredoFam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAntecedentesHeredoFam.setText("Antecedentes Heredofamiliares");

        javax.swing.GroupLayout pAntecedentesHeredofamiliaresLayout = new javax.swing.GroupLayout(pAntecedentesHeredofamiliares);
        pAntecedentesHeredofamiliares.setLayout(pAntecedentesHeredofamiliaresLayout);
        pAntecedentesHeredofamiliaresLayout.setHorizontalGroup(
            pAntecedentesHeredofamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pAntecedentesHeredofamiliaresLayout.setVerticalGroup(
            pAntecedentesHeredofamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAntecedentesHeredoFam, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        lblDoctor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));
        lblAviso.setText("**Marca el tipo de padecimiento para poder registrar cual es el que tiene**");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pAntecedentesHeredofamiliares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(lblAbuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(lblPadres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(lblHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(lblHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(txtAbuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(txtPadres, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(txtHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxDiabetes)
                                .addGap(204, 204, 204)
                                .addComponent(txtDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxHipertension)
                                .addGap(171, 171, 171)
                                .addComponent(txtHipertension, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxCardiopatias)
                                .addGap(171, 171, 171)
                                .addComponent(txtCardiopatias, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxNeuropatias)
                                .addGap(175, 175, 175)
                                .addComponent(txtNeuropatias, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxOncologicos)
                                .addGap(174, 174, 174)
                                .addComponent(txtOncologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxHematologicos)
                                .addGap(151, 151, 151)
                                .addComponent(txtHematologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxTranstornosPsiquiatricos)
                                .addGap(63, 63, 63)
                                .addComponent(txtTranstornosPsiquiatricos, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(chbxOtros)
                                .addGap(231, 231, 231)
                                .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblAviso)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblEdad)
                    .addComponent(lblEmpresa))
                .addGap(8, 8, 8)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTel)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(lblFechaHora))
                .addGap(8, 8, 8)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(pAntecedentesHeredofamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbuelos)
                    .addComponent(lblPadres)
                    .addComponent(lblHermanos)
                    .addComponent(lblHijos))
                .addGap(8, 8, 8)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAbuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPadres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lblAviso)
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxDiabetes))
                    .addComponent(txtDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(chbxNeuropatias))
                    .addComponent(txtNeuropatias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxOncologicos))
                    .addComponent(txtOncologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxHematologicos))
                    .addComponent(txtHematologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chbxTranstornosPsiquiatricos))
                    .addComponent(txtTranstornosPsiquiatricos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(sbAntHere)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (navigator != null) {
            // Validación: si una casilla está marcada, el campo asociado no debe quedar vacío
            if (chbxDiabetes.isSelected() && txtDiabetes.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Diabetes asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtDiabetes.requestFocus();
                return;
            }
            if (chbxHipertension.isSelected() && txtHipertension.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Hipertensión asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtHipertension.requestFocus();
                return;
            }
            if (chbxCardiopatias.isSelected() && txtCardiopatias.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Cardiopatías asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtCardiopatias.requestFocus();
                return;
            }
            if (chbxNeuropatias.isSelected() && txtNeuropatias.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Neuropatías asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtNeuropatias.requestFocus();
                return;
            }
            if (chbxOncologicos.isSelected() && txtOncologicos.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Oncológicos asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtOncologicos.requestFocus();
                return;
            }
            if (chbxHematologicos.isSelected() && txtHematologicos.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Hematológicos asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtHematologicos.requestFocus();
                return;
            }
            if (chbxTranstornosPsiquiatricos.isSelected() && txtTranstornosPsiquiatricos.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo de Trastornos Psiquiátricos asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtTranstornosPsiquiatricos.requestFocus();
                return;
            }
            if (chbxOtros.isSelected() && txtOtros.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Complete el campo 'Otros' asociado a la casilla marcada.", "Formulario incompleto", javax.swing.JOptionPane.WARNING_MESSAGE);
                txtOtros.requestFocus();
                return;
            }

            // Si pasa validación, guardar y avanzar
            guardar();
            Form_Formulario_HCPatologicos next = new Form_Formulario_HCPatologicos(pacienteId, empleadoId);
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

    private void chbxNeuropatiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxNeuropatiasMouseClicked
        if (chbxNeuropatias.isSelected() == false) {
            txtNeuropatias.disable();
        }
        if (chbxNeuropatias.isSelected() == true) {
            txtNeuropatias.enable();
        }
    }//GEN-LAST:event_chbxNeuropatiasMouseClicked

    private void chbxOncologicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxOncologicosMouseClicked
        if (chbxOncologicos.isSelected() == false) {
            txtOncologicos.disable();
        }
        if (chbxOncologicos.isSelected() == true) {
            txtOncologicos.enable();
        }
    }//GEN-LAST:event_chbxOncologicosMouseClicked

    private void chbxHematologicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxHematologicosMouseClicked
        if (chbxHematologicos.isSelected() == false) {
            txtHematologicos.disable();
        }
        if (chbxHematologicos.isSelected() == true) {
            txtHematologicos.enable();
        }
    }//GEN-LAST:event_chbxHematologicosMouseClicked

    private void chbxTranstornosPsiquiatricosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxTranstornosPsiquiatricosMouseClicked
        if (chbxTranstornosPsiquiatricos.isSelected() == false) {
            txtTranstornosPsiquiatricos.disable();
        }
        if (chbxTranstornosPsiquiatricos.isSelected() == true) {
            txtTranstornosPsiquiatricos.enable();
        }
    }//GEN-LAST:event_chbxTranstornosPsiquiatricosMouseClicked

    private void chbxOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxOtrosMouseClicked
        if (chbxOtros.isSelected() == false) {
            txtOtros.disable();
        }
        if (chbxOtros.isSelected() == true) {
            txtOtros.enable();
        }
    }//GEN-LAST:event_chbxOtrosMouseClicked
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
        // Estos campos pueden contener texto (p. ej. "NO", "diabetes tipo 2")
        // Guardarlos como cadena para evitar NumberFormatException.
        datos.put("Abuelos", txtAbuelos.getText().trim());
        datos.put("Padres", txtPadres.getText().trim());
        datos.put("Hermanos", txtHermanos.getText().trim());
        datos.put("Hijos", txtHijos.getText().trim());
        datos.put("Diabetes", txtDiabetes.getText());
        datos.put("Hipertension", txtHipertension.getText());
        datos.put("Cardiopatias", txtCardiopatias.getText());
        datos.put("Neuropatias", txtNeuropatias.getText());
        datos.put("Oncologicos", txtOncologicos.getText());
        datos.put("Hematologicos", txtHematologicos.getText());
        datos.put("Psiquiatricos", txtTranstornosPsiquiatricos.getText());
        datos.put("Otros", txtOtros.getText());
        Modelo.Model_Paciente.guardarPacienteAuto("AntecedentesHeredofamiliares", datos);
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    } catch (HeadlessException e) {
        System.err.println("Error: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar");
    }
}
    private void verificarCheckBox() {
        if (chbxDiabetes.isSelected() == false) {
            txtDiabetes.disable();
        }
        if (chbxHipertension.isSelected() == false) {
            txtHipertension.disable();
        }
        if (chbxCardiopatias.isSelected() == false) {
            txtCardiopatias.disable();
        }
        if (chbxNeuropatias.isSelected() == false) {
            txtNeuropatias.disable();
        }
        if (chbxOncologicos.isSelected() == false) {
            txtOncologicos.disable();
        }
        if (chbxHematologicos.isSelected() == false) {
            txtHematologicos.disable();
        }
        if (chbxTranstornosPsiquiatricos.isSelected() == false) {
            txtTranstornosPsiquiatricos.disable();
        }
        if (chbxOtros.isSelected() == false) {
            txtOtros.disable();
        }
    }

    private void cargarPacienteEnFormulario(String id) {
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    new javax.swing.SwingWorker<Map<String, Object>, Void>() {
        @Override
        protected Map<String, Object> doInBackground() throws Exception {
            return Modelo.Model_Paciente.obtenerPacientePorId(Integer.parseInt(id)); // Convertir a int
        }

        @Override
        protected void done() {
            try {
                Map<String, Object> d = get();
                if (d == null) {
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HistoriaClinica.this, "Paciente no encontrado.");
                    return;
                }
                // Usar las claves que devuelve Model_Paciente
                String nombreCompleto = (val(d, "nombres") + " " + val(d, "apellido_paterno") + " " + val(d, "apellido_materno")).trim();
                txtNombre.setText(nombreCompleto);

                // Fecha de nacimiento puede venir como java.sql.Date o como String
                Object fechaObj = d.get("fecha_nacimiento");
                String fechaNacimientoStr = "";
                if (fechaObj instanceof java.sql.Date) {
                    fechaNacimientoStr = ((java.sql.Date) fechaObj).toLocalDate().format(formatter);
                } else if (fechaObj != null) {
                    fechaNacimientoStr = fechaObj.toString().trim();
                }
                txtFechaNacimiento.setText(fechaNacimientoStr);
                if (!fechaNacimientoStr.isEmpty()) {
                    try {
                        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
                        Period periodo = Period.between(fechaNacimiento, fechaActual);
                        int edad = periodo.getYears();
                        txtEdad.setText(Integer.toString(edad));
                    } catch (DateTimeParseException dtpe) {
                        System.err.println("Fecha de nacimiento inválida para paciente id=" + id + ": '" + fechaNacimientoStr + "' - " + dtpe.getMessage());
                        txtEdad.setText("");
                    }
                } else {
                    txtEdad.setText("");
                }
                txtEmpresa.setText(val(d, "empresa_nombre"));
                txtFecha.setText(fechaActual.format(formatter));
                txtTel.setText(val(d, "telefono"));
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HistoriaClinica.this, "No se pudo cargar el paciente: " + ex.getMessage());
            }
        }
    }.execute();

    // CORREGIR: Usar el objeto Empleado directamente
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
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HistoriaClinica.this, "Empleado no encontrado.");
                    return;
                }
                lblDoctor.setText("Dr. " + empleado.getNombres() + " " + 
                    empleado.getApellidoPaterno() + " " + 
                    empleado.getApellidoMaterno());
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Form_Formulario_HistoriaClinica.this, "No se pudo cargar el empleado.");
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
    private javax.swing.JCheckBox chbxCardiopatias;
    private javax.swing.JCheckBox chbxDiabetes;
    private javax.swing.JCheckBox chbxHematologicos;
    private javax.swing.JCheckBox chbxHipertension;
    private javax.swing.JCheckBox chbxNeuropatias;
    private javax.swing.JCheckBox chbxOncologicos;
    private javax.swing.JCheckBox chbxOtros;
    private javax.swing.JCheckBox chbxTranstornosPsiquiatricos;
    private javax.swing.JLabel lblAbuelos;
    private javax.swing.JLabel lblAntecedentesHeredoFam;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblHermanos;
    private javax.swing.JLabel lblHijos;
    private javax.swing.JLabel lblHistoriaClinica;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPadres;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pAntecedentesHeredofamiliares;
    private javax.swing.JPanel pHistoriaClinica;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sbAntHere;
    private javax.swing.JTextField txtAbuelos;
    private javax.swing.JTextField txtCardiopatias;
    private javax.swing.JTextField txtDiabetes;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtHematologicos;
    private javax.swing.JTextField txtHermanos;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtHipertension;
    private javax.swing.JTextField txtNeuropatias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOncologicos;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtPadres;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTranstornosPsiquiatricos;
    // End of variables declaration//GEN-END:variables
}
