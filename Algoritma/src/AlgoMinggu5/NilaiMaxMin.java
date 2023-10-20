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
public class NilaiMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang : ");
        int jumlah = scan.nextInt();
        String tertinggi = null, terendah = null;
        int maks = -1;
        int min = 101;
        int i = 1;

        while (i <= jumlah) {
            System.out.print("Masukkan nama : ");
            String nama = scan.next();
            System.out.print("Masukkan nilai : ");
            int nilai = scan.nextInt();
            i++;

            if (maks < nilai) {
                maks = nilai;
                tertinggi = nama;
            }
            if (min > nilai) {
                min = nilai;
                terendah = nama;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi + " dengan nilai " + maks);
        System.out.println("Nilai terendah : " + terendah + " dengan nilai " + min);
    }
}
