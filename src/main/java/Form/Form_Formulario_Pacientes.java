package Form;

import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

/**
 * Formulario para crear/editar pacientes.
 * Mantiene la interfaz original pero guarda la fecha de nacimiento como java.sql.Date
 * y maneja correctamente la selección / placeholder de empresa.
 */
public class Form_Formulario_Pacientes extends javax.swing.JPanel {

    private Integer pacienteId = null;   // null = nuevo, no-null = editar
    private final String empleadoId;

    public Form_Formulario_Pacientes(int empleadoId) {
        initComponents();
        this.empleadoId = String.valueOf(empleadoId);
        cargarEmpresas();
        configurarComponentes();
    }

    public Form_Formulario_Pacientes(int pacienteId, int empleadoId) {
        initComponents();
        this.pacienteId = pacienteId;
        this.empleadoId = String.valueOf(empleadoId);
        cargarEmpresas();
        configurarComponentes();

        jLabel1.setText("Editar Paciente");
        lblGuardar.setText("Guardar cambios");
        cargarPacienteEnFormulario(pacienteId);
    }

    private void configurarComponentes() {
        // Configurar combobox de sexo
        cbxSexo.removeAllItems();
        cbxSexo.addItem("M");
        cbxSexo.addItem("F");
        cbxSexo.addItem("Otro");

        // Configurar fecha por defecto
        dpFechaNacimiento.setDate(LocalDate.now().minusYears(30));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoPatTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoMatTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dpFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EMailTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        curpTxt = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Nuevo Paciente");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombres *");

        nombreTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Apellido Paterno");

        apellidoPatTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoPatTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Apellido Materno");

        apellidoMatTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoMatTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Sexo *");

        cbxSexo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "Otro" }));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha de Nacimiento");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Dirección");

        direccionTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        direccionTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Correo Electrónico");

        EMailTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EMailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Teléfono");

        telTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Empresa");

        cbxEmpresa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("CURP *");

        curpTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        curpTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));

        lblGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
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
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));

        lblCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(51, 51, 51));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("Cancelar");
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(apellidoPatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(apellidoMatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(curpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(EMailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)))
                        ));
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        if (navigator != null) {
            Form_Pacientes f = new Form_Pacientes(Integer.parseInt(empleadoId));
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        btnCancelar.setBackground(new Color(170, 170, 170));
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        btnCancelar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lblCancelarMouseExited

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardar() {
        // Validar campos obligatorios
        if (nombreTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            nombreTxt.requestFocus();
            return;
        }

        if (cbxSexo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "El sexo es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            cbxSexo.requestFocus();
            return;
        }

        if (curpTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El CURP es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            curpTxt.requestFocus();
            return;
        }

        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("nombres", nombreTxt.getText().trim());
            datos.put("apellido_paterno", apellidoPatTxt.getText().trim());
            datos.put("apellido_materno", apellidoMatTxt.getText().trim());
            datos.put("sexo", cbxSexo.getSelectedItem().toString());
            datos.put("curp", curpTxt.getText().trim().toUpperCase());

            // Fecha de nacimiento: guardamos como java.sql.Date (o no la incluimos si es null)
            if (dpFechaNacimiento.getDate() != null) {
                // java.sql.Date.valueOf(LocalDate)
                datos.put("fecha_nacimiento", java.sql.Date.valueOf(dpFechaNacimiento.getDate()));
            } else {
                datos.put("fecha_nacimiento", null);
            }

            datos.put("direccion", direccionTxt.getText().trim());
            datos.put("correo_electronico", EMailTxt.getText().trim());
            datos.put("telefono", telTxt.getText().trim());

            // Empresa
            Object empresaSeleccionada = cbxEmpresa.getSelectedItem();
            if (empresaSeleccionada instanceof Modelo.Model_Empresas.EmpresaItem) {
                Modelo.Model_Empresas.EmpresaItem empresa = (Modelo.Model_Empresas.EmpresaItem) empresaSeleccionada;
                if (empresa.getId() > 0) { // 0 es el placeholder
                    datos.put("id_empresa", empresa.getId());
                } else {
                    // Si es el placeholder, establecer como null
                    datos.put("id_empresa", null);
                }
            } else {
                // Si no es un EmpresaItem (defensivo), setear null
                datos.put("id_empresa", null);
            }

            boolean resultado;
            if (pacienteId == null) {
                // Nuevo paciente
                resultado = Modelo.Model_Paciente.guardarPaciente(datos);
            } else {
                // Editar paciente existente
                resultado = Modelo.Model_Paciente.actualizarPaciente(pacienteId, datos);
            }

            if (resultado) {
                JOptionPane.showMessageDialog(this,
                    pacienteId == null ? "Paciente guardado con éxito" : "Paciente actualizado con éxito");

                // Regresar al listado
                if (navigator != null) {
                    Form_Pacientes f = new Form_Pacientes(Integer.parseInt(empleadoId));
                    f.setNavigator(navigator);
                    navigator.accept(f);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el paciente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarEmpresas() {
        var empresas = Modelo.Model_Empresas.traerEmpresas();
        cbxEmpresa.removeAllItems();
        // Opción placeholder
        cbxEmpresa.addItem(new Modelo.Model_Empresas.EmpresaItem(0, "Selecciona una empresa"));
        for (var e : empresas) {
            cbxEmpresa.addItem(e);
        }
    }

    private void cargarPacienteEnFormulario(int id) {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                return Modelo.Model_Paciente.obtenerPacientePorId(id);
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> datos = get();
                    if (datos == null) {
                        JOptionPane.showMessageDialog(Form_Formulario_Pacientes.this, "Paciente no encontrado.");
                        return;
                    }

                    nombreTxt.setText(safe(datos.get("nombres")));
                    apellidoPatTxt.setText(safe(datos.get("apellido_paterno")));
                    apellidoMatTxt.setText(safe(datos.get("apellido_materno")));
                    curpTxt.setText(safe(datos.get("curp")));

                    // Sexo
                    String sexo = safe(datos.get("sexo"));
                    if (!sexo.isEmpty()) {
                        cbxSexo.setSelectedItem(sexo);
                    }

                    // Fecha de nacimiento: manejamos java.sql.Date, java.sql.Timestamp o String
                    Object fechaNac = datos.get("fecha_nacimiento");
                    if (fechaNac instanceof java.sql.Date) {
                        dpFechaNacimiento.setDate(((java.sql.Date) fechaNac).toLocalDate());
                    } else if (fechaNac instanceof java.sql.Timestamp) {
                        dpFechaNacimiento.setDate(((java.sql.Timestamp) fechaNac).toLocalDateTime().toLocalDate());
                    } else if (fechaNac instanceof String) {
                        try {
                            dpFechaNacimiento.setDate(LocalDate.parse((String) fechaNac));
                        } catch (Exception ex) {
                            // ignorar parse error y no setear fecha
                        }
                    }

                    direccionTxt.setText(safe(datos.get("direccion")));
                    EMailTxt.setText(safe(datos.get("correo_electronico")));
                    telTxt.setText(safe(datos.get("telefono")));

                    // Empresa: buscar por id si viene, si no buscar por nombre
                    Object idEmpresa = datos.get("id_empresa");
                    if (idEmpresa != null) {
                        try {
                            int idEmp = Integer.parseInt(idEmpresa.toString());
                            for (int i = 0; i < cbxEmpresa.getItemCount(); i++) {
                                Modelo.Model_Empresas.EmpresaItem item = (Modelo.Model_Empresas.EmpresaItem) cbxEmpresa.getItemAt(i);
                                if (item.getId() == idEmp) {
                                    cbxEmpresa.setSelectedIndex(i);
                                    break;
                                }
                            }
                        } catch (NumberFormatException e) {
                            // Si no es un número válido, buscar por nombre
                            String nombreEmpresa = safe(datos.get("empresa_nombre"));
                            if (!nombreEmpresa.isEmpty()) {
                                for (int i = 0; i < cbxEmpresa.getItemCount(); i++) {
                                    Modelo.Model_Empresas.EmpresaItem item = (Modelo.Model_Empresas.EmpresaItem) cbxEmpresa.getItemAt(i);
                                    if (item.getNombre().equalsIgnoreCase(nombreEmpresa)) {
                                        cbxEmpresa.setSelectedIndex(i);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        // Si no hay empresa, seleccionar placeholder (índice 0)
                        if (cbxEmpresa.getItemCount() > 0) cbxEmpresa.setSelectedIndex(0);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_Pacientes.this, "No se pudo cargar el paciente.");
                }
            }
        }.execute();
    }

    private static String safe(Object obj) {
        return obj == null ? "" : obj.toString().trim();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMailTxt;
    private javax.swing.JTextField apellidoMatTxt;
    private javax.swing.JTextField apellidoPatTxt;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JComboBox<Modelo.Model_Empresas.EmpresaItem> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JTextField curpTxt;
    private javax.swing.JTextField direccionTxt;
    private com.github.lgooddatepicker.components.DatePicker dpFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JTextField nombreTxt;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JTextField telTxt;
    // End of variables declaration//GEN-END:variables
}
