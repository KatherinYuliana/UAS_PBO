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
public class Permutasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Mengetahui berapa banyak cara menyusun buku
        
        int fak = 1;
        System.out.println("Masukkan jumlah buku: ");
        int jumlah = scan.nextInt();
        while (jumlah > 0) {
            fak = fak * jumlah;
            jumlah = jumlah - 1;
        }
        System.out.println("Hasil: " + fak + " cara");

    }
}
