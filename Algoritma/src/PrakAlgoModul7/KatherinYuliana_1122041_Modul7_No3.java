/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Pasien {
    String nama, alamat, penyakit;
    int telepon, usia, gender;
    boolean bpjs;
}

public class KatherinYuliana_1122041_Modul7_No3 {
    public static void _input(Pasien pasien) {
        Scanner scan = new Scanner(System.in);
        pasien.bpjs = true;
        System.out.println("Nama: ");
        pasien.nama = scan.nextLine();
        System.out.println("Alamat: ");
        pasien.alamat = scan.nextLine();
        System.out.println("Telepon: ");
        pasien.telepon = scan.nextInt();
        System.out.println("Usia: ");
        pasien.usia = scan.nextInt();
        System.out.println("Gender (0 = pria, 1 = wanita): ");
        pasien.gender = scan.nextInt();
        System.out.println("Keluhan penyakit: ");
        pasien.penyakit = scan.next();
        System.out.println("BPJS? : ");
        pasien.bpjs = scan.nextBoolean();
    }

    public static int _umur(Pasien pasien, int x) {
        int umur = 0;
        if (pasien.usia < x) {
            umur = pasien.usia;
        }
        return umur;
    }

    public static String _nama(Pasien pasien, String y) {
        String nama = "";
        if (pasien.nama == y) {
            nama = pasien.nama;
        }
        return nama;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pasien pasien = new Pasien();

        String lanjut = "Ya";
        String arrPasien[] = new String[10];
        while (lanjut.equalsIgnoreCase("Ya")) {
            _input(pasien);
            System.out.println("Mau input lagi?");
            lanjut = scan.next();
        }
        System.out.println("Masukkan x: ");
        int x = scan.nextInt();
        System.out.println("Masukkan y: ");
        String y = scan.next();

        int umur = _umur(pasien, x);
        String nama = _nama(pasien, y);
        System.out.println(umur);
        System.out.println(nama);
    }
}
