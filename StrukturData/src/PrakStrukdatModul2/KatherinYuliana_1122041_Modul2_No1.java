/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Penerbangan {

    String nama;
    String tujuan;
    String kelas;
    int usia;
    int beratBagasi;
    int hargaTiket;
    int biayaBagasi;
}

public class KatherinYuliana_1122041_Modul2_No1 {

    public static void bacaData(Penerbangan penumpang[], int jumlah) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < jumlah; i++) {
            penumpang[i] = new Penerbangan();
            System.out.println("Masukkan nama : ");
            penumpang[i].nama = scan.next();
            System.out.println("Masukkan tujuan : ");
            penumpang[i].tujuan = scan.next();
            System.out.println("Masukkan kelas: ");
            penumpang[i].kelas = scan.next();
            System.out.println("Masukkan umur : ");
            penumpang[i].usia = scan.nextInt();
            System.out.println("Masukkan berat bagasi: ");
            penumpang[i].beratBagasi = scan.nextInt();
        }
    }

    public static double diskon(Penerbangan penumpang[], int jumlah) {
        double diskon = 0;
        for (int i = 0; i < jumlah; i++) {
            if (penumpang[i].usia <= 1 || penumpang[i].usia >= 60) {
                diskon = 0.5;
            } else {
                diskon = 0;
            }
        }
        return diskon;
    }

    public static double hargaTiket(Penerbangan penumpang[], int jumlah, double diskon) {
        double hargaTiket = 0;
        double totalHarga = 0;
        for (int i = 0; i < jumlah; i++) {
            if (penumpang[i].tujuan == "A") {
                if (penumpang[i].kelas == "Promo") {
                    hargaTiket = 310000;
                } else if (penumpang[i].kelas == "Ekonomi") {
                    hargaTiket = 400000;
                } else {
                    hargaTiket = 500000;
                }
            } else if (penumpang[i].tujuan == "B" || penumpang[i].tujuan == "C") {
                if (penumpang[i].kelas == "Promo") {
                    hargaTiket = 500000;
                } else if (penumpang[i].kelas == "Ekonomi") {
                    hargaTiket = 550000;
                } else {
                    hargaTiket = 620000;
                }
            } else if (penumpang[i].tujuan == "D" || penumpang[i].tujuan == "E") {
                if (penumpang[i].kelas == "Promo") {
                    hargaTiket = 620000;
                } else if (penumpang[i].kelas == "Ekonomi") {
                    hargaTiket = 700000;
                } else {
                    hargaTiket = 750000;
                }
            }

            if (diskon != 0) {
                totalHarga = hargaTiket * diskon;
            } else {
                totalHarga = hargaTiket;
            }
        }
        return totalHarga;
    }

    public static double biayaBagasi(Penerbangan penumpang[], int jumlah) {
        double biaya = 0;
        for (int i = 0; i < jumlah; i++) {
            if (penumpang[i].beratBagasi <= 15) {
                biaya = 45000;
            } else if (penumpang[i].beratBagasi <= 20) {
                biaya = 90000;
            } else {
                biaya = 120000;
            }
        }
        return biaya;
    }

    public static double bayar(double hargaTiket, double biayaBagasi) {
        double total = 0;
        total = hargaTiket + biayaBagasi;

        return total;
    }

    public static void tampilkanData(Penerbangan penumpang[], int jumlah, double hargaTiket, double biayaBagasi, double bayar) {
        System.out.println("DAFTAR PENUMPANG ELANG AIR");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("No.\t Nama\t Tujuan\t Usia\t Harga Tiket\t Biaya Bagasi\t Bayar");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t " + penumpang[i].nama + "\t " + penumpang[i].tujuan + "\t " + penumpang[i].usia + "\t " + hargaTiket + "\t \t " + biayaBagasi + "\t " + bayar);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                                         Total : " + (bayar + bayar));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Penerbangan penumpang[] = new Penerbangan[100];
        Penerbangan penumpang2 = new Penerbangan();

        System.out.println("Masukkan jumlah penumpang: ");
        int jumlah = scan.nextInt();

        bacaData(penumpang, jumlah);
        double diskon = diskon(penumpang, jumlah);
        double hargaTiket = hargaTiket(penumpang, jumlah, diskon);
        double biayaBagasi = biayaBagasi(penumpang, jumlah);
        double bayar = bayar(hargaTiket, biayaBagasi);

        tampilkanData(penumpang, jumlah, hargaTiket, biayaBagasi, bayar);
    }
}
