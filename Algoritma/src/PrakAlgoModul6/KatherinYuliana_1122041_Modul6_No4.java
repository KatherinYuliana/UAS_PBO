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
public class KatherinYuliana_1122041_Modul6_No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah peserta: ");
        int jumlah = scan.nextInt();
        
        String nama[]= new String [jumlah];
        System.out.println(nama[1]);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan nama : ");
            nama[i] = scan.next();
        }
        System.out.println("Masukkan n : ");
        int n = scan.nextInt();
        System.out.println("Output: " + nama[n]);
    }
}
