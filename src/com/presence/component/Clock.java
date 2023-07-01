
package com.presence.component;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Clock extends javax.swing.JPanel {

    int timeRun = 0;
    public Clock() {
        initComponents();
        setOpaque(false);
        lbWaktu.setForeground(new Color(255,255,255));
        //set default color to white;
        
        
     //unremark this if app is ready to demo
        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                    Date d = new Date();
                    lbWaktu.setText(s.format(d));
                }
            }
        }.start();
    }
    
    public void setClockColor(Color color){
        lbWaktu.setForeground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWaktu = new javax.swing.JLabel();

        lbWaktu.setFont(new java.awt.Font("DS-Digital", 1, 36)); // NOI18N
        lbWaktu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWaktu.setText("4:44:44");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbWaktu;
    // End of variables declaration//GEN-END:variables
}
