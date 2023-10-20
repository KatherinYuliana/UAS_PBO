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
public class PowerOperator {
    
    public static int powerOperator(int n, int m){
        if(m == 0){
            return 1;
        } else {
            return (n * powerOperator(n, m - 1));
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();
        System.out.println("Masukkan m: ");
        int m = scan.nextInt();
        
        int hasil = powerOperator(n, m);
        System.out.println("Hasil: " + hasil);
    }
}
