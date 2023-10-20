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
public class No3_1122041_QuBar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai s: ");
        int s = scan.nextInt();
        int A[] = {18, 4, 25, 8, 9, 12};
        
        for (int i = 0; i < A.length; i++) {
            if (s == A[i]){
                System.out.println("Sum found between index " + A[i] + " and " + A[i]);
            }
            int sum = 0;
            sum = A[i] + sum;
            if(s == sum){
                System.out.println("Sum found between index " + A[i] + " and " + A[i]);
            } else {
                System.out.println("No Subarray Found");
            }
        }
    }
}
