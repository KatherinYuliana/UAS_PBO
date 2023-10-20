/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizBareng;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_No4 {
    public static void dataAngka(int arrN, int data, int besar, int kecil, int besar2, int kecil2){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrN; i++) {
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            
            if (data >= besar){
                besar2 = besar;
                besar = data;
            } else if (data >= besar2){
                besar2 = data;
            }
            
            if(data <= kecil){
                kecil2 = kecil;
                kecil = data;
            } else if(data <= kecil2){
                kecil2 = data;
            }
        }
        System.out.println("Hasil 2 terbesar = " + (besar + besar2));
        System.out.println("Hasil 2 terkecil = " + (kecil + kecil2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = 0, besar = Integer.MIN_VALUE, kecil = Integer.MAX_VALUE;
        int kecil2 = 0, besar2 = 0;
        
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();
        int arrN[] = new int[n];
        
        dataAngka(n, data, besar, kecil, besar2, kecil2);
    }
}
