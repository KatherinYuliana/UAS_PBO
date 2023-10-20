/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuBar2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class No2_1122041_QuBar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = scan.nextInt();
        int arrN[] = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan angka: ");
            arrN[i] = scan.nextInt();
        }
        System.out.println("Masukkan nilai x: ");
        int x = scan.nextInt();
        
        int count = 0;
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                total += arrN[i];
            }
            if(total == x){
                count += 1;
            }
            System.out.println("Ada " + count + " triplet yang adalah " + arrN[i] + " dimana tripletnya berjumlah " + x);
        }
    }
}
