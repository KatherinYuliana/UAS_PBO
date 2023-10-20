
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class JarakAntarKota {
    public static void main(String[] args) {
        // soal yafet
        Scanner scan = new Scanner(System.in);
        int jarakA = 0;
        int jarakB = 0;
        System.out.println("Kota 1 : ");
        String kota1 = scan.next();
        
        if(kota1.equalsIgnoreCase("Bandung")){
            jarakA = 0;
        } else if (kota1.equalsIgnoreCase("Jakarta")){
            jarakA = 151;
        } else if (kota1.equalsIgnoreCase("Banjar")){
            jarakA = 147;
        } else if (kota1.equalsIgnoreCase("Purwokerto")){
            jarakA = 353;
        } else {
            System.out.println("Kota salah");
            System.exit(0);
        }
        
        System.out.println("Kota 2 : ");
        String kota2 = scan.next();

        if (kota2.equalsIgnoreCase("Bandung")){
            jarakB = 0;
        } else if (kota2.equalsIgnoreCase("Jakarta")){
            jarakB = 151;
        } else if (kota2.equalsIgnoreCase("Banjar")){
            jarakB = 147;
        } else if (kota2.equalsIgnoreCase("Purwokerto")){
            jarakB = 353;
        } else {
            System.out.println("Kota salah");
            System.exit(0);
        }

        int total = jarakB - jarakA;
        System.out.println("total = " + total);
        scan.close();
    }
}
