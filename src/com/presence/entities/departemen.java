/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;

/**
 *
 * @author adw-ahad
 */
public class departemen {
    private int id;
    private String nama_dept;
    private int perusahaan_id;
    private int kepala_id;
    
    private String nama_kepala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_dept() {
        return nama_dept;
    }

    public void setNama_dept(String nama_dept) {
        this.nama_dept = nama_dept;
    }

    public int getPerusahaan_id() {
        return perusahaan_id;
    }

    public void setPerusahaan_id(int perusahaan_id) {
        this.perusahaan_id = perusahaan_id;
    }

    public int getKepala_id() {
        return kepala_id;
    }

    public void setKepala_id(int kepala_id) {
        this.kepala_id = kepala_id;
    }

    public String getNama_kepala() {
        return nama_kepala;
    }

    public void setNama_kepala(String nama_kepala) {
        this.nama_kepala = nama_kepala;
    }
    
    public departemen(int id, String nama_dept, int perusahaan_id, int kepala_id, String nama_kepala) {
        this.id = id;
        this.nama_dept = nama_dept;
        this.perusahaan_id = perusahaan_id;
        this.kepala_id = kepala_id;
        this.nama_kepala = nama_kepala;
    }
}
