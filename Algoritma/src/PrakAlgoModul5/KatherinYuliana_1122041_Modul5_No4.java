/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul5_No4 {

    public static int perbesaran(int perbesar, int p, int l, int t) {
        p = p * perbesar;
        l = l * perbesar;
        t = t * perbesar;
        System.out.println("P: " + p + ", L: " + l + ", T: " + t);
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan p : ");
        int p = scan.nextInt();
        System.out.println("Masukkan l : ");
        int l = scan.nextInt();
        System.out.println("Masukkan t : ");
        int t = scan.nextInt();
        System.out.println("Masukkan perbesaran : ");
        int perbesar = scan.nextInt();

        perbesaran(perbesar, p, l, t);
    }
}
