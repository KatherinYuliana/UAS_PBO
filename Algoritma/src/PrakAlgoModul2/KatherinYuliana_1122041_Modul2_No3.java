/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul2_No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nilai a : ");
        int a = scan.nextInt();
        System.out.println("Nilai b : ");
        int b = scan.nextInt();
        System.out.println("Nilai c : ");
        int c = scan.nextInt();
        
        if ((c*c) < (a*a) + (b*b)){
            System.out.println("Segitiga Lancip");
        }
        if ((c*c) > (a*a) + (b*b)){
            System.out.println("Segitiga Tumpul");
        }
        if ((c*c) == (a*a) + (b*b)){
            System.out.println("Segitiga Siku-siku");
        }
        
    }
}
