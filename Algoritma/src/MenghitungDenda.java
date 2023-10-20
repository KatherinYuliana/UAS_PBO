
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenghitungDenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int denda = 0;
        System.out.print("Masukkan banyak pengunjung : ");
        int jumlah = scan.nextInt();
        
        while(i <= jumlah){
            System.out.print("Masukkan tanggal pinjam : ");
            int tanggalPinjam = scan.nextInt();
            System.out.print("Masukkan bulan pinjam : ");
            int bulanPinjam = scan.nextInt();
            System.out.print("Masukkan tanggal pengembalian : ");
            int tanggalKembali = scan.nextInt();
            System.out.print("Masukkan bulan pengembalian : ");
            int bulanKembali = scan.nextInt();
            System.out.print("Total buku yang dipinjam : ");
            int total = scan.nextInt();
            
            int hari = tanggalKembali - tanggalPinjam;
            
            if(total > 3){
                denda = 10000 * total;
            }
            if(hari > 7){
                denda = 5000 * hari;
            }
            System.out.println("Total denda : " + denda);
            i++;
        }
    }
}
