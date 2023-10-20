/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizAlgo2;


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pesanan {
    String nama;
    char menu;
    int topping, banyak;
    double harga[] = new double[3];
    
    public static double[] hargaPokok(Pesanan pembeli[], int jumlah){
        double hargaPokok[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if(pembeli[i].menu == 'A'){
                hargaPokok[i] = 30000;
            } else if(pembeli[i].menu == 'B'){
                hargaPokok[i] = 25000;
            } else if(pembeli[i].menu == 'C'){
                hargaPokok[i] = 35000;
            }
        }
        return hargaPokok;
    }
    
    public static double[] hargaTopping(Pesanan pembeli[], int jumlah){
        double hargaTopping[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if(pembeli[i].menu == 'A'){
                if(pembeli[i].topping == 1){
                    hargaTopping[i] = 5000;
                } else {
                    hargaTopping[i] = 4000;
                }
            } else if(pembeli[i].menu == 'B'){
                if(pembeli[i].topping == 1){
                    hargaTopping[i] = 4000;
                } else {
                    hargaTopping[i] = 6000;
                }
            } else if(pembeli[i].menu == 'C'){
                if(pembeli[i].topping == 1){
                    hargaTopping[i] = 6000;
                } else {
                    hargaTopping[i] = 5000;
                }
            }
        }
        return hargaTopping;
    }
    
    public static double[] total(Pesanan pembeli[], double hargaPokok[], double hargaTopping[], int jumlah){
        double total[] = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            if(pembeli[i].topping != 0){
                total[i] = (hargaPokok[i] + hargaTopping[i]) * pembeli[i].banyak;
            } else {
                total[i] = hargaPokok[i]  * pembeli[i].banyak;
            }
        }
        return total;
    }
    
    public static double totalSemua(int jumlah, double total[]){
        double totalSemua = 0;
        for (int i = 0; i < jumlah; i++) {
            totalSemua = total[i] + totalSemua;
        }
        return totalSemua;
    }
    
    public static void tampilkanData(int jumlah, Pesanan pembeli[], double hargaPokok[], double hargaTopping[], double total[], double totalSemua){
        System.out.println("DAFTAR PENJUALAN HBFood");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("No.\t Nama\t Menu\t Banyak\t Harga Pokok\t Topping\t Total");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t " + pembeli[i].nama + "\t " + pembeli[i].menu + "\t " + pembeli[i].banyak + "\t " + hargaPokok[i] + "\t " + hargaTopping[i] + "\t \t " + total[i]);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                                                 Total : " + totalSemua);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah pembeli: ");
        int jumlah = scan.nextInt();
        
        Pesanan pembeli[] = new Pesanan[jumlah];
        for (int i = 0; i < jumlah; i++) {
            pembeli[i] = new Pesanan(); 
            System.out.println("Masukkan nama : ");
            pembeli[i].nama = scan.next();
            System.out.println("Masukkan menu : ");
            pembeli[i].menu = scan.next().charAt(0);
            System.out.println("Masukkan topping : ");
            pembeli[i].topping = scan.nextInt();
            System.out.println("Masukkan banyak pesanan : ");
            pembeli[i].banyak = scan.nextInt();
        }
        double hargaPokok[] = hargaPokok(pembeli, jumlah);
        double hargaTopping[] = hargaTopping(pembeli, jumlah);
        double total[] = total(pembeli, hargaPokok, hargaTopping, jumlah);
        double totalSemua = totalSemua(jumlah, total);
        
        tampilkanData(jumlah, pembeli, hargaPokok, hargaTopping, total, totalSemua);
    }
}
