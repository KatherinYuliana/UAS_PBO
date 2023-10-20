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
public class KatherinYuliana_1122041_Modul2_No7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan suhu : ");
        int suhu = scan.nextInt();
        
        if (suhu > 100){
            System.out.println("Air mendidih");
        }
        if (suhu >= 50 && suhu <= 99){
            System.out.println("Air hangat");
        }
        if (suhu >= 10 && suhu <= 49){
            System.out.println("Air normal");
        }
        if (suhu < 10){
            System.out.println("Air beku");
        }
    }
}
