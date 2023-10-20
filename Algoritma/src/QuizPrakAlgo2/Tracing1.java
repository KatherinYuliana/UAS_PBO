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
public class Tracing1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, number;
        a = scan.nextInt(); b = scan.nextInt(); number = scan.nextInt();
        
        do{
            System.out.println(a + " " + b);
            if (number % 2 == 0){
                number -= a * b;
                a++;
                b--;
            } else {
                number -= a / b;
                a -= 2;
                b /= 5;
            }
            System.out.println("number: " + number);
        } while (a > 0 && b > 0);
    }
}
