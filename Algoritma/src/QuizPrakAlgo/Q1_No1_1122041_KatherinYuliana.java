/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Q1_No1_1122041_KatherinYuliana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exit = "false";
        String[] ratus = {"", " Seratus", " Dua Ratus", " Tiga Ratus", " Empat Ratus",
            " Lima Ratus", " Enam Ratus", " Tujuh Ratus", " Delapan Ratus", " Sembilan Ratus"};
        String[] puluh = {"", " Belas", " Dua Puluh", " Tiga Puluh", " Empat Puluh",
            " Lima Puluh", " Enam Puluh", " Tujuh Puluh", " Delapan Puluh", " Sembilan Puluh"};
        String[] satu = {"", " Satu", " Dua", " Tiga", " Empat", " Lima", " Enam",
            " Tujuh", " Delapan", " Sembilan"};

        while (exit.equals("false")) {
            System.out.println("Input angka : ");
            int angka = scan.nextInt();

            if (angka < 1000 && angka > 0) {
                int ratusan, puluhan, satuan;

                ratusan = (angka % 1000) / 100;
                puluhan = (angka % 100) / 10;
                satuan = angka % 10;
                if (puluhan == 1) {
                    if (satuan == 1) {
                        System.out.println("print : " + ratus[ratusan] + " Se" + puluh[puluhan]);
                    } else if (satuan == 0) {
                        System.out.println("print : " + ratus[ratusan] + " Sepuluh");
                    } else {
                        System.out.println("print : " + ratus[ratusan] + satu[satuan] + puluh[puluhan]);
                    }
                } else {
                    System.out.println("print : " + ratus[ratusan] + puluh[puluhan] + satu[satuan]);
                }
            }
            System.out.print("exit ? ");
            exit = scan.next();
        }
    }
}
