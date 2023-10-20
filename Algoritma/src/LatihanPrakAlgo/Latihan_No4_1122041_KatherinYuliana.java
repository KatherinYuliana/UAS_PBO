/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Latihan_No4_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // a.
        System.out.println("Masukkan n : ");
        int n1 = scan.nextInt();
        
        for (int i = 1; i <= n1; i++) {
            for (int j = n1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        // b.
        System.out.println("Masukkan n : ");
        int n2 = scan.nextInt();
        
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= n2 - 2; i++) {
            System.out.print("*");
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
