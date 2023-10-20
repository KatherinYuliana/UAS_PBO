/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo6 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Merek mobil : ");
        String mobil = scan.next();
        
        System.out.println("bumper?");
        boolean bumper = scan.nextBoolean();
        System.out.println("spion?");
        boolean spion = scan.nextBoolean();
        System.out.println("body?");
        boolean body = scan.nextBoolean();
        System.out.println("mesin?");
        boolean mesin = scan.nextBoolean();

        System.out.println("bumper = " + bumper);
        System.out.println("spion = " + spion);
        System.out.println("body = " + body);
        System.out.println("mesin = " + mesin);
         
        int total = 0;
        switch (mobil){
            case "Lamborghini":
                if (bumper){
                     total = 100000;
                }
                if (spion){
                     total = 30000;
                }
                if (body){
                     total = 200000;
                }
                if (mesin){
                     total = 300000;
                }
                break;
            case "Toyota":
                if (bumper){
                     total = 10000;
                }
                if (spion) {
                     total = 5000;
                }
                if (body) {
                     total = 50000;
                }
                if (mesin) {
                     total = 30000;
                }
                break;
            case "AstonMartin":
                if (bumper){
                     total = 20000;
                }
                if (spion) {
                     total = 40000;
                }
                if (body) {
                     total = 100000;
                }
                if (mesin) {
                     total = 200000;
                }
                break;
            case "Hummer":
                if (bumper){
                     total = 30000;
                }
                if (spion) {
                     total = 3000;
                }
                if (body) {
                     total = 90000;
                 }
                 if (mesin) {
                     total = 150000;
                }
                break;
            case "Honda":
                if (bumper){
                     total = 40000;
                }
                if (spion) {
                     total = 1000;
                }
                if (body) {
                     total = 40000;
                }
                if (mesin) {
                     total = 10000;
                }
                break;
            default :
                System.out.println(+ 0);
        }
        System.out.println("Total : " + total);
    }
}
