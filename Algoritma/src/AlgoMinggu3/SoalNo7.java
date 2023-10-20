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
public class SoalNo7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Trophy yang dipertaruhkan : ");
        int trophy = scan.nextInt();
        System.out.println("Status town hall : ");
        String status = scan.next();
        System.out.println("Persentase kehancuran : ");
        int hancur = scan.nextInt();
        
        
        switch (status){
            case "TidakHancur":
                if (hancur < 40) {
                    System.out.println("Status serangan : victory, tidak mendapat shield");
                }
                if (hancur >= 40 && hancur <= 49) {
                    System.out.println("Status serangan : victory, shield +2 jam");
                }
                break;
            case "Hancur 50":
                if (hancur == 50) {
                System.out.println("Status serangan : defeat, 1 bintang");
                }
                break;
            case "Hancur":
                if (hancur == 100){
                System.out.println("Status serangan : defeat, 1 bintang, shield +2 jam");
                }
                break;
            case "Hancur 100":
                if (hancur == 100){
                System.out.println("Status serangan : defeat, 1 bintang, shield +2 jam");
                break;
                }
                
        boolean victory = true;
        boolean defeat = false;
        
        if (victory){
            System.out.println("Trophy yang didapat" + trophy);
        }
        else {
        }
        }
    }
}
