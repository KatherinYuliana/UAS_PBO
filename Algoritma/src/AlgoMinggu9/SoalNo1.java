/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo1 {
    public static double angkaAkhir(int quis, int uts, int uas){
        double angkaAkhir = 0;
        angkaAkhir = (quis * 20 / 100) + (uts * 30 / 100) + (uas * 50 / 100);
        return angkaAkhir;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai quis : ");
        int quis = scan.nextInt();
        System.out.println("Masukkan nilai uts : ");
        int uts = scan.nextInt();
        System.out.println("Masukkan nilai uas : ");
        int uas = scan.nextInt();
        
        double nilaiAkhir = angkaAkhir(quis, uts, uas);
        System.out.println("Angka Akhir: " + nilaiAkhir);
    }
}
