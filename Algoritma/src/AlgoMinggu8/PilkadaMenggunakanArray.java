/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PilkadaMenggunakanArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah pemilih : ");
        int n = scan.nextInt();
        int calon[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("masukkan nomor pilihan : ");
            calon[i] = scan.nextInt();
        }
        int pilihan = scan.nextInt();
        while(pilihan != 0){
            calon[pilihan - 1]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Calon "+calon[i]);
        }
    }
}
