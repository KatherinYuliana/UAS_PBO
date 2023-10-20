/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul3_No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlah = scan.nextInt();
        int rata = 0;
        int sum = 0;
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan nilai mahasiswa : ");
            int nilai = scan.nextInt();
            sum = nilai + sum;
            rata = sum / jumlah;
        }
        System.out.println("Nilai rata - rata : " + rata);
    }
}
