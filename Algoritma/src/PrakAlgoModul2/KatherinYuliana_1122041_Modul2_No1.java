/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul2_No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka 1 : ");
        int angka1  = scan.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka2  = scan.nextInt();
        System.out.println("Masukkan angka 3 : ");
        int angka3  = scan.nextInt();
        
        if (angka1%2==0 && angka2%2==0){
            System.out.println("Dominan genap");
        }
        if (angka1%2==0 && angka3%2==0){
            System.out.println("Dominan genap");
        }
        if (angka2%2==0 && angka3%2==0){
            System.out.println("Dominan genap");
        }
        if (angka1%2 !=0 && angka2%2 !=0){
            System.out.println("Dominan ganjil");
        }
        if (angka1%2 !=0 && angka3%2 !=0){
            System.out.println("Dominan ganjil");
        }
        if (angka2%2 !=0 && angka3%2 !=0){
            System.out.println("Dominan ganjil");
        }
    }
}
