/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul4_No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = 0;
        int max = 0;
        double rata = 0;
        double sum = 0;
        String input = "Y";
        
        while(input.equals("Y")){
            System.out.print("Input angka : ");
            angka = scan.nextInt();
            System.out.print("Masih mau input ? ");
            input = scan.next();
            max = Math.max(max, angka);
            sum = sum + angka;
            rata = sum / 3;
        }
        
        System.out.println("Nilai max : " + max);
        System.out.println("Nilai rata-rata : " + rata);
    }
}
