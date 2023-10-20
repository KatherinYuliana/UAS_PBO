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
public class DivideInHalves {
    
    public static int divideInHalves(int a, int b){
        if(a == b){
            return a * a;
        } else {
            int c = (a + b) / 2;
            return (divideInHalves(a, c) + divideInHalves(c+1, b));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan a: ");
        int a = scan.nextInt();
        System.out.println("Masukkan b: ");
        int b = scan.nextInt();
        
        int hasil = divideInHalves(a, b);
        System.out.println("Hasil: " + hasil);
    }
}
