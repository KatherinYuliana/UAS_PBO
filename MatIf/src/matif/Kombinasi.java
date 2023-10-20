/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matif;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Kombinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Mengetahui berapa banyak cara menyusun menu makanan untuk makan siang
        
        int fak1, fak2, fak3;
        fak1 = fak2 = fak3 = 1;
        int hasil = 0;
        
        System.out.println("Masukkan berapa hari: ");
        int hari = scan.nextInt();
        System.out.println("Masukkan berapa kali makan : ");
        int kali = scan.nextInt();
        int a = hari - kali;
        
        while (hari > 0) {
            fak1 = fak1 * hari;
            hari = hari - 1;
        }
        while (kali > 0) {
            fak2 = fak2 * kali;
            kali = kali - 1;
        }
        while (a > 0) {
            fak3 = fak3 * a;
            a = a - 1;
        }
        
        hasil = fak1 / (fak2 * fak3);
        System.out.println("Hasil: " + hasil + " cara");
    }
}
