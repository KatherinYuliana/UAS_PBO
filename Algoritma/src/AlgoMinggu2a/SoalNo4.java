/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu2a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Minggu = 1;
        //Senin = 2;
        //Selasa = 3;
        //Rabu = 4;
        //Kamis = 5;
        //Jumat = 6;
        //Sabtu = 7;
        
        System.out.println("Senin-Kamis : " + (5 - 2));
        System.out.println("Kamis-Senin : " + (7 - 5 + 2));

        // ---------------------------------------------

        int minggu = 1;
        int senin = 2;
        int selasa = 3;
        int rabu = 4;
        int kamis = 5;
        int jumat = 6;
        int sabtu = 7;

        System.out.println("Masukkan hari pertama: ");
        String hari1 = scan.nextLine();
        System.out.println("Masukkan hari kedua: ");
        String hari2 = scan.nextLine();
        int hari = 0;

        switch(hari1){
            case "minggu":
                if(hari2 == "senin"){
                    hari = senin - minggu;
                }
                break;
        }

        System.out.println(hari);
    }
}
