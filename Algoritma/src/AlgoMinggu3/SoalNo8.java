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
public class SoalNo8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Job : ");
        String job = scan.next();
        
        System.out.println("Beginner?");
        boolean beginner = scan.nextBoolean();
        System.out.println("Intermediate?");
        boolean intermediate = scan.nextBoolean();
        System.out.println("Expert?");
        boolean expert = scan.nextBoolean();
        int mastery = 0;
        
        switch (job) {
            case "Cleric":
                if (beginner) {
                    mastery = 1000;
                }
                if (intermediate) {
                    mastery = 1400;
                }
                if (expert) {
                    mastery = 1500;
                }
                System.out.println("50% latihan nursing, 30% latihan fighting, 20% latihan archery");
                break;
            case "Warrior":
                if (beginner) {
                    mastery = 1000;
                }
                if (intermediate) {
                    mastery = 1400;
                }
                if (expert) {
                    mastery = 1500;
                }
                System.out.println("50% latihan fighting, 30% latihan archery, 20% latihan nursing");
                break;
            case "Ranger":
                if (beginner) {
                    mastery = 1000;
                }
                if (intermediate) {
                    mastery = 1400;
                }
                if (expert) {
                    mastery = 1500;
                }
                System.out.println("50% latihan archery, 30% latihan fighting, dan 20% latihan nursing");
                break;
        }
        System.out.println("Mastery yang dibutuhkan : " + mastery);
        
    }
}
