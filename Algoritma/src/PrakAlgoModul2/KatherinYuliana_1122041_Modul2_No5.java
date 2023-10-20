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
public class KatherinYuliana_1122041_Modul2_No5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jam : ");
        int jam = scan.nextInt();
        System.out.println("Menit : ");
        int menit = scan.nextInt();
        System.out.println("Jenis kendaraan : ");
        String kendaraan = scan.next();
        int tarif1jamMotor = 1500;
        int tarifNextMotor = 3000;
        int maxPerHariMotor = 10000;
        int tarif1jamMobil = 2000;
        int tarifNextMobil = 4000;
        int maxPerHariMobil = 25000;
        int bayar = 0;
        
        switch(kendaraan){
            case "Motor":
                bayar = tarif1jamMotor + (tarifNextMotor * jam) - tarifNextMotor;
                if (menit > 30){
                    bayar = bayar + tarifNextMotor;
                }
                if (bayar > maxPerHariMotor){
                    bayar = maxPerHariMotor;
                }
            break;
            case "Mobil":
                bayar = tarif1jamMobil + (tarifNextMobil * jam) - tarifNextMobil;
                if (menit > 30){
                    bayar = bayar + tarifNextMobil;
                }
                if (bayar > maxPerHariMobil){
                    bayar = maxPerHariMobil;
                }
            break;
        }
        System.out.println("Bayar : " + bayar);
    }
}
