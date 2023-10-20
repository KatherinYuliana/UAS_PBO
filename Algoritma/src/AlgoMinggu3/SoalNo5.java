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
public class SoalNo5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Produk yang mau dibeli : ");
        String produk = scan.next();
        
        System.out.println("Knight?");
        boolean knight = scan.nextBoolean();
        System.out.println("Windwalker?");
        boolean windwalker = scan.nextBoolean();
        
        System.out.println("Total produk : ");
        int n = scan.nextInt(); //n = total produk
        int zeny = 0;
        int bonus = 0;
       
        switch (produk) {
            case "Excallibur":
                if (knight && n % 3 == 0) {
                   zeny = n * 75000;
                   bonus = n / 3;
                } else if (knight) {
                    zeny = n * 75000;
                } else if (windwalker && n % 2 == 0) {
                    zeny = n * 70000 * 5 / 100;
                } else if (windwalker) {
                    zeny = n * 70000;
                } 
                break;
            case "BowOfLight":
                if (knight) {
                   zeny = n * 90000;
                } else if (windwalker && n % 2 == 0) {
                   zeny = n * 100000 * 5 / 100;
                } else if (windwalker) {
                   zeny = n * 100000;
                } 
                break;
            default :
                zeny = 0;
        }
        System.out.println("Total zeny : " + zeny);
        System.out.println("Total bonus : " + bonus);
    }
        
}
