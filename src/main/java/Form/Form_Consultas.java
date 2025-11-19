package Form;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Modelo.Model_Paciente;
import Swing.ScrollBar;

public class Form_Consultas extends javax.swing.JPanel {

    private final int empleadoId;  

    public Form_Consultas(int empleadoId) {  
        initComponents();
        this.empleadoId = empleadoId;
        spTbPacientes.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spTbPacientes.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        
        Model_Paciente.cargarTablaPacientes(tbPacientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        spTbPacientes = new javax.swing.JScrollPane();
        tbPacientes = new Swing.Tabla();
        btnConsultar = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JPanel();
        lblHistorial = new javax.swing.JLabel();
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

        btnConsultar.setBackground(new java.awt.Color(30, 103, 201));

        lblConsultar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar.setText("Consultar");
        lblConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnHistorial.setBackground(new java.awt.Color(30, 103, 201));

        lblHistorial.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setText("Historial de consultas");
        lblHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHistorialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHistorialLayout = new javax.swing.GroupLayout(btnHistorial);
        btnHistorial.setLayout(btnHistorialLayout);
        btnHistorialLayout.setHorizontalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnHistorialLayout.setVerticalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 94, 183));
        jLabel1.setText("Consultas");

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
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblConsultarMouseClicked(java.awt.event.MouseEvent evt) {
    int viewRow = tbPacientes.getSelectedRow();
    if (viewRow < 0) {
        JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
        return;
    }
    int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
    
   
    int pacienteId = (int) tbPacientes.getModel().getValueAt(modelRow, 0);
    
    if (navigator != null) {
        Form_Formulario_Consulta f = new Form_Formulario_Consulta(
            pacienteId,   
            empleadoId    
        );
        f.setNavigator(navigator);    
        navigator.accept(f);    
    }
}

    private void lblConsultarMouseEntered(java.awt.event.MouseEvent evt) {
        btnConsultar.setBackground(new Color(80, 158, 255));
    }

    private void lblConsultarMouseExited(java.awt.event.MouseEvent evt) {
        btnConsultar.setBackground(new Color(30, 103, 201));
    }

    private void lblHistorialMouseClicked(java.awt.event.MouseEvent evt) {
        int viewRow = tbPacientes.getSelectedRow();
        if (viewRow < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un paciente.");
            return;
        }
        int modelRow = tbPacientes.convertRowIndexToModel(viewRow);
        
       
        int pacienteId = (int) tbPacientes.getModel().getValueAt(modelRow, 0);
        
        if (navigator != null) {
            Form_Consultas_Historial f = new Form_Consultas_Historial(
                empleadoId,  
                pacienteId
            );
            f.setNavigator(navigator);
            navigator.accept(f);
        }
    }

    private void lblHistorialMouseEntered(java.awt.event.MouseEvent evt) {
        btnHistorial.setBackground(new Color(80, 158, 255));
    }

    private void lblHistorialMouseExited(java.awt.event.MouseEvent evt) {
        btnHistorial.setBackground(new Color(30, 103, 201));
    }
    
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblHistorial;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTbPacientes;
    private Swing.Tabla tbPacientes;
    // End of variables declaration
}