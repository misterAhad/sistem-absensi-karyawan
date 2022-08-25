/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adw-ahad
 */
public class koneksi {

    private Connection koneksi;
    private static Connection conn;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Konek");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Konek : " + ex);
        }

        String url = "jdbc:mysql://localhost/pv_absensi";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil konek database");
        } catch (SQLException ex) {
            System.out.println("Gagal konek: " + ex);
        }
        return koneksi;
    }

    public static Connection koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Konek");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Konek : " + ex);
        }

        String url = "jdbc:mysql://localhost/pv_absensi";
        try {
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil konek database");
        } catch (SQLException ex) {
            System.out.println("Gagal konek: " + ex);
        }
        return conn;
    }
}
