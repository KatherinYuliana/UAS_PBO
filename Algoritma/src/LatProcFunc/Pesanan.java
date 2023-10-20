/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatProcFunc;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pesanan {
    String nama;
    int menu, topping, banyak, ongkir;
    double harga[] = new double[3];

    public static double[] hargaMenu(Pesanan pembeli[], int jumlah) {
        double hargaMenu[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if (pembeli[i].menu == 1) {
                hargaMenu[i] = 20000;
            } else if (pembeli[i].menu == 2) {
                hargaMenu[i] = 30000;
            } else if (pembeli[i].menu == 3) {
                hargaMenu[i] = 35000;
            }
        }
        return hargaMenu;
    }

    public static double[] hargaTopping(Pesanan pembeli[], int jumlah) {
        double hargaTopping[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if (pembeli[i].topping == 1) {
                hargaTopping[i] = 5000;
            } else if (pembeli[i].topping == 2) {
                hargaTopping[i] = 6000;
            } else if (pembeli[i].topping == 3) {
                hargaTopping[i] = 4000;
            } else if (pembeli[i].topping == 4) {
                hargaTopping[i] = 7000;
            }
        }
        return hargaTopping;
    }
    
    public static double[] ongkir(Pesanan pembeli[], int jumlah){
        double ongkir[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if(pembeli[i].ongkir == 0){
                ongkir[i] = 0;
            } else if(pembeli[i].ongkir == 1){
                ongkir[i] = 7000;
            } else if(pembeli[i].ongkir == 2){
                ongkir[i] = 10000;
            }
        }
        return ongkir;
    }
    
    public static double[] total(Pesanan pembeli[], int jumlah, double hargaMenu[], double hargaTopping[], double ongkir[]){
        double total[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            total[i] = ((hargaMenu[i] + hargaTopping[i]) * pembeli[i].banyak) + ongkir[i];
        }
        return total;
    }

    public static void cetak(Pesanan pembeli[], int jumlah, double hargaMenu[], double hargaTopping[], double ongkir[], double total[]) {
        System.out.println("DAFTAR PESANAN HBFood");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("No. \t Nama \t Menu \t\t Topping \t Banyak \t Ongkir \t Total");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + " \t " + pembeli[i].nama + " \t " + hargaMenu[i] + " \t " + hargaTopping[i] + " \t " + pembeli[i].banyak + " \t\t " + ongkir[i] + " \t " + total[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah pembeli: ");
        int jumlah = scan.nextInt();

        Pesanan pembeli[] = new Pesanan[jumlah];
        for (int i = 0; i < jumlah; i++) {
            pembeli[i] = new Pesanan();
            System.out.println("Masukkan nama : ");
            pembeli[i].nama = scan.next();
            System.out.println("Masukkan menu : ");
            pembeli[i].menu = scan.nextInt();
            System.out.println("Masukkan topping : ");
            pembeli[i].topping = scan.nextInt();
            System.out.println("Masukkan banyak pesanan : ");
            pembeli[i].banyak = scan.nextInt();
            System.out.println("Masukkan zona : ");
            pembeli[i].ongkir = scan.nextInt();
        }

        double hargaMenu[] = hargaMenu(pembeli, jumlah);
        double hargaTopping[] = hargaTopping(pembeli, jumlah);
        double ongkir[] = ongkir(pembeli, jumlah);
        double total[] = total(pembeli, jumlah, hargaMenu, hargaTopping, ongkir);

        cetak(pembeli, jumlah, hargaMenu, hargaTopping, ongkir, total);
    }
}
