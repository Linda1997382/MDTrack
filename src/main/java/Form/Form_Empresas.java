package Form;

import Swing.ScrollBar;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import Modelo.Model_Empresas;

public class Form_Empresas extends javax.swing.JPanel {

    private JTable tbEmpresas;
    private JScrollPane spTbEmpresas;

    public Form_Empresas() {
        initComponents();
        initCustomComponents();
    }

    private void initCustomComponents() {
        // Crear tabla y scroll pane
        tbEmpresas = new JTable();
        spTbEmpresas = new JScrollPane(tbEmpresas);
        spTbEmpresas.setVerticalScrollBar(new ScrollBar());
        spTbEmpresas.setPreferredSize(new Dimension(600, 400));
        
        // Configurar la tabla
        configurarTabla();
        
        // Agregar el scroll pane al panel
        panelTabla.add(spTbEmpresas);
        
        // Cargar datos
        cargarDatosEmpresas();
    }

    private void configurarTabla() {
        // Configurar columnas
        String[] columnNames = {
            "ID",
            "Nombre de la empresa", 
            "Responsable",
            "Teléfono",
            "Correo electrónico"
        };
        
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tbEmpresas.setModel(model);
        
        // Ocultar columna ID
        tbEmpresas.getColumnModel().getColumn(0).setMinWidth(0);
        tbEmpresas.getColumnModel().getColumn(0).setMaxWidth(0);
        tbEmpresas.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        // Configurar tamaño de columnas
        tbEmpresas.getColumnModel().getColumn(1).setPreferredWidth(200); // Nombre
        tbEmpresas.getColumnModel().getColumn(2).setPreferredWidth(150); // Responsable
        tbEmpresas.getColumnModel().getColumn(3).setPreferredWidth(100); // Teléfono
        tbEmpresas.getColumnModel().getColumn(4).setPreferredWidth(150); // Correo
    }

    private void cargarDatosEmpresas() {
        Model_Empresas.cargarTablaEmpresas(tbEmpresas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(30, 103, 201));
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 50));

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
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(30, 103, 201));
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 50));

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

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(30, 103, 201));
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 50));

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

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Empresas");

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));
        panelTabla.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        if (navigator != null) {
            Form_Formulario_Empresas f = new Form_Formulario_Empresas();
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void lblAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseEntered
        btnAgregar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblAgregarMouseEntered

    private void lblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseExited
        btnAgregar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblAgregarMouseExited

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        int viewRow = tbEmpresas.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una empresa de la tabla.");
            return;
        }
        int modelRow = tbEmpresas.convertRowIndexToModel(viewRow);
        int id = (int) tbEmpresas.getModel().getValueAt(modelRow, 0);
        
        // Crear formulario de actualización
        Form_Formulario_ActualizarEmpresas f = new Form_Formulario_ActualizarEmpresas(id);
        f.setNavigator(navigator);
        navigator.accept(f);
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseEntered
        btnEditar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblEditarMouseEntered

    private void lblEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseExited
        btnEditar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblEditarMouseExited

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        int viewRow = tbEmpresas.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una empresa de la tabla.");
            return;
        }
        int modelRow = tbEmpresas.convertRowIndexToModel(viewRow);
        int id = (int) tbEmpresas.getModel().getValueAt(modelRow, 0);
        String nombre = String.valueOf(tbEmpresas.getModel().getValueAt(modelRow, 1));
        
        int r = JOptionPane.showConfirmDialog(this, 
            "¿Estás seguro de que deseas eliminar la empresa:\n" + nombre + "?", 
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
            
        if (r == JOptionPane.YES_OPTION) {
            boolean eliminado = Model_Empresas.eliminarEmpresa(id);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Empresa eliminada correctamente.");
                cargarDatosEmpresas(); // Recargar tabla
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar la empresa.");
            }
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered
        btnEliminar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited
        btnEliminar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblEliminarMouseExited

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables
}