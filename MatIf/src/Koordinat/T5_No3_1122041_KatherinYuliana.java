/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koordinat;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class T5_No3_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan x1: ");
        int x1 = scan.nextInt();
        System.out.println("Masukkan y1: ");
        int y1 = scan.nextInt();
        System.out.println("Masukkan x2: ");
        int x2 = scan.nextInt();
        System.out.println("Masukkan y2: ");
        int y2 = scan.nextInt();

        double hasil = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Hasil: " + hasil);
    }
}
