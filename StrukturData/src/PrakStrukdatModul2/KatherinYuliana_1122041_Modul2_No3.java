/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Seat {
    String seatCode;
    boolean seatState;
}

class Film {
    String title;
    double duration;
    String releaseDate;
    double rating;
}

class Studio{
    Seat seats[] = new Seat[2];
    double ticketPrice;
    Film film = new Film();
}

class Transaction{
    String transactionCode;
    String filmName;
    String chairCode;
    String paymentMethod;
    long totalOrder;
}

class Member{
    String userName;
    String password;
    Transaction transactions[] = new Transaction[5];
}

public class KatherinYuliana_1122041_Modul2_No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
    }
}

