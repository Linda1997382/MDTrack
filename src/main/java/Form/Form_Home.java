package Form;

import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Modelo.Model_Citas;
import Modelo.Model_Home;
import Swing.ScrollBar;

public class Form_Home extends javax.swing.JPanel {

    private final int empleadoId;
    private Modelo.Model_Empleado.Empleado empleadoCache; 
    private boolean empleadoCargado = false; 
    private final DateTimeFormatter fmtFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm");

    public Form_Home(int empleadoId) {
        initComponents();
        this.empleadoId = empleadoId;
        verificarPuesto();
        spHome.setVerticalScrollBar(new ScrollBar());
        spTbCitas.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spTbCitas.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        // Cargar citas al inicio (como antes) — si el empleado resulta Administrador
        // se volverá a recargar desde procesarEmpleado para mostrar todas las citas
        cargarCitasDeHoy();
        
        // Configurar renderer para la tabla
        tbCitas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                
                // Buscar columna de asistencia
                int asistenciaCol = -1;
                for (int i = 0; i < table.getColumnCount(); i++) {
                    if ("Asistencia".equals(table.getColumnName(i))) {
                        asistenciaCol = i;
                        break;
                    }
                }
                
                if (asistenciaCol != -1) {
                    Object val = table.getValueAt(row, asistenciaCol);
                    if (val != null) {
                        String asistencia = val.toString();
                        if ("Sí".equalsIgnoreCase(asistencia)) {
                            c.setBackground(new Color(142, 207, 221));
                            c.setForeground(Color.WHITE);
                        } else if ("No".equalsIgnoreCase(asistencia)) {
                            c.setBackground(new Color(236, 93, 126));
                            c.setForeground(Color.WHITE);
                        } else {
                            c.setBackground(Color.WHITE);
                            c.setForeground(Color.BLACK);
                        }
                    } else {
                        c.setBackground(Color.WHITE);
                        c.setForeground(Color.BLACK);
                    }
                } else {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                }

                if (isSelected) {
                    c.setBackground(table.getSelectionBackground());
                    c.setForeground(table.getSelectionForeground());
                }

                return c;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spHome = new javax.swing.JScrollPane();
        panelBorder1 = new Swing.PanelBorder();
        pCards = new javax.swing.JPanel();
        cardHoy = new Componentes.Card();
        cardMes = new Componentes.Card();
        lblReportes = new javax.swing.JLabel();
        spTbCitas = new javax.swing.JScrollPane();
        tbCitas = new Swing.Tabla();
        btnConsultar2 = new javax.swing.JPanel();
        lblConsultar2 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        pCards.setLayout(new java.awt.GridLayout(1, 2, 16, 16));

        cardHoy.setColor1(new java.awt.Color(213, 117, 239));
        cardHoy.setColor2(new java.awt.Color(177, 30, 217));
        pCards.add(cardHoy);

        cardMes.setColor1(new java.awt.Color(241, 208, 62));
        cardMes.setColor2(new java.awt.Color(211, 184, 61));
        pCards.add(cardMes);

        lblReportes.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(22, 94, 183));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setText("Citas del dia");

        tbCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CitaId", "PacienteId", "Paciente", "Fecha", "Hora", "Asistencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTbCitas.setViewportView(tbCitas);

        btnConsultar2.setBackground(new java.awt.Color(30, 103, 201));

        lblConsultar2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblConsultar2.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar2.setText("Consultar");
        lblConsultar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConsultar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConsultar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnConsultar2Layout = new javax.swing.GroupLayout(btnConsultar2);
        btnConsultar2.setLayout(btnConsultar2Layout);
        btnConsultar2Layout.setHorizontalGroup(
            btnConsultar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsultar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultar2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnConsultar2Layout.setVerticalGroup(
            btnConsultar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConsultar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pCards, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                            .addComponent(spTbCitas))))
                .addGap(61, 61, 61))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pCards, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(spTbCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        spHome.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHome)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblConsultar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultar2MouseClicked
        int viewRow = tbCitas.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una cita.");
            return;
        }
        int modelRow = tbCitas.convertRowIndexToModel(viewRow);
        int citaId = (int) tbCitas.getModel().getValueAt(modelRow, 0);
        int pacienteId = (int) tbCitas.getModel().getValueAt(modelRow, 1);
        actualizarCita(citaId);
        Form_Formulario_Consulta f = new Form_Formulario_Consulta(pacienteId, empleadoId);
        f.setNavigator(navigator);
        navigator.accept(f);
    }//GEN-LAST:event_lblConsultar2MouseClicked

    private void lblConsultar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultar2MouseEntered
        btnConsultar2.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblConsultar2MouseEntered

    private void lblConsultar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultar2MouseExited
        btnConsultar2.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblConsultar2MouseExited

    private void actualizarCita(int citaId) {
        try {
            boolean actualizado = Model_Citas.marcarAsistencia(citaId);
            if (actualizado) {
                JOptionPane.showMessageDialog(this, "El paciente asistió a la consulta");
                cargarCitasDeHoy(); // Recargar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar la asistencia");
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar");
        }
    }

    private void cargarCitasDeHoy() {
        new javax.swing.SwingWorker<List<Object[]>, Void>() {
            @Override
            protected List<Object[]> doInBackground() throws Exception {
                // Si el empleado es administrador o enfermero, devolver todas las citas del día
                if (empleadoCache != null) {
                    String puestoCache = empleadoCache.getPuesto();
                    if ("Administrador".equalsIgnoreCase(puestoCache) || "Enfermero".equalsIgnoreCase(puestoCache)) {
                        return Model_Citas.obtenerCitasDelDiaTodos();
                    }
                }
                return Model_Citas.obtenerCitasDelDia(empleadoId);
            }

            @Override
            protected void done() {
                try {
                    List<Object[]> filas = get();
                    DefaultTableModel model = (DefaultTableModel) tbCitas.getModel();
                    model.setRowCount(0);
                    for (Object[] row : filas) {
                        model.addRow(row);
                    }
                    ocultarColumnasIds(tbCitas);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Home.this, "No se pudieron cargar las citas de hoy.");
                }
            }
        }.execute();
    }

    private void verificarPuesto() {
    System.out.println("=== DEBUG Form_Home.verificarPuesto() ===");
    System.out.println("ID Empleado recibido: " + empleadoId);
    
    // Si ya está cargado, usar cache
    if (empleadoCargado && empleadoCache != null) {
        System.out.println("DEBUG: Usando empleado en cache");
        procesarEmpleado(empleadoCache);
        return;
    }
    
    // Mostrar estado de carga
    pCards.setVisible(false);
    btnConsultar2.setVisible(false);
    lblReportes.setText("Cargando...");
    
    new javax.swing.SwingWorker<Modelo.Model_Empleado.Empleado, Void>() {
        @Override
        protected Modelo.Model_Empleado.Empleado doInBackground() throws Exception {
            System.out.println("DEBUG: Consultando empleado desde BD...");
            Thread.sleep(50); // Pequeña pausa
            return Modelo.Model_Empleado.obtenerEmpleadoPorId(empleadoId);
        }

        @Override
        protected void done() {
            try {
                Modelo.Model_Empleado.Empleado empleado = get();
                empleadoCache = empleado; // Guardar en cache
                empleadoCargado = true;
                procesarEmpleado(empleado);
                
            } catch (Exception ex) {
                System.out.println("DEBUG: Error en verificarPuesto: " + ex.getMessage());
                manejarError(ex);
            }
        }
    }.execute();
}

    // Nuevo método separado para procesar el empleado
    private void procesarEmpleado(Modelo.Model_Empleado.Empleado empleado) {
        if (empleado == null) {
            System.out.println("DEBUG: EMPLEADO ES NULL");
            lblReportes.setText("Citas del día");
            JOptionPane.showMessageDialog(this, 
                "Empleado no encontrado. ID: " + empleadoId, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String puesto = empleado.getPuesto();
        System.out.println("DEBUG: Procesando puesto: " + puesto);
        
        lblReportes.setText("Citas del día");
        
        if (!"Medico".equalsIgnoreCase(puesto) && !"Administrador".equalsIgnoreCase(puesto)) {
            pCards.setVisible(false);
            btnConsultar2.setVisible(false);
            // Si el puesto es Enfermero, recargar las citas para mostrar todas del día
            if ("Enfermero".equalsIgnoreCase(puesto)) {
                cargarCitasDeHoy();
            }
        } else {
            pCards.setVisible(true);
            btnConsultar2.setVisible(true);
            cargarKPIsMedico();
            // Cargar las citas una vez sabemos el puesto del empleado
            cargarCitasDeHoy();
        }
        
        panelBorder1.revalidate();
        panelBorder1.repaint();
    }

    private void manejarError(Exception ex) {
        lblReportes.setText("Citas del día");
        pCards.setVisible(false);
        btnConsultar2.setVisible(false);
        
        // Solo mostrar error si no es NullPointerException de conexión
        if (!(ex.getCause() instanceof NullPointerException)) {
            JOptionPane.showMessageDialog(this, 
                "Error al cargar información: " + ex.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

        private java.util.function.Consumer<javax.swing.JComponent> navigator;

        public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
            this.navigator = nav;
        }

        private void ocultarColumnasIds(JTable table) {
            try {
                // Ocultar columna 0 (CitaId)
                table.getColumnModel().getColumn(0).setMinWidth(0);
                table.getColumnModel().getColumn(0).setMaxWidth(0);
                table.getColumnModel().getColumn(0).setPreferredWidth(0);

                // Ocultar columna 1 (PacienteId)
                table.getColumnModel().getColumn(1).setMinWidth(0);
                table.getColumnModel().getColumn(1).setMaxWidth(0);
                table.getColumnModel().getColumn(1).setPreferredWidth(0);
            } catch (Exception ignored) {
            }
        }

        private void cargarKPIsMedico() {
            new javax.swing.SwingWorker<Model_Home.Contadores, Void>() {
                @Override
                protected Model_Home.Contadores doInBackground() throws Exception {
                    return Model_Home.contarConsultasDeEmpleado(empleadoId);
                }

                @Override
                protected void done() {
                    try {
                        Model_Home.Contadores c = get();
                        // Card "Hoy"
                        cardHoy.setData(
                                new Swing.Model_Card(
                                        new javax.swing.ImageIcon(getClass().getResource("/imagenes/hoy.png")),
                                        "Consultas de HOY",
                                        String.valueOf(c.hoy),
                                        "Hechas por ti"
                                )
                        );
                        // Card "Mes"
                        cardMes.setData(
                                new Swing.Model_Card(
                                        new javax.swing.ImageIcon(getClass().getResource("/imagenes/mes.png")),
                                        "Consultas del MES",
                                        String.valueOf(c.mes),
                                        "Acumulado del mes"
                                )
                        );
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(Form_Home.this, "No se pudieron cargar los KPIs.");
                    }
                }
            }.execute();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConsultar2;
    private Componentes.Card cardHoy;
    private Componentes.Card cardMes;
    private javax.swing.JLabel lblConsultar2;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JPanel pCards;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spHome;
    private javax.swing.JScrollPane spTbCitas;
    private Swing.Tabla tbCitas;
    // End of variables declaration//GEN-END:variables
}