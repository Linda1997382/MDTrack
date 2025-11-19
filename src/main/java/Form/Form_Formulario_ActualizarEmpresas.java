package Form;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Form_Formulario_ActualizarEmpresas extends javax.swing.JPanel {
    private final int empresaId;  // CAMBIADO: de String a int

    // CAMBIADO: Constructor ahora recibe int en lugar de String
    public Form_Formulario_ActualizarEmpresas(int empresaId) {
        initComponents();
        this.empresaId = empresaId;
        cargarEmpresaEnFormulario(empresaId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        nombreEmpresaTxt = new javax.swing.JTextField();
        lblNombreResponsable = new javax.swing.JLabel();
        nombreResponsableTxt = new javax.swing.JTextField();
        lblTelResponsable = new javax.swing.JLabel();
        telResponsableTxt = new javax.swing.JTextField();
        lblEmailResponsable = new javax.swing.JLabel();
        eMailResponsableTxt = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JPanel();
        lblcancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar empresa");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        lblNombreEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblNombreEmpresa.setText("Nombre de la empresa:");
        panelBorder1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        nombreEmpresaTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        nombreEmpresaTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        panelBorder1.add(nombreEmpresaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 240, 40));

        lblNombreResponsable.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblNombreResponsable.setText("Nombre del responsable:");
        panelBorder1.add(lblNombreResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 230, -1));

        nombreResponsableTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        nombreResponsableTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        panelBorder1.add(nombreResponsableTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 240, 40));

        lblTelResponsable.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTelResponsable.setText("Telefono del responsable:");
        panelBorder1.add(lblTelResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 240, -1));

        telResponsableTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        telResponsableTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        telResponsableTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telResponsableTxtKeyTyped(evt);
            }
        });
        panelBorder1.add(telResponsableTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 240, 40));

        lblEmailResponsable.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblEmailResponsable.setText("Correo electronico:");
        panelBorder1.add(lblEmailResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 210, -1));

        eMailResponsableTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        eMailResponsableTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        panelBorder1.add(eMailResponsableTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 240, 40));

        btnCancelar.setBackground(new java.awt.Color(30, 103, 201));

        lblcancelar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblcancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcancelar.setText("Cancelar");
        lblcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        panelBorder1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 182, -1));

        btnGuardar.setBackground(new java.awt.Color(30, 103, 201));

        lblGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
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
                .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        panelBorder1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 182, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseClicked
        if (navigator != null) {
            Form_Empresas back = new Form_Empresas();
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }//GEN-LAST:event_lblcancelarMouseClicked

    private void lblcancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseEntered
        btnCancelar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblcancelarMouseEntered

    private void lblcancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelarMouseExited
        btnCancelar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblcancelarMouseExited

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if (navigator != null) {
            guardar();
            Form_Empresas back = new Form_Empresas();
            back.setNavigator(navigator);
            navigator.accept(back);
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        btnGuardar.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        btnGuardar.setBackground(new Color(30, 103, 201));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void telResponsableTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telResponsableTxtKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros && telResponsableTxt.getText().length() >= 10) {
            evt.consume();
        }
        if (telResponsableTxt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_telResponsableTxtKeyTyped
    private java.util.function.Consumer<javax.swing.JComponent> navigator;

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        this.navigator = nav;
    }

    private void guardar() {
        try {
            Map<String, Object> datos = new HashMap<>();
            // CORREGIDO: Usar los nombres de campos correctos que espera el modelo
            datos.put("nombre", nombreEmpresaTxt.getText());
            datos.put("nombre_responsable", nombreResponsableTxt.getText());
            datos.put("telefono_responsable", telResponsableTxt.getText());
            datos.put("correo_responsable", eMailResponsableTxt.getText());
            
            // CORREGIDO: empresaId ya es int, no necesita conversión
            Modelo.Model_Empresas.actualizarEmpresa(empresaId, datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    // CAMBIADO: Parámetro de String a int
    private void cargarEmpresaEnFormulario(int id) {
        new javax.swing.SwingWorker<Map<String, Object>, Void>() {
            @Override
            protected Map<String, Object> doInBackground() throws Exception {
                // CORREGIDO: Pasar int directamente al modelo
                return Modelo.Model_Empresas.obtenerEmpresaPorId(id);
            }

            @Override
            protected void done() {
                try {
                    Map<String, Object> d = get();
                    if (d == null) {
                        javax.swing.JOptionPane.showMessageDialog(Form_Formulario_ActualizarEmpresas.this, "Empresa no encontrada.");
                        return;
                    }
                    // CORREGIDO: Usar los nombres de campos correctos del modelo
                    nombreEmpresaTxt.setText(val(d, "nombre"));
                    nombreResponsableTxt.setText(val(d, "nombre_responsable"));
                    telResponsableTxt.setText(val(d, "telefono_responsable"));
                    eMailResponsableTxt.setText(val(d, "correo_responsable"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(Form_Formulario_ActualizarEmpresas.this, "No se pudo cargar la empresa.");
                }
            }
        }.execute();
    }

    private static String val(Map<String, Object> m, String k) {
        Object v = m.get(k);
        return v == null ? "" : v.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JTextField eMailResponsableTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmailResponsable;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreResponsable;
    private javax.swing.JLabel lblTelResponsable;
    private javax.swing.JLabel lblcancelar;
    private javax.swing.JTextField nombreEmpresaTxt;
    private javax.swing.JTextField nombreResponsableTxt;
    private Swing.PanelBorder panelBorder1;
    private javax.swing.JTextField telResponsableTxt;
    // End of variables declaration//GEN-END:variables
}