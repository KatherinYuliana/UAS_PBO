/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul6_No7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int jumlah = scan.nextInt();
        int max = 0;
        int min1 = 999;
        int min2 = 999;
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan angka: ");
            int angka = scan.nextInt();
            
            if(angka > max){
                max = angka;
            }
            
            if (angka < min1) {
                min2 = min1;
                min1 = angka;
            } else if (angka < min2) {
                min2 = angka;
            }
        }
        int selisihMax = max - min1;
        int selisihMin = min2 - min1;
        System.out.println("Selisih Maksimum: " + selisihMax);
        System.out.println("Selisih Minimum: " + selisihMin);
    }
}
