/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Soal1 {
   
    public static void main(String[] args) {
        
        //Jarak 5 km
        //Time 10 menit
        //Kec dalam m/s
        
        int jarakKm = 5;
        int waktuMenit = 10;
        
        int jarakMeter = jarakKm * 1000;
        int waktuDetik = waktuMenit * 60;
        
        double hasil = jarakMeter/waktuDetik;
        
        System.out.println(hasil);
        
        
        
    }
    
}
