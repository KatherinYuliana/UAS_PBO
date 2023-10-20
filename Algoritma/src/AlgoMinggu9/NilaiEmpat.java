/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NilaiEmpat {

    int nil1, nil2, nil3, nil4, nil5, nilUTS, nilUAS;
    double rQuis, nilAkhir;
    char nilMutu;

    public static double rataQuis(int nil1, int nil2, int nil3, int nil4, int nil5) {
        double rQuis = 0;
        if (nil1 < nil2 && nil1 < nil3 && nil1 < nil4 && nil1 < nil5) {
            rQuis = (nil2 + nil3 + nil4 + nil5) / 4;
        }
        if (nil2 < nil3 && nil2 < nil4 && nil2 < nil5) {
            rQuis = (nil1 + nil3 + nil4 + nil5) / 4;
        }
        if (nil3 < nil4 && nil3 < nil5) {
            rQuis = (nil1 + nil2 + nil4 + nil5) / 4;
        }
        if (nil4 < nil5) {
            rQuis = (nil1 + nil2 + nil3 + nil5) / 4;
        }
        if (nil5 > nil1 && nil5 > nil2 && nil5 > nil3 && nil5 > nil4) {
            rQuis = (nil1 + nil2 + nil3 + nil4) / 4;
        }
        return rQuis;
    }

    public static double angkaAkhir(double rataQuis, int nilUTS, int nilUAS) {
        double nilAkhir = 0;
        nilAkhir = (rataQuis * 20 / 100) + (nilUTS * 30 / 100) + (nilUAS * 50 / 100);
        return nilAkhir;
    }

    public static char nilaiMutu(double angkaAkhir) {
        char nilMutu = ' ';
        if (angkaAkhir >= 80) {
            nilMutu = 'A';
        } else if (angkaAkhir >= 68) {
            nilMutu = 'B';
        } else if (angkaAkhir >= 56) {
            nilMutu = 'C';
        } else if (angkaAkhir >= 41) {
            nilMutu = 'D';
        } else {
            nilMutu = 'E';
        }
        return nilMutu;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = scan.nextInt();

        // deklarasi array of struct
        NilaiEmpat mahasiswa[] = new NilaiEmpat[jumlah];

        // baca data
        for (int i = 0; i < jumlah; i++) {
            mahasiswa[i] = new NilaiEmpat();
            System.out.println("Mahasiswa ke: " + (i + 1));
            System.out.println("Masukkan nilai kuis 1: ");
            mahasiswa[i].nil1 = scan.nextInt();
            System.out.println("Masukkan nilai kuis 2: ");
            mahasiswa[i].nil2 = scan.nextInt();
            System.out.println("Masukkan nilai kuis 3: ");
            mahasiswa[i].nil3 = scan.nextInt();
            System.out.println("Masukkan nilai kuis 4: ");
            mahasiswa[i].nil4 = scan.nextInt();
            System.out.println("Masukkan nilai kuis 5: ");
            mahasiswa[i].nil5 = scan.nextInt();
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilUTS = scan.nextInt();
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilUAS = scan.nextInt();
        }

        // hitung
        for (int i = 0; i < jumlah; i++) {
            mahasiswa[i].rQuis = rataQuis(mahasiswa[i].nil1, mahasiswa[i].nil2, mahasiswa[i].nil3, mahasiswa[i].nil4, mahasiswa[i].nil5);
            mahasiswa[i].nilAkhir = angkaAkhir(mahasiswa[i].rQuis, mahasiswa[i].nilUTS, mahasiswa[i].nilUAS);
            mahasiswa[i].nilMutu = nilaiMutu(mahasiswa[i].nilAkhir);
        }

        //cetak hasil dalam bentuk tabel
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Rata2 nilai: " + "\t" + mahasiswa[i].rQuis);
            System.out.println("Nilai akhir: " + "\t" + mahasiswa[i].nilAkhir);
            System.out.println("Nilai mutu: " + "\t" + mahasiswa[i].nilMutu);
        }
    }
}
