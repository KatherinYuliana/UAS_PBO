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
public class FaktorialRekrusif {
    public static int fac(int n){
        if(n == 0){
            return 1;
        } else {
            return n * fac(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();
        
        int fak = fac(n);
        System.out.println(fak);
    }
}
