/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feuxtricolores;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BoxLayout;

/**
 *
 * @author VEK
 */
public class PanneauFeu extends javax.swing.JPanel {
    private String couleur="rouge";
    /**
     * Creates new form PanneauFeu
     */
    public PanneauFeu() {
        initComponents();
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if(couleur=="rouge"){
            g.setColor(Color.red);
            g.fillOval(this.getWidth()/2-40,10,80,80);
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,100,80,80);
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,190,80,80);
        }
        else if(couleur=="orange"){
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,10,80,80);
            g.setColor(Color.orange);
            g.fillOval(this.getWidth()/2-40,100,80,80);
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,190,80,80);
        }
        else{
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,10,80,80);
            g.setColor(Color.black);
            g.fillOval(this.getWidth()/2-40,100,80,80);
            g.setColor(Color.green);
            g.fillOval(this.getWidth()/2-40,190,80,80);
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

        setBackground(new java.awt.Color(204, 204, 204));

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
