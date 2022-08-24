/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;

import java.sql.Date;

/**
 *
 * @author adw-ahad
 */
public class users {
    public int id;
    public String username;
    public String nama_lengkap;
    public String password;
    public String email;
    public String telepon;
    public String nik;
    public Date tanggal_lahir;
    public Date tanggal_bergabung;
    public int aktif;
    public String nip;
    public int jabatan_id;
    public int kelompok_absensi_id;
    
    public String status_nama;
    public String nama_jabatan;
    public String nama_shift;
    
    public users(){
        //do nothing lol
    }
    
    public users(int id, String username, String nama_lengkap, String password, String email, Date tanggal_lahir, Date tanggal_bergabung, int aktif, String nip, int jabatan_id, int kelompok_absensi_id, String status_nama, String nama_jabatan, String nama_shift) {
        this.id = id;
        this.username = username;
        this.nama_lengkap = nama_lengkap;
        this.password = password;
        this.email = email;
        this.tanggal_lahir = tanggal_lahir;
        this.tanggal_bergabung = tanggal_bergabung;
        this.aktif = aktif;
        this.nip = nip;
        this.jabatan_id = jabatan_id;
        this.kelompok_absensi_id = kelompok_absensi_id;
        this.status_nama = status_nama;
        this.nama_jabatan = nama_jabatan;
        this.nama_shift = nama_shift;
    }
    
    
    
    //notmapped
    public int role_level;
}
