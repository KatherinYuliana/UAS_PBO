
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class SegitigaBersebelahan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah baris : " );
        int baris = scan.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = baris; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
