/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author DELL
 */
public class DurasiWaktu {
    public static void main(String[] args) {
        // waktu awal : 9:20:10 ; waktu akhir : 10:20:10
        int jamAwal = 9;
        int menitAwal = 20;
        int detikAwal = 10;
        
        int jamAkhir = 10;
        int menitAkhir = 20;
        int detikAkhir = 10;
        
        detikAwal =  detikAwal + (jamAwal * 3600) + 
                (menitAwal * 60);
        
        detikAkhir = detikAkhir + (jamAkhir * 3600) + 
                (menitAkhir * 60);
        
        int selisihDetik = detikAkhir - detikAwal;
        
        int selisihJam = selisihDetik/3600;
        selisihDetik = selisihDetik%3600;
        int selisihMenit = selisihDetik/60;
        selisihDetik= selisihDetik%10;
        
        System.out.println("Selisih Durasi : " + selisihJam + " Jam" 
                + selisihMenit + " Menit" + selisihDetik + " Detik");
       
    }
}
