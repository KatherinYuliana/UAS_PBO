/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Exercise1 {
    String subjek[] = {"piano", "violin", "singing", "harp", "cello"};
    int usia;
    String kota[] = {"Bandung", "Jakarta", "Surabaya", "Makassar", "Bali"};
    
    String sis[][][] = new String [5][5][3];
    String sis2[][][] = new String [5][3][5];
    
    public static int jumlah(){
        
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercise1 siswa = new Exercise1();
        Exercise1 siswa2[][][] = new Exercise1[5][5][3];
        
        System.out.println("Masukkan usia: ");
        siswa.usia = scan.nextInt();
        System.out.println("Masukkan kota asal: ");
        siswa2[5][5][3].kota[5] = scan.next();
    }
}
