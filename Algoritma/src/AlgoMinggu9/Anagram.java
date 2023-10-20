/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kata 1 : ");
        String kata1 = scan.nextLine();
        System.out.println("Masukkan kata 2 : ");
        String kata2 = scan.nextLine();
        
        String temp1 = "";
        String temp2 = "";
        int panjangKata1 = kata1.length();
        int panjangkata2 = kata2.length();
        int penanda = 0;
        
        //hilangksan spasi
        for (int i = 0; i < panjangKata1; i++) {
            if (kata1.charAt(i) == ' ') {
                penanda = i;
                i = i + 1;
            }
            temp1 = temp1 + kata1.charAt(i);
        }
        temp1 = temp1.toLowerCase();

        for (int i = 0; i < panjangkata2; i++) {
            if (kata2.charAt(i) == ' ') {
                penanda = i;
                i = i + 1;
            }
            temp2 = temp2 + kata2.charAt(i);
        }
        temp2 = temp2.toLowerCase();
        
        // cek huruf
        String tempAhkir = temp2;
        for (int i = 0; i < temp1.length(); i++) {
            for (int j = 0; j < temp2.length(); j++) {
                if (temp1.charAt(i) == temp2.charAt(j)) {
                    tempAhkir  = tempAhkir.replace(temp1.charAt(i), '=');
                }
            }
        }
        
        // cek anagram atau bukan 
        boolean cek  = true;
        for (int i = 0 ; i <  tempAhkir.length() ; i++){
            if(tempAhkir.charAt(i)!= '='){
                cek =  false;  
            }   
        }
        
        if (cek == true){
            System.out.println("Anagram");
        }   else {
            System.out.println("Bukan anagram");
        }
        
    }
}
