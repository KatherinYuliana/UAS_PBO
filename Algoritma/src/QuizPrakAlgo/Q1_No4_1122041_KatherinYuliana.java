/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakAlgo;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Q1_No4_1122041_KatherinYuliana {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("Tipe Member : ");
        String member;
        JOptionPane.showInputDialog("Input Kendaraan : ");
        
        String kendaraan = null;
        String jenis;
        
        int biayaCuci = 0;
        int biayaWax = 0;
        int pintu = 0;
        int cc = 0;
        boolean wax = true;
        double totalBayar = 0;
        
        switch(kendaraan){
            case "mobil":
                if (("sport").equalsIgnoreCase("sport")){
                    if(pintu == 2){
                        biayaCuci = 120000;
                    } else {
                        biayaCuci = 100000;
                    }
                }
                if (("manual").equalsIgnoreCase("manual")){
                    biayaCuci = 70000;
                }
                if (("matic").equalsIgnoreCase("matic")){
                    if (wax){
                        biayaWax = 50000;
                    } else {
                        biayaCuci = 50000;
                    }
                }
                break;
                
            case "motor":
                if (("sport").equalsIgnoreCase("sport")){
                    if(cc == 250){
                        biayaCuci = 30000;
                    } else if (cc == 600){
                        biayaCuci = 40000;
                    } else {
                        biayaCuci = 50000;
                    }
                }
                if (("manual").equalsIgnoreCase("manual")){
                    biayaCuci = 25000;
                }
                if (("matic").equalsIgnoreCase("matic")){
                    if (wax){
                        biayaWax = 30000;
                    } else {
                        biayaCuci = 20000;
                    }
                }
        }
        totalBayar = biayaCuci + biayaWax;
        System.out.println("Total bayar: " + totalBayar);
    }
}
