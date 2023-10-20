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
public class No1 {
    public static void foo(int _x, int _y){
        int num1 = 10;
        _x = _x - num1;
        _y = _x - _y;
        System.out.println("Num1: " + num1);
        System.out.println("X: " + _x);
        System.out.println("Y: " + _y);
    }
    
    public static int woo(int _a, int _b){
        if(_b < _a){
            _a = _a + 5;
        } else if(_b > (_a + 1)){
            _b = _b + 3;
        }
        return (_a + _b);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        for (int i = 0; i < 2; i++) {
            if (num1 > num2){
                num1 = woo(num2, num2);
                num2 = woo(num2, num1);
                System.out.println("Num1: " + num1);
                System.out.println("Num2: " + num2);
            } else {
                num2 = woo(num1, num1);
                num1 = woo(num1, num2);
                System.out.println("Num1: " + num1);
                System.out.println("Num2: " + num2);
            }
            System.out.println("-----");
        }
        foo(num2, num1);
        num1 = num1 + 5;
        num2 = num2 + 3;
        System.out.println("Final Num1: " + num1);
        System.out.println("Final Num2: " + num2);
    }
}
