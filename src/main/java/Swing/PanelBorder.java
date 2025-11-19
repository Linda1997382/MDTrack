/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author anton
 */
public class PanelBorder extends javax.swing.JPanel {

    /**
     * Creates new form PanelBorder
     */
    public PanelBorder() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);                    // pinta hijos primero
        Graphics2D g2 = (Graphics2D) g.create();
        try {
            // Pares correctos de hints
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            // No necesitas hint de texto si no dibujas texto aquí

            int arc = 15;
            g2.setColor(getBackground() != null ? getBackground() : java.awt.Color.WHITE);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

            // (Opcional) borde suave:
            g2.setColor(new java.awt.Color(0, 0, 0, 40));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        } finally {
            g2.dispose();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
