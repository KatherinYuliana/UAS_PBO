package PrakStrukdatModul7;

import java.util.Scanner;

public class Modul7_No1_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Sparse matriks
        int baris, kolom, total = 0;
		
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
		
		for(int i = 0; i < baris ; i++){
			for(int j = 0; j < kolom; j++){
				if(arr[i][j] == 0) {
					total++;
				}
			}
		}
		
		if(total > ((baris * kolom)/2)) {
			System.out.println("Matriks merupakan Sparse Matriks");
		}
		else {
			System.out.println("Matriks bukan merupakan Sparse Matriks");
		}

		System.out.println("-----------------------------------------------------");

        //Tridiagonal matriks
        System.out.println("Masukkan ukuran matriks: ");
		int ukuran = scan.nextInt();
		
		int array[][] = new int[ukuran][ukuran];
		
		System.out.println("Masukkan elemen matriks :  ");
		for(int i = 0; i < ukuran; i++) {
			for(int j = 0; j < ukuran; j++) {
				array[i][j] = scan.nextInt();
			}		
		}

		int a = 0;
		if(array[a][a] != 0 && array[a][a+1] != 0 && array[a+1][a] != 0){
			System.out.println("Matriks merupakan Tridiagonal Matriks");
		} else {
			System.out.println("Matriks bukan merupakan Tridiagonal Matriks");
		}
        
    }
}
