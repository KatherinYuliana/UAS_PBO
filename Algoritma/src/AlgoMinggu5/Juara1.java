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
public class Juara1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang : ");
        int jumlah = scan.nextInt();

        int maks = 0;
        int temp = 0;
        int i = 1;

        while (i <= jumlah) {
            System.out.print("Masukkan nama : ");
            String nama = scan.next();
            System.out.print("Masukkan nilai : ");
            int nilai = scan.nextInt();
            temp = nilai;
            i++;

            if (maks < temp) {
                maks = temp;
            }
        }
        System.out.println("Juara 1 dengan nilai : " + maks);
    }
}
