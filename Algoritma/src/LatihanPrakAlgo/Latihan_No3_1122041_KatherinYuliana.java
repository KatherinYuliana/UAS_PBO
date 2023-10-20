/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Latihan_No3_1122041_KatherinYuliana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angkaTebakan = 5;
        int tebak = 0;
        int skor = 8;
        String lanjut = "Ya";

        while (tebak != angkaTebakan && lanjut.equals("Ya")) {
            System.out.println("Masukkan angka tebakan : ");
            tebak = scan.nextInt();

            if (tebak == angkaTebakan) {
                System.out.println("Skor : " + skor);
            } else {
                skor = skor - 3;
                System.out.println("Skor : " + skor);
            }
            
            if (tebak != angkaTebakan) {
                System.out.println("Lanjut ? (Ya/Tidak) : ");
                lanjut = scan.next();
            }
        }

    }
}
