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
public class StatistikAntarKota {
    public static int tolAsalTujuan(int asal, int tujuan, int tol[][][]){
        int tolAsalTujuan = 0;
        for (int i = 0; i < 3; i++) {
            tolAsalTujuan += tol[asal-1][tujuan-1][i];
        }
        return tolAsalTujuan;
    }
    
    public static int tolAsalGol(int asal, int gol, int tol[][][]){
        int tolAsalGol = 0;
        for (int i = 0; i < 5; i++) {
            tolAsalGol += tol[asal-1][i][gol-1];
        }
        return tolAsalGol;
    }
    
    public static int tolGol(int gol, int tol[][][]){
        int tolGol = 0;
        for (int i = 0; i < 5; i++) {
            tolGol += tol[i][i][gol-1];
        }
        return tolGol;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tol [][][] = 
        {
            {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},
                {4, 5, 6},
                {6, 7, 8}
            },
            {
                {9, 3, 4},
                {2, 9, 5},
                {4, 5, 6},
                {1, 4, 7},
                {0, 7, 8}
            },
            {
                {3, 1, 5},
                {1, 5, 6},
                {3, 6, 7},
                {6, 5, 8},
                {7, 0, 9}
            },
            {
                {7, 5, 6},
                {5, 6, 7},
                {6, 1, 8},
                {2, 8, 9},
                {8, 4, 1}
            },
            {
                {3, 6, 7},
                {6, 4, 8},
                {7, 8, 9},
                {8, 5, 0},
                {9, 1, 2}
            }
        };
        System.out.println("Masukkan asal: ");
        int asal = scan.nextInt();
        System.out.println("Masukkan tujuan: ");
        int tujuan = scan.nextInt();
        System.out.println("Masukkan golongan: ");
        int gol = scan.nextInt();
        
        int tolAsalTujuan = tolAsalTujuan(asal, tujuan, tol);
        int tolAsalGol = tolAsalGol(asal, gol, tol);
        int tolGol = tolGol(gol, tol);
        
        System.out.println("Kendaraan asal " + asal + ", tujuan " + tujuan + ", sejumlah " + tolAsalTujuan);
        System.out.println("Kendaraan asal " + asal + ", golongan " + gol + ", sejumlah " + tolAsalGol);
        System.out.println("Kendaraan golongan " + gol + ", sejumlah " + tolGol);
    }
}
