/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPrakAlgo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UTS_Soal1_1122041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan keikutsertaan : ");
        boolean keikutsertaan = scan.nextBoolean();
        System.out.print("Masukkan tingkat kompetisi : ");
        boolean tingkat = scan.nextBoolean();
        System.out.print("masukkan institusi : ");
        String institusi = scan.next();
        System.out.print("Masukkan aural : ");
        int aural = scan.nextInt();
        System.out.print("Masukkan sight-reading : ");
        int sight = scan.nextInt();

        boolean pernah = true;
        boolean tidakPernah = false;
        boolean nasional = true;
        boolean internasional = true;
        boolean bukanNasional = false;
        boolean rcm = true;

        if (pernah) {
            if (nasional || internasional) {
                System.out.println("Lulus seleksi tanpa harus audisi");
            } else {
                if (rcm) {
                    if (aural >= 17 && aural <= 18 && sight >= 19 && sight <= 21) {
                        System.out.println("Lulus seleksi tanpa harus audisi");
                    }
                    if (aural >= 12 && aural <= 16 && sight >= 14 && sight <= 18) {
                        System.out.println("Harus audisi");
                    }
                    if (aural < 12 && sight < 14) {
                        System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                    }
                } else {
                    if (aural >= 9 && aural <= 10 && sight >= 12 && sight <= 14) {
                        System.out.println("Lulus seleksi tanpa harus audisi");
                    }
                    if (aural >= 6 && aural <= 8 && sight >= 9 && sight <= 11) {
                        System.out.println("Harus audisi");
                    }
                    if (aural < 6 && sight < 9) {
                        System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                    }
                }
            }
        } else {
            if (rcm) {
                if (aural >= 17 && aural <= 18 && sight >= 19 && sight <= 21) {
                    System.out.println("Lulus seleksi tanpa harus audisi");
                }
                if (aural >= 12 && aural <= 16 && sight >= 14 && sight <= 18) {
                    System.out.println("Harus audisi");
                }
                if (aural < 12 && sight < 14) {
                    System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                }
            } else {
                if (aural >= 9 && aural <= 10 && sight >= 12 && sight <= 14) {
                    System.out.println("Lulus seleksi tanpa harus audisi");
                }
                if (aural >= 6 && aural <= 8 && sight >= 9 && sight <= 11) {
                    System.out.println("Harus audisi");
                }
                if (aural < 6 && sight < 9) {
                    System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                }
            }
        }
    }
}
