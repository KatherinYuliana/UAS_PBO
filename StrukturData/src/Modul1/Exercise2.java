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
public class Exercise2 {
    int tahunTerbit;
    String keadaanBuku;
    String subjekBuku;
    int jumlahBuku = 10;
    
    public static void total(String subjekBuku, int jumlahBuku){
        int jumlahFiksi = 0;
        int jumlahNonfiksi = 0;
        int jumlahOnline = 0;
        
        for (int i = 0; i < jumlahBuku; i++) {
            if(subjekBuku == "fiksi"){
                jumlahFiksi += 1;
            } else if(subjekBuku == "nonfiksi"){
                jumlahNonfiksi +=1;
            } else {
                jumlahOnline +=1;
            }
        }
        
        System.out.println("Jumlah Buku Fiksi: " + jumlahFiksi);
        System.out.println("Jumlah Buku Nonfiksi: " + jumlahNonfiksi);
        System.out.println("Jumlah Koleksi Online: " + jumlahOnline);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        String buku[][] = new String[3][3];
        
        
        System.out.println("Masukkan tahun terbit: ");
        System.out.println("Masukkan subjek buku: ");
        
    }
}
