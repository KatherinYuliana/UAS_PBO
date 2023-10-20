/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Latihan_No2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan passing grade : ");
        int passingGrade = scan.nextInt();
        System.out.print("Masukkan jumlah soal : ");
        int jumlahSoal = scan.nextInt();
        System.out.print("Jumlah soal benar : ");
        int benar = scan.nextInt();
        System.out.print("Jumlah soal salah : ");
        int salah = scan.nextInt();
        double grade = 0.0;
        
        grade = (benar * 4 - salah * 1) * 100 / (jumlahSoal * 4);
        
        if(grade >= passingGrade){
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }
    }
}
