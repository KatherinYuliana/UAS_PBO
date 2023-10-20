/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class SoalNo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat : ");
        int bulat = Integer.parseInt(scan.next());
        int ganjil = bulat;
        while (bulat != 1){
            if (bulat % 2 != 0){
                bulat = (bulat * ganjil) + 1;
            } else {
                bulat = bulat / 2;
            }
            System.out.println("Bilangan : " + bulat);
        }
    }
}
