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
public class KatherinYuliana_1122041_Modul2_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jam Masuk : ");
        int jamMasuk = scan.nextInt();
        System.out.println("Menit Masuk : ");
        int menitMasuk = scan.nextInt();
        System.out.println("Jam Keluar : ");
        int jamKeluar = scan.nextInt();
        System.out.println("Menit Keluar : ");
        int menitKeluar = scan.nextInt();
        System.out.println("Status : ");
        String status = scan.next();
        
        int bayar = 0;
        int menit = menitKeluar - menitMasuk;
        int jam = jamKeluar - jamMasuk;
        
        switch(status){
            case "Umum":
                if (jam >= 1){
                    bayar = 3000 * jam;
                }
                else if (menit > 15){
                    bayar = 3000;
                }else {
                    bayar = 0;
                }
            break;
            case "Mahasiswa":
                if (jam >= 1){
                    bayar = 2000 * jam;
                }
                else if (menit > 15){
                    bayar = 2000;
                }else {
                    bayar = 0;
                }
            break;
        }
        System.out.println("Total jam : " + jam + " jam " + menit + " menit");
        System.out.println("Status : " + status);
        System.out.println("Bayar : " + bayar);
    }
}
