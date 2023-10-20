/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul5_No7 {
    public static double _rata(int sum, int jumlah){
        double rata = 0;
        rata = sum / jumlah;
        return rata;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah: ");
        int jumlah = scan.nextInt();
        int angka = 0;
        int sum = 0;
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan angka: ");
            angka = scan.nextInt();
            sum = sum + angka;
        }
        double rata = _rata(sum, jumlah); 
        System.out.println("Nilai rata-rata: " + rata);
    }
}
