/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TarifTolDalamKota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gol[] = new int[4];
        int totalKendaraan = 0;
        int totalPendapatan = 0;
        
        for (int i = 0; i < gol.length; i++) {
            gol[i] = 0;
        }
        int pendapatan[] = {10000, 15000, 15000, 17000};
        int pendapatan2 = 0;

        System.out.println("Masukkan nomor golongan: ");
        int golongan = scan.nextInt();

        while (golongan != 0) {
            gol[golongan - 1]++;
            System.out.println("Masukkan nomor golongan: ");
            golongan = scan.nextInt();
        }

        for (int i = 0; i < gol.length; i++) {
            pendapatan2 = gol[i] * pendapatan[i];
            totalKendaraan = totalKendaraan + gol[i];
            totalPendapatan = totalPendapatan + pendapatan2;
            System.out.println("Gol " + (i + 1) + "= " + gol[i] + " kendaraan, pendapatan = " + pendapatan2);
        }

        System.out.println("Total kendaraan: " + totalKendaraan + ", Total pendapatan: " + totalPendapatan);
    }
}
