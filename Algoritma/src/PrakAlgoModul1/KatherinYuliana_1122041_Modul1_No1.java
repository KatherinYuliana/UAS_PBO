/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul1;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul1_No1 {
    public static void main(String[] args) {
        // a. phytagoras
        double a = 3.0;
        double b = 4.0;
        double c;
        
        c = Math.sqrt((a * a) + (b * b));
        
        System.out.println("c = " + c);

        // b. volume kerucut
        double phi = 3.14;
        double r = 7.0;
        double t = 30.0;
        double x = 0.333333; // x = 1/3
        double v;
        
        v = x * phi * r * r * t;
        
        System.out.println("Volume Kerucut = " + v);
    }
}
