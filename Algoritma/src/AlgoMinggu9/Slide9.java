/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;

/**
 *
 * @author DELL
 */
public class Slide9 {
    public static int luasPersegiPanjang2(int p, int l){
        int luas = p * l;
        return luas;
    }
    public static void main(String[] args) {
        int a = 10, b = 5, c = 4, d = 3;
        int luas1 = luasPersegiPanjang2(a,b);
        int luas2 = luasPersegiPanjang2(c,d);
        System.out.println("Luas 1 : " + luas1);
        System.out.println("Luas 2 : " + luas2);
    }
}
