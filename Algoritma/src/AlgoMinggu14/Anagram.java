/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu14;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Anagram {
    public static String sort(String kata1, String kata2){
        String temp = "";
        for (int i = 0; i < kata1.length(); i++) {
            for (int j = i + 1; j < kata2.length(); j++) {
                
            }
        }
        return temp;
    }
    public static String egual(String sorting){
        
        return "";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kata1 = "acaa";
        String kata2 = "caaa";
        
        String sorting = sort(kata1, kata2);
        System.out.println("cek : " + sorting);
    }
}
