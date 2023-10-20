/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul7;

/**
 *
 * @author DELL
 */

class City{
    String nama, provinsi;
    double latitude, longtitude;
}
public class KatherinYuliana_1122041_Modul7_No1 {
    public static void kota(City kota){
        System.out.println("Nama kota: " + kota.nama);
        System.out.println("Provinsi : " + kota.provinsi);
        System.out.println("Latitude : " + kota.latitude);
        System.out.println("Longtitude : " + kota.longtitude);
    }
    public static void main(String[] args) {
        City kota = new City();
        kota.nama = "Bandung";
        kota.provinsi = "Jawa Barat";
        kota.latitude = -6.914;
        kota.longtitude = 107.608;
        kota(kota);
    }
}
