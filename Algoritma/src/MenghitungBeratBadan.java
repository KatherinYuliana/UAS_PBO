
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenghitungBeratBadan {
    public static void main(String[] args) {
        // soal darren setiawan
        String cobaLagi;
        float beratBadan, tinggiBadan, imt;
        
        cobaLagi = "ya";
        
        while(cobaLagi.equals("ya")) {
        Scanner sc = new Scanner(System.in);    
            System.out.print("Masukkan berat badan : ");
            beratBadan = sc.nextFloat();
            System.out.print("Masukkan tinggi badan : ");
            tinggiBadan = sc.nextFloat();
            
            tinggiBadan = tinggiBadan / 100;
            imt = beratBadan / (tinggiBadan * tinggiBadan);
            
            if(imt < 17) {
                System.out.println("IMT anda : " + imt);
                System.out.println("Anda sangat kurus");
            } else if (imt < 18.5) {
                System.out.println("IMT anda : " + imt);
                System.out.println("Anda kurus");
            } else if (imt < 25) {
                System.out.println("IMT anda : " + imt);
                System.out.println("Anda normal");
            } else if (imt < 27) {
                System.out.println("IMT anda : " + imt);
                System.out.println("Anda gemuk");
            } else {
                System.out.println("IMT anda : " + imt);
                System.out.println("Anda obesitas");
            }
            
            System.out.print("Coba lagi ? (ya/tidak) : ");
                    cobaLagi = sc.next();
        }
        System.out.println("Terima kasih telah menggunakan program ini!");
    }
}
