package TubesStrukdat;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class diskon {
    public static void main(String[] args) {
        // ArrayList<String> discounts = new ArrayList<String>();
        // Scanner scanner = new Scanner(System.in);
        
        // Menambahkan diskon ke dalam list
        // discounts.add("Diskon 10%");
        // discounts.add("Diskon 20%");
        // discounts.add("Diskon 30%");
        // discounts.add("Diskon 40%");
        // discounts.add("Diskon 50%");

        // System.out.println("Diskon yang tersedia: ");
        // // for (String discount : discounts) {
        // //     System.out.println("- " + discount);
        // // }
        // String temp[] = new String[5];
        // int i = 0;
        // for (String discount : discounts) {
        //     //System.out.println("- " + discount);
        //     temp[i] = discount;
        //     i++;
            
        // }
        // JOptionPane.showMessageDialog(null, "Diskon yang tersedia: \n" + temp[i]);

        // System.out.print("\nMasukkan nomor diskon yang ingin dipilih: ");
        // int selectedDiscount = scanner.nextInt();

        // Menghapus diskon yang telah dipilih dari list
        // if (selectedDiscount > 0 && selectedDiscount <= discounts.size()) {
        //     String selected = discounts.get(selectedDiscount-1);
        //     discounts.remove(selectedDiscount-1);
        //     System.out.println("\nAnda telah memilih diskon " + selected + ".");
        //     System.out.println("Diskon yang tersedia sekarang: ");
        //     for (String discount : discounts) {
        //         System.out.println("- " + discount);
        //     }
        // } else {
        //     System.out.println("\nNomor diskon yang anda masukkan tidak valid.");
        // }

        
        // ArrayList<String> discounts = new ArrayList<String>();

        // // Menambahkan diskon ke dalam list
        // discounts.add("Diskon 10%");
        // discounts.add("Diskon 20%");
        // discounts.add("Diskon 30%");
        // discounts.add("Diskon 40%");
        // discounts.add("Diskon 50%");

        // boolean continueSelecting = true;

        // while (continueSelecting && discounts.size() > 0) {
        //     String selectedDiscount = (String) JOptionPane.showInputDialog(null, "Diskon yang tersedia:" + discounts);


        //     if (selectedDiscount != null) {
        //         discounts.remove(selectedDiscount);
        //         JOptionPane.showMessageDialog(null, "Anda telah memilih diskon " + selectedDiscount + ".");
        //     } else {
        //         JOptionPane.showMessageDialog(null, "Anda tidak memilih diskon.");
        //         continueSelecting = false;
        //     }
        // }

        // if (discounts.size() == 0) {
        //     JOptionPane.showMessageDialog(null, "Tidak ada diskon yang tersedia lagi.");
        // }

        //ArrayList<String> discounts = new ArrayList<String>();
        
        // Menambahkan diskon ke dalam list
        // discounts.add("Diskon 10%");
        // discounts.add("Diskon 15%");
        // discounts.add("Diskon 20%");
        // discounts.add("Diskon 25%");
        // discounts.add("Diskon 30%");
        
        
        //int arrDiskon[] = {10, 15, 20, 25, 30};
        
        // String selectedDiscount = (String) JOptionPane.showInputDialog(null, 
        // "Diskon yang tersedia:", 
        // "Pilih Diskon", 
            // JOptionPane.PLAIN_MESSAGE, 
            // null, 
            // discounts.toArray(), 
            // discounts.get(0));

            // if (selectedDiscount != null) {
                //     JOptionPane.showMessageDialog(null, "Anda telah memilih diskon " + selectedDiscount + ".");
                // } else {
                    //     JOptionPane.showMessageDialog(null, "Anda tidak memilih diskon.");
                    // }
                    
                    // int dis = arrDiskon[discounts];
                    // System.out.println(arrDiskon[]);
                    ArrayList<Integer> discounts = new ArrayList<Integer>();
                    discounts.add(10);
                    discounts.add(15);
                    discounts.add(20);
                    discounts.add(25);
                    discounts.add(30);
            
                    int pilih = JOptionPane.showConfirmDialog(null, "Ingin menggunakan diskon?", "Diskon", JOptionPane.YES_NO_OPTION);
            
                    if (pilih == JOptionPane.YES_OPTION) {
                    String pilihDiskon = JOptionPane.showInputDialog(null, "1. Diskon 10% \n2. Diskon 15% \n3. Diskon 20% \n4. Diskon 25% \n5. Diskon 30%");
                    int pilihDiskon2 = Integer.parseInt(pilihDiskon);
                    
                    double temp = discounts.get(pilihDiskon2-1);
                    
                    double diskon = temp / 100;
                    discounts.remove(pilihDiskon2 - 1);
                    JOptionPane.showMessageDialog(null, "Diskon yang tersedia: \n" + discounts);
                }
            }
        }
        
