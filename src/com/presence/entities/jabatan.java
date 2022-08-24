/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.entities;

/**
 *
 * @author adw-ahad
 */
public class jabatan {
    private int id;
    private String nama_jabatan;
    private int role;
    private int departemen_id;
    private String nama_level;
    private String nama_dept;

    public jabatan(int id, String nama_jabatan, int role, int departemen_id, String nama_level, String nama_dept) {
        this.id = id;
        this.nama_jabatan = nama_jabatan;
        this.role = role;
        this.departemen_id = departemen_id;
        this.nama_level = nama_level;
        this.nama_dept = nama_dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_jabatan() {
        return nama_jabatan;
    }

    public void setNama_jabatan(String nama_jabatan) {
        this.nama_jabatan = nama_jabatan;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getDepartemen_id() {
        return departemen_id;
    }

    public void setDepartemen_id(int departemen_id) {
        this.departemen_id = departemen_id;
    }

    public String getNama_level() {
        return nama_level;
    }

    public void setNama_level(String nama_level) {
        this.nama_level = nama_level;
    }

    public String getNama_dept() {
        return nama_dept;
    }

    public void setNama_dept(String nama_dept) {
        this.nama_dept = nama_dept;
    }
    
    
}
