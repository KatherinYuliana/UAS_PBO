/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PemiluArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int calon[] = new int[3];
        for (int i = 0; i < calon.length; i++) {
            calon[i] = 0;
        }
        
        System.out.println("Masukkan nomor calon: ");
        int c = scan.nextInt();
        
        while(c != -1){
            calon[c-1]++;
            
            System.out.println("Masukkan nomor calon: ");
            c = scan.nextInt();
        }
        
        for (int i = 0; i < calon.length; i++) {
            System.out.println("Calon " + (i+1) + ": " + calon[i]);
        }
    }
}
