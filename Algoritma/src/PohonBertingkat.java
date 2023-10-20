
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PohonBertingkat {
    public static void main(String[] args) {
        //soal hegya rifandy
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        int tinggi = scan.nextInt();
        System.out.print("Masukkan banyak tingkat : ");
        int tingkat = scan.nextInt();
        int a = 0;
        
        for (int i = 1; i <= tingkat; i++) {
            for (int j = 1; j <= tinggi; j++) {
                for (int k = tinggi; k >= j; k--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= j + a; k++) {
                    System.out.print("*");
                }
                a++;
                System.out.println("");
            }
        }
    }    
}
