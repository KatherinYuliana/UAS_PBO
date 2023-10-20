/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah yang diinginkan : ");
        int jumlah = scan.nextInt();
        
        int ganjil = 0;
        int sum = 0;
        
        while (sum < jumlah){
            if (ganjil % 2 != 0){
                sum = sum + ganjil;
                ganjil++;
            } else {
                ganjil++;
            }
        }
        System.out.println("Hasil jumlah bilangan ganjil : " + sum);
    }
}
