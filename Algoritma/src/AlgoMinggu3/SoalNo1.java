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
public class SoalNo1 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukkan tahun : ");
         int tahun = scan.nextInt();
         
         if (tahun % 400 == 0) {
             System.out.println("Tahun kabisat");
         }else if (tahun % 100 ==0) {
             System.out.println("Bukan tahun kabisat");
         }else if (tahun % 4 == 0) {
             System.out.println("Tahun kabisat");
         }else {
             System.out.println("Bukan tahun kabisat");
         }
     }
}
