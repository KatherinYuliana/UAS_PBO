/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul5_No3 {
    public static double _totalBayar (int harga, int jumlah, double ppn, double serviceCharge){
        
        double totalBayar = 0;
        totalBayar = (harga * jumlah) * ppn * serviceCharge;
        return totalBayar;
    }
    
    public static double _totalKeuntungan(double totalBayar){
         double biayaUtilitas = 0.1;
         double bayarPegawai = 0.15;
         double bahanBaku = 0.2;
         double totalKeuntungan = 0;
         totalKeuntungan = totalBayar * biayaUtilitas * bayarPegawai * bahanBaku;
         return totalKeuntungan;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nama: ");
        String nama = scan.next();
        int harga = 0;
        int jumlah = 0;
        double ppn = 0.11;
        double serviceCharge = 0.05;
       
        String pesanan = ""; 
        while(!pesanan.equals("-")){
            System.out.println("Masukkan pesanan : ");
            pesanan = scan.next();
            System.out.println("Masukkan harga: ");
            harga = scan.nextInt();
            System.out.println("Masukkan jumlah pesanan: ");
            jumlah = scan.nextInt();
        }
        System.out.println("Nama: " + nama);
        double totalBayar = _totalBayar (harga, jumlah, ppn, serviceCharge);
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("Total PPN: " + ppn);
        System.out.println("Total Service Charge: " + serviceCharge);
        double totalKeuntungan = _totalKeuntungan(totalBayar);
        System.out.println("Total Keuntungan: " + totalKeuntungan);
    }
}
