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
public class SoalNo4 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukkan tahun : ");
         int tahun = scan.nextInt();
         
         if (tahun % 400 == 0) {
             System.out.println("366 hari");
         }else if (tahun % 100 ==0) {
             System.out.println("365 hari");
         }else if (tahun % 4 == 0) {
             System.out.println("366 hari");
         }else {
             System.out.println("365 hari");
         }
         
         System.out.println("Masukkan bulan : ");
         String bulan = scan.next();
         
         switch (bulan){
             case "Januari":
                 System.out.println("31 hari");
                 break;
             case "Februari":
                 if (tahun % 4 == 0){
                     System.out.println("29 hari");
                 } else {
                     System.out.println("28 hari");
                 }
                 break;
             case "Maret":
                 System.out.println("31 hari");
                 break;
             case "April":
                 System.out.println("30 hari");
                 break;
             case "Mei":
                 System.out.println("31 hari");
                 break;
             case "Juni":
                 System.out.println("30 hari");
                 break;
             case "Juli":
                 System.out.println("31 hari");
                 break;
             case "Agustus":
                 System.out.println("31 hari");
                 break;
             case "September":
                 System.out.println("30 hari");
                 break;
             case "Oktober":
                 System.out.println("31 hari");
                 break;
             case "November":
                 System.out.println("30 hari");
                 break;
             case "Desember":
                 System.out.println("31 hari");
                 break;
         }
                 
     }
}
