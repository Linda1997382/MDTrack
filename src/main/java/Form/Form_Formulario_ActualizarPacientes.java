package Form;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import Modelo.Model_Empresas;
import Modelo.Model_Paciente;

public class Form_Formulario_ActualizarPacientes extends javax.swing.JPanel {

    private int empleadoId;
    private int pacienteId;
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public Form_Formulario_ActualizarPacientes(int empleadoId, int pacienteId) {
        this.empleadoId = empleadoId;
        this.pacienteId = pacienteId;

        initComponents();
        cargarEmpresas();
        cargarPacienteEnFormulario(pacienteId);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        lblApellidoPat = new javax.swing.JLabel();
        apellidoPatTxt = new javax.swing.JTextField();
        lblApellidoMat = new javax.swing.JLabel();
        apellidoMatTxt = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        dpFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        lblDireccion = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        lblEMail = new javax.swing.JLabel();
        EMailTxt = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        telTxt = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblcancelar = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Paciente");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 40));

        lblNombre.setText("Nombre(s)");
        panelBorder1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        panelBorder1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, 30));

        lblApellidoPat.setText("Apellido Paterno");
        panelBorder1.add(lblApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        panelBorder1.add(apellidoPatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 30));

        lblApellidoMat.setText("Apellido Materno");
        panelBorder1.add(lblApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        panelBorder1.add(apellidoMatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 30));

        lblSexo.setText("Sexo");
        panelBorder1.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        panelBorder1.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 30));

        lblFechaNacimiento.setText("Fecha de nacimiento");
        panelBorder1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        panelBorder1.add(dpFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 280, 30));

        lblDireccion.setText("Dirección");
        panelBorder1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
        panelBorder1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 280, 30));

        lblEMail.setText("Correo Electrónico");
        panelBorder1.add(lblEMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));
        panelBorder1.add(EMailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 280, 30));

        lblTel.setText("Teléfono");
        panelBorder1.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        telTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telTxtKeyTyped(evt);
            }
        });
        panelBorder1.add(telTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 280, 30));

        lblEmpresa.setText("Empresa");
        panelBorder1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));
        panelBorder1.add(cbxEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 280, 30));

        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setLayout(new java.awt.BorderLayout());

        lblGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
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
        btnGuardar.add(lblGuardar, java.awt.BorderLayout.CENTER);
        panelBorder1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setLayout(new java.awt.BorderLayout());

        lblcancelar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblcancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcancelar.setText("Cancelar");
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
        btnCancelar.add(lblcancelar, java.awt.BorderLayout.CENTER);
        panelBorder1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 720, 120, 40));

        add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));
    }

    private void lblcancelarMouseClicked(java.awt.event.MouseEvent evt) {
        if (navigator != null) {
            Form_Pacientes back = new Form_Pacientes(empleadoId);
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }

    private void lblcancelarMouseEntered(java.awt.event.MouseEvent evt) {
        btnCancelar.setBackground(new Color(80, 158, 255));
    }

    private void lblcancelarMouseExited(java.awt.event.MouseEvent evt) {
        btnCancelar.setBackground(new Color(30, 103, 201));
    }

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {
        guardar();
    }

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {
        btnGuardar.setBackground(new Color(80, 158, 255));
    }

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {
        btnGuardar.setBackground(new Color(30, 103, 201));
    }

    private void telTxtKeyTyped(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if (telTxt.getText().length() >= 10) {
            evt.consume();
        }
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardar() {

        if (nombreTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            nombreTxt.requestFocus();
            return;
        }

        try {
            Map<String, Object> datos = new HashMap<>();

            datos.put("nombres", nombreTxt.getText().trim());
            datos.put("apellido_paterno", apellidoPatTxt.getText().trim());
            datos.put("apellido_materno", apellidoMatTxt.getText().trim());
            datos.put("sexo", cbxSexo.getSelectedItem().toString());

            if (dpFechaNacimiento.getDate() != null) {
                datos.put("fecha_nacimiento", java.sql.Date.valueOf(dpFechaNacimiento.getDate()));
            } else {
                datos.put("fecha_nacimiento", null);
            }

            datos.put("direccion", direccionTxt.getText().trim());
            datos.put("correo_electronico", EMailTxt.getText().trim());
            datos.put("telefono", telTxt.getText().trim());

            Object empresaSeleccionada = cbxEmpresa.getSelectedItem();
            if (empresaSeleccionada instanceof Model_Empresas.EmpresaItem empresa) {
                if (empresa.getId() > 0) {
                    datos.put("id_empresa", empresa.getId());
                } else {
                    datos.put("id_empresa", null);
                }
            }

            boolean resultado = Model_Paciente.actualizarPaciente(pacienteId, datos);

            if (resultado) {
                JOptionPane.showMessageDialog(this, "Paciente actualizado con éxito");

                if (navigator != null) {
                    Form_Pacientes back = new Form_Pacientes(empleadoId);
                    back.setNavigator(navigator);
                    navigator.accept(back);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el paciente", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarEmpresas() {
        var empresas = Model_Empresas.traerEmpresas();

        cbxEmpresa.removeAllItems();
        cbxEmpresa.addItem(new Model_Empresas.EmpresaItem(0, "Selecciona una empresa"));

        for (var e : empresas) {
            cbxEmpresa.addItem(e);
        }
    }

    private void cargarPacienteEnFormulario(int id) {

        new javax.swing.SwingWorker<Map<String, Object>, Void>() {

            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                return Model_Paciente.obtenerPacientePorId(id);
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> datos = get();

                    if (datos == null) {
                        JOptionPane.showMessageDialog(Form_Formulario_ActualizarPacientes.this, "Paciente no encontrado.");
                        return;
                    }

                    nombreTxt.setText(safe(datos.get("nombres")));
                    apellidoPatTxt.setText(safe(datos.get("apellido_paterno")));
                    apellidoMatTxt.setText(safe(datos.get("apellido_materno")));

                    String sexo = safe(datos.get("sexo"));
                    if (!sexo.isEmpty()) {
                        cbxSexo.setSelectedItem(sexo);
                    }

                    Object fechaNac = datos.get("fecha_nacimiento");
                    if (fechaNac instanceof java.sql.Date) {
                        dpFechaNacimiento.setDate(((java.sql.Date) fechaNac).toLocalDate());
                    }

                    direccionTxt.setText(safe(datos.get("direccion")));
                    EMailTxt.setText(safe(datos.get("correo_electronico")));
                    telTxt.setText(safe(datos.get("telefono")));

                    Object idEmpresa = datos.get("id_empresa");

                    if (idEmpresa != null) {
                        try {
                            int idEmp = Integer.parseInt(idEmpresa.toString());

                            for (int i = 0; i < cbxEmpresa.getItemCount(); i++) {
                                Model_Empresas.EmpresaItem item = (Model_Empresas.EmpresaItem) cbxEmpresa.getItemAt(i);
                                if (item.getId() == idEmp) {
                                    cbxEmpresa.setSelectedIndex(i);
                                    break;
                                }
                            }
                        } catch (NumberFormatException e) {
                            String nombreEmpresa = safe(datos.get("empresa_nombre"));
                            if (!nombreEmpresa.isEmpty()) {
                                for (int i = 0; i < cbxEmpresa.getItemCount(); i++) {
                                    Model_Empresas.EmpresaItem item = (Model_Empresas.EmpresaItem) cbxEmpresa.getItemAt(i);
                                    if (item.getNombre().equalsIgnoreCase(nombreEmpresa)) {
                                        cbxEmpresa.setSelectedIndex(i);
                                        break;
                                    }
                                }
                            }
                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_ActualizarPacientes.this, "No se pudo cargar el paciente.");
                }
            }
        }.execute();
    }

    private static String safe(Object obj) {
        return obj == null ? "" : obj.toString().trim();
    }

    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JComboBox<Model_Empresas.EmpresaItem> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JTextField EMailTxt;
    private javax.swing.JTextField apellidoMatTxt;
    private javax.swing.JTextField apellidoPatTxt;
    private com.github.lgooddatepicker.components.DatePicker dpFechaNacimiento;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoMat;
    private javax.swing.JLabel lblApellidoPat;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblcancelar;
    private javax.swing.JTextField nombreTxt;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JTextField telTxt;
}
