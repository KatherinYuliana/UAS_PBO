/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = scan.nextInt();
        String angkaString = String.valueOf(angka);
        int pangkat = angkaString.length();
        
        double temp = 0;
        int count = 0;
        while (count < pangkat) {
            int angkatemp = Integer.parseInt(angkaString.charAt(count) + "");
            temp = temp + Math.pow(angkatemp, pangkat);
            count++;
            System.out.println("angka temp" + angkatemp);
        }
        
        if (angka == temp){
            System.out.println("Bilangan Armstrong");
        } else {
            System.out.println("Bukan Bilangan Armstrong");
        }
    }
}
