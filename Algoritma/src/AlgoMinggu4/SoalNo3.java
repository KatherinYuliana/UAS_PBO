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
public class SoalNo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n : ");
        int n = scan.nextInt();
        
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= n; i++) {
            a = a + b;
            b = a - b;
            System.out.print(a + " ");
        }
    }
}
