/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul6_No8 {
    public static int _numCounter(int arrAngka[], int angkaCari){
        int angka = 0;
        int hasil = 0;
        for (int i = 0; i < arrAngka.length; i++) {
            angka = arrAngka[i];
            
            if(angkaCari == angka){
               hasil = hasil + angka;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka: ");
        int jumlah = scan.nextInt();
        int arrAngka[] = new int [jumlah];
        
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.println("Masukkan angka: ");
            arrAngka[i] = scan.nextInt();
           
        }
        System.out.println("Masukkan angka yang dicari: ");
        int angkaCari = scan.nextInt();
        
        int numCounter = _numCounter(arrAngka, angkaCari);
        System.out.println("Output: " + numCounter);
    }
}
