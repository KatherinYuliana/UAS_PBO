
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PasswordHP {
    public static void main(String[] args) {
        // soal gregory jason
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int password = 12345;
        int temp = 0;
        while (count < 5 && password != temp) {
            System.out.println("Masukkan password : ");
            temp = scan.nextInt();
            if (password == temp) {
                System.out.println("Berhasil");
            } else {
                count++;
                System.out.println("Gagal");
            }
        }
    }
}
