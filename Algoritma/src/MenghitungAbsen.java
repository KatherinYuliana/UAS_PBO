
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenghitungAbsen {
    public static void main(String[] args) {
        // soal dea nursyakinah
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = scan.nextInt();
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan keterangan (hadir/sakit/izin/alpha) : ");
            String keterangan = scan.next();
        }
    }
}
