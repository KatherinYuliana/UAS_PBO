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
class Pesanan {
    int noMenu, banyak;
}

class TamuRestoran {
    int noMeja;
    Pesanan pesan = new Pesanan();
}

public class KatherinYuliana_1122041_Modul7_No4 {
    public static int _bayar(TamuRestoran tamu[], int jumlah) {
        int bayar = 0;
        for (int i = 0; i < jumlah; i++) {

            if (tamu[i].pesan.noMenu == 1) {
                bayar = 22000 * tamu[i].pesan.banyak;
            } else if (tamu[i].pesan.noMenu == 2) {
                bayar = 15000 * tamu[i].pesan.banyak;
            } else if (tamu[i].pesan.noMenu == 3) {
                bayar = 30000 * tamu[i].pesan.banyak;
            } else if (tamu[i].pesan.noMenu == 4) {
                bayar = 10000 * tamu[i].pesan.banyak;
            } else if (tamu[i].pesan.noMenu == 5) {
                bayar = 8000 * tamu[i].pesan.banyak;
            }
        }
        return bayar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah tamu: ");
        int jumlah = scan.nextInt();
        Pesanan pesan = new Pesanan();
        TamuRestoran tamu[] = new TamuRestoran[jumlah];

        for (int i = 0; i < jumlah; i++) {
            tamu[i] = new TamuRestoran();
            System.out.println("Masukkan no meja: ");
            tamu[i].noMeja = scan.nextInt();
            System.out.println("Masukkan no menu: ");
            tamu[i].pesan.noMenu = scan.nextInt();
            System.out.println("Masukkan banyak: ");
            tamu[i].pesan.banyak = scan.nextInt();
        }

        int bayar = _bayar(tamu, jumlah);
        System.out.println("Total bayar: " + bayar);
    }
}
