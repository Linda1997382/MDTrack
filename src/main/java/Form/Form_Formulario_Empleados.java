package Form;

import java.awt.Color;
import java.security.SecureRandom;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import com.github.lgooddatepicker.components.DatePicker;

import Modelo.Model_Empleado;

public class Form_Formulario_Empleados extends javax.swing.JPanel {

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public Form_Formulario_Empleados() {
        try {
            initComponents();
            // Forzar la visualización de componentes
            setVisible(true);
            revalidate();
            repaint();
            
            System.out.println("DEBUG: Formulario agregar empleados inicializado");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inicializando formulario: " + e.getMessage());
        }
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardar() {
        // Validación de campos obligatorios
        if (txtNombre.getText().trim().isEmpty() ||
            txtApellidoPaterno.getText().trim().isEmpty() ||
            txtApellidoMaterno.getText().trim().isEmpty() ||
            txtEmail.getText().trim().isEmpty() ||
            txtCURP.getText().trim().isEmpty() ||
            txtRFC.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Por favor llena todos los campos obligatorios.");
            return;
        }

        // Validación de teléfono
        String telefono = txtTel.getText().trim();
        if (!telefono.isEmpty() && telefono.length() != 10) {
            JOptionPane.showMessageDialog(this, "El teléfono debe tener 10 dígitos.");
            return;
        }

        // Validación de email
        String email = txtEmail.getText().trim();
        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Correo electrónico no válido.");
            return;
        }

        // Generar contraseña
        String password = generarContrasena(8);

        try {
            // Enviar correo con contraseña
            Modelo.Model_Mail.transfer_to_email(email, password);

            // Preparar datos para guardar
            Map<String, Object> datos = new HashMap<>();
            datos.put("nombres", txtNombre.getText().trim());
            datos.put("apellido_paterno", txtApellidoPaterno.getText().trim());
            datos.put("apellido_materno", txtApellidoMaterno.getText().trim());

            // Fecha de nacimiento (opcional)
            if (dpFechaNacimiento.getDate() != null) {
                datos.put("fecha_nacimiento", dpFechaNacimiento.getDate()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }

            // Sexo - CORREGIDO (switch tradicional)
            String sexoSeleccionado = cbxSexo.getSelectedItem().toString();
            String sexo;
            switch (sexoSeleccionado) {
                case "Masculino":
                    sexo = "M";
                    break;
                case "Femenino":
                    sexo = "F";
                    break;
                default:
                    sexo = "Otro";
                    break;
            }
            datos.put("sexo", sexo);

            datos.put("telefono", telefono);
            datos.put("correo_electronico", email);
            datos.put("password_hash", password);
            datos.put("curp", txtCURP.getText().trim());
            datos.put("rfc", txtRFC.getText().trim());
            datos.put("puesto", cbxPuesto.getSelectedItem().toString());
            datos.put("horario", cbxHorario.getSelectedItem().toString());

            // ID empresa por defecto
            datos.put("id_empresa", 1);

            System.out.println("DEBUG: Guardando empleado con datos: " + datos);

            // Guardar en la base de datos
            boolean exito = Model_Empleado.guardarEmpleado(datos);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Empleado guardado con éxito.");
                if (navigator != null) {
                    Form_Empleados back = new Form_Empleados();
                    back.setNavigator(navigator);
                    navigator.accept(back);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar el empleado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar empleado: " + e.getMessage());
        }
    }

    public static String generarContrasena(int longitud) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String todos = mayusculas + minusculas + numeros + especiales;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        password.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        password.append(minusculas.charAt(random.nextInt(minusculas.length())));
        password.append(numeros.charAt(random.nextInt(numeros.length())));
        password.append(especiales.charAt(random.nextInt(especiales.length())));

        for (int i = 4; i < longitud; i++) {
            password.append(todos.charAt(random.nextInt(todos.length())));
        }

        return mezclar(password.toString(), random);
    }

    private static String mezclar(String input, SecureRandom random) {
        char[] caracteres = input.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int j = random.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        return new String(caracteres);
    }

    // ================== Eventos ==================
    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        guardar();
    }                                      

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {                                       
        btnGuardar.setBackground(new Color(80, 158, 255));
    }                                      

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {                                      
        btnGuardar.setBackground(new Color(30, 103, 201));
    }                                     

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        if (navigator != null) {
            Form_Empleados back = new Form_Empleados();
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }                                        

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {                                         
        btnCancelar.setBackground(new Color(80, 158, 255));
    }                                        

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {                                        
        btnCancelar.setBackground(new Color(30, 103, 201));
    }                                       

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {                               
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtTel.getText().length() >= 10) {
            evt.consume();
        }
    }                              

    // ================== NetBeans initComponents ==================
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblCURP = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCURP = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        cbxPuesto = new javax.swing.JComboBox<>();
        cbxHorario = new javax.swing.JComboBox<>();
        dpFechaNacimiento = new DatePicker();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Formulario de Empleados");

        lblNombre.setText("Nombre:");
        lblApellidoPaterno.setText("Apellido Paterno:");
        lblApellidoMaterno.setText("Apellido Materno:");
        lblEmail.setText("Correo Electrónico:");
        lblTel.setText("Teléfono:");
        lblCURP.setText("CURP:");
        lblRFC.setText("RFC:");
        lblSex.setText("Sexo:");
        lblPuesto.setText("Puesto:");
        lblHorario.setText("Horario:");
        lblFechaNacimiento.setText("Fecha de Nacimiento:");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Administrativo", "Operativo" }));
        cbxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Nocturno" }));

        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setText("Guardar");
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setText("Cancelar");
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        // LAYOUT CORREGIDO
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                            .addComponent(lblHorario))
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
                            .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jLabel1)
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

    // ================== Variables ==================
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JComboBox<String> cbxHorario;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JComboBox<String> cbxSexo;
    private DatePicker dpFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCURP;
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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
}