/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tracing2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, number, k = 0;
        number = scan.nextInt();
        a = scan.nextInt(); b = scan.nextInt(); c = scan.nextInt();
        
        do{
            System.out.println("Nilai number = " + number);
            for (int i = number%10; i > 0; i--) {
                System.out.println("Nilai i = " + i);
                if (i%2 == 1){
                    k = a;
                    a = b+2;
                    b += c*2;
                } else {
                    k = b;
                    b = a-c;
                    c -= b+k;
                }
                int sum = a+b+c+k;
                System.out.println("Hasil penjumlahan = " + sum);
            }
            if (k % 2 == 1){
                a -= 5;
                b +=5;
                c %= 2;
                int calculation = a+b*k+c;
                System.out.println("Hasil calculation = " + calculation);
                k /= 10;
            }
            number /= 10;
        } while (number > 0);
    }
}
