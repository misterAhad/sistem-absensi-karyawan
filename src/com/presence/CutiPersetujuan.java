/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.presence;

import com.presence.common.koneksi;
import com.presence.common.userSession;
import com.presence.common.utilities;
import com.presence.entities.departemen;
import com.presence.entities.vm_cuti;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adw-ahad
 */
public class CutiPersetujuan extends javax.swing.JPanel {

    /**
     * Creates new form PanelTemplate
     */
    private int managerDeptId = 0;
    public CutiPersetujuan() {
        initComponents();
        setOpaque(false);
        managerDeptId = getManagerDeptId();
        fillTableData();
        txtId.setVisible(false);
        
        
        //set button invisible at first load
        btnSetuju.setVisible(false);
        btnTolak.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListCuti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnSetuju = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnTolak = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNIP = new javax.swing.JLabel();
        lbNamaKaryawan = new javax.swing.JLabel();
        lbJabatan = new javax.swing.JLabel();
        lbTglSelesai = new javax.swing.JLabel();
        lbTglMulai = new javax.swing.JLabel();
        lbAlasan = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 244, 244));

        lbTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbTitle.setText("Persetujuan Cuti");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbListCuti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Karyawan", "Tanggal Mulai Cuti", "Tanggal Selesai Cuti"
            }
        ));
        tbListCuti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListCutiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListCuti);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("List Pengajuan Cuti");

        jPanel2.setBackground(new java.awt.Color(94, 162, 229));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detail Pengajuan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NIP");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nama Karyawan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Jabatan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tanggal Mulai Cuti");

        btnSetuju.setBackground(new java.awt.Color(45, 197, 112));
        btnSetuju.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetuju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetujuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetujuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSetujuMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Setuju");

        javax.swing.GroupLayout btnSetujuLayout = new javax.swing.GroupLayout(btnSetuju);
        btnSetuju.setLayout(btnSetujuLayout);
        btnSetujuLayout.setHorizontalGroup(
            btnSetujuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnSetujuLayout.setVerticalGroup(
            btnSetujuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        btnTolak.setBackground(new java.awt.Color(238, 95, 95));
        btnTolak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTolak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTolakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTolakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTolakMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tolak");

        javax.swing.GroupLayout btnTolakLayout = new javax.swing.GroupLayout(btnTolak);
        btnTolak.setLayout(btnTolakLayout);
        btnTolakLayout.setHorizontalGroup(
            btnTolakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnTolakLayout.setVerticalGroup(
            btnTolakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tanggal Selesai Cuti");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Alasan Cuti");

        lbNIP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNIP.setForeground(new java.awt.Color(0, 0, 102));
        lbNIP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNIP.setText("(Kosong)");

        lbNamaKaryawan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNamaKaryawan.setForeground(new java.awt.Color(0, 0, 102));
        lbNamaKaryawan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNamaKaryawan.setText("(Kosong)");

        lbJabatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbJabatan.setForeground(new java.awt.Color(0, 0, 102));
        lbJabatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbJabatan.setText("(Kosong)");

        lbTglSelesai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTglSelesai.setForeground(new java.awt.Color(0, 0, 102));
        lbTglSelesai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTglSelesai.setText("(Kosong)");

        lbTglMulai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTglMulai.setForeground(new java.awt.Color(0, 0, 102));
        lbTglMulai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTglMulai.setText("(Kosong)");

        lbAlasan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAlasan.setForeground(new java.awt.Color(0, 0, 102));
        lbAlasan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAlasan.setText("(Kosong)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNIP, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(lbNamaKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTglMulai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTglSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAlasan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnSetuju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTolak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbNIP))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbNamaKaryawan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbJabatan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTglMulai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbTglSelesai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbAlasan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSetuju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTolak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbListCutiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListCutiMouseClicked
        // TODO add your handling code here:
        int index = tbListCuti.getSelectedRow();
        fillDataField(index);
        
        btnSetuju.setVisible(true);
        btnTolak.setVisible(true);        
    }//GEN-LAST:event_tbListCutiMouseClicked

    private void btnSetujuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetujuMouseEntered
        // TODO add your handling code here:
        btnSetuju.setBackground(new Color(5, 168, 87));
    }//GEN-LAST:event_btnSetujuMouseEntered

    private void btnSetujuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetujuMouseExited
        // TODO add your handling code here:
        btnSetuju.setBackground(new Color(45,197,112));
    }//GEN-LAST:event_btnSetujuMouseExited

    private void btnTolakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTolakMouseEntered
        // TODO add your handling code here:
        btnTolak.setBackground(new Color(217, 87, 87));
    }//GEN-LAST:event_btnTolakMouseEntered

    private void btnTolakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTolakMouseExited
        // TODO add your handling code here:
        btnTolak.setBackground(new Color(238,95,95));
    }//GEN-LAST:event_btnTolakMouseExited

    private void btnSetujuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetujuMouseClicked
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(utilities.getVisibleWindow(), "Anda yakin untuk menyetujui cuti?", "Peringatan", dialogBtn);

        if (dialogResult == 0) {
            processCuti(1);
            clearAllFields();
            fillTableData();
        }      
    }//GEN-LAST:event_btnSetujuMouseClicked

    private void btnTolakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTolakMouseClicked
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(utilities.getVisibleWindow(), "Anda yakin untuk menolak cuti?", "Peringatan", dialogBtn);

        if (dialogResult == 0) {
            processCuti(0);
            clearAllFields();
            fillTableData();
        }              
    }//GEN-LAST:event_btnTolakMouseClicked

    private void processCuti(int response) {
        String id = txtId.getText();
        long timeNow = Calendar.getInstance().getTimeInMillis();
        java.sql.Timestamp ts = new java.sql.Timestamp(timeNow);        

        String updQuery = "update cuti SET status = ?, tanggal_disetujui= ?, penyetuju_id=? "
                + "WHERE id =" + id;
        try {
            Connection conn = new koneksi().connect();

            Statement st = conn.createStatement();
            PreparedStatement preparedStatement = conn.prepareStatement(updQuery);
            preparedStatement.setInt(1, response);
            preparedStatement.setTimestamp(2, ts);
            preparedStatement.setInt(3, userSession.getU_id());

            preparedStatement.executeUpdate();

            st.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    private void fillTableData() {
        ArrayList<vm_cuti> data = getDataPengajuanCuti();
        DefaultTableModel model = (DefaultTableModel) tbListCuti.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for (int i = 0; i < data.size(); i++) {
            row[0] = data.get(i).getId();
            row[1] = data.get(i).getNama_lengkap();
            row[2] = data.get(i).getTanggal_mulai();
            row[3] = data.get(i).getTanggal_berakhir();
            model.addRow(row);
        }        
    }
    
    private void fillDataField(int index) {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        
        int id = getDataPengajuanCuti().get(index).getId();
        txtId.setText(Integer.toString(id));
        lbNIP.setText(getDataPengajuanCuti().get(index).getNip());
        lbNamaKaryawan.setText(getDataPengajuanCuti().get(index).getNama_lengkap());
        lbJabatan.setText(getDataPengajuanCuti().get(index).getNama_jabatan());
        lbTglMulai.setText(s.format(getDataPengajuanCuti().get(index).getTanggal_mulai()));
        lbTglSelesai.setText(s.format(getDataPengajuanCuti().get(index).getTanggal_berakhir()));
         lbAlasan.setText(getDataPengajuanCuti().get(index).getAlasan());
    }       

    private ArrayList<vm_cuti> getDataPengajuanCuti() {
        ArrayList<vm_cuti> data = new ArrayList();
        try {
            Connection conn = new koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "SELECT c.id,c.tanggal_mulai,c.tanggal_berakhir,c.alasan, u.nama_lengkap, u.nip, j.nama_jabatan,d.id as dept_id, d.nama_dept, c.status FROM \n"
                    + "cuti c join users u on c.user_id = u.id\n"
                    + "join jabatan j on j.id = u.jabatan_id\n"
                    + "join departemen d on d.id = j.departemen_id "
                    + "WHERE c.status=2 and d.id=" + managerDeptId;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vm_cuti cuti = new vm_cuti(rs.getInt("id"), rs.getDate("tanggal_mulai"), rs.getDate("tanggal_berakhir"),
                        rs.getString("alasan"), rs.getString("nama_lengkap"), rs.getString("nip"),
                        rs.getString("nama_jabatan"), rs.getInt("dept_id"), rs.getString("nama_dept"), rs.getInt("status"));
                data.add(cuti);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }
    
    private int getManagerDeptId() {
        int dept_id = 0;
        try {
            Connection conn = new koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "SELECT j.departemen_id "
                    + "FROM users u join jabatan j ON u.jabatan_id = j.id "
                    + "WHERE u.id=" + userSession.getU_id();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                dept_id = rs.getInt("departemen_id");
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Gagal",
                        JOptionPane.ERROR_MESSAGE);
                    
        }
        return dept_id;
    }        
    
    private void clearAllFields() {
        txtId.setText(null);
        lbNIP.setText("(Kosong)");
        lbNamaKaryawan.setText("(Kosong)");
        lbJabatan.setText("(Kosong)");
        lbTglMulai.setText("(Kosong)");
        lbTglSelesai.setText("(Kosong)");
        lbAlasan.setText("(Kosong)");        
        btnSetuju.setVisible(false);
        btnTolak.setVisible(false);        
    }         

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSetuju;
    private javax.swing.JPanel btnTolak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbAlasan;
    private javax.swing.JLabel lbJabatan;
    private javax.swing.JLabel lbNIP;
    private javax.swing.JLabel lbNamaKaryawan;
    private javax.swing.JLabel lbTglMulai;
    private javax.swing.JLabel lbTglSelesai;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tbListCuti;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
