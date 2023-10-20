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
public class Penerbangan {
    String nama;
    int umur, tujuan, hargaTiket;
    double diskon, bayar;
    
    public static int hargaTiket(Penerbangan penumpang[], int jumlah){
        int hargaTiket = 0;
        for (int i = 0; i < jumlah; i++) {
            int tujuan  = penumpang[i].tujuan;
            if(tujuan == 1){
                hargaTiket = 280000;
            } else if(tujuan == 2){
                hargaTiket = 600000;
            } else if(tujuan == 3){
                hargaTiket = 215000;
            } else if(tujuan == 4){
                hargaTiket = 475000;
            } else {
                hargaTiket = 0;
            }
        }
        return hargaTiket;
    }
    
    public static double diskon(Penerbangan penumpang[], int jumlah){
        double diskon = 0;
        for (int i = 0; i < jumlah; i++) {
            int umur = penumpang[i].umur;
            if(umur <= 6){
                diskon = 0.5;
            } else if(umur <= 12){
                diskon = 0.25;
            } else if(umur <= 59){
                diskon = 0;
            } else {
                diskon = 0.5;
            }
        }
        return diskon;
    }
    
    public static double bayar(int hargaTiket, double diskon){
        double bayar = 0;
        if(diskon != 0){
            bayar = (hargaTiket * diskon);
        } else {
            bayar = hargaTiket;
        }
        return bayar;
    }
    
    public static void tampilkanData(int jumlah, Penerbangan penumpang[], int hargaTiket, double diskon, double bayar){
        System.out.println("Penjualan Tiket PT GAJAH TERBANG");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("No.\t Nama\t Umur\t Tujuan\t Harga Tiket\t Diskon\t Bayar");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t " + penumpang[i].nama + "\t " + penumpang[i].umur + "\t " + penumpang[i].tujuan + "\t " + hargaTiket + "\t \t " + diskon + "\t " + bayar);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                                         Total : " + (bayar + bayar));
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah penumpang: ");
        int jumlah = scan.nextInt();
        
        Penerbangan penumpang[] = new Penerbangan[jumlah];
        for (int i = 0; i < jumlah; i++) {
            penumpang[i] = new Penerbangan(); 
            System.out.println("Masukkan nama : ");
            penumpang[i].nama = scan.next();
            System.out.println("Masukkan umur : ");
            penumpang[i].umur = scan.nextInt();
            System.out.println("Masukkan nomor tujuan : ");
            penumpang[i].tujuan = scan.nextInt();
        }
        int hargaTiket = hargaTiket(penumpang, jumlah);
        double diskon = diskon(penumpang, jumlah);
        double bayar = bayar(hargaTiket, diskon);
        
        tampilkanData(jumlah, penumpang, hargaTiket, diskon, bayar);
    }
}
