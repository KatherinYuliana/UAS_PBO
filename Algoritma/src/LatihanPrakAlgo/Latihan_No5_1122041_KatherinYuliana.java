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
public class Latihan_No5_1122041_KatherinYuliana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = scan.nextInt();
        System.out.print("Masukkan kota asal : ");
        String kotaAsal = scan.next();
        System.out.print("Masukkan kota tujuan : ");
        String kotaTujuan = scan.next();
        System.out.print("Masukkan muatan bagasi : ");
        int muatan = scan.nextInt();
        System.out.print("Masukkan tipe tiket : ");
        String tipe = scan.next();

        int hargaTiket = 0;
        double harga = 0;
        double hargaBagasi = 0;

        if (kotaTujuan.equalsIgnoreCase("J") && kotaAsal.equalsIgnoreCase("B")) {
            if (tipe.equalsIgnoreCase("X")) {
                hargaTiket = 100;
            } else if (tipe.equalsIgnoreCase("Y")) {
                hargaTiket = 150;
            } else {
                System.out.println("Tiket tidak ditemukan");
            }
        } else if (kotaTujuan.equalsIgnoreCase("B") && kotaAsal.equalsIgnoreCase("S")) {
            if (tipe.equalsIgnoreCase("X")) {
                hargaTiket = 210;
            } else if (tipe.equalsIgnoreCase("Y")) {
                hargaTiket = 200;
            } else {
                System.out.println("Tiket tidak ditemukan");
            }
        } else if (kotaTujuan.equalsIgnoreCase("S") && kotaAsal.equalsIgnoreCase("M")) {
            if (tipe.equalsIgnoreCase("X")) {
                hargaTiket = 220;
            } else if (tipe.equalsIgnoreCase("Y")) {
                hargaTiket = 240;
            } else {
                System.out.println("Tiket tidak ditemukan");
            }
        } else {
            System.out.println("Keberangkatan tidak ada");
        }
        System.out.println("Harga Tiket : " + hargaTiket);

        if (umur <= 5) {
            harga = (hargaTiket * 50) / 100;
        } else if (umur <= 13) {
            harga = (hargaTiket * 20) / 100;
        } else if (umur <= 59) {
            harga = (hargaTiket * 0) / 100;
        } else {
            harga = (hargaTiket * 30) / 100;
        }

        if (harga != 0) {
            System.out.println("Harga tiket setelah pengecekan umur : " + harga);
        } else {
            System.out.println("Harga tiket setelah pengecekan umur : " + hargaTiket);
        }

        if (muatan < 20) {
            hargaBagasi = 50;
        } else if (muatan > 20 && umur >= 14 && umur <= 59) {
            hargaBagasi = 65;
        } else if (muatan > 20 && umur >= 0 && umur <= 13) {
            hargaBagasi = 65 * 90 / 100;
        } else if (muatan > 20 && umur >= 60) {
            hargaBagasi = 65 * 80 / 100;
        }

        if (harga != 0) {
            System.out.println("Harga total : " + (harga + hargaBagasi));
        } else {
            System.out.println("Harga total : " + (hargaTiket + hargaBagasi));
        }
    }
}
