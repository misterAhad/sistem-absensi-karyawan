/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;
import java.sql.Time;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
/**
 *
 * @author adw-ahad
 */
public class absensi {
    private int id;
    private LocalDateTime waktu_masuk;
    private LocalDateTime waktu_keluar;
    private Date tanggal;
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getWaktu_masuk() {
        return waktu_masuk;
    }

    public void setWaktu_masuk(LocalDateTime waktu_masuk) {
        this.waktu_masuk = waktu_masuk;
    }

    public LocalDateTime getWaktu_keluar() {
        return waktu_keluar;
    }

    public void setWaktu_keluar(LocalDateTime waktu_keluar) {
        this.waktu_keluar = waktu_keluar;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
}
