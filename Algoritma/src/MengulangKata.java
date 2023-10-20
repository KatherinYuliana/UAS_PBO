
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MengulangKata {
    public static void main(String[] args) {
        // soal rafael joy hadi
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = scan.next();
        System.out.print("Masukkan jumlah mengulang : ");
        int jumlah = scan.nextInt();
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(kata);
        }
        
    }
}
