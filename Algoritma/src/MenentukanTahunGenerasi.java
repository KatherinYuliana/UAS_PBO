
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenentukanTahunGenerasi {
    public static void main(String[] args) {
        // soal elliezer christian
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang : ");
        int jumlah = scan.nextInt();
        
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nama : ");
            String nama = scan.next();
             System.out.print("Masukkan tahun lahir : ");
            int tahun = scan.nextInt();
            
            if (tahun > 1944 && tahun <= 1964) {
                System.out.println(nama + " termasuk generasi Baby Boomer");
            } else if(tahun > 1964 && tahun <= 1979){
                System.out.println(nama + " termasuk generasi X");
            } else if(tahun >1979 && tahun <= 1994){
                System.out.println(nama + " termasuk generasi Y (Milenials)");
            } else if(tahun > 1994 && tahun <= 2015){
                System.out.println(nama + " termasuk generasi Z");
            } else {
                System.out.println("Tahun lahir diluar range yang tersedia");
            }
        }
    }
}
