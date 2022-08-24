/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presence.common;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adw-ahad
 */
public class utilities {
    public static String getDayName(int day_of_week) {
        switch(day_of_week){
            case 1 -> {
                return "Minggu";
            }
            case 2 -> {
                return "Senin";
            }
            case 3 -> {
                return "Selasa";
            }
            case 4 -> {
                return "Rabu";
            }
            case 5 -> {
                return "Kamis";
            }
            case 6 -> {
                return "Jumat";
            }
            case 7 -> {
                return "Sabtu";
            }
            default -> {                
                return "";
            }            
        }
    } 
    public static String getMonthName(int month){
         switch(month){
            case 1 -> {
                return "Januari";
            }
            case 2 -> {
                return "Februari";
            }
            case 3 -> {
                return "Maret";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "Mei";
            }
            case 6 -> {
                return "Juni";
            }
            case 7 -> {
                return "Juli";
            }
            case 8 -> {
                return "Agustus";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "Oktober";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "Desember";
            }            
            default -> {                
                return "";
            }            
        }       
    }
    
    public static Window getVisibleWindow(){
        List<Window> visibleWindows = new ArrayList<Window>();
        for (Window w : Window.getWindows()) {
            if (w.isShowing()) {
                visibleWindows.add(w);
            }
        }
        return visibleWindows.get(0);    
    }
}
