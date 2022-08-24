/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.common;

/**
 *
 * @author adw-ahad
 */
public class userSession {
    private static int id;
    private static String username;
    private static String nama_lengkap;
    private static int jabatan_id;
    private static int kelompok_absensi;
    private static String jabatan_name;

    public static int getU_id() {
        return id;
    }

    public static void setU_id(int u_id) {
        userSession.id = u_id;
    }

    public static String getU_username() {
        return username;
    }

    public static void setU_username(String u_username) {
        userSession.username = u_username;
    }

    public static String getU_namaLengkap() {
        return nama_lengkap;
    }

    public static void setU_namaLengkap(String u_namaLengkap) {
        userSession.nama_lengkap = u_namaLengkap;
    }

    public static int getU_jabatan() {
        return jabatan_id;
    }

    public static void setU_jabatan(int u_jabatan) {
        userSession.jabatan_id = u_jabatan;
    }

    public static int getU_kelompokAbsen() {
        return kelompok_absensi;
    }

    public static void setU_kelompokAbsen(int u_kelompokAbsen) {
        userSession.kelompok_absensi = u_kelompokAbsen;
    }    
    
    public static String getU_jabatanName(int j_id) {
        String jabatan_name = "";
        
        switch(j_id){
            case 1 -> jabatan_name = "Admin";
            case 2 -> jabatan_name = "HRD";
            case 3 -> jabatan_name = "Manager";
            case 4 -> jabatan_name = "Karyawan";
            default -> {
            }            
        }
        return jabatan_name;
    }    
}
