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
public class KatherinYuliana_1122041_Modul5_No2 {
    public static double tambah(double angka1, double angka2){
        double total = 0;
        total = angka1 + angka2;
        return total;
    }
    
    public static double kali(double angka1, double angka2){
        double total = 0;
        total = angka1 * angka2;
        return total;
    }
    
    public static double bagi(double angka1, double angka2){
        double total = 0;
        total = angka1 / angka2;
        return total;
    }
    
    public static double mod(double angka1, double angka2){
        double total = 0;
        total = angka1 % angka2;
        return total;
    }
    
    public static double pangkat(double angka1, double angka2){
        double total = 0;
        total = Math.pow(angka1,angka2);
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka desimal 1: ");
        double angka1 = scan.nextDouble();
        System.out.println("Masukkan operasi: ");
        char operasi = scan.next().charAt(0);
        System.out.println("Masukkan angka desimal 2: ");
        double angka2 = scan.nextDouble();
        
        double hasil = 0;
        switch(operasi){
            case '+':
                hasil = tambah(angka1, angka2);
                System.out.println("hasil " + hasil);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                System.out.println("hasil " + hasil);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                System.out.println("hasil " + hasil);
                break;
            case '%':
                hasil = mod(angka1, angka2);
                System.out.println("hasil " + hasil);
                break;
            case '^':
                hasil = pangkat(angka1, angka2);
                System.out.println("hasil " + hasil);
                break;
        }
    }
}
