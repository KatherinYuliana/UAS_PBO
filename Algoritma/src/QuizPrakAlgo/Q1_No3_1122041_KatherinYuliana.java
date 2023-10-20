/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Q1_No3_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jam (0-23) : ");
        int jam = scan.nextInt();
        System.out.print("Masukkan menit (0-59) : ");
        int menit = scan.nextInt();
        System.out.print("Masukkan detik (0-59) : ");
        int detik = scan.nextInt();
        System.out.println("Waktu sekarang : " + jam + " : " + menit + " : " + detik);
        
        System.out.println("1. Tambah Jam");
        System.out.println("2. Tambah Menit");
        System.out.println("3. Tambah Detik");
        System.out.println("4. Exit");
        System.out.println("Masukkan nomor menu : ");
        int menu = scan.nextInt();
        System.out.println("Input angka untuk ditambahkan : ");
        int angka = scan.nextInt();
        int hasil = 0;
        
        switch(menu){
            case 1:
                hasil = jam + angka;
                break;
            case 2:
                hasil = menit + angka;
                break;
            case 3:
                hasil = detik + angka;
                break;
            
        }
        System.out.println("Waktu sekarang : " + hasil + " : " + hasil + " : " + hasil);
    }
}
