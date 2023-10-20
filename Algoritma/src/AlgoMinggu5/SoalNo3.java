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
public class SoalNo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = scan.nextInt();
        String angkaString = String.valueOf(angka);
        int count = angkaString.length();
        String temp = "";
        while(count > 0){
            temp = temp + angkaString.charAt(count - 1);
            count--;
        }
        System.out.println("Hasil : " + temp);
    }
}
