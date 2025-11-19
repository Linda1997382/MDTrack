package Form;

import Swing.ScrollBar;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.optionalusertools.DateVetoPolicy;
import com.github.lgooddatepicker.optionalusertools.TimeVetoPolicy;
import java.awt.Color;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Modelo.Model_Paciente;
import Modelo.Model_Citas;

public class Form_Formulario_Citas extends javax.swing.JPanel {

    private final int empleadoId;  // Cambiado a int

    // Constructor corregido para aceptar int
    public Form_Formulario_Citas(int empleadoId) {
        initComponents();
        this.empleadoId = empleadoId;
        
        // Configuración inicial
        configurarComponentes();
        cargarDatosIniciales();
    }

    private void configurarComponentes() {
        // Configurar scrollbars
        spCitasPaciente.setVerticalScrollBar(new ScrollBar());
        spTbPacientes.setVerticalScrollBar(new ScrollBar());
        
        JPanel b = new JPanel();
        spCitasPaciente.setCorner(JScrollPane.UPPER_RIGHT_CORNER, b);
        
        JPanel p = new JPanel();
        spTbPacientes.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        // Configurar datepicker y timepicker
        configurarSelectoresFechaHora();
    }

    private void cargarDatosIniciales() {
        // Cargar pacientes en la tabla
        cargarPacientes();
        
        // Configurar fecha actual y horas disponibles
        dpFechaCita.setDate(LocalDate.now());
        cargarHorasDisponiblesParaDia(LocalDate.now());
    }

    private void configurarSelectoresFechaHora() {
        // Configurar DatePicker
        var dateSettings = dpFechaCita.getSettings();
        dateSettings.setAllowKeyboardEditing(false);
        dateSettings.setVetoPolicy(new DateVetoPolicy() {
            @Override
            public boolean isDateAllowed(LocalDate date) {
                return date != null && !date.isBefore(LocalDate.now());
            }
        });

        // Configurar TimePicker
        var timeSettings = tpHora.getSettings();
        timeSettings.setAllowKeyboardEditing(false);
        timeSettings.setVetoPolicy(new TimeVetoPolicy() {
            @Override
            public boolean isTimeAllowed(LocalTime time) {
                if (time == null) {
                    return false;
                }
                var inicio = LocalTime.of(10, 0);
                var fin = LocalTime.of(20, 0);
                return !time.isBefore(inicio) && !time.isAfter(fin);
            }
        });

        // Listener para cuando cambia la fecha
        dpFechaCita.addDateChangeListener(e -> {
            LocalDate nuevaFecha = e.getNewDate();
            if (nuevaFecha != null) {
                cargarHorasDisponiblesParaDia(nuevaFecha);
            } else {
                tpHora.clear();
            }
        });
    }

    private void cargarPacientes() {
        // Cargar pacientes en la tabla
        Modelo.Model_Paciente.cargarTablaPacientes(tbPacientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spCitasPaciente = new javax.swing.JScrollPane();
        panelBorder1 = new Swing.PanelBorder();
        spTbPacientes = new javax.swing.JScrollPane();
        tbPacientes = new Swing.Tabla();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        dpFechaCita = new com.github.lgooddatepicker.components.DatePicker();
        txtNombre = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblFechaCita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        tpHora = new com.github.lgooddatepicker.components.TimePicker();
        lblFechaCita1 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        lblMotivo = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setOpaque(true);

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Empresa", "E-mail", "Fecha de nacimiento", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacientesMouseClicked(evt);
            }
        });
        spTbPacientes.setViewportView(tbPacientes);

        btnRegresar.setBackground(new java.awt.Color(30, 103, 201));

        lblRegresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtNombre.setEnabled(false);

        lblPaciente.setText("Paciente:");
        lblPaciente.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        lblEmpresa.setText("Empresa:");
        lblEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        lblEmail.setText("E-mail:");
        lblEmail.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        lblFechaNacimiento.setText("Fecha de nacimiento:");
        lblFechaNacimiento.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        txtNombreEmpresa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtNombreEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtNombreEmpresa.setEnabled(false);

        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEmail.setEnabled(false);

        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFechaNacimiento.setEnabled(false);

        lblFechaCita.setText("Fecha de la cita:");
        lblFechaCita.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jLabel1.setText("Formulario de cita");
        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));

        lblAviso.setText("**Selecciona un paciente para cargar los datos**");
        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));

        lblFechaCita1.setText("Hora de la cita:");
        lblFechaCita1.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        txtMotivo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtMotivo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        lblMotivo.setText("Motivo de la cita:");
        lblMotivo.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(352, 352, 352))))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lblAviso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCita1)
                    .addComponent(lblFechaCita)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(lblEmail)
                    .addComponent(lblEmpresa)
                    .addComponent(lblPaciente)
                    .addComponent(lblMotivo))
                .addGap(8, 8, 8)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addComponent(txtNombreEmpresa)
                        .addComponent(txtEmail)
                        .addComponent(txtFechaNacimiento)
                        .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(257, 257, 257))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(lblAviso)
                .addGap(8, 8, 8)
                .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPaciente)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEmpresa)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMotivo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFechaCita)
                    .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCita1))
                .addGap(48, 48, 48)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        spCitasPaciente.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spCitasPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spCitasPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        guardarCita();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        if (navigator != null) {
            Form_Citas f = new Form_Citas(empleadoId); // Ya es int
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        btnRegresar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        btnRegresar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblRegresarMouseExited

    private void tbPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMouseClicked
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
        try {
            String idStr = String.valueOf(tbPacientes.getModel().getValueAt(modelRow, 0));
            cargarPacienteEnFormulario(idStr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al seleccionar paciente");
        }
    }//GEN-LAST:event_tbPacientesMouseClicked

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardarCita() {
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
        try {
            String pacienteIdStr = String.valueOf(tbPacientes.getModel().getValueAt(modelRow, 0));
            int pacienteId = Integer.parseInt(pacienteIdStr);

            LocalDate fecha = dpFechaCita.getDate();
            LocalTime hora = tpHora.getTime();
            String motivo = txtMotivo.getText().trim();

            // Validaciones
            if (fecha == null) {
                JOptionPane.showMessageDialog(this, "Selecciona la fecha de la cita.");
                return;
            }
            if (hora == null) {
                JOptionPane.showMessageDialog(this, "Selecciona la hora de la cita.");
                return;
            }
            if (motivo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa el motivo de la cita.");
                return;
            }

            // Crear LocalDateTime combinando fecha y hora
            LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

            // Preparar datos para guardar
            Map<String, Object> datos = new HashMap<>();
            datos.put("id_paciente", pacienteId);
            datos.put("id_empleado", empleadoId); // Ya es int, no necesita parseo
            datos.put("fecha_hora", fechaHora);
            datos.put("estado", "Programada");
            datos.put("motivo", motivo);

            // Guardar cita usando el modelo
            boolean exito = Model_Citas.guardarCita(datos);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Cita guardada con éxito");
                limpiarFormulario();
                cargarHorasDisponiblesParaDia(fecha);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar la cita");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el formato del ID del paciente");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar la cita");
        }
    }

    private void cargarPacienteEnFormulario(String id) {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                try {
                    int pacienteId = Integer.parseInt(id);
                    return Model_Paciente.obtenerPacientePorId(pacienteId);
                } catch (NumberFormatException e) {
                    System.err.println("Error: ID de paciente no válido: " + id);
                    return null;
                }
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> datos = get();
                    if (datos == null) {
                        JOptionPane.showMessageDialog(Form_Formulario_Citas.this, "Paciente no encontrado.");
                        return;
                    }
                    
                    // Cargar datos en los campos del formulario
                    txtNombre.setText(val(datos, "nombres") + " " + 
                                     val(datos, "apellido_paterno") + " " + 
                                     val(datos, "apellido_materno"));
                    txtNombreEmpresa.setText(val(datos, "empresa_nombre"));
                    txtEmail.setText(val(datos, "correo_electronico"));
                    
                    // Formatear fecha de nacimiento
                    java.sql.Date fechaNac = (java.sql.Date) datos.get("fecha_nacimiento");
                    if (fechaNac != null) {
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                        txtFechaNacimiento.setText(sdf.format(fechaNac));
                    } else {
                        txtFechaNacimiento.setText("");
                    }
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_Citas.this, "No se pudo cargar el paciente.");
                }
            }
        }.execute();
    }

    private void cargarHorasDisponiblesParaDia(LocalDate fecha) {
        tpHora.clear();

        new javax.swing.SwingWorker<List<java.sql.Time>, Void>() {
            @Override
            protected List<java.sql.Time> doInBackground() throws Exception {
                return Model_Citas.obtenerHorasOcupadas(fecha, empleadoId); // Ya es int, no necesita parseo
            }

            @Override
            protected void done() {
                try {
                    List<java.sql.Time> horasOcupadas = get();
                    if (horasOcupadas == null) {
                        horasOcupadas = java.util.Collections.emptyList();
                    }

                    final java.util.Set<LocalTime> ocupadas = new java.util.HashSet<>();
                    for (java.sql.Time time : horasOcupadas) {
                        ocupadas.add(time.toLocalTime());
                    }

                    final LocalDate fechaSeleccionada = fecha;

                    TimePickerSettings settings = tpHora.getSettings();
                    settings.generatePotentialMenuTimes(
                            TimePickerSettings.TimeIncrement.ThirtyMinutes,
                            LocalTime.of(10, 0),
                            LocalTime.of(20, 0)
                    );

                    settings.setVetoPolicy(time -> {
                        if (time == null) {
                            return false;
                        }

                        // Validar horario laboral
                        if (time.isBefore(LocalTime.of(10, 0)) || time.isAfter(LocalTime.of(20, 0))) {
                            return false;
                        }

                        // No permitir horas pasadas para el día actual
                        if (LocalDate.now().equals(fechaSeleccionada)) {
                            LocalTime ahora = LocalTime.now().withSecond(0).withNano(0);
                            if (time.isBefore(ahora)) {
                                return false;
                            }
                        }

                        // Excluir horas ocupadas
                        return !ocupadas.contains(time);
                    });

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_Citas.this,
                            "No se pudieron cargar las horas disponibles.");
                }
            }
        }.execute();
    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtNombreEmpresa.setText("");
        txtEmail.setText("");
        txtFechaNacimiento.setText("");
        txtMotivo.setText("");
        dpFechaCita.setDate(LocalDate.now());
        tpHora.clear();
        tbPacientes.clearSelection();
    }

    private static String val(Map<String, Object> map, String key) {
        Object value = map.get(key);
        if (value == null) return "";
        
        // Manejar fechas de manera especial
        if (value instanceof java.sql.Date) {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
            return sdf.format((java.sql.Date) value);
        }
        
        return value.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnRegresar;
    private com.github.lgooddatepicker.components.DatePicker dpFechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaCita;
    private javax.swing.JLabel lblFechaCita1;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblRegresar;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spCitasPaciente;
    private javax.swing.JScrollPane spTbPacientes;
    private Swing.Tabla tbPacientes;
    private com.github.lgooddatepicker.components.TimePicker tpHora;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}