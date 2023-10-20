/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo3 {
    public static int hargaTiket(int tujuan){
        int hargaTiket = 0;
        if(tujuan == 1){
            hargaTiket = 280000;
        } else if(tujuan == 2){
            hargaTiket = 600000;
        } else if(tujuan == 3){
            hargaTiket = 215000;
        } else if(tujuan == 4){
            hargaTiket = 475000;
        } else {
            hargaTiket = 0;
        }
        return hargaTiket;
    }
    
    public static double diskon(int umur){
        double diskon = 0;
        if(umur <= 6){
            diskon = 0.5;
        } else if(umur <= 12){
            diskon = 0.25;
        } else if(umur <= 59){
            diskon = 0;
        } else {
            diskon = 0.5;
        }
        return diskon;
    }
    
    public static double bayar(int hargaTiket, double diskon){
        double bayar = 0;
        if(diskon != 0){
            bayar = (hargaTiket * diskon);
        } else {
            bayar = hargaTiket;
        }
        return bayar;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nomor tujuan : ");
        int tujuan = scan.nextInt();
        System.out.println("Masukkan umur : ");
        int umur = scan.nextInt();
        
        int hargaTiket = hargaTiket(tujuan);
        double diskon = diskon(umur);
        double total = bayar(hargaTiket, diskon);
        
        System.out.println("Total harga : " + total);
    }
}
