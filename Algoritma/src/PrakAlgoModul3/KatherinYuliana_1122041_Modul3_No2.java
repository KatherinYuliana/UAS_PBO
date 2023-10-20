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
public class KatherinYuliana_1122041_Modul3_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Pemilih : ");
        int jumlah = scan.nextInt();
        int skor = 0;
        int sum = 0;
        int paslon = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan Jenis Pemilih : ");
            String jenis = scan.next();
            System.out.println("Masukkan Paslon Pilihan : ");
            paslon = scan.nextInt();

            switch (paslon) {
                case 1:
                    if (jenis.equalsIgnoreCase("Mahasiswa")) {
                        skor = 1;
                    } else {
                        skor = 5;
                    }
                    break;
                case 2:
                    if (jenis.equalsIgnoreCase("Mahasiswa")) {
                        skor = 1;
                    } else {
                        skor = 5;
                    }
                    break;
                case 3:
                    if (jenis.equalsIgnoreCase("Mahasiswa")) {
                        skor = 1;
                    } else {
                        skor = 5;
                    }
                    break;
            }
            sum = skor + sum;
        }
        System.out.println("Paslon pemenang adalah paslon " + paslon + " dengan skor " + sum);
    }
}
