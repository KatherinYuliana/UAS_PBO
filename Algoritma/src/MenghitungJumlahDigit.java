
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MenghitungJumlahDigit {
    public static void main(String[] args) {
        // soal martinus mada
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = scan.nextInt();
        String angkaString = String.valueOf(angka);
        int pangkat = angkaString.length();
        
        int sum = 0;
        double temp = 0;
        int count = 0;
        while (count < pangkat) {
            int angkatemp = Integer.parseInt(angkaString.charAt(count) + "");
            temp = temp + Math.pow(angkatemp, pangkat);
            count++;
            sum = angkatemp + sum;
        }
        System.out.println("Jumlah digit : " + sum);
    }
}
