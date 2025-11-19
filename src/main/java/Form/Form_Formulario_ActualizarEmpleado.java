package Form;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import Modelo.Model_Empleado;

public class Form_Formulario_ActualizarEmpleado extends javax.swing.JPanel {

    private final int empleadoId;
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public Form_Formulario_ActualizarEmpleado(int empleadoId) {
        initComponents();
        this.empleadoId = empleadoId;
        cargarEmpleadoEnFormulario(empleadoId);
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCURP = new javax.swing.JTextField();
        lblCURP = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        cbxPuesto = new javax.swing.JComboBox<>();
        lblPuesto = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        cbxHorario = new javax.swing.JComboBox<>();
        lblCedulaProfesional = new javax.swing.JLabel();
        txtCedulaProfesional = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dpFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();

        setBackground(new java.awt.Color(255, 255, 255));

        lblApellidoPaterno.setText("Apellido Paterno:");
        lblApellidoPaterno.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtApellidoPaterno.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblApellidoMaterno.setText("Apellido Materno:");
        lblApellidoMaterno.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtApellidoMaterno.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblNombre.setText("Nombre(s):");
        lblNombre.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblSex.setText("Sexo:");
        lblSex.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Masculino", "Femenino"}));
        cbxSexo.setFont(new java.awt.Font("Roboto Medium", 0, 16));

        lblFechaNacimiento.setText("Fecha de nacimiento:");
        lblFechaNacimiento.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        lblTel.setText("Teléfono:");
        lblTel.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtTel.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char key = evt.getKeyChar();
                if (!Character.isDigit(key) || txtTel.getText().length() >= 10) {
                    evt.consume();
                }
            }
        });

        lblEmail.setText("Correo electrónico:");
        lblEmail.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtEmail.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblCURP.setText("CURP:");
        lblCURP.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtCURP.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtCURP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblRFC.setText("RFC:");
        lblRFC.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtRFC.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtRFC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        lblPuesto.setText("Puesto:");
        lblPuesto.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Medico", "Paramedico", "Enfermer@", "Secretari@", "Administracion"}
        ));
        cbxPuesto.setFont(new java.awt.Font("Roboto Medium", 0, 16));

        lblHorario.setText("Horario:");
        lblHorario.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        cbxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Matutino", "Vespertino", "Nocturno"}));
        cbxHorario.setFont(new java.awt.Font("Roboto Medium", 0, 16));

        lblCedulaProfesional.setText("Cédula profesional:");
        lblCedulaProfesional.setFont(new java.awt.Font("Roboto Medium", 0, 18));

        txtCedulaProfesional.setFont(new java.awt.Font("Roboto Medium", 0, 16));
        txtCedulaProfesional.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));

        // BOTÓN GUARDAR
        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));
        lblGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18));
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardar.setBackground(new Color(80, 158, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardar.setBackground(new Color(30, 103, 201));
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
                btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
                btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        // BOTÓN CANCELAR
        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));
        lblCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 18));
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("Cancelar");
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (navigator != null) {
                    Form_Empleados back = new Form_Empleados();
                    back.setNavigator(navigator);
                    navigator.accept(back);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar.setBackground(new Color(80, 158, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar.setBackground(new Color(30, 103, 201));
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
                btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
                btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jLabel2.setText("Actualizar Empleado");
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 36));
        jLabel2.setForeground(new java.awt.Color(22, 94, 183));

        // LAYOUT
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellidoPaterno)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblSex)
                            .addComponent(lblTel)
                            .addComponent(lblEmail)
                            .addComponent(lblCURP)
                            .addComponent(lblRFC)
                            .addComponent(lblPuesto)
                            .addComponent(lblHorario)
                            .addComponent(lblCedulaProfesional))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCURP)
                    .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaProfesional)
                    .addComponent(txtCedulaProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto)
                    .addComponent(cbxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }

    private void guardar() {
        try {
            // Validación básica
            if (txtNombre.getText().trim().isEmpty() || 
                txtApellidoPaterno.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nombre y Apellido Paterno son obligatorios.");
                return;
            }

            Map<String, Object> datos = new HashMap<>();
            datos.put("nombres", txtNombre.getText().trim());
            datos.put("apellido_paterno", txtApellidoPaterno.getText().trim());
            datos.put("apellido_materno", txtApellidoMaterno.getText().trim());

            // Fecha de nacimiento - CORREGIDO
            if (dpFechaNacimiento.getDate() != null) {
                datos.put("fecha_nacimiento", dpFechaNacimiento.getDate().toString());
            } else {
                datos.put("fecha_nacimiento", "");
            }

            // Sexo - CORREGIDO
            String sexo = cbxSexo.getSelectedItem().toString();
            datos.put("sexo", "Masculino".equals(sexo) ? "M" : 
                              "Femenino".equals(sexo) ? "F" : "Otro");

            datos.put("telefono", txtTel.getText().trim());
            datos.put("correo_electronico", txtEmail.getText().trim());
            datos.put("curp", txtCURP.getText().trim());
            datos.put("rfc", txtRFC.getText().trim());
            datos.put("cedula_profesional", txtCedulaProfesional.getText().trim());
            datos.put("puesto", cbxPuesto.getSelectedItem().toString());
            datos.put("horario", cbxHorario.getSelectedItem().toString());
            
            // ID empresa por defecto (1 = Clinica MedTrack)
            datos.put("id_empresa", 1);

            System.out.println("DEBUG: Actualizando empleado ID: " + empleadoId);
            System.out.println("DEBUG: Datos: " + datos);

            boolean exito = Model_Empleado.actualizarEmpleado(empleadoId, datos);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Empleado actualizado con éxito");
                if (navigator != null) {
                    Form_Empleados back = new Form_Empleados();
                    back.setNavigator(navigator);
                    navigator.accept(back);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el empleado");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }

    private void cargarEmpleadoEnFormulario(int id) {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                System.out.println("DEBUG: Cargando empleado ID: " + id);
                Map<String, Object> empleado = Model_Empleado.obtenerDetallesEmpleadoPorId(id);
                System.out.println("DEBUG: Empleado obtenido: " + (empleado != null ? "SI" : "NO"));
                if (empleado != null) {
                    System.out.println("DEBUG: Datos: " + empleado.keySet());
                }
                return empleado;
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> empleado = get();

                    if (empleado == null || empleado.isEmpty()) {
                        JOptionPane.showMessageDialog(Form_Formulario_ActualizarEmpleado.this, 
                            "Empleado no encontrado con ID: " + id);
                        return;
                    }

                    // Cargar datos básicos (manejar nulos)
                    txtNombre.setText(safeString(empleado.get("nombres")));
                    txtApellidoPaterno.setText(safeString(empleado.get("apellido_paterno")));
                    txtApellidoMaterno.setText(safeString(empleado.get("apellido_materno")));

                    // Fecha de nacimiento - CORREGIDO
                    java.sql.Date fechaNac = (java.sql.Date) empleado.get("fecha_nacimiento");
                    if (fechaNac != null) {
                        try {
                            dpFechaNacimiento.setDate(fechaNac.toLocalDate());
                        } catch (Exception e) {
                            System.out.println("DEBUG: Error cargando fecha: " + e.getMessage());
                        }
                    }

                    // Contacto
                    txtTel.setText(safeString(empleado.get("telefono")));
                    txtEmail.setText(safeString(empleado.get("correo_electronico")));
                    txtCURP.setText(safeString(empleado.get("curp")));
                    txtRFC.setText(safeString(empleado.get("rfc")));
                    txtCedulaProfesional.setText(safeString(empleado.get("cedula_profesional")));

                    // Combos - CORREGIDO (manejar valores nulos)
                    String sexo = safeString(empleado.get("sexo"));
                    if ("M".equals(sexo)) {
                        cbxSexo.setSelectedItem("Masculino");
                    } else if ("F".equals(sexo)) {
                        cbxSexo.setSelectedItem("Femenino");
                    } else {
                        cbxSexo.setSelectedIndex(0); // Valor por defecto
                    }
                    
                    // Puesto y horario
                    String puesto = safeString(empleado.get("puesto"));
                    if (!puesto.isEmpty()) {
                        cbxPuesto.setSelectedItem(puesto);
                    } else {
                        cbxPuesto.setSelectedIndex(0);
                    }
                    
                    String horario = safeString(empleado.get("horario"));
                    if (!horario.isEmpty()) {
                        cbxHorario.setSelectedItem(horario);
                    } else {
                        cbxHorario.setSelectedIndex(0);
                    }

                    System.out.println("DEBUG: Formulario cargado exitosamente");

                } catch (java.util.concurrent.ExecutionException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_ActualizarEmpleado.this, 
                        "Error al cargar empleado: " + e.getCause().getMessage());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_ActualizarEmpleado.this, 
                        "No se pudo cargar el empleado: " + ex.getMessage());
                }
            }
        }.execute();
    }

    // ================== MÉTODO AUXILIAR ==================
    // Método auxiliar para manejar valores nulos
    private String safeString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    // ================== VARIABLES ==================
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JComboBox<String> cbxHorario;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JComboBox<String> cbxSexo;
    private com.github.lgooddatepicker.components.DatePicker dpFechaNacimiento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblCedulaProfesional;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCURP;
    private javax.swing.JTextField txtCedulaProfesional;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
}