/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu4;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class SoalNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan lebar: ");
        int lebar = scan.nextInt();
        System.out.println("Masukkan tinggi: ");
        int tinggi = scan.nextInt();
        System.out.println("Masukkan tebal: ");
        int tebal = scan.nextInt();
        
        for(int i = 1; i <= tebal; i++){
            for(int j = 1; j <= lebar; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= tinggi - (2 * tebal); i++) {
            for (int j = 1; j <= tebal; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= lebar - (2 * tebal); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tebal; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= tebal; i++){
            for(int j = 1; j <= lebar; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
