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
public class Juara1dan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang : ");
        int jumlah = scan.nextInt();
        String juara1 = null, juara2 = null;
        
        int maks1 = 0;
        int maks2 = 0;
        int i = 1;

        while (i <= jumlah) {
            System.out.print("Masukkan nama : ");
            String nama = scan.next();
            System.out.print("Masukkan nilai : ");
            int nilai = scan.nextInt();
            i++;

            if (maks1 < nilai) {
                maks2 = maks1;
                maks1 = nilai;
                juara1 = nama;
            } else if (maks2 < nilai) {
                maks2 = nilai;
                juara2 = nama;
            }
        }
        System.out.println("Juara 1 adalah " + juara1 + " dengan nilai : " + maks1);
        System.out.println("Juara 2 adalah " + juara2 + " dengan nilai : " + maks2);
    }
}
