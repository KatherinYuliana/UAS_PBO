/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul5_No5 {
    public static void phytagoras(int a, int b, int c){
        
        if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("Phytagoras");
        } else {
            System.out.println("Bukan Phytagoras");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai a : ");
        int a = scan.nextInt();
        System.out.println("Masukkan nilai b : ");
        int b = scan.nextInt();
        System.out.println("Masukkan nilai c : ");
        int c = scan.nextInt();
        
        phytagoras(a, b, c);
    }
}
