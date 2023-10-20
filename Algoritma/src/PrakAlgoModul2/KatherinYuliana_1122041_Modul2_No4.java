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
public class KatherinYuliana_1122041_Modul2_No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jenis Kamar : ");
        String jenis = scan.next();
        System.out.println("Lama Inap : ");
        int lama = scan.nextInt();
        System.out.println("Harga Kamar");
        int harga = scan.nextInt();
        double pajak = 0;
        
        switch (jenis){
            case "Deluxe":
                pajak = 8 / 100;
                break;
            case "Executive":
                pajak = 12 / 100;
                break;
            case "Suite":
                pajak = 18 /100;
                break;
        }
        System.out.println("Total : " + ((lama * harga)+ pajak));
    }
}
