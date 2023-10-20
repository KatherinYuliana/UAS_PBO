
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenentukanKelulusan {
    public static void main(String[] args) {
        // soal peter kurniawan
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlah = scan.nextInt();
        int rata = 0;
        int sum = 0;
        String status = "";
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan nilai mahasiswa : ");
            int nilai = scan.nextInt();
            sum = nilai + sum;
            rata = sum / jumlah;
        }
        if (rata >= 78){
            status = "lulus";
        } else {
            status = "tidak lulus";
        }
        System.out.println("Nilai rata - rata : " + rata);
        System.out.println("Status kelulusan : " + status);
    }
}
