package Form;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Modelo.Model_Empleado;
import Swing.ScrollBar;

public class Form_Empleados extends javax.swing.JPanel {

    public Form_Empleados() {
        initComponents();
        spTbEmpleados.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spTbEmpleados.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        // Cargar tabla de empleados
        Model_Empleado.cargarTablaEmpleados(tbEmpleados);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        spTbEmpleados = new javax.swing.JScrollPane();
        tbEmpleados = new Swing.Tabla();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nombre completo", "Puesto", "Horario", "Teléfono", "ID Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] { false, false, false, false, false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        spTbEmpleados.setViewportView(tbEmpleados);

        btnAgregar.setBackground(new java.awt.Color(30, 103, 201));
        lblAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("Agregar");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregar.setBackground(new Color(80, 158, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregar.setBackground(new Color(30, 103, 201));
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(30, 103, 201));
        lblEditar.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditar.setBackground(new Color(80, 158, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditar.setBackground(new Color(30, 103, 201));
            }
        });

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(30, 103, 201));
        lblEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminar.setBackground(new Color(80, 158, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminar.setBackground(new Color(30, 103, 201));
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36));
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Empleados");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(spTbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
    }

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {
        if (navigator != null) {
            Form_Formulario_Empleados f = new Form_Formulario_Empleados();
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {
    int viewRow = tbEmpleados.getSelectedRow();
    if (viewRow < 0) {
        JOptionPane.showMessageDialog(this, "Selecciona un empleado.");
        return;
    }

    int modelRow = tbEmpleados.convertRowIndexToModel(viewRow);
    int id = (int) tbEmpleados.getModel().getValueAt(modelRow, 0);

    //  CORREGIDO: Pasar el ID como int directamente
    Form_Formulario_ActualizarEmpleado f = new Form_Formulario_ActualizarEmpleado(id);
    f.setNavigator(navigator);
    navigator.accept(f);
}

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {
        int viewRow = tbEmpleados.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un empleado.");
            return;
        }

        int modelRow = tbEmpleados.convertRowIndexToModel(viewRow);
        int id = (int) tbEmpleados.getModel().getValueAt(modelRow, 0);
        String nombre = String.valueOf(tbEmpleados.getModel().getValueAt(modelRow, 1));

        int r = JOptionPane.showConfirmDialog(this,
                "¿Eliminar al empleado " + nombre + "?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (r == JOptionPane.YES_OPTION) {
            Model_Empleado.eliminarEmpleado(id);
            Model_Empleado.cargarTablaEmpleados(tbEmpleados);
        }
    }

    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTbEmpleados;
    private Swing.Tabla tbEmpleados;
}
