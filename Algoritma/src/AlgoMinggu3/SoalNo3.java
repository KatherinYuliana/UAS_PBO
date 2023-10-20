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
public class SoalNo3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan jam : ");
        double jam = scan.nextDouble();
        
        if (jam <= 1) {
            System.out.println("Tarif jam pertama : " + 2000);
        }
        else if (jam == 24) {
            System.out.println("Tarif max perhari : " + (2000 + (1500 * 24) - 1500));
        }
        else {
            System.out.println("Tarif jam berikutnya : " + (2000 + (1500 * jam) - 1500));
        }
    }
}
