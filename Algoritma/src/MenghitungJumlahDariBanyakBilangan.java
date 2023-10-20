
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenghitungJumlahDariBanyakBilangan {
    public static void main(String[] args) {
        // soal erwin dosantos
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Banyak Bilangan = ");
        int a = sc.nextInt();
        int sum =0;
        for(int i = 1; i<= a;i++){
            sum = sum + i;
        }
        System.out.println("Jumlah dari banyak bilangan adalah " + sum);
    }
}
