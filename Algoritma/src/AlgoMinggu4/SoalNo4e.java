/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu4;

/**
 *
 * @author DELL
 */
public class SoalNo4e {
    public static void main(String[] args) {
 
        for (int i = 1; i <=4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
