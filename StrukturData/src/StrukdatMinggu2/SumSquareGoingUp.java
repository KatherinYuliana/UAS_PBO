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
public class SumSquareGoingUp {
    
    public static int SumSquare(int a, int b){
        if(a == b){
            return a * a;
        } else {
            return a * a + SumSquare((a + 1), b);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan a: ");
        int a = scan.nextInt();
        System.out.println("Masukkan b: ");
        int b = scan.nextInt();
        
        int SumSquare = SumSquare(a, b);
        System.out.println("Hasil: " + SumSquare);
    }
}
