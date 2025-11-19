package Componentes;

import Event.EventMenuSelected;
import Modelo.Model_Menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("0", "Home", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("1", "Consultas", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2", "Pacientes", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "Citas", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "Empresas", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "Empleados", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("6", "Reportes", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("7", "Cerrar Sesión", Model_Menu.MenuType.MENU));
    }

    @SuppressWarnings("unchecked")

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        try {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int arc = 15;
            // fondo
            g2.setColor(new Color(30, 103, 201));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

            // borde suave opcional
            g2.setColor(new Color(0, 0, 0, 35));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        } finally {
            g2.dispose();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new Swing.ListMenu<>();
        jSeparator1 = new javax.swing.JSeparator();

        panelMove.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2Bla.png"))); // NOI18N

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoveLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void buildForRole(String puesto) {
        // Limpia el listado
        listMenu1.clearItems();

        String p = puesto == null ? "" : puesto.trim();

        // Siempre "Home"
        listMenu1.addItem(new Model_Menu("home", "0", "Home", Model_Menu.MenuType.MENU));

        if (p.equalsIgnoreCase("admin")) {
            listMenu1.addItem(new Model_Menu("consultas", "1", "Consultas", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("pacientes", "2", "Pacientes", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("citas", "3", "Citas", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("empresas", "4", "Empresas", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("empleados", "5", "Empleados", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("reportes", "6", "Reportes", Model_Menu.MenuType.MENU));

        } else if (p.equalsIgnoreCase("medico")) {
            listMenu1.addItem(new Model_Menu("consultas", "1", "Consultas", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("pacientes", "2", "Pacientes", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("citas", "3", "Citas", Model_Menu.MenuType.MENU));

        } else if (p.equalsIgnoreCase("administracion")) {
            listMenu1.addItem(new Model_Menu("empresas", "4", "Empresas", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("empleados", "5", "Empleados", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("reportes", "6", "Reportes", Model_Menu.MenuType.MENU));

        } else {
            // Otros: Home y Citas
            listMenu1.addItem(new Model_Menu("citas", "3", "Citas", Model_Menu.MenuType.MENU));
        }

        // Siempre "Cerrar Sesión"
        listMenu1.addItem(new Model_Menu("logout", "7", "Cerrar Sesión", Model_Menu.MenuType.MENU));
    }

    private void addSlot(String id, String name, boolean enabled) {
        if (enabled) {
            listMenu1.addItem(new Model_Menu(id, name, Model_Menu.MenuType.MENU));
        } else {
            // ocupa el índice pero NO se puede clickear ni se dibuja texto
            listMenu1.addItem(new Model_Menu(id, name, Model_Menu.MenuType.EMPTY));
        }
    }

    // (Opcional) si algún día quieres rutear por id en lugar de índice:
    public String getCommandAt(int index) {
        Model_Menu m = listMenu1.getItemAtIndex(index);
        return m != null ? m.getId() : null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private Swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMove;
    // End of variables declaration//GEN-END:variables
}
