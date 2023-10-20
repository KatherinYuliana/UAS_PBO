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
public class KatherinYuliana_1122041_Modul2_No6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Planet : ");
        String planet = scan.next();
        System.out.println("Planet 2 : ");
        String planet2 = scan.next();
        boolean mercury = true;
        boolean venus = false;
        boolean earth = true;
        boolean mars = false;
        int jarak = 0;
        
        if (mercury || venus){
            jarak = 108;
        }
        if (venus || earth){
            jarak = 162;
        }
        if (earth || mars){
            jarak = 225;
        }
        System.out.println("Total jarak : " + jarak);
    }
}
