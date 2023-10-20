
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PemiluVarBiasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int calon1 = 0;
        int calon2 = 0;
        int calon3 = 0;
        int c = 0;
        
        while(c != -1){
            System.out.println("Masukkan nomor calon: ");
            c = scan.nextInt();
            if(c == 1){
                calon1++;
            }
            if(c == 2){
                calon2++;
            }
            if(c == 3){
                calon3++;
            }
        }
        System.out.println("Calon 1: " + calon1);
        System.out.println("Calon 2 : " + calon2);
        System.out.println("Calon 3 : " + calon3);
    }
}
