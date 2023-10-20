/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo8c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan lebar 1:");
        int lebar1 = scan.nextInt();
        System.out.println("Masukkan tinggi 1:");
        int tinggi1 = scan.nextInt();
        System.out.println("Masukkan lebar 2:");
        int lebar2 = scan.nextInt();
        System.out.println("Masukkan tinggi 2:");
        int tinggi2 = scan.nextInt();
       
        for (int i = 1; i <= lebar1; i++) {
            for (int j = 1; j <= tinggi1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= lebar2 - (lebar1 * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tinggi1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
       
        for(int i = 1; i <= tinggi2; i++){
            for(int j = 1; j <= lebar2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= lebar1; i++) {
            for (int j = 1; j <= tinggi1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= lebar2 - (lebar1 * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tinggi1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
