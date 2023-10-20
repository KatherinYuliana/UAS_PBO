/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu2a;

/**
 *
 * @author DELL
 */
public class SoalNo1 {
    public static void main(String[] args) {
        int belanja = 200000;
        float diskon = 10 / 100;
        
        if (belanja > 100000) {
            diskon = belanja * diskon;
        } else {
            diskon = belanja + 0;
        }
        System.out.println("Bayar : " + diskon);
    }
}
