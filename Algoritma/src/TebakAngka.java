/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TebakAngka {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int tebak = random.nextInt(10)+1;
        int nebak = -1;
        do{
            System.out.println("Masukkan tebakkan anda : ");
            nebak = scn.nextInt();
            if(nebak > tebak){
                System.out.println("tebakan salah, coba angka yang lebih kecil");
            }else if(nebak < tebak){
                System.out.println("tebakan salah, coba angka yang lebih besar");
            }else{
                System.out.println("Selamat! tebakan anda benar.");
            }
        }while(nebak != tebak);
    }
}
