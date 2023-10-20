/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class dataKendaraan {
    String plat;
    int biaya;
}

class dataTol {
    String gateMasuk, gateKeluar;
}

public class KatherinYuliana_1122041_Modul7_No5 {
    public static int _biaya(dataTol tol[], int jumlah){
        int totalBiaya = 0; 
        for (int i = 0; i < jumlah; i++) {
                if(tol[i].gateMasuk == "A"){
                    if(tol[i].gateKeluar == "A"){
                        totalBiaya = 0;
                    } else if(tol[i].gateKeluar == "B"){
                        totalBiaya = 1000;
                    } else if(tol[i].gateKeluar == "C"){
                        totalBiaya = 2000;
                    } else if(tol[i].gateKeluar == "D"){
                        totalBiaya = 6500;
                    } else if(tol[i].gateKeluar == "E"){
                        totalBiaya = 3210;
                    }
                } else if (tol[i].gateMasuk == "B"){
                    if(tol[i].gateKeluar == "A"){
                        totalBiaya = 1400;
                    } else if(tol[i].gateKeluar == "B"){
                        totalBiaya = 0;
                    } else if(tol[i].gateKeluar == "C"){
                        totalBiaya = 8700;
                    } else if(tol[i].gateKeluar == "D"){
                        totalBiaya = 5000;
                    } else if(tol[i].gateKeluar == "E"){
                        totalBiaya = 6000;
                    }
                } else if(tol[i].gateMasuk == "C"){
                    if(tol[i].gateKeluar == "A"){
                        totalBiaya = 5800;
                    } else if(tol[i].gateKeluar == "B"){
                        totalBiaya = 10500;
                    } else if(tol[i].gateKeluar == "C"){
                        totalBiaya = 0;
                    } else if(tol[i].gateKeluar == "D"){
                        totalBiaya = 8000;
                    } else if(tol[i].gateKeluar == "E"){
                        totalBiaya = 7000;
                    }
                } else if(tol[i].gateMasuk == "D"){
                    if(tol[i].gateKeluar == "A"){
                        totalBiaya = 3500;
                    } else if(tol[i].gateKeluar == "B"){
                        totalBiaya = 9800;
                    } else if(tol[i].gateKeluar == "C"){
                        totalBiaya = 2300;
                    } else if(tol[i].gateKeluar == "D"){
                        totalBiaya = 0;
                    } else if(tol[i].gateKeluar == "E"){
                        totalBiaya = 10000;
                    }
                } else if(tol[i].gateMasuk == "E"){
                    if(tol[i].gateKeluar == "A"){
                        totalBiaya = 7000;
                    } else if(tol[i].gateKeluar == "B"){
                        totalBiaya = 2000;
                    } else if(tol[i].gateKeluar == "C"){
                        totalBiaya = 3400;
                    } else if(tol[i].gateKeluar == "D"){
                        totalBiaya = 9000;
                    } else if(tol[i].gateKeluar == "E"){
                        totalBiaya = 0;
                    }
                }
        }
        return totalBiaya;
    }
    
    public static void output(dataKendaraan kendaraan[], dataTol tol[], int jumlah, int biaya){
        System.out.println("Plat \t Masuk \t Keluar \t Biaya");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(kendaraan[i].plat + " \t " + tol[i].gateMasuk + " \t " + tol[i].gateKeluar + " \t \t " + biaya);
        }
        int total = 0;
        total = biaya + total;
        System.out.println("                          Total: " + total);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah kendaraan: ");
        int jumlah = scan.nextInt();
        
        dataKendaraan kendaraan[] = new dataKendaraan[jumlah];
        dataTol tol[] = new dataTol[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            kendaraan[i] = new dataKendaraan();
            tol[i] = new dataTol();
            System.out.println("Masukkan plat nomor: ");
            kendaraan[i].plat = scan.next();
            System.out.println("Masukkan gate masuk: ");
            tol[i].gateMasuk = scan.next();
            System.out.println("Masukkan gate keluar: ");
            tol[i].gateKeluar = scan.next();
        }
        
        int biaya = _biaya(tol, jumlah);
        System.out.println("biaya " + biaya);
        output(kendaraan, tol, jumlah, biaya);
    }
}
