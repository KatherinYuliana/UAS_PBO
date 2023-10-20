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
public class UTS_Soal3_1122041 {
    public static void main(String[] args) {
        double hasil = 0;
        int v = 340;
        String input = "Iya";

        while (input.equals("Iya")) {
            String jenis = JOptionPane.showInputDialog("Masukkan jenis harmonik");
            String tipe = JOptionPane.showInputDialog("Masukkan tipe harmonik");
            String l = JOptionPane.showInputDialog("Masukkan l");
            int l1 = Integer.parseInt(l);
            switch (jenis) {
                case "1":
                    switch (tipe) {
                        case "pipa organa terbuka":
                            hasil = v / 2 * l1;
                            break;
                        case "pipa organa tertutup":
                            hasil = v / 4 * l1;
                            break;
                        case "senar":
                            hasil = v / 2 * l1;
                            break;
                    }
                    break;
                case "2":
                    switch (tipe) {
                        case "pipa organa terbuka":
                            hasil = v / l1;
                            break;
                        case "pipa organa tertutup":
                            hasil = 3 * v / 4 * l1;
                            break;
                        case "senar":
                            hasil = 2 * v / 2 * l1;
                            break;
                    }
                    break;
                case "3":
                    switch (tipe) {
                        case "pipa organa terbuka":
                            hasil = 3 * v / 2 * l1;
                            break;
                        case "pipa organa tertutup":
                            hasil = 5 * v / 4 * l1;
                            break;
                        case "senar":
                            hasil = 3 * v / 2 * l1;
                            break;
                    }
                    break;
                case "4":
                    switch (tipe) {
                        case "pipa organa terbuka":
                            JOptionPane.showMessageDialog(null, "Tidak ada");
                            break;
                        case "pipa organa tertutup":
                            JOptionPane.showMessageDialog(null, "Tidak ada");
                            break;
                        case "senar":
                            hasil = 4 * v / 2 * l1;
                            break;
                    }
                    break;
            }
            JOptionPane.showMessageDialog(null, "Hasil " + hasil);
            input = JOptionPane.showInputDialog("Masih mau input? ");

        }
    }
}
