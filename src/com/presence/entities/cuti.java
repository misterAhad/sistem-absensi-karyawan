/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;

import java.util.Date;

/**
 *
 * @author adw-ahad
 */
public class cuti {
    private int id;
    private Date tanggal_mulai;
    private Date tanggal_berakhir;
    private String alasan;
    private int status;
    private Date tanggal_disetujui;
    private int user_id;
    private int penyetuju_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggal_mulai() {
        return tanggal_mulai;
    }

    public void setTanggal_mulai(Date tanggal_mulai) {
        this.tanggal_mulai = tanggal_mulai;
    }

    public Date getTanggal_berakhir() {
        return tanggal_berakhir;
    }

    public void setTanggal_berakhir(Date tanggal_berakhir) {
        this.tanggal_berakhir = tanggal_berakhir;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTanggal_disetujui() {
        return tanggal_disetujui;
    }

    public void setTanggal_disetujui(Date tanggal_disetujui) {
        this.tanggal_disetujui = tanggal_disetujui;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPenyetuju_id() {
        return penyetuju_id;
    }

    public void setPenyetuju_id(int penyetuju_id) {
        this.penyetuju_id = penyetuju_id;
    }
    
    
}
