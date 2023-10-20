/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul6_No5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan String 1: ");
        String kata1 = scan.next();
        System.out.println("Masukkan String 2: ");
        String kata2 = scan.next();
        
        String temp1 = "";
        String temp2 = "";
        int kataa1 = kata1.length();
        int kataa2 = kata2.length();
        int tanda = 0;
        
        for (int i = 0; i < kataa1; i++) {
            if (kata1.charAt(i) == ' ') {
                tanda = i;
                i = i + 1;
            }
            temp1 = temp1 + kata1.charAt(i);
        }
        temp1 = temp1.toLowerCase();

        for (int i = 0; i < kataa2; i++) {
            if (kata2.charAt(i) == ' ') {
                tanda = i;
                i = i + 1;
            }
            temp2 = temp2 + kata2.charAt(i);
        }
        temp2 = temp2.toLowerCase();
        
        String tempAhkir = temp2;
        for (int i = 0; i < temp1.length(); i++) {
            for (int j = 0; j < temp2.length(); j++) {
                if (temp1.charAt(i) == temp2.charAt(j)) {
                    tempAhkir  = tempAhkir.replace(temp1.charAt(i), '_');
                }
            }
        }
        System.out.println("Kata Akhir: " + tempAhkir);
    }
}
