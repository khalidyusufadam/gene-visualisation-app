/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

/**
 *
 * @author khali
 */
public class geneModelPanel extends javax.swing.JPanel {

    /**
     * Creates new form geneModelPanel
     */
    public geneModelPanel() {
        initComponents();
        turnred();
    }
    
    private boolean blue;
    private boolean red;

    public void turnred(){
        red = true;
        blue = false;
        repaint();
    }
    public void turnblue() {
        red = false;
        blue = true;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (red) {
        g.setColor(Color.red);
        g.setColor(Color.red);
        g.drawRect(5, 5, 20, 20);
        } else if (blue){
        g.setColor(Color.blue);
        g.setColor(Color.blue);
        g.drawRect(5, 5, 20, 20);

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
