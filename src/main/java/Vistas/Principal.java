package Vistas;

import javax.swing.JComponent;

import Event.EventMenuSelected;
import Form.Form_Citas;
import Form.Form_Consultas;
import Form.Form_Empleados;
import Form.Form_Empresas;
import Form.Form_Home;
import Form.Form_Pacientes;
import Form.Form_Reportes;

public class Principal extends javax.swing.JFrame {

    private final int idEmpleado;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal(int idEmpleado) {
        initComponents();
        this.idEmpleado = idEmpleado;
        
        // CORREGIDO: Usar obtenerRolPorId en lugar de verificarPuestoEmpleado
        String rol = Modelo.Model_Login.obtenerRolPorId(idEmpleado);
        System.out.println("El rol del empleado es: " + rol);
        
        menu.buildForRole(rol); // Pasar el rol en lugar del puesto
        setResizable(false);
        
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selectedId(String id) {
                switch (id) {
                    case "home" -> {
                        Form_Home form = new Form_Home(idEmpleado);
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                    }
                    case "consultas" -> {
                        Form_Consultas form = new Form_Consultas(idEmpleado);
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                        System.out.println("Mostrando consultas");
                    }
                    case "pacientes" -> {
                        Form_Pacientes form = new Form_Pacientes(idEmpleado);
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                    }
                    case "citas" -> {
                        Form_Citas form = new Form_Citas(idEmpleado);
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                    }
                    case "empresas" -> {
                        Form_Empresas form = new Form_Empresas();
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                    }
                    case "empleados" -> {
                        Form_Empleados form = new Form_Empleados();
                        form.setNavigator(Principal.this::setForm);
                        setForm(form);
                    }
                    case "reportes" ->
                        setForm(new Form_Reportes());

                    case "logout" -> {
                        int r = javax.swing.JOptionPane.showConfirmDialog(
                                Principal.this, "¿Cerrar Sesión?", "MEDTrack",
                                javax.swing.JOptionPane.YES_NO_OPTION,
                                javax.swing.JOptionPane.QUESTION_MESSAGE
                        );
                        if (r == javax.swing.JOptionPane.YES_OPTION) {
                            cerrarSesion();
                        }
                    }
                    default -> {
                        /* opcional: no-op */ }
                }
            }
        });
        
        Form_Home home = new Form_Home(idEmpleado);
        home.setNavigator(Principal.this::setForm);
        setForm(home);
    }

    // Constructor sobrecargado para mantener compatibilidad con código existente
    public Principal(String idEmpleadoStr) {
        this(convertirAInt(idEmpleadoStr));
    }

    // Método auxiliar para convertir String a int de forma segura
    private static int convertirAInt(String idEmpleadoStr) {
        try {
            return Integer.parseInt(idEmpleadoStr);
        } catch (NumberFormatException e) {
            System.err.println("Error: ID de empleado no válido: " + idEmpleadoStr);
            return -1;
        }
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com, java.awt.BorderLayout.CENTER);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void cerrarSesion() {
        com.mycompany.mdtrack.Login login = new com.mycompany.mdtrack.Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        menu = new Componentes.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            com.mycompany.mdtrack.Login login = new com.mycompany.mdtrack.Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private Componentes.Menu menu;
    private Swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}