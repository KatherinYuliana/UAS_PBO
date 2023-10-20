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
public class QuizNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n : ");
        int n = scan.nextInt();
        System.out.println("Masukkan lebar : ");
        int lebar = scan.nextInt();
      
        
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= lebar; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = lebar; j >= 1; j--) {
                System.out.print(j); 
            }
            System.out.println();
        }
        
    }
}
