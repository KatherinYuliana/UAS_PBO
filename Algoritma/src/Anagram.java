/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Anagram {
    public static void main(String[] args) {
        //Input String dan hitung panjang nya
        String kata1 = JOptionPane.showInputDialog("Masukan Kata 1");
        String kata2 = JOptionPane.showInputDialog("Masukan Kata 1]2");
        String temp1 = "";
        String temp2 = "";
        int kataa1 = kata1.length();
        int kataa2 = kata2.length();
        int penanda = 0;
        
        //hilangksan spasi
        for (int i = 0; i < kataa1; i++) {
            if (kata1.charAt(i) == ' ') {
                penanda = i;
                i = i + 1;
            }
            temp1 = temp1 + kata1.charAt(i);
        }
        temp1 = temp1.toLowerCase();

        for (int i = 0; i < kataa2; i++) {
            if (kata2.charAt(i) == ' ') {
                penanda = i;
                i = i + 1;
            }
            temp2 = temp2 + kata2.charAt(i);
        }
        temp2 = temp2.toLowerCase();
        
        
        // cek huruf dan menandai dengan =
        String tempAhkir = temp2;
        for (int i = 0; i < temp1.length(); i++) {
            for (int j = 0; j < temp2.length(); j++) {
                if (temp1.charAt(i) == temp2.charAt(j)) {
                    tempAhkir  = tempAhkir.replace(temp1.charAt(i), '=');
                    System.out.println("Cek Kata  : " + tempAhkir);
                }
            }
        }
        
        System.out.println("Kata 1  : " + temp1);
        System.out.println("Kata 2  : " + temp2);
        System.out.println("Check  : " + tempAhkir);
        
        // cek anagram atau bukan 
        boolean check  = true;
        
        for (int i = 0 ; i <  tempAhkir.length() ; i++){
            if(tempAhkir.charAt(i)!= '='){
                check =  false;  
            }   
        }
        
        if (check == true){
            System.out.println("ini Anagram");
        }   else {
                System.out.println("ini bukan anagram");
        }
    }
}
