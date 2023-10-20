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
public class KatherinYuliana_1122041_Modul5_No6 {
    public static double d(int x1, int x2, int y1, int y2){
        double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Hasil : " + d);
        return d;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan x1 : ");
        int x1 = scan.nextInt();
        System.out.println("Masukkan y1 : ");
        int y1 = scan.nextInt();
        System.out.println("Masukkan x2 : ");
        int x2 = scan.nextInt();
        System.out.println("Masukkan y2 : ");
        int y2 = scan.nextInt();
        
        d(x1, x2, y1, y2);
    }
}
