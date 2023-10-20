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
public class KatherinYuliana_1122041_Modul6_No6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan input 1: ");
        String input1 = scan.next();
        System.out.println("Masukkan input 2: ");
        String input2 = scan.next();
        
        int kata1 = input1.length();
        int kata2 = input2.length();
        
        char huruf1 = input1.charAt(kata1);
        char huruf2 = input2.charAt(kata2);
        
        if(huruf1 == huruf2){
            System.out.println("Ada");
        } else {
            System.out.println("Tidak ada");
        }
    }
}
