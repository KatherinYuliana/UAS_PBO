/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

/**
 *
 * @author DELL
 */
public class Slide7 {
    static int p,l;
    public static int luasPersegiPanjang(){
        int luas = p * l;
        return luas;
    }
    
    public static void main(String[] args) {
        //PP pertama
        p = 10; l = 5;
        int luas1 = luasPersegiPanjang();
        System.out.println("luas 1 " + luas1);
        //PP kedua
        p = 4; l = 3;
        int luas2 = luasPersegiPanjang();
        System.out.println("luas 2 " + luas2);
    }  
}
