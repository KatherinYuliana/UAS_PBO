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
public class KatherinYuliana_1122041_Modul5_No1 {
    public static void persegi(int sPersegi){
        int keliling = 4 * sPersegi;
        int luas = sPersegi * sPersegi;
        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);
    }
    
    public static void persegiPanjang(int p, int l){
        int keliling = 2 * (p + l);
        int luas = p * l;
        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);
    }
    
    public static void lingkaran(int r){
        double phi = 3.14;
        double keliling = 2 * phi * r;
        double luas = phi * Math.pow(r,2);
        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);
    }
    
    public static void segitiga(int sSegitiga, int a, int t){
        double keliling = sSegitiga + sSegitiga + sSegitiga;
        double luas = 1/2 * a * t;
        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bangun (persegi, persegi panjang, lingkaran, segitiga): ");
        String bangun = scan.nextLine();
        int sPersegi = 0;
        int p = 0;
        int l = 0;
        int r = 0;
        int sSegitiga = 0;
        int a = 0;
        int t = 0;
        
        switch(bangun){
            case "persegi":
                System.out.println("Masukkan panjang sisi : ");
                sPersegi = scan.nextInt();
                persegi(sPersegi);
                break;
            case "persegi panjang":
                System.out.println("Masukkan panjang : ");
                p = scan.nextInt();
                System.out.println("Masukkan lebar : ");
                l = scan.nextInt();
                persegiPanjang(p,l);
                break;
            case "lingkaran":
                System.out.println("Masukkan jari - jari : ");
                r = scan.nextInt();
                lingkaran(r);
                break;
            case "segitiga":
                System.out.println("Masukkan panjang sisi : ");
                sSegitiga = scan.nextInt();
                System.out.println("Masukkan alas : ");
                a = scan.nextInt();
                System.out.println("Masukkan tinggi : ");
                t = scan.nextInt();
                segitiga(sSegitiga, a, t);
                break;
        }
    }
}
