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
public class RevisiSoalNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = scan.nextInt();
        int num = 0;
        int temp = 0;
        int total = 0;

        num = angka;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == angka) {
            System.out.println("Bilangan Armstrong");
        } else {
            System.out.println("Bukan Bilangan Armstrong");
        }
    }
}
