/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Satuan {
    String satuan[] = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
}

public class Q2_1122041_KatherinYuliana_No1 {
    public static double hitung(double angka, String awal, String akhir) {
        double hasil = 0;
        if (awal == "km" && akhir == "hm") {
            hasil = angka * 10;
        } else if (awal == "km" && akhir == "dam") {
            hasil = angka * 100;
        } else if (awal == "km" && akhir == "m") {
            hasil = angka * 1000;
        } else if (awal == "km" && akhir == "dm") {
            hasil = angka * 10000;
        } else if (awal == "km" && akhir == "cm") {
            hasil = angka * 100000;
        } else if (awal == "km" && akhir == "mm"){
            hasil = angka * 1000000;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Satuan satuan[] = new Satuan[7];
        Scanner scan = new Scanner(System.in);
        String input = "Ya";
        while (input.equalsIgnoreCase("Ya")) {
            System.out.println("Masukkan angka: ");
            double angka = scan.nextInt();
            System.out.println("Masukkan satuan awal: ");
            String awal = scan.next();
            System.out.println("Masukkan satuan akhir: ");
            String akhir = scan.next();
            double hasil = hitung(angka, awal, akhir);
            System.out.println("Hasil : " + hasil);
            System.out.println("Masih mau input?");
            input = scan.next();
        }

    }
}
