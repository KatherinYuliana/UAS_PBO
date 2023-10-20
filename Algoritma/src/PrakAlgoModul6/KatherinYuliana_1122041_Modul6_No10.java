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
public class KatherinYuliana_1122041_Modul6_No10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka : ");
        int jumlah = scan.nextInt();
        
        int arrAngka[] = new int [jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan angka : ");
            arrAngka[i] = scan.nextInt();
            System.out.println("Masukkan batas bawah : ");
            int bawah = scan.nextInt();
            System.out.println("Masukkan batas atas : ");
            int atas = scan.nextInt();
        }
        int angka = 0;
        for (int i = 0; i < jumlah; i++) {
            angka = arrAngka[i];
            
        }
        
    }
}
