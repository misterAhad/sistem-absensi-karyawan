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
public class vm_cuti {
    private int id;
    private Date tanggal_mulai;
    private Date tanggal_berakhir;
    private String alasan;
    private String nama_lengkap;
    private String nip;
    private String nama_jabatan;
    private int dept_id;
    private String nama_dept;
    private int status;

    public vm_cuti(int id, Date tanggal_mulai, Date tanggal_berakhir, String alasan, String nama_lengkap, String nip, String nama_jabatan, int dept_id, String nama_dept, int status) {
        this.id = id;
        this.tanggal_mulai = tanggal_mulai;
        this.tanggal_berakhir = tanggal_berakhir;
        this.alasan = alasan;
        this.nama_lengkap = nama_lengkap;
        this.nip = nip;
        this.nama_jabatan = nama_jabatan;
        this.dept_id = dept_id;
        this.nama_dept = nama_dept;
        this.status = status;
    }

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

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama_jabatan() {
        return nama_jabatan;
    }

    public void setNama_jabatan(String nama_jabatan) {
        this.nama_jabatan = nama_jabatan;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getNama_dept() {
        return nama_dept;
    }

    public void setNama_dept(String nama_dept) {
        this.nama_dept = nama_dept;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
