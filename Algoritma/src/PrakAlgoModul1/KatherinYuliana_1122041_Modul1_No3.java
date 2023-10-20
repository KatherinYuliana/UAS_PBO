/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class KatherinYuliana_1122041_Modul1_No3 {
    public static void main(String[] args) {
        double persentase;
        int gaji;
        int bonus;
        int denda;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Persentase Pajak : ");
        persentase = scan.nextDouble();
        
        System.out.println("Gaji : ");
        gaji = scan.nextInt();
        
        System.out.println("Bonus : ");
        bonus = scan.nextInt();
        
        System.out.println("Denda : ");
        denda = scan.nextInt();
        
        double penghasilan = gaji + bonus - denda;
        double total = penghasilan - (penghasilan * persentase);
        
        JOptionPane.showMessageDialog(null, "Total " + total);
        
        
    }
}
