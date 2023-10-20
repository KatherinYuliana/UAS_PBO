/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuBar2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Flower{
    int quantity;
    int seedPrice;
    int plantTime;
    int sellPrice;
    String flowerName; //nama bunga
}

class Gardener{
    String id;
    String name;
    Flower[] flower = new Flower[5];
    double startingBalance;
    double lastBalance;
    double income;
    double expense;
}

public class No4_1122041_QuBar2 {
    public static void inputData(Gardener gardener[], int jumlah, Flower lily, Flower morningGlory, Flower jasmine){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < jumlah; i++) {
            gardener[i] = new Gardener();
            gardener[i].id = Integer.toString(jumlah + 1);
            System.out.println("Masukkan Nama Gardener: ");
            gardener[i].name = scan.next();
            
            gardener[i].flower[0] = lily;
            gardener[i].flower[1] = morningGlory;
            gardener[i].flower[2] = jasmine;
            
            int totalSeedPrice = 0;
            int totalPlantPrice = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Masukkan jumlah bibit bunga " + gardener[i].flower[j].flowerName);
                gardener[i].flower[j].quantity = scan.nextInt();
                
                totalSeedPrice += gardener[i].flower[j].quantity * gardener[i].flower[j].seedPrice;
                totalPlantPrice += gardener[i].flower[j].quantity * gardener[i].flower[j].plantTime;
            }
            
            System.out.println("Masukkan Saldo Awal: ");
            gardener[i].startingBalance = scan.nextInt();
            gardener[i].expense = totalSeedPrice + totalPlantPrice;
            
            if(gardener[i].startingBalance < gardener[i].expense){
                System.out.println("Modal awal kurang");
            }
        }
    }
    
    public static void countIncome(Gardener gardener[], int jumlah){
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 3; j++) {
                gardener[i].income += (gardener[i].flower[j].sellPrice * gardener[i].flower[j].quantity);
            }
        }
    }
    
    public static void countLastBalance(Gardener gardener[], int jumlah){
        for (int i = 0; i < jumlah; i++) {
            gardener[i].lastBalance = gardener[i].startingBalance + gardener[i].income - gardener[i].expense;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX_GARDENER = 100;
        Gardener[] gardener = new Gardener[MAX_GARDENER];
        
        Flower lily = new Flower();
        lily.flowerName = "Lily";
        lily.seedPrice = 2;
        lily.plantTime = 5;
        lily.sellPrice = 10;
        
        Flower morningGlory = new Flower();
        morningGlory.flowerName = "Morning Glory";
        morningGlory.seedPrice = 2;
        morningGlory.plantTime = 5;
        morningGlory.sellPrice = 10;
        
        Flower jasmine = new Flower();
        jasmine.flowerName = "Jasmine";
        jasmine.seedPrice = 2;
        jasmine.plantTime = 5;
        jasmine.sellPrice = 10;
        
        System.out.println("Jumlah gardener: ");
        int jumlah = scan.nextInt();
        
        inputData(gardener, jumlah, lily, morningGlory, jasmine);
        countIncome(gardener, jumlah);
        countLastBalance(gardener, jumlah);
//        
        System.out.println("HB Gardening Dance on Mobile");
        System.out.println("No |\tNama Gardener |\tNama Bunga |\tBanyak |\tSaldo Awal |\tPendapatan |\tPengeluaran |\tSaldoAkhir");
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gardener[i].id + " |\t" + gardener[i].name + " |\t" + gardener[i].flower[j].flowerName + " |\t" + gardener[i].flower[j].quantity + " |\t" + gardener[i].income + " |\t" + gardener[i].expense + " |\t" + gardener[i].lastBalance);
            }
        }
    }
}
