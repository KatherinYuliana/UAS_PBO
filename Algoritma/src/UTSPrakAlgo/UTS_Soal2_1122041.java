/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UTS_Soal2_1122041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        int n = scan.nextInt();
        System.out.print("Masukkan m : ");
        int m = scan.nextInt();
        
        for (int i = m; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
