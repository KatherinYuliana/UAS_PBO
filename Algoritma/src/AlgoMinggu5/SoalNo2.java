/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan desimal : ");
        int desimal = scan.nextInt();
        int n = desimal;
        
        System.out.print("Biner : ");
        while (desimal > 0){
            n = desimal % 2;
            
            if(n > 0){
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            
            desimal = desimal / 2;   
        }
    }
}
