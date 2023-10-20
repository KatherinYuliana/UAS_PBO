/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author DELL
 */
public class SoalNo4 {
    public static void main(String[] args) {
        double rpm = 3600;
        double phi = 3.14;
        double diameter = 14;
        
        double rph = rpm * 60;
        double keliling = phi * diameter;
        
        double speedPerHourInch = rph * keliling;
        double speedPerHourMile = speedPerHourInch / 63360;
        
        System.out.println(speedPerHourMile);
    }
}
