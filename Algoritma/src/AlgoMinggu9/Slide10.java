/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;



/**
 *
 * @author DELL
 */
public class Slide10 {
    public static float luasSegitigaSikuSiku(int p, int l){
        float luas;
            luas = (float) (0.5 * p * l);
        return luas;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 5, c = 4, d = 3;
        float luas1 = luasSegitigaSikuSiku(a,b);
        float luas2 = luasSegitigaSikuSiku(c,d);
        System.out.println("Luas 1:" + luas1);
        System.out.println("Luas 2:" + luas2);
    }
}
