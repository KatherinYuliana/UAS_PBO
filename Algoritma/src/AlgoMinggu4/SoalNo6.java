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
public class SoalNo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan tinggi segitiga: ");
        int tinggi = scan.nextInt();
        System.out.println("Masukkan lebar persegi: ");
        int lebar = scan.nextInt();
        System.out.println("Masukkan tinggi persegi: ");
        int tinggi2 = scan.nextInt();
        int a = 0;
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) {
                System.out.print("*");
            }
            a++;
            System.out.println("");
        }
        
        for(int i = 1; i <= tinggi2; i++){
            for(int j = 1; j <= ((2 * tinggi - 1) - lebar) / 2 + 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
