/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizBareng;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_No5 {
    public static void simbol(int randomSimbolNumber, char randomSimbol, String simbolName){
        Random random = new Random();
        randomSimbolNumber = random.nextInt(4) + 1;
        switch(randomSimbolNumber){
            case 1:
                randomSimbol = 'S';
                simbolName = "Spade";
                break;
            case 2:
                randomSimbol = 'H';
                simbolName = "Heart";
                break;
            case 3:
                randomSimbol = 'D';
                simbolName = "Diamond";
                break;
            case 4:
                randomSimbol = 'C';
                simbolName = "Club";
                break;
        }
    }
    
    public static void angka(int randomAngka, String numberName){
        switch (randomAngka){
            case 1:
                numberName = "As";
                break;
            case 11:
                numberName = "Jack";
                break;
            case 12:
                numberName = "As";
                break;
            case 13:
                numberName = "As";
                break;
        }
    }
    
    public static void pengecekan(char inputSimbol, boolean input, int randomSimbol, int inputAngka, int randomAngka, boolean sameCard){
        Scanner scan = new Scanner(System.in);
        do{
            do{
                System.out.println("Masukkan tebakan simbol: ");
                inputSimbol = scan.next().charAt(0);
                if((inputSimbol == 'S' || inputSimbol == 'H' || inputSimbol == 'D' || inputSimbol == 'C')){
                    input = true;
                    System.out.println("Selanjutnya pilih angka kartu");
                } else {
                    System.out.println("Simbol tidak ditemukan");
                }
            } while (!input);
            if(inputSimbol == randomSimbol){
                if(inputAngka == randomAngka){
                    System.out.println("Selamat tebakan anda benar");
                    sameCard = true;
                } else if (inputAngka > randomAngka){
                    System.out.println("Ayo sedikit lagi, angka kartu anda masih kurang kecil");
                } else {
                    System.out.println("Ayo sedikit lagi, angka kartu anda masih kurang besar");
                }
            } else {
                System.out.println("Simbol kartu tebakan masih kurang tepat");
            }
        } while (!sameCard);
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        char inputSimbol = 0, randomSimbol = 0;
        int inputAngka = 0, randomSimbolNumber = 0, randomAngka;
        boolean sameCard = false, input = false;
        String simbolName = null;
        String numberName = null;
        
        randomSimbolNumber = random.nextInt(4) + 1;
        randomAngka = random.nextInt(13) + 1;
        
        simbol(randomSimbolNumber,randomSimbol, simbolName);
        angka(randomAngka, numberName);
        pengecekan(inputSimbol, input, randomSimbol, inputAngka, randomAngka, sameCard);
    }
}
