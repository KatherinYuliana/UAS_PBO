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
public class NilaiArray {
    String nim, nama;
    double nilai[] = new double[9];  // 5 nilai quis, uts, uas, rkuis, nilaiakhir
    char nilMutu;

    public static double rataQuis(NilaiArray mahasiswa[], int jumlah) {
        double rQuis = 0;
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 5; j++) {
                rQuis = (mahasiswa[i].nilai[j]) / 5;
            }
        }
        return rQuis;
    }

    public static double angkaAkhir(double rataQuis, NilaiArray mahasiswa[], int jumlah) {
        double nilAkhir = 0;
        for (int i = 0; i < jumlah; i++) {
            nilAkhir = (rataQuis * 20 / 100) + (mahasiswa[i].nilai[5] * 30 / 100) + (mahasiswa[i].nilai[6] * 50 / 100);
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
        NilaiArray mahasiswa[] = new NilaiArray[jumlah];

        // baca data
        for (int i = 0; i < jumlah; i++) {
            mahasiswa[i] = new NilaiArray();
            System.out.println("Mahasiswa ke: " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Masukkan kuis " + (j + 1));
                mahasiswa[i].nilai[j] = scan.nextInt();
            }
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilai[5] = scan.nextDouble();
            System.out.println("Masukkan nilai uts: ");
            mahasiswa[i].nilai[6] = scan.nextInt();
        }
        
        double rataQuis = rataQuis(mahasiswa, jumlah);
        double angkaAkhir = angkaAkhir(rataQuis, mahasiswa, jumlah);
        
        // hitung
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 5; j++) {
                mahasiswa[i].nilai[j] = rataQuis(mahasiswa, jumlah);
            }
            mahasiswa[i].nilai[i] = angkaAkhir(rataQuis, mahasiswa, jumlah);
            mahasiswa[i].nilMutu = nilaiMutu(angkaAkhir);
        }
        
        //cetak hasil dalam bentuk tabel
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Rata2 nilai: " + "\t" + mahasiswa[i].nilai[j]);
            }
            System.out.println("Nilai akhir: " + "\t" + mahasiswa[i].nilai[i]);
            System.out.println("Nilai mutu: " + "\t" + mahasiswa[i].nilMutu);
        }
    }
}
