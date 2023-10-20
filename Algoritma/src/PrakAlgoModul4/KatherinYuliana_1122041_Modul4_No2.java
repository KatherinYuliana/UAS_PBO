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
public class KatherinYuliana_1122041_Modul4_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = scan.nextInt();
        int i = 1;
        int bil = 0;
        
        while (i <= angka){
            bil = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    bil = bil + 1;
                }
            }
            if(bil == 2){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
