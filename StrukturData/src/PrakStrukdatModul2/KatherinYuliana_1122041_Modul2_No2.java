/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

class Makanan{
    int id;
    String air, roti, teh;
    int harga;
}

public class KatherinYuliana_1122041_Modul2_No2 {
    
    public static int airMineral(Makanan pesan){
        int hargaAir = 0;
        if(pesan.air == "Aqua"){
            hargaAir = 3000;
        } else {
            hargaAir = 2000;
        }
        
        return hargaAir;
    }
    
    public static int roti(Makanan pesan){
        int hargaRoti = 0;
        if(pesan.roti == "Sari roti"){
            hargaRoti = 15000;
        } else {
            hargaRoti = 12000;
        }
        
        return hargaRoti;
    }
    
    public static int tehKemasan(Makanan pesan){
        int hargaTeh = 0;
        if(pesan.teh == "Teh kotak"){
            hargaTeh = 4500;
        } else {
            hargaTeh = 6000;
        }
        
        return hargaTeh;
    }
    
    public static int total(int airMineral, int roti, int tehKemasan){
        int total = 0; 
        total = airMineral + roti + tehKemasan;
        
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Makanan pesan = new Makanan();
        
        System.out.println("Air Mineral: Aqua, Amidis \nRoti: Sari roti, Tosis \nTeh Kemasan: Teh kotak, Ichi ocha");
        System.out.println("Pilih merk air mineral: ");
        pesan.air = scan.nextLine();
        System.out.println("Pilih merk roti: ");
        pesan.roti = scan.nextLine();
        System.out.println("Pilih merk teh kemasan: ");
        pesan.teh = scan.nextLine();
        
        int airMineral = airMineral(pesan);
        int roti = roti(pesan);
        int tehKemasan = tehKemasan(pesan);
        int total = total(airMineral, roti, tehKemasan);
        
        System.out.println("Total: " + total);
    }
}
