
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PemiluArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int calon[] = new int[3];
        int c = 0;
        while(c != -1){
            
            calon[c-1]++;
            
            System.out.println("Masukkan nomor calon: ");
            c = scan.nextInt();
            
        }
        
        for (int i = 0; i < calon.length; i++) {
            System.out.println("Calon " + calon[i]);
        }
        
//        int calon[] = new int[3];
//        
//        for (int i = 0; i < 3; i++) {
//            System.out.println("masukkan nomor pilihan : ");
//            calon[i] = scan.nextInt();
//        }
//        int pilihan = scan.nextInt();
//        while(pilihan != 0){
//            calon[pilihan - 1]++;
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Calon "+calon[i]);
//        }
    }
}
