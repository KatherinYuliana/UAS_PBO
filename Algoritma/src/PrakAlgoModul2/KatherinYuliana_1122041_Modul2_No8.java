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
public class KatherinYuliana_1122041_Modul2_No8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka 1 : ");
        double angka1 = scan.nextDouble();
        System.out.println("Masukkan operasi : ");
        String operasi = scan.next();
        System.out.println("Masukkan angka 2 : ");
        double angka2 = scan.nextDouble();
        double hasil = 0;
        
        switch (operasi){
            case "tambah":
                hasil = angka1 + angka2;
                break;
            case "kurang":
                hasil = angka1 - angka2;
                break;
            case "kali":
                hasil = angka1 * angka2;
                break;
            case "bagi":
                hasil = angka1 / angka2;
                break;
        }
        System.out.println("Hasil = " + hasil);
    }
}
