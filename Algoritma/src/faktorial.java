/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class faktorial {
    public static void main(String[] args) {
        int n = 5;
        int faktorial = 1;
        for (int i = 0; i < n + 1; i++) {
            faktorial = 1;
        
        for (int faktor = 1; faktor <= i; faktor++) 
            faktorial *= faktor;
            System.out.println(faktorial);
        }
    }
}
