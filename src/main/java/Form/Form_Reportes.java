package Form;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

import Swing.Model_Card;
import Swing.ScrollBar;

public class Form_Reportes extends javax.swing.JPanel {

    private boolean _llenandoCombos = false;

    public Form_Reportes() {
        initComponents();
        spReportes.setVerticalScrollBar(new ScrollBar());
        spTbConsultas.setVerticalScrollBar(new ScrollBar());
        JPanel p = new JPanel();
        spReportes.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        postInitSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spReportes = new javax.swing.JScrollPane();
        panelBorder1 = new Swing.PanelBorder();
        pCards = new javax.swing.JPanel();
        card3 = new Componentes.Card();
        card4 = new Componentes.Card();
        pReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox<>();
        lblMes = new javax.swing.JLabel();
        cbxMes = new javax.swing.JComboBox<>();
        lblAño = new javax.swing.JLabel();
        cbxAño = new javax.swing.JComboBox<>();
        spTbConsultas = new javax.swing.JScrollPane();
        tbConsultas = new Swing.Tabla();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        pCards.setLayout(new java.awt.GridLayout(1, 2, 16, 16));

        card3.setColor1(new java.awt.Color(213, 117, 239));
        card3.setColor2(new java.awt.Color(177, 30, 217));
        pCards.add(card3);

        card4.setColor1(new java.awt.Color(241, 208, 62));
        card4.setColor2(new java.awt.Color(211, 184, 61));
        pCards.add(card4);

        pReportes.setBackground(new java.awt.Color(59, 139, 238));

        lblReportes.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setText("Reportes");

        javax.swing.GroupLayout pReportesLayout = new javax.swing.GroupLayout(pReportes);
        pReportes.setLayout(pReportesLayout);
        pReportesLayout.setHorizontalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pReportesLayout.setVerticalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        lblEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblEmpresa.setText("Empresa:");

        cbxEmpresa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblMes.setText("Mes:");

        cbxMes.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAño.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblAño.setText("Año");

        cbxAño.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spTbConsultas.setViewportView(tbConsultas);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spTbConsultas)
                            .addComponent(pCards, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                            .addComponent(pReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblEmpresa)
                        .addGap(8, 8, 8)
                        .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblMes)
                        .addGap(8, 8, 8)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblAño)
                        .addGap(8, 8, 8)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresa)
                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMes)
                    .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAño))
                .addGap(45, 45, 45)
                .addComponent(pCards, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(spTbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        spReportes.setViewportView(panelBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spReportes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spReportes)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void postInitSetup() {
        // Modelo de tabla bonito y no editable
        DefaultTableModel m = new DefaultTableModel(new Object[][]{}, new String[]{
            "Fecha", "Paciente", "Empresa", "Médico"
        }) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbConsultas.setModel(m);

        // Llenar combos
        cargarCombos();

        // Listeners de filtros
        cbxEmpresa.addActionListener(e -> recargarTodo());
        cbxMes.addActionListener(e -> recargarTodo());
        cbxAño.addActionListener(e -> recargarTodo());

        // Carga inicial
        recargarTodo();
    }

    private void cargarCombos() {
    _llenandoCombos = true;
    try {
        // Empresa
        cbxEmpresa.removeAllItems();
        cbxEmpresa.addItem("Todas"); // Opción por defecto
        
        // ✅ CORREGIDO: Guardar los IDs correctamente
        List<Modelo.Model_Reportes.ItemCombo> empresas = Modelo.Model_Reportes.listarEmpresas();
        for (Modelo.Model_Reportes.ItemCombo it : empresas) {
            if (it.id != null) { // Solo agregar empresas con ID (excluye "Todas")
                cbxEmpresa.addItem(it.label);
                // ✅ CORREGIDO: Guardar el ID en el modelo del combo
                cbxEmpresa.putClientProperty(it.label, it.id);
            }
        }

        // Mes
        cbxMes.removeAllItems();
        cbxMes.addItem("Todos");
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mes : meses) {
            cbxMes.addItem(mes);
        }
        cbxMes.setSelectedIndex(LocalDate.now().getMonthValue());

        // Año
        cbxAño.removeAllItems();
        cbxAño.addItem("Todos");
        
        for (Integer y : Modelo.Model_Reportes.aniosDisponibles()) {
            cbxAño.addItem(String.valueOf(y));
        }
        cbxAño.setSelectedItem(String.valueOf(Year.now().getValue()));

    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "No se pudieron cargar filtros.");
    } finally {
        _llenandoCombos = false;
    }
}

    private void recargarTodo() {
        if (_llenandoCombos) {
            return;
        }
        cargarTablaAsync();
        actualizarCardsAsync();
    }

    private String empresaSeleccionadaId() {
    Object sel = cbxEmpresa.getSelectedItem();
    if (sel == null || "Todas".equals(sel.toString())) {
        return null;
    }
    String label = sel.toString();
    
    //  CORREGIDO: Buscar directamente por la etiqueta
    Object id = cbxEmpresa.getClientProperty(label);
    System.out.println("DEBUG: Buscando empresa '" + label + "' -> ID: " + id);
    
    return (id != null) ? id.toString() : null;
}

    private Integer mesSeleccionado() {
        int idx = cbxMes.getSelectedIndex();
        if (idx <= 0) {
            return null;
        }
        return idx;
    }

    private Integer anioSeleccionado() {
        Object sel = cbxAño.getSelectedItem();
        if (sel == null || "Todos".equals(sel.toString())) {
            return null;
        }
        try {
            return Integer.parseInt(sel.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private void cargarTablaAsync() {
        String empId = empresaSeleccionadaId();
        Integer mes = mesSeleccionado();
        Integer anio = anioSeleccionado();

        ((DefaultTableModel) tbConsultas.getModel()).setRowCount(0);

        new SwingWorker<List<Map<String, Object>>, Void>() {
            @Override
            protected List<Map<String, Object>> doInBackground() throws Exception {
                // ✅ CORREGIDO: Usar método MySQL
                return Modelo.Model_Reportes.consultasFiltradas(empId, mes, anio);
            }

            @Override
            protected void done() {
                try {
                    List<Map<String, Object>> rows = get();
                    DefaultTableModel m = (DefaultTableModel) tbConsultas.getModel();
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

                    for (Map<String, Object> r : rows) {
                        // ✅ CORREGIDO: Usar java.sql.Timestamp en lugar de Firebase Timestamp
                        java.sql.Timestamp ts = (java.sql.Timestamp) r.get("fecha");
                        String fechaStr = "";
                        if (ts != null) {
                            fechaStr = ts.toLocalDateTime().format(fmt);
                        }
                        m.addRow(new Object[]{
                            fechaStr,
                            String.valueOf(r.getOrDefault("paciente", "")),
                            String.valueOf(r.getOrDefault("empresa", "")),
                            String.valueOf(r.getOrDefault("medico", ""))
                        });
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Form_Reportes.this, "No se pudo cargar la tabla.");
                }
            }
        }.execute();
    }

    private void actualizarCardsAsync() {
        String empId = empresaSeleccionadaId();
        Integer mes = mesSeleccionado();
        Integer anio = anioSeleccionado();

        // IZQUIERDA: Consultas de hoy
        new SwingWorker<Long, Void>() {
            @Override
            protected Long doInBackground() throws Exception {
                // ✅ CORREGIDO: Usar método MySQL
                return Modelo.Model_Reportes.contarHoy(empId);
            }

            @Override
            protected void done() {
                try {
                    long total = get();
                    String desc = (empId == null) ? "Todas las empresas" : "Filtrado por empresa";
                    card3.setData(buildCard("/imagenes/hoy.png", "Consultas de hoy", total, desc));
                    card3.repaint();
                } catch (Exception ignored) {
                }
            }
        }.execute();

        // DERECHA: Consultas del mes
        new SwingWorker<Long, Void>() {
            @Override
            protected Long doInBackground() throws Exception {
                // ✅ CORREGIDO: Usar método MySQL
                return Modelo.Model_Reportes.contarMes(empId, mes, anio);
            }

            @Override
            protected void done() {
                try {
                    long total = get();
                    String sub = (mes == null || anio == null)
                            ? "Mes actual"
                            : "Mes " + cbxMes.getSelectedItem() + " " + cbxAño.getSelectedItem();
                    card4.setData(buildCard("/imagenes/mes.png", "Consultas del mes", total, sub));
                    card4.repaint();
                } catch (Exception ignored) {
                }
            }
        }.execute();
    }

    private Model_Card buildCard(String iconPath, String title, long total, String description) {
        ImageIcon icon = null;
        try {
            var url = getClass().getResource(iconPath);
            if (url != null) {
                icon = new ImageIcon(url);
            }
        } catch (Exception ignored) {
        }
        return new Model_Card(icon, title, String.valueOf(total), description);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Card card3;
    private Componentes.Card card4;
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JPanel pCards;
    private javax.swing.JPanel pReportes;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spReportes;
    private javax.swing.JScrollPane spTbConsultas;
    private Swing.Tabla tbConsultas;
    // End of variables declaration//GEN-END:variables
}