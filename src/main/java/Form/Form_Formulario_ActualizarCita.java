package Form;

import Swing.ScrollBar;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.optionalusertools.DateVetoPolicy;
import com.github.lgooddatepicker.optionalusertools.TimeVetoPolicy;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Formulario_ActualizarCita extends javax.swing.JPanel {

    private final int empleadoId;  // Cambiado a int
    private final int citaId;      // Cambiado a int

    // Constructor corregido para aceptar int
    public Form_Formulario_ActualizarCita(int empleadoId, int citaId) {
        initComponents();
        this.empleadoId = empleadoId;
        this.citaId = citaId;
        
        // Configurar componentes
        spCitasPaciente.setVerticalScrollBar(new ScrollBar());
        JPanel b = new JPanel();
        spCitasPaciente.setCorner(JScrollPane.UPPER_RIGHT_CORNER, b);
        
        // Configurar horario
        horarioCita();
        
        // Cargar datos de la cita
        cargarDatosCita();
        
        // Configurar listener para fecha
        dpFechaCita.addDateChangeListener(e -> {
            LocalDate nuevaFecha = e.getNewDate();
            if (nuevaFecha != null) {
                cargarHorasDisponiblesParaDia(nuevaFecha);
            } else {
                tpHora.clear();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spCitasPaciente = new javax.swing.JScrollPane();
        panelBorder1 = new Swing.PanelBorder();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
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

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setOpaque(true);

        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));

        lblCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
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

        jLabel1.setText("Editar cita");
        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));

        lblAviso.setText("**Editando cita existente**");
        lblAviso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(35, 106, 193));

        lblFechaCita1.setText("Hora de la cita:");
        lblFechaCita1.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lblAviso))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaCita1)
                                    .addComponent(lblFechaCita)
                                    .addComponent(lblFechaNacimiento)
                                    .addComponent(lblEmail)
                                    .addComponent(lblEmpresa)
                                    .addComponent(lblPaciente))
                                .addGap(8, 8, 8)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtNombreEmpresa)
                                    .addComponent(txtEmail)
                                    .addComponent(txtFechaNacimiento)
                                    .addComponent(dpFechaCita, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(tpHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(lblAviso)
                .addGap(37, 37, 37)
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
                    .addComponent(lblFechaCita)
                    .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCita1))
                .addGap(48, 48, 48)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        spCitasPaciente.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spCitasPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        volverAListaCitas();
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        btnCancelar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        btnCancelar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblCancelarMouseExited

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardarCita() {
    LocalDate fecha = dpFechaCita.getDate();
    LocalTime hora = tpHora.getTime();
    
    if (fecha == null) {
        JOptionPane.showMessageDialog(this, "Selecciona la fecha de la cita.");
        return;
    }
    if (hora == null) {
        JOptionPane.showMessageDialog(this, "Selecciona la hora de la cita.");
        return;
    }
    
    try {
        LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);
        
        // OBTENER LOS DATOS COMPLETOS DE LA CITA ACTUAL PRIMERO
        Map<String, Object> citaActual = Modelo.Model_Citas.obtenerCitaPorId(citaId);
        if (citaActual == null) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar los datos de la cita.");
            return;
        }
        
        // CREAR MAPA CON TODOS LOS CAMPOS OBLIGATORIOS
        Map<String, Object> datos = new HashMap<>();
        datos.put("id_paciente", citaActual.get("id_paciente")); // Campo obligatorio
        datos.put("id_empleado", empleadoId);
        datos.put("fecha_hora", fechaHora);
        datos.put("estado", citaActual.get("estado")); // Campo obligatorio
        datos.put("motivo", citaActual.get("motivo")); // Campo obligatorio
        
        boolean actualizado = Modelo.Model_Citas.actualizarCita(citaId, datos);
        
        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Cita actualizada correctamente");
            volverAListaCitas();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la cita");
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
    }
}

    private void cargarDatosCita() {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                return Modelo.Model_Citas.obtenerCitaPorId(citaId); // Ya es int
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> cita = get();
                    if (cita == null) {
                        JOptionPane.showMessageDialog(Form_Formulario_ActualizarCita.this, "Cita no encontrada.");
                        volverAListaCitas();
                        return;
                    }
                    
                    // Cargar datos del paciente
                    Integer idPaciente = (Integer) cita.get("id_paciente");
                    if (idPaciente != null) {
                        cargarDatosPaciente(idPaciente);
                    }
                    
                    // Cargar fecha y hora de la cita
                    java.sql.Timestamp fechaHora = (java.sql.Timestamp) cita.get("fecha_hora");
                    if (fechaHora != null) {
                        LocalDateTime ldt = fechaHora.toLocalDateTime();
                        dpFechaCita.setDate(ldt.toLocalDate());
                        tpHora.setTime(ldt.toLocalTime());
                        
                        // Cargar horas disponibles para esa fecha
                        cargarHorasDisponiblesParaDia(ldt.toLocalDate());
                    }
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_ActualizarCita.this, "Error al cargar los datos de la cita.");
                }
            }
        }.execute();
    }

    private void cargarDatosPaciente(int idPaciente) {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                return Modelo.Model_Paciente.obtenerPacientePorId(idPaciente);
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> paciente = get();
                    if (paciente != null) {
                        // Nombre completo
                        String nombreCompleto = construirNombreCompleto(
                            (String) paciente.get("nombres"),
                            (String) paciente.get("apellido_paterno"),
                            (String) paciente.get("apellido_materno")
                        );
                        txtNombre.setText(nombreCompleto);
                        
                        // Empresa
                        txtNombreEmpresa.setText((String) paciente.get("empresa_nombre"));
                        
                        // Email
                        txtEmail.setText((String) paciente.get("correo_electronico"));
                        
                        // Fecha nacimiento
                        java.sql.Date fechaNac = (java.sql.Date) paciente.get("fecha_nacimiento");
                        if (fechaNac != null) {
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            txtFechaNacimiento.setText(fechaNac.toLocalDate().format(formatter));
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }.execute();
    }

    private String construirNombreCompleto(String nombres, String apellidoPaterno, String apellidoMaterno) {
        StringBuilder sb = new StringBuilder();
        if (nombres != null && !nombres.isBlank()) 
            sb.append(nombres.trim()).append(" ");
        if (apellidoPaterno != null && !apellidoPaterno.isBlank()) 
            sb.append(apellidoPaterno.trim()).append(" ");
        if (apellidoMaterno != null && !apellidoMaterno.isBlank()) 
            sb.append(apellidoMaterno.trim());
        return sb.toString().trim();
    }

    private void volverAListaCitas() {
        if (navigator != null) {
            Form_Citas f = new Form_Citas(empleadoId); // Ya es int
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }

    private void horarioCita() {
        var d = dpFechaCita.getSettings();
        d.setAllowKeyboardEditing(false);
        d.setVetoPolicy(new DateVetoPolicy() {
            @Override
            public boolean isDateAllowed(LocalDate date) {
                return date != null && !date.isBefore(LocalDate.now());
            }
        });

        var s = tpHora.getSettings();
        s.setAllowKeyboardEditing(false);
        s.setVetoPolicy(new TimeVetoPolicy() {
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
    }

    private void cargarHorasDisponiblesParaDia(LocalDate fecha) {
        tpHora.clear();

        new javax.swing.SwingWorker<List<java.sql.Time>, Void>() {
            @Override
            protected List<java.sql.Time> doInBackground() throws Exception {
                return Modelo.Model_Citas.obtenerHorasOcupadas(fecha, empleadoId); // Ya es int
            }

            @Override
            protected void done() {
                try {
                    List<java.sql.Time> horasOcupadas = get();
                    if (horasOcupadas == null) {
                        horasOcupadas = java.util.Collections.emptyList();
                    }

                    final java.util.Set<LocalTime> ocupadas = new java.util.HashSet<>();
                    for (java.sql.Time hora : horasOcupadas) {
                        ocupadas.add(hora.toLocalTime());
                    }
                    
                    final LocalDate fechaSeleccionada = fecha;

                    TimePickerSettings s = tpHora.getSettings();
                    s.generatePotentialMenuTimes(
                            TimePickerSettings.TimeIncrement.ThirtyMinutes,
                            LocalTime.of(10, 0),
                            LocalTime.of(20, 0)
                    );

                    s.setVetoPolicy(time -> {
                        if (time == null) {
                            return false;
                        }

                        if (time.isBefore(LocalTime.of(10, 0)) || time.isAfter(LocalTime.of(20, 0))) {
                            return false;
                        }

                        if (LocalDate.now().equals(fechaSeleccionada)) {
                            LocalTime ahora = LocalTime.now().withSecond(0).withNano(0);
                            if (time.isBefore(ahora)) {
                                return false;
                            }
                        }

                        return !ocupadas.contains(time);
                    });

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Formulario_ActualizarCita.this,
                            "No se pudieron cargar las horas disponibles.");
                }
            }
        }.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private com.github.lgooddatepicker.components.DatePicker dpFechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaCita;
    private javax.swing.JLabel lblFechaCita1;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblPaciente;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spCitasPaciente;
    private com.github.lgooddatepicker.components.TimePicker tpHora;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}