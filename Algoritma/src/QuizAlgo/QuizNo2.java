/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuizNo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan baris : ");
        int baris = scan.nextInt();
        int a = 0;
        
        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) {
                System.out.print("*");
            }
            for (int j = baris; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) {
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
}
