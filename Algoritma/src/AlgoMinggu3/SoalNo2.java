/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo2 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai1 : ");
        double nilai1 = scan.nextDouble();
        System.out.println("Masukkan nilai2 : ");
        double nilai2 = scan.nextDouble();
        System.out.println("Masukkan nilai3 : ");
        double nilai3 = scan.nextDouble();
        System.out.println("Masukkan nilai4 : ");
        double nilai4 = scan.nextDouble();
        System.out.println("Masukkan nilai5 : ");
        double nilai5 = scan.nextDouble();
        
        double nilai = 0;
        
        if (nilai1 < nilai2 && nilai1 < nilai3 && nilai1 < nilai4 && nilai1 < nilai5) {
            nilai = (nilai2 + nilai3 + nilai4 + nilai5) / 4;
        }
        if (nilai2 < nilai3 && nilai2 < nilai4 && nilai2 < nilai5) {
            nilai = (nilai1 + nilai3 + nilai4 + nilai5) / 4;
        }
        if (nilai3 < nilai4 && nilai3 < nilai5) {
            nilai = (nilai1 + nilai2 + nilai4 + nilai5) / 4;
        }
        if (nilai4 < nilai5) {
            nilai = (nilai1 + nilai2 + nilai3 + nilai5) / 4;
        }
        if (nilai5 > nilai1 && nilai5 > nilai2 && nilai5 > nilai3 && nilai5 > nilai4) {
            nilai = (nilai1 + nilai2 + nilai3 + nilai4) / 4;
        }
        
        System.out.println("Nilai rata-rata" + nilai);
        
        if ( nilai >= 80 ) {
            System.out.println("NA = A ");
            System.out.println("INA = 4 ");
        }
        if ( nilai >= 76 && nilai < 80) {
            System.out.println("NA = A- ");
            System.out.println("INA = 3,7 ");
        }
        if ( nilai >= 72 && nilai < 76) {
            System.out.println("NA = B+ ");
            System.out.println("INA = 3,4 ");
        }
        if ( nilai >= 68 && nilai < 72) {
            System.out.println("NA = B ");
            System.out.println("INA = 3 ");
        }
        if ( nilai >= 64 && nilai < 68) {
            System.out.println("NA = B- ");
            System.out.println("INA = 2,7 ");
        }
        if ( nilai >= 60 && nilai < 64) {
            System.out.println("NA = C+ ");
            System.out.println("INA = 2,4 ");
        }
        if ( nilai >= 56 && nilai < 60) {
            System.out.println("NA = C ");
            System.out.println("INA = 2 ");
        }
        if ( nilai >= 41 && nilai < 56) {
            System.out.println("NA = D ");
            System.out.println("INA = 1 ");
        }
        if ( nilai < 41) {
            System.out.println("NA = E ");
            System.out.println("INA = 0 ");
        }
    }
}
