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
public class KatherinYuliana_1122041_Modul6_No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah nama: ");
        int jumlah = scan.nextInt();
        
        String nama [] = new String[jumlah];
        String nama2 = "";
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Masukkan nama : ");
            nama[i] = scan.next();
        }
        System.out.println("Input nama yang mau diganti : ");
        String ganti = scan.next();
        System.out.println("Input nama baru : ");
        String namaBaru = scan.next();
        String nama3 = "";
        for (int i = 0; i < nama.length; i++) {
            nama2 = nama[i];
            for (int j = 0; j < nama.length; j++) {
                if(nama2 == ganti){
                nama2 = namaBaru;
                }
            }
            System.out.println("hasil " + nama2);
        }
    }
}
