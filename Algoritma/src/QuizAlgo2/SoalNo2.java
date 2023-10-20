/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizAlgo2;

/**
 *
 * @author DELL
 */
public class SoalNo2 {
    static int a = 2, b = 3, x;
    public static void cetak(){
        for (int x = a; x <= b; x++) {
            System.out.println("cetak " + x);
        }
    }
    public static void main(String[] args) {
        for (int x = 1; x <= 2; x++) {
            int a = 1; int b = x+2;
            System.out.println("main " + x);
            cetak();
        }
    }
}
