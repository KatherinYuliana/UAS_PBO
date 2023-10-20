/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizBareng;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int baris = 0;

        do {
            System.out.println("Masukkan baris: ");
            baris = scan.nextInt();
        } while (baris > 9 || baris < 2);
        do {

            System.out.println("Masukkan n: ");
            n = scan.nextInt();
        } while (n > baris);
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if(j < n){
                    System.out.print((j + 1) + "");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
