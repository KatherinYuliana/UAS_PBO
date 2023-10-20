/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul4_No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int n = scan.nextInt();
        int i = 1;
        int a = 0;
        int b = 1;
        
        while(i <= n){
            System.out.print(a + " ");
            i += a / 2 ;
            a =  a + b;
            b = a - b;
        }
    }
}
