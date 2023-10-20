
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class BintangDanAngka {
    public static void main(String[] args) {
        //soal nico jonathan
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan baris : ");
        int baris = scan.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
