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
public class KatherinYuliana_1122041_No3 {
    public static double _totalBelanja(boolean anggota, double total) {
        double diskon = 0;
        double totalBelanja = 0;
        if (anggota) {
            if (total > 500000) {
                diskon = 0.2 * total;
                if (diskon > 80000) {
                    diskon = 80000;
                }
            } else if (total > 300000) {
                diskon = 0.15 * total;
                if (diskon > 50000) {
                    diskon = 50000;
                }
            } else if (total > 100000) {
                diskon = 0.1 * total;
                if (diskon > 15000) {
                    diskon = 15000;
                }
            }
        } else {
            if (total > 100000) {
                diskon = 0.05 * total;
                if (diskon > 10000) {
                    diskon = 10000;
                }
            }
        }
        totalBelanja = total - diskon;
        return totalBelanja;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String belanja = "Ya";
        boolean anggota = true;
        while (belanja.equalsIgnoreCase("Ya")) {
            System.out.println("Apakah anggota?(ya/tidak): ");
            anggota = scan.nextBoolean();
            System.out.println("Masukkan total belanja: ");
            double total = scan.nextDouble();

            double totalBelanja = _totalBelanja(anggota, total);
            System.out.println("Total Belanja: " + totalBelanja);
            System.out.println("Apakah mau belanja lagi?");
            belanja = scan.next();
        }
    }
}
