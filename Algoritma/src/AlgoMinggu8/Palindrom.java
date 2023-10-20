/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String kata = scan.nextLine();
        String kata2 = "";
        int panjang = kata.length();
        
        for (int i = panjang - 1; i >= 0; i--) {
            kata2 = kata2 + kata.charAt(i);
        }
        
        if(kata.equals(kata2)){
            System.out.println("Palindrom");
        } else {
            System.out.println("Bukan Palindrom");
        }
    }
}
