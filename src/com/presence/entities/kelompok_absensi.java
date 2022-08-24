/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;
import java.sql.Time;
/**
 *
 * @author adw-ahad
 */
public class kelompok_absensi {
    private int id;
    private String nama;
    private Time waktu_masuk;
    private Time waktu_keluar;

    public kelompok_absensi() {
    }
    

    public kelompok_absensi(int id, String nama, Time waktu_masuk, Time waktu_keluar) {
        this.id = id;
        this.nama = nama;
        this.waktu_masuk = waktu_masuk;
        this.waktu_keluar = waktu_keluar;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Time getWaktu_masuk() {
        return waktu_masuk;
    }

    public void setWaktu_masuk(Time waktu_masuk) {
        this.waktu_masuk = waktu_masuk;
    }

    public Time getWaktu_keluar() {
        return waktu_keluar;
    }

    public void setWaktu_keluar(Time waktu_keluar) {
        this.waktu_keluar = waktu_keluar;
    }
    
    
}
