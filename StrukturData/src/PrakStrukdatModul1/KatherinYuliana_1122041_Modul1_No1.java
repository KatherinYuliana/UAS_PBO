/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Variabel {

    double sisi[] = new double[3];
    double panjang;
    double lebar;
    double alas;
    double tinggi;
    double diagonal1;
    double diagonal2;
    double jari;
    double keliling;
    double luas;
}

public class KatherinYuliana_1122041_Modul1_No1 {

    public static void persegi(Variabel bangun) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan sisi: ");
        bangun.sisi[0] = scan.nextDouble();

        bangun.keliling = 4 * bangun.sisi[0];
        bangun.luas = bangun.sisi[0] * bangun.sisi[0];

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void persegiPanjang(Variabel bangun) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        bangun.panjang = scan.nextDouble();
        System.out.println("Masukkan lebar: ");
        bangun.lebar = scan.nextDouble();

        bangun.keliling = 2 * (bangun.panjang + bangun.lebar);
        bangun.luas = bangun.panjang * bangun.lebar;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void jajaranGenjang(Variabel bangun) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        bangun.panjang = scan.nextDouble();
        System.out.println("Masukkan lebar: ");
        bangun.lebar = scan.nextDouble();
        System.out.println("Masukkan alas: ");
        bangun.alas = scan.nextDouble();
        System.out.println("Masukkan tinggi: ");
        bangun.tinggi = scan.nextDouble();

        bangun.keliling = 2 * (bangun.panjang + bangun.lebar);
        bangun.luas = bangun.alas * bangun.tinggi;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void trapesium(Variabel bangun) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan sisi " + (i + 1) + ": ");
            bangun.sisi[i] = scan.nextDouble();
        }
        System.out.println("Masukkan tinggi: ");
        bangun.tinggi = scan.nextDouble();

        bangun.keliling = bangun.sisi[0] + bangun.sisi[1] + bangun.sisi[2] + bangun.tinggi;
        bangun.luas = (bangun.sisi[0] + bangun.sisi[1]) * bangun.tinggi / 2;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void belahKetupat(Variabel bangun) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan sisi: ");
        bangun.sisi[0] = scan.nextDouble();
        System.out.println("Masukkan diagonal 1: ");
        bangun.diagonal1 = scan.nextDouble();
        System.out.println("Masukkan diagonal 2: ");
        bangun.diagonal2 = scan.nextDouble();

        bangun.keliling = 4 * bangun.sisi[0];
        bangun.luas = bangun.diagonal1 * bangun.diagonal2 / 2;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void layangLayang(Variabel bangun) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan panjang: ");
        bangun.panjang = scan.nextDouble();
        System.out.println("Masukkan lebar: ");
        bangun.lebar = scan.nextDouble();
        System.out.println("Masukkan diagonal 1: ");
        bangun.diagonal1 = scan.nextDouble();
        System.out.println("Masukkan diagonal 2: ");
        bangun.diagonal2 = scan.nextDouble();

        bangun.keliling = 2 * (bangun.panjang + bangun.lebar);
        bangun.luas = bangun.diagonal1 * bangun.diagonal2 / 2;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void segitiga(Variabel bangun) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan sisi " + (i + 1) + ": ");
            bangun.sisi[i] = scan.nextDouble();
        }
        System.out.println("Masukkan alas: ");
        bangun.alas = scan.nextDouble();
        System.out.println("Masukkan tinggi: ");
        bangun.tinggi = scan.nextDouble();

        bangun.keliling = bangun.sisi[0] + bangun.sisi[1] + bangun.alas;
        bangun.luas = bangun.alas * bangun.tinggi / 2;

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void lingkaran(Variabel bangun) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jari-jari: ");
        bangun.jari = scan.nextDouble();

        bangun.keliling = 2 * Math.PI * bangun.jari;
        bangun.luas = Math.PI * Math.pow(bangun.jari, 2);

        System.out.println("Keliling: " + bangun.keliling + " cm");
        System.out.println("Luas : " + bangun.luas + " cm");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Variabel bangun = new Variabel();

        System.out.println("Persegi, Persegi Panjang, Jajaran Genjang, Trapesium, Belah Ketupat, Layang-layang, Segitiga, Lingkaran");
        System.out.println("Masukkan nama bangun datar: ");
        String nama = scan.nextLine().toLowerCase();

        switch (nama) {
            case "persegi":
                persegi(bangun);
                break;
            case "persegi panjang":
                persegiPanjang(bangun);
                break;
            case "jajaran genjang":
                jajaranGenjang(bangun);
                break;
            case "trapesium":
                trapesium(bangun);
                break;
            case "belah ketupat":
                belahKetupat(bangun);
                break;
            case "layang-layang":
                layangLayang(bangun);
                break;
            case "segitiga":
                segitiga(bangun);
                break;
            case "lingkaran":
                lingkaran(bangun);
                break;
        }
    }
}
