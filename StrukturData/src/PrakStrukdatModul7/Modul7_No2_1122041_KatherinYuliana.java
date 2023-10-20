package PrakStrukdatModul7;

import java.util.Scanner;

public class Modul7_No2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String matriks[][] = new String[10][10];
        String transpose[][] = new String[10][10];
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = scan.nextInt();
        
        System.out.println("Masukkan elemen matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = scan.next();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }

        System.out.println("Transpose matriks: ");
        
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
