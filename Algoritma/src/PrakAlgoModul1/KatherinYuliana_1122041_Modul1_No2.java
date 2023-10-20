/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul1_No2 {
    public static void main(String[] args) {
        int usia;
        boolean sudahMenikah = true;
        boolean belumMenikah = false;
        double penghasilan = 12.5;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama : ");
        String nama = scan.next();
        
        System.out.println("Alamat : ");
        String alamat = scan.next();
        
        System.out.println("Telepon : ");
        String telepon = scan.next();
        
        System.out.println("Gender : ");
        String gender = scan.next();
        
        System.out.println("Usia : ");
        usia = scan.nextInt();
        
        System.out.println("Status Menikah : ");
        belumMenikah = scan.hasNext();
        
        System.out.println("Penghasilan : " + penghasilan);
        
        System.out.println("Nama saya " + nama + ", seorang " + gender + 
                " tinggal di " + alamat + ", dan Telepon " + telepon + 
                ". Tahun ini usia saya " + usia + ", " + belumMenikah + 
                ", dan Penghasilan saya " + penghasilan);
    }
}
