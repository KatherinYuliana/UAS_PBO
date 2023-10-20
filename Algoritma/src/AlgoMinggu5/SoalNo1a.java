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
public class SoalNo1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int pin = 12345;
        int temp = 0;
        while (count < 3 && pin != temp) {
            System.out.println("Masukkan pin : ");
            temp = scan.nextInt();
            if (pin == temp) {
                System.out.println("Berhasil");
            } else {
                count++;
                System.out.println("Gagal");
            }
        }
    }
}
