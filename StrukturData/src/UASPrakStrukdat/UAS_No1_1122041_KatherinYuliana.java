package UASPrakStrukdat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UAS_No1_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();
        
        if (pilih == 1){
            ArrayList<Integer> data1 = new ArrayList<Integer>();
            int n = scan.nextInt();

            if (n == 0){
                System.out.println("Array Kosong");
            } else {
                for (int i = 0; i < n; i++){
                    int angka = scan.nextInt();
                    data1.add(angka);
                }
                System.out.println(data1);
                Collections.sort(data1);
                System.out.println(data1);
            }

        } else if (pilih == 2){
            ArrayList<Character> data2 = new ArrayList<Character>();
            int n = scan.nextInt();

            if (n == 0){
                System.out.println("Array Kosong");
            } else {
                for (int i = 0; i < n; i++){
                    char huruf = scan.next().charAt(0);
                    data2.add(huruf);
                }
                System.out.println(data2);
                Collections.sort(data2);
                System.out.println(data2);
            }

        } else {
            ArrayList<String> data3 = new ArrayList<String>();
            int n = scan.nextInt();
            
            if (n == 0){
                System.out.println("Array Kosong");
            } else {
                for (int i = 0; i <= n; i++){
                    String kata = scan.nextLine();
                    data3.add(kata);
                }
                System.out.println(data3);
                Collections.sort(data3);
                System.out.println(data3);
            }
        }
    }
}
