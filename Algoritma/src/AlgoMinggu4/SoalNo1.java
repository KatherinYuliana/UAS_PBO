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
public class SoalNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan N : ");
        int n = scan.nextInt();
        int sum = 0;
      
        for(int i = 1; i<=n; i ++){
            sum = (2*i - 1) + sum;
        }
        System.out.println("Total : " + sum);
    }
}
