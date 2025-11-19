package Form;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import Modelo.Model_Paciente;
import Swing.ScrollBar;

/**
 * Form_Pacientes - adaptado a modelos MySQL
 * Mantiene la interfaz visual original y conecta la lógica con Model_Paciente.
 */
public class Form_Pacientes extends javax.swing.JPanel {

    private final int empleadoId; // Cambiado a int para consistencia

    public Form_Pacientes(int empleadoId) { // Cambiado a int
        initComponents();
        this.empleadoId = empleadoId;

        // Scroll custom
        spTbPacientes.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spTbPacientes.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        // Cargar la tabla de pacientes (async-safe)
        refrescarTablaPacientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        spTbPacientes = new javax.swing.JScrollPane();
        tbPacientes = new Swing.Tabla();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        pEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        pEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        pAgregarHistoriaClinica = new javax.swing.JPanel();
        lblHistoriaClinica = new javax.swing.JLabel();
        pHistorialMedico = new javax.swing.JPanel();
        lblHistorialMedico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setOpaque(true);

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Empresa", "E-mail", "Fecha de nacimiento", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTbPacientes.setViewportView(tbPacientes);

        btnAgregar.setBackground(new java.awt.Color(30, 103, 201));

        lblAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("Agregar");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pEditar.setBackground(new java.awt.Color(30, 103, 201));

        lblEditar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pEditarLayout = new javax.swing.GroupLayout(pEditar);
        pEditar.setLayout(pEditarLayout);
        pEditarLayout.setHorizontalGroup(
            pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEditarLayout.setVerticalGroup(
            pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pEliminar.setBackground(new java.awt.Color(30, 103, 201));

        lblEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pEliminarLayout = new javax.swing.GroupLayout(pEliminar);
        pEliminar.setLayout(pEliminarLayout);
        pEliminarLayout.setHorizontalGroup(
            pEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEliminarLayout.setVerticalGroup(
            pEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pAgregarHistoriaClinica.setBackground(new java.awt.Color(30, 103, 201));

        lblHistoriaClinica.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblHistoriaClinica.setForeground(new java.awt.Color(255, 255, 255));
        lblHistoriaClinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoriaClinica.setText("Agregar Historia Clinica");
        lblHistoriaClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoriaClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoriaClinicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHistoriaClinicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHistoriaClinicaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pAgregarHistoriaClinicaLayout = new javax.swing.GroupLayout(pAgregarHistoriaClinica);
        pAgregarHistoriaClinica.setLayout(pAgregarHistoriaClinicaLayout);
        pAgregarHistoriaClinicaLayout.setHorizontalGroup(
            pAgregarHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        pAgregarHistoriaClinicaLayout.setVerticalGroup(
            pAgregarHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pHistorialMedico.setBackground(new java.awt.Color(30, 103, 201));

        lblHistorialMedico.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblHistorialMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorialMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorialMedico.setText("Historial Medico");
        lblHistorialMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistorialMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistorialMedicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHistorialMedicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHistorialMedicoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pHistorialMedicoLayout = new javax.swing.GroupLayout(pHistorialMedico);
        pHistorialMedico.setLayout(pHistorialMedicoLayout);
        pHistorialMedicoLayout.setHorizontalGroup(
            pHistorialMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistorialMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        pHistorialMedicoLayout.setVerticalGroup(
            pHistorialMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistorialMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Pacientes");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pHistorialMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pAgregarHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(pEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(pEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(pAgregarHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(pHistorialMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        if (navigator != null) {
            Form_Formulario_Pacientes f = new Form_Formulario_Pacientes(empleadoId);
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }                                       

    private void lblAgregarMouseEntered(java.awt.event.MouseEvent evt) {                                        
        btnAgregar.setBackground(new Color(80, 158, 255));
    }                                       

    private void lblAgregarMouseExited(java.awt.event.MouseEvent evt) {                                       
        btnAgregar.setBackground(new Color(30, 103, 201));
    }                                      

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);

        // Obtener ID como entero desde la columna 0 (oculta)
        Object idObj = tbPacientes.getModel().getValueAt(modelRow, 0);
        int id;
        if (idObj instanceof Integer) {
            id = (Integer) idObj;
        } else {
            try {
                id = Integer.parseInt(String.valueOf(idObj));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID de paciente inválido.");
                return;
            }
        }

        // CORREGIDO: Usar Form_Formulario_Pacientes en modo edición
        Form_Formulario_Pacientes f = new Form_Formulario_Pacientes(id, empleadoId);
        f.setNavigator(navigator);
        navigator.accept(f);
    }                                      

    private void lblEditarMouseEntered(java.awt.event.MouseEvent evt) {                                       
        pEditar.setBackground(new Color(80, 158, 255));
    }                                      

    private void lblEditarMouseExited(java.awt.event.MouseEvent evt) {                                      
        pEditar.setBackground(new Color(30, 103, 201));
    }                                     

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
        // Obtener ID como entero
        Object idObj = tbPacientes.getModel().getValueAt(modelRow, 0);
        int id;
        if (idObj instanceof Integer) {
            id = (Integer) idObj;
        } else {
            try {
                id = Integer.parseInt(String.valueOf(idObj));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID de paciente inválido.");
                return;
            }
        }

        String nombre = String.valueOf(tbPacientes.getModel().getValueAt(modelRow, 1));
        
        int r = JOptionPane.showConfirmDialog(this, "¿Eliminar al paciente " + nombre + "?", "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (r == JOptionPane.YES_OPTION) {
            Model_Paciente.eliminarPaciente(id);
            // Recargar tabla después de eliminar
            refrescarTablaPacientes();
        }
    }                                        

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {                                         
        pEliminar.setBackground(new Color(80, 158, 255));
    }                                        

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {                                        
        pEliminar.setBackground(new Color(30, 103, 201));
    }                                       

    private void lblHistoriaClinicaMouseClicked(java.awt.event.MouseEvent evt) {                                                
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
        // Obtener ID como entero
        Object idObj = tbPacientes.getModel().getValueAt(modelRow, 0);
        int pacienteId;
        if (idObj instanceof Integer) {
            pacienteId = (Integer) idObj;
        } else {
            try {
                pacienteId = Integer.parseInt(String.valueOf(idObj));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID de paciente inválido.");
                return;
            }
        }

        String nombre = String.valueOf(tbPacientes.getModel().getValueAt(modelRow, 1));
        
        int r = JOptionPane.showConfirmDialog(this, "¿Crear historia clinica de " + nombre
                + "? \n(No podra regresar hasta haber terminado la historia clinica)", "Crear historia clinica",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (r == JOptionPane.YES_OPTION) {
    if (r == JOptionPane.YES_OPTION) {
    if (navigator != null) {
        // Ahora ambos son int - consistente con el resto del proyecto
        Form_Formulario_HistoriaClinica f = new Form_Formulario_HistoriaClinica(
            pacienteId,   // int
            empleadoId    // int
        );
        f.setNavigator(navigator);
        navigator.accept(f);
    }
}
}
    }                                               

    private void lblHistoriaClinicaMouseEntered(java.awt.event.MouseEvent evt) {                                                
        pAgregarHistoriaClinica.setBackground(new Color(80, 158, 255));
    }                                               

    private void lblHistoriaClinicaMouseExited(java.awt.event.MouseEvent evt) {                                               
        pAgregarHistoriaClinica.setBackground(new Color(30, 103, 201));
    }                                              

    private void lblHistorialMedicoMouseClicked(java.awt.event.MouseEvent evt) {                                                
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
        // Obtener ID como entero
        Object idObj = tbPacientes.getModel().getValueAt(modelRow, 0);
        int pacienteId;
        if (idObj instanceof Integer) {
            pacienteId = (Integer) idObj;
        } else {
            try {
                pacienteId = Integer.parseInt(String.valueOf(idObj));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID de paciente inválido.");
                return;
            }
        }

        String nombre = String.valueOf(tbPacientes.getModel().getValueAt(modelRow, 1));

        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setDialogTitle("Guardar historial médico de " + nombre);
        fc.setSelectedFile(new java.io.File("Historial_" + nombre.replaceAll("\\s+", "_") + ".pdf"));
        int r = fc.showSaveDialog(this);
        if (r != javax.swing.JFileChooser.APPROVE_OPTION) {
            return;
        }

        java.io.File destino = fc.getSelectedFile();
        if (!destino.getName().toLowerCase().endsWith(".pdf")) {
            destino = new java.io.File(destino.getParentFile(), destino.getName() + ".pdf");
        }

        try {
            Modelo.CrearPDFHistorialMedico gen = new Modelo.CrearPDFHistorialMedico();
            java.io.File out = gen.crearParaPaciente(pacienteId, destino);
            JOptionPane.showMessageDialog(this, "PDF creado:\n" + out.getAbsolutePath());
            try {
                java.awt.Desktop.getDesktop().open(out);
            } catch (Exception ignore) {
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se pudo crear el PDF:\n" + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                               

    private void lblHistorialMedicoMouseEntered(java.awt.event.MouseEvent evt) {                                                
        pHistorialMedico.setBackground(new Color(80, 158, 255));
    }                                               

    private void lblHistorialMedicoMouseExited(java.awt.event.MouseEvent evt) {                                               
        pHistorialMedico.setBackground(new Color(30, 103, 201));
    }                                              
    
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    /**
     * Recarga la tabla de pacientes usando tu modelo MySQL y asegura ocultar la columna ID.
     * Esto encapsula la llamada a Model_Paciente.cargarTablaPacientes para que la UI no cambie.
     */
    private void refrescarTablaPacientes() {
        // Llamada en background para no bloquear UI
        SwingUtilities.invokeLater(() -> {
            try {
                Model_Paciente.cargarTablaPacientes(tbPacientes);
                ocultarColumnaIdSiExiste();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "No se pudieron cargar los pacientes: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    /**
     * Oculta la columna ID (columna 0) si está presente en el modelo de la tabla.
     */
    private void ocultarColumnaIdSiExiste() {
        try {
            if (tbPacientes.getColumnModel().getColumnCount() > 0) {
                tbPacientes.getColumnModel().getColumn(0).setMinWidth(0);
                tbPacientes.getColumnModel().getColumn(0).setMaxWidth(0);
                tbPacientes.getColumnModel().getColumn(0).setPreferredWidth(0);
            }
        } catch (Exception e) {
            // Si falla no hacer nada; la tabla seguirá mostrando el ID
            System.err.println("No se pudo ocultar columna ID: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblHistoriaClinica;
    private javax.swing.JLabel lblHistorialMedico;
    private javax.swing.JPanel pAgregarHistoriaClinica;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pEliminar;
    private javax.swing.JPanel pHistorialMedico;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTbPacientes;
    private Swing.Tabla tbPacientes;
    // End of variables declaration                   
}
