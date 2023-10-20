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
public class NilaiLima {
    String nim, nama;
    int quis[] = new int[5];
    int nilUTS, nilUAS;
    double rQuis, nilAkhir;
    char nilMutu;

    public static double rataQuis(NilaiLima mahasiswa[], int jumlah) {
        double rQuis = 0;
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 5; j++) {
                rQuis = mahasiswa[i].quis[j] / 5;
            }
        }
        return rQuis;
    }

    public static double angkaAkhir(double rataQuis, NilaiLima mahasiswa[], int jumlah) {
        double nilAkhir = 0;
        for (int i = 0; i < jumlah; i++) {
            nilAkhir = (rataQuis * 20 / 100) + (mahasiswa[i].nilUTS * 30 / 100) + (mahasiswa[i].nilUAS * 50 / 100);
        }
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
        NilaiLima mahasiswa[] = new NilaiLima[jumlah];
        
        // baca data
        for (int i = 0; i < jumlah; i++) {
            mahasiswa[i] = new NilaiLima();
            System.out.println("Mahasiswa ke: " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Masukkan kuis " + (j + 1));
                mahasiswa[i].quis[j] = scan.nextInt();
            }
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilUTS = scan.nextInt();
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilUAS = scan.nextInt();
        }

        // hitung
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 5; j++) {
                mahasiswa[i].rQuis = rataQuis(mahasiswa, jumlah);
            }
            mahasiswa[i].nilAkhir = angkaAkhir(mahasiswa[i].rQuis, mahasiswa, mahasiswa[i].nilUAS);
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
