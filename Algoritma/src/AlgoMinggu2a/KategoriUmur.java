/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu2a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KategoriUmur {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan umur : ");
        int umur = scan.nextInt();
            if (umur < 6) {
                System.out.println("Balita");
            } else if (umur < 13) {
                System.out.println("Anak");
            } else if (umur < 19) {
                System.out.println("Remaja");
            } else if (umur < 26) {
                System.out.println("Pemuda");
            } else if (umur < 56) {
                System.out.println("Dewasa");
            } else {
                System.out.println("Tua");
            }
        }
    }

