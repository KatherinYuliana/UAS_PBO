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
public class Tracing3 {
    public static int calculateNumber1(int number){
        System.out.println("Ini dari int");
        int counter = number;
        while(counter > 0){
            if(number % 5 != 0){
                number /= 5;
            } else if (number < 10){
                counter = 0;
            }
            counter -= 5;
        }
        System.out.println("Angka saat ini: " + number);
        return number;
    }
    
    public static void calculateNumber2(int number){
        System.out.println("Ini dari void");
        int temp = number / 5;
        for (int i = 0; i <= temp; i++) {
            if(number % 2 == 0){
                number -= 5;
            } else {
                temp -= 5;
            }
        }
        System.out.println("Angka saat ini: " + number);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, number, sum;
        a = scan.nextInt(); b = scan.nextInt(); c = scan.nextInt(); number = scan.nextInt();
        
        if(a < b){
            a += c;
            b -= c;
            sum = number + a + b;
            System.out.println("Total saat ini: " + sum);
            number = calculateNumber1(number);
        } else if(b < c){
            b += a;
            c /= 3;
            sum = a + b + c;
            System.out.println("Total saat ini: " + sum);
            calculateNumber2(number);
        } else {
            c--;
            sum = a + b + c;
            System.out.println("Total saat ini: " + sum);
        }
    }
}
