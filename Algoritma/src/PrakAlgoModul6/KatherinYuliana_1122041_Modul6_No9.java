/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul6;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul6_No9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2};
        int c[] = {0};
        for (int i = 0; i < a.length; i++) {
            c[i] = (a[i] * b[0]) + (a[i] * b[1]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Hasil : " + c[i]);
        }
    }
}
