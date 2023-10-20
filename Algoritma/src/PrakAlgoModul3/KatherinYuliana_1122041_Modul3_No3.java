/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul3_No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //half pyramid
        System.out.println("Masukkan baris : ");
        int baris = scan.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        //inverted half pyramid
        System.out.println("Masukkan baris : ");
        int baris2 = scan.nextInt();

        for (int i = baris2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        //hollow half pyramid
        System.out.println("Masukkan baris : ");
        int baris3 = scan.nextInt();

        for (int i = 1; i <= baris3; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == baris3 || j == i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        
        //full pyramid
        System.out.println("Masukkan baris : ");
        int baris4 = scan.nextInt();
        int angka = 0;
        
        for (int i = 1; i <= baris4; i++) {
            for (int j = 1; j <= baris4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                angka++;
                System.out.print(angka + " ");
            }
            for (int j = 1; j < i; j++) {
                angka--;
                System.out.print(angka + " ");
            }
            System.out.println();
        }

        //hollow full pyramid
        System.out.println("Masukkan baris : ");
        int baris5 = scan.nextInt();

        for (int i = 1; i <= baris5; i++) {
            for (int j = baris5 - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == baris5 || j == i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        
        //hollow inverted half pyramid
        System.out.println("Masukkan baris : ");
        int baris6 = scan.nextInt();

        for (int i = 1; i <= baris6; i++) {
            for (int j = i; j <= baris6; j++) {
                if (i == 1) {
                    System.out.print(j + " ");
                } else if (j == i) {
                    System.out.print(i + " ");
                } else if (j == baris6) {
                    System.out.print(baris6 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
