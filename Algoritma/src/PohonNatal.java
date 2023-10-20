
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PohonNatal {
    public static void main(String[] args) {
        // soal gregorius jerriyana
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi daun: ");
        int tinggi = scan.nextInt();
        System.out.print("Masukkan lebar batang: ");
        int lebar = scan.nextInt();
        System.out.print("Masukkan tinggi batang: ");
        int tinggi2 = scan.nextInt();
        int a = 0;
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) {
                System.out.print("*");
            }
            for (int j = tinggi; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = tinggi; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) {
                System.out.print("*");
            }
            a++;
            System.out.println("");
        }
        
        for(int i = 1; i <= tinggi2; i++){
            for(int j = 1; j <= ((2 * tinggi - 1) - lebar) / 2 + 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= ((2 * tinggi - 1) - lebar) / 2 + 1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2 * tinggi - 1) - lebar) / 2 + 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
