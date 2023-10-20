/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Q1_No2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan baris : ");
        int baris = scan.nextInt();
        System.out.print("Masukkan nilai n : ");
        int n = scan.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = baris - 1; j >= i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= n; j++) {
                if (baris - n != 0){
                    System.out.print(j + " ");
                }
            }
            for (int j = 1; j <= n; j++) {
                if (n <= baris){
                    System.out.print(j + " ");
                } else {
                    if (i == baris && j == baris){
                        System.out.print("Hehe");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
