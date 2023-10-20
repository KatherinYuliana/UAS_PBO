
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d = 1;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        for (int i = 3; i > 1; i--) {
            if((i/2) ==1){
                if((a>b) || ((i+b) > c)){
                    a = (a * b) - c;
                } else {
                    c = a + b + (a*c);
                }
            } else {
                int k = 0;
                do{
                    a = a + b;
                    c = a - c;
                    k++;
                } while (k<= 1);
            }
            
            int j = 0;
            while (j <= 1){
                if(a < 5){
                    b = a + c -d ;
                    d = c + (a * b);
                } else {
                    c = (b*c)-a;
                }
                j++;
            }
            
            int sum = a + b + c + d;
            
            System.out.println("a: " + a); System.out.println("b: " + b);
            System.out.println("c: " + c); System.out.println("d: " + d);
            System.out.println("Sum: " + sum);
        }
    }
}
