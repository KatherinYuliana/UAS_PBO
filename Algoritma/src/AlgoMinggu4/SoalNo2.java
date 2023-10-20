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
public class SoalNo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan N : ");
        int n = scan.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i+=2){
            System.out.print(i);
                sum = i + sum;
        }
        System.out.println(" Hasil : " + sum);
    }
}