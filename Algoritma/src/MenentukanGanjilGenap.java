
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenentukanGanjilGenap {
    public static void main(String[] args) {
        // soal hasan abdullah
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n : ");
        int n = scan.nextInt();
        
        if(n % 2 != 0){
            System.out.println("weird");
        }else{
            if(n >= 2 && n <= 5){
                System.out.println("not weird");
            } else if(n >= 6 && n <= 20){
                System.out.println("weird");
            } else {
                System.out.println("not weird");
            }
        }
    }
}
