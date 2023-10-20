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
public class NilaiTiga {
    String NIM, Nama;
    int nil1, nil2, nil3 , nil4, nil5, nilUTS, nilUAS;
    double rQuis, nilAkhir;
    char nilMutu;
   
    public static double rataQuis(int nil1, int nil2, int nil3, int nil4, int nil5){
        double rQuis = 0;
        if (nil1 < nil2 && nil1 < nil3 && nil1 < nil4 && nil1 < nil5) {
            rQuis = (nil2 + nil3 + nil4 + nil5) / 4;
        }
        if (nil2 < nil3 && nil2< nil4 && nil2 < nil5) {
            rQuis = (nil1 + nil3 + nil4 + nil5) / 4;
        }
        if (nil3< nil4 && nil3< nil5) {
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
    
    public static double angkaAkhir(double rataQuis, int nilUTS, int nilUAS){
        double nilAkhir = 0;
        nilAkhir = (rataQuis * 20 / 100) + (nilUTS * 30 / 100) + (nilUAS * 50 / 100);
        return nilAkhir;
    }
    
    public static char nilaiMutu(double angkaAkhir){
        char nilMutu = ' ';
        if (angkaAkhir >= 80 ) {
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
        NilaiTiga mahasiswa = new NilaiTiga();
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai kuis 1: ");
        mahasiswa.nil1= scan.nextInt();
        System.out.println("Masukkan nilai kuis 2: ");
        mahasiswa.nil2= scan.nextInt();
        System.out.println("Masukkan nilai kuis 3: ");
        mahasiswa.nil3= scan.nextInt();
        System.out.println("Masukkan nilai kuis 4: ");
        mahasiswa.nil4= scan.nextInt();
        System.out.println("Masukkan nilai kuis 5: ");
        mahasiswa.nil5= scan.nextInt();
        System.out.println("Masukkan nilai uts: ");
        mahasiswa.nilUTS = scan.nextInt();
        System.out.println("Masukkan nilai uts: ");
        mahasiswa.nilUAS = scan.nextInt();
       
        mahasiswa.rQuis = rataQuis(mahasiswa.nil1, mahasiswa.nil2, mahasiswa.nil3, mahasiswa.nil4, mahasiswa.nil5);
        System.out.println("Rata2 nilai: " + mahasiswa.rQuis);
        mahasiswa.nilAkhir = angkaAkhir(mahasiswa.rQuis, mahasiswa.nilUTS, mahasiswa.nilUAS);
        System.out.println("Nilai akhir: " + mahasiswa.nilAkhir);
        mahasiswa.nilMutu = nilaiMutu(mahasiswa.nilAkhir);
        System.out.println("Nilai mutu: " + mahasiswa.nilMutu);
    }
}
