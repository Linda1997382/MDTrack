package com.mycompany.mdtrack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    FondoPanel fondo = new FondoPanel();

    public Login() {
        this.setContentPane(fondo);
        initComponents();
        txtPassword.setText("************");
        txtPassword.setEchoChar((char) 0);

        txtPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                String cur = String.valueOf(txtPassword.getPassword());
                if ("************".equals(cur)) {
                    txtPassword.setText("");
                    txtPassword.setEchoChar('\u2022'); // bullets
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String cur = String.valueOf(txtPassword.getPassword());
                if (cur.isEmpty()) {
                    txtPassword.setText("************");
                    txtPassword.setEchoChar((char) 0); // texto claro
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 81, 129));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LG.png"))); // NOI18N
        jLabel1.setText("GeneralMed");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 170));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblUsuario.setText("USUARIO");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lblPassword.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPassword.setText("CONTRASEÑA");
        bg.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        txtPassword.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPassword.setText("************");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        bg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 320, 40));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 255)));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 320, 40));

        loginBtn.setBackground(new java.awt.Color(46, 112, 193));

        loginBtnTxt.setBackground(new java.awt.Color(0, 204, 204));
        loginBtnTxt.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("INICIAR SESIÓN");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 467, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(80, 158, 255));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(46, 112, 193));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed

    }//GEN-LAST:event_txtPasswordMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        hacerLogin();
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    // En tu clase Login, modifica el método hacerLogin():
private void hacerLogin() {
    String usuario = txtUsuario.getText().trim();
    String pass = String.valueOf(txtPassword.getPassword());
    
    // CORREGIR: Verificar si es el placeholder
    if ("************".equals(pass)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ingresa tu contraseña real.");
        return;
    }

    if (usuario.isEmpty() || pass.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ingresa usuario y contraseña.");
        return;
    }

    final String fu = usuario;
    final String fp = pass;

    loginBtn.setEnabled(false);
    loginBtnTxt.setEnabled(false);

    new javax.swing.SwingWorker<String, Void>() {
        @Override
        protected String doInBackground() throws Exception {
            return Modelo.Model_Login.verificarUsuario(fu, fp);
        }

        @Override
        protected void done() {
            try {
                String idStr = get();
                if (idStr != null) {
                    try {
                        int idEmpleado = Integer.parseInt(idStr);
                        new Vistas.Principal(idEmpleado).setVisible(true);
                        dispose();
                    } catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(Login.this, 
                            "Error: ID de empleado no válido.");
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(Login.this, 
                        "Usuario o contraseña incorrectos.\n\nPrueba con:\nUsuario: admin / Contraseña: admin123\nO usa el correo: admin@medtrack.com");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(Login.this, "Error al conectar con la base de datos.");
            } finally {
                loginBtn.setEnabled(true);
                loginBtnTxt.setEnabled(true);
            }
        }
    }.execute();
}
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
        Conexion.conectar();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    class FondoPanel extends javax.swing.JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            //super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
