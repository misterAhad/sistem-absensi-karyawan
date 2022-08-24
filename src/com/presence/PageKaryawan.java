package com.presence;

import com.presence.common.koneksi;
import com.presence.common.userSession;
import com.presence.entities.departemen;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PageKaryawan extends javax.swing.JFrame {

    public PageKaryawan() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);        

        menuPanel.addMenu("Halaman Utama", "ic_app_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               changePanel(welcomePanel2);
            }
        });
        menuPanel.addMenu("Absensi Karyawan", "ic_pulse_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke AbsensiKaryawan
               changePanel(absensiKaryawan1);
            }
        });
        menuPanel.addMenu("Pengajuan Cuti", "ic_pulse_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke CutiKaryawan
               if(!cutiMasihDiReview()){
                changePanel(cutiKaryawan1);                   
               }else{
                   JOptionPane.showMessageDialog(null,
                           "Tidak dapat mengajukan cuti karena pengajuan cuti Anda sebelumnya masih direview",
                           "Peringatan",
                           JOptionPane.ERROR_MESSAGE);                 
               }
            }
        });
        menuPanel.addMenu("Riwayat Absensi", "ic_paper_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke AbsensiRiwayat
               changePanel(absensiRiwayat1);
            }
        });
        menuPanel.addMenu("Riwayat Cuti", "ic_paper_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke CutiRiwayat
            }
        });        
    }

    private void changePanel(JPanel panel){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.presence.component.PanelBorder();
        menuPanel = new com.presence.component.Menu();
        headerPanel1 = new com.presence.component.Header();
        mainPanel = new javax.swing.JPanel();
        welcomePanel2 = new com.presence.WelcomePanel();
        cutiKaryawan1 = new com.presence.CutiKaryawan();
        absensiKaryawan1 = new com.presence.AbsensiKaryawan();
        absensiRiwayat1 = new com.presence.AbsensiRiwayat();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presence - Sistem Absensi Karyawan");

        panelBorder1.setBackground(new java.awt.Color(244, 244, 244));

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(welcomePanel2, "card2");
        mainPanel.add(cutiKaryawan1, "card3");
        mainPanel.add(absensiKaryawan1, "card4");
        mainPanel.add(absensiRiwayat1, "card5");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(headerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageKaryawan().setVisible(true);
            }
        });
    }
    
    private boolean cutiMasihDiReview(){
        boolean status = false;
        try {
            Connection conn = new koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "select * from cuti where status=2 and user_id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userSession.getU_id());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                status = true;
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
        }        
        return status;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.presence.AbsensiKaryawan absensiKaryawan1;
    private com.presence.AbsensiRiwayat absensiRiwayat1;
    private com.presence.CutiKaryawan cutiKaryawan1;
    private com.presence.component.Header headerPanel1;
    private javax.swing.JPanel mainPanel;
    private com.presence.component.Menu menuPanel;
    private com.presence.component.PanelBorder panelBorder1;
    private com.presence.WelcomePanel welcomePanel2;
    // End of variables declaration//GEN-END:variables
}
