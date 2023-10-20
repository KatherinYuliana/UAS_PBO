/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPrakAlgo;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UTS_Soal4_1122041 {
    public static void main(String[] args) {
        String usia = JOptionPane.showInputDialog("Masukkan usia ");
        int usia1 = Integer.parseInt(usia);
        String status = JOptionPane.showInputDialog("Masukkan status pernikahan : ");
        boolean menikah = false;
        boolean belumMenikah = true;
        
        if(usia1 <= 12){
            JOptionPane.showMessageDialog(null,"Kategori anak");
        } else if(usia1 >= 13 && usia1 <= 17){
            JOptionPane.showMessageDialog(null,"Kategori remaja");
        } else if(usia1 >= 18 && usia1 <=30 && belumMenikah){
            JOptionPane.showMessageDialog(null,"Kategori OMK");
        } else{
            JOptionPane.showMessageDialog(null,"Kategori dewasa");
        }
    }
}
