/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Passenger{
    String name;
    int age;
    double totalPayment;
}

class Seat{
    String seatCode;
    boolean seatStatus;
    Passenger passenger = new Passenger();
}

class Cabin{
    Seat[] seats = new Seat[2];
}

class Plane{
    Cabin[] cabins = new Cabin[5];
}

public class Q2_1122041_KatherinYuliana_No2 {
    public static double diskon(Seat[] seats){
        double diskon = 0;
        for (int i = 0; i < 1; i++) {
            if(seats[i].passenger.age < 12){
                diskon = 20 / 100;
            }
        }
        return diskon;
    }
    
    public static double harga(double diskon, double harga){
        double total = 0;
        total = harga * diskon;
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double harga = 100000;
        Plane plane = new Plane();
        for (int i = 0; i < plane.cabins.length; i++) {
            plane.cabins[i] = new Cabin();
            for (int j = 0; j < plane.cabins[i].seats.length; j++) {
                plane.cabins[i].seats[j] = new Seat();
                plane.cabins[i].seats[j].seatStatus = true;
            }
        }
        Seat[] seats = new Seat[2];
        for (int i = 0; i < 1; i++) {
            System.out.println("Masukkan nama: ");
            seats[i].passenger.name = scan.next();
            System.out.println("Masukkan usia: ");
            seats[i].passenger.age = scan.nextInt();
        }
        
        double diskon = diskon(seats);
        double total = harga(diskon, harga);
        System.out.println("Total: " + total);
    }
}
