package PrakStrukdatModul7;

import java.util.Scanner;

public class Modul7_No4_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int baris, kolom = 0;
		
		System.out.println("Masukkan baris: ");
		baris = scan.nextInt();
        System.out.println("Masukkan kolom: ");
		kolom = scan.nextInt();
		
		int arr[][] = new int[baris][kolom];
		
		System.out.println("Masukkan elemen matriks :  ");
		for(int i = 0; i < baris; i++) {
			for(int j = 0; j < kolom; j++) {
				arr[i][j] = scan.nextInt();
			}		
		}

        System.out.println("Masukkan k: ");
        int k = scan.nextInt();

		System.out.print(arr[k][k]);
        System.out.println(arr[k][k+1]);
        System.out.print(arr[k+1][k]);
        System.out.print(arr[k+1][k+1]);
    }
}
