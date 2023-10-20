/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul6_No1 {
    
    public static double _rataRata(int input2){
        int sum = 0;
        sum = sum + input2;
        double rata = sum / 10;
        return rata;
    }
    
    public static double median (int input2){
        return 0;
    }
    
    public static int _nilaiMax(int input2){
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if(input2 > max){
                max = input2;
            }
        }
        return max;
    }
    
    public static int _nilaiMin(int input2){
        int min = 100;
        for (int i = 0; i < 10; i++) {
            if(input2 < min){
                min = input2;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input[] = new int [10];
        int input2 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan angka : ");
            input[i] = scan.nextInt();
            input2 = input[i];
        }
        double rataRata =  _rataRata(input2);
        System.out.println("Nilai max : " + rataRata);
        int nilaiMax = _nilaiMax(input2);
        System.out.println("Nilai max : " + nilaiMax);
        int nilaiMin = _nilaiMin(input2);
        System.out.println("Nilai min : " + nilaiMin);
    }
}
