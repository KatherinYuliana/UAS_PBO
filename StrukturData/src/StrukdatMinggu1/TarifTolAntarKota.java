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
public class TarifTolAntarKota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //jumlah kendaraan
        int jumlah[][] = new int[4][5];
        System.out.println("Masukkan asal: ");
        int asal = scan.nextInt();
        System.out.println("Masukkan nomor golongan: ");
        int golongan = scan.nextInt();
        
        while (asal != 0 && golongan != 0) {
            jumlah[asal-1][golongan - 1]++;
            System.out.println("Masukkan asal: ");
            asal = scan.nextInt();
            System.out.println("Masukkan nomor golongan: ");
            golongan = scan.nextInt();
        }
        
        System.out.println("Kendaraan \tGol 1 \t Gol2 \tGol3 \tGol4 \tGol5");
        for (int i = 0; i < jumlah.length; i++) {
            System.out.print("Asal " + (i+1));
            for (int j = 0; j < 5; j++) {
                System.out.print("  \t" + jumlah[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //pendapatan
        int pendapatan[][] = {{13500, 21500, 27000, 34000, 41000}, {9500, 15500, 19000, 24000, 29000}, {8000, 14000, 17500, 22000, 26500}, {7000, 13000, 15500, 19500, 25500}};
        int pendapatan2 = 0;
        int total = 0;
        
        System.out.println("Pendapatan \tGol 1 \t Gol2 \tGol3 \tGol4 \tGol5");
        for (int i = 0; i < jumlah.length; i++) {
            System.out.print("Asal " + (i+1));
            for (int j = 0; j < 5; j++) {
                pendapatan2 = jumlah[i][j] * pendapatan[i][j];
                total = total + pendapatan2;
                System.out.print("  \t" + pendapatan2);
            }
            System.out.println("");
        }
        System.out.println("Total: " + total);
    }
}
