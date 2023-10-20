/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pilkada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Pemilih : ");
        int jumlah = scan.nextInt();
        int pilihan = 0;
        int calon1 = 0;
        int calon2 = 0;
        int calon3 = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan Nomor Calon Pilihan : ");
            pilihan = scan.nextInt();
            
            if(pilihan == 1){
                calon1++;
            } else if(pilihan == 2){
                calon2++;
            } else if(pilihan == 3){
                calon3++;
            } else {
                System.out.println("Nomor calon salah");
            }
        }
        System.out.println("Calon 1 : " + calon1);
        System.out.println("Calon 2 : " + calon2);
        System.out.println("Calon 3 : " + calon3);
    }
}
