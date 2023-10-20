/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Latihan_No1_1122041_KatherinYuliana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        int a = scan.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = scan.nextInt();
        System.out.print("Masukkan nilai c : ");
        int c = scan.nextInt();

        double d = 0;
        double x1 = 0;
        double x2 = 0;

        if (a != 0) {
            d = (Math.pow(b, 2)) - 4 * a * c;
            x1 = -b + (Math.sqrt(d)) / 2 * a;
            x2 = -b - (Math.sqrt(d)) / 2 * a;

            if (d < 0) {
                System.out.println("Nilai dari akar-akarnya tidak real");
            } else if (d > 0 && x1 != x2) {
                System.out.println("Nilai dari akar-akarnya real");
            } else if (d == 0 && x1 == x2) {
                System.out.println("Nilai dari akar-akarnya real");
            }
            
        } else {
            System.out.println("Nilai a tidak boleh 0");
        }
    }
}
