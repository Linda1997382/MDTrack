package Form;

import Swing.ScrollBar;
import java.awt.Color;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.Model_Consultas;

public class Form_Consultas_Historial extends javax.swing.JPanel {

    private final int empleadoId;
    private final int pacienteId;
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public Form_Consultas_Historial(int empleadoId, int pacienteId) {
        initComponents();
        this.empleadoId = empleadoId;
        this.pacienteId = pacienteId;
        spTbPacientes.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spTbPacientes.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        cargarConsultasAsync();
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        spTbPacientes = new javax.swing.JScrollPane();
        tbPacientes = new Swing.Tabla();
        btnConsultar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JPanel();
        lblVer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setOpaque(true);

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Consulta", "ID Paciente", "Paciente", "Empresa", "Fecha de consulta", "Motivo de consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] { false, false, false, false, false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTbPacientes.setViewportView(tbPacientes);

        btnConsultar.setBackground(new java.awt.Color(30, 103, 201));

        lblRegresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); 
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { lblRegresarMouseClicked(evt); }
            public void mouseEntered(java.awt.event.MouseEvent evt) { btnConsultar.setBackground(new Color(80, 158, 255)); }
            public void mouseExited(java.awt.event.MouseEvent evt) { btnConsultar.setBackground(new Color(30, 103, 201)); }
        });

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnHistorial.setBackground(new java.awt.Color(30, 103, 201));

        lblVer.setFont(new java.awt.Font("Roboto Medium", 0, 14)); 
        lblVer.setForeground(new java.awt.Color(255, 255, 255));
        lblVer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVer.setText("Ver consulta");
        lblVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { lblVerMouseClicked(evt); }
            public void mouseEntered(java.awt.event.MouseEvent evt) { btnHistorial.setBackground(new Color(80, 158, 255)); }
            public void mouseExited(java.awt.event.MouseEvent evt) { btnHistorial.setBackground(new Color(30, 103, 201)); }
        });

        javax.swing.GroupLayout btnHistorialLayout = new javax.swing.GroupLayout(btnHistorial);
        btnHistorial.setLayout(btnHistorialLayout);
        btnHistorialLayout.setHorizontalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVer, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnHistorialLayout.setVerticalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVer, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); 
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Historial de consultas");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {
        if (navigator != null) {
            Form_Consultas f = new Form_Consultas(empleadoId);
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }

    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una consulta.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        // Obtener el ID de forma segura (puede venir como Integer, Long o String)
        int consultaId = -1;
        try {
            Object idObj = tbPacientes.getModel().getValueAt(modelRow, 0);
            consultaId = Integer.parseInt(String.valueOf(idObj));
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "ID de consulta inválido: " + ex.getMessage());
            return;
        }

        // Depuración rápida: imprimir el id obtenido y el estado del navigator
        String dbg = "[DEBUG] lblVerMouseClicked: viewRow=" + viewRow + " modelRow=" + modelRow + " consultaId=" + consultaId + " navigator=" + (navigator == null ? "null" : "ok");
        System.out.println(dbg);
        // Nota: ya no mostramos el diálogo emergente de depuración.

        if (navigator == null) {
            // Debug: navigator no fue configurado
            javax.swing.JOptionPane.showMessageDialog(this, "Navegación no disponible (navigator == null). Revisa el flujo que abre este formulario.");
            return;
        }

        try {
            Form_Formulario_Consulta_Ver_Safe f = new Form_Formulario_Consulta_Ver_Safe(
                String.valueOf(pacienteId),
                String.valueOf(empleadoId),
                String.valueOf(consultaId)
            );
            f.setNavigator(navigator);
            navigator.accept(f);
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo abrir la consulta: " + ex.getMessage());
        }
    }

    // ==============================
    //   CARGA DE CONSULTAS
    // ==============================
    private void cargarConsultasAsync() {
        DefaultTableModel model = (DefaultTableModel) tbPacientes.getModel();
        model.setRowCount(0);

        new javax.swing.SwingWorker<List<Object[]>, Void>() {
            @Override
            protected List<Object[]> doInBackground() {
                return Model_Consultas.listarConsultasDePaciente(pacienteId);
            }

            @Override
            protected void done() {
                try {
                    List<Object[]> rows = get();
                    for (Object[] r : rows) {
                        model.addRow(r);
                    }
                    ocultarColumnasIds(tbPacientes);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Consultas_Historial.this,
                            "No se pudo cargar el historial de consultas.");
                }
            }
        }.execute();
    }

    private void ocultarColumnasIds(JTable table) {
        int[] cols = {0, 1}; // ConsultaId, PacienteId
        for (int c : cols) {
            table.getColumnModel().getColumn(c).setMinWidth(0);
            table.getColumnModel().getColumn(c).setMaxWidth(0);
            table.getColumnModel().getColumn(c).setPreferredWidth(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblVer;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTbPacientes;
    private Swing.Tabla tbPacientes;
    // End of variables declaration//GEN-END:variables
}
