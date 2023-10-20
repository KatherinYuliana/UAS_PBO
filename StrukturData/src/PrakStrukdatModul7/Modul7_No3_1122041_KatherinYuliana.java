package PrakStrukdatModul7;

import java.util.Scanner;

public class Modul7_No3_1122041_KatherinYuliana {
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

        int a = 0;
		if(arr[a][a] == arr[a+1][a+1]){
			System.out.println("Matriks merupakan Matriks Toeplitz");
		} else {
			System.out.println("Matriks bukan merupakan Matriks Toeplitz");
		}
    }
}
