/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koordinat;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class T5_No2_1122041_KatherinYuliana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();

        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan x" + i + ": ");
            x[i] = scan.nextInt();
            System.out.println("Masukkan y" + i + ": ");
            y[i] = scan.nextInt();
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                count1 = ((x[i] * y[0] - x[0] * y[i]));
            } else {
                count2 = ((x[i] * y[i + 1] - x[i + 1] * y[i]));
            }
        }
        int hasil = 1 / 2 * (count1 + count2);
        System.out.println("Hasil: " + hasil);
    }
}
