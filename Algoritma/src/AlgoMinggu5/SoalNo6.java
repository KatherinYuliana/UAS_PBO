/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n : ");
        int n = scan.nextInt();
        double total = 0;
        double a = 1;
        double sum = 0;
        
        while (a <= n){
            if (n % 2 != 0){
                total += (1 / a);
            }
            else {
                total -= (1 / a);
            }
            sum = total + total;
            a++;
        }
        System.out.println(sum);
    }
}
