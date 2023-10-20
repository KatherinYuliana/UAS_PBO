/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MultiplicationRekrusif {
    public static int multiplication(int n, int m){
        if(n == 1){
            return m;
        } else {
            return m + multiplication((n-1), m);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();
        System.out.println("Masukkan m: ");
        int m = scan.nextInt();
        
        int multiplication = multiplication(n, m);
        System.out.println(multiplication);
    }
}
