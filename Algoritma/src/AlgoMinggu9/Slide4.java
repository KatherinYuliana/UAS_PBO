/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

/**
 *
 * @author DELL
 */
public class Slide4 {
    static int a, b, i, j;
    public static void cetakLooping() {
        for (j = a; j <= b; j++) {
            System.out.println("proc " + j);
        }
    }
    
    public static void main(String[] args) {
        for (i = 1; i <= 2; i++) {
            a = 1; b = i+2;
            System.out.println("main " + i);
            cetakLooping();
        }
    }
}
