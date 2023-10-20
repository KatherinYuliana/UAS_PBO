
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
		in.nextLine();
        String nama1 = "";
        String nama2 = "";
        int phone = 0;
		for(int i=0;i<n;i++){
			nama1 = in.nextLine();
			phone=in.nextInt();
			in.nextLine();
		}
        for(int i = 0; i < n; i++){
            nama2 = in.nextLine();
        }
        for(int i = 0; i < n; i++){
            if(nama1 == nama2){
                System.out.println(nama1 + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
		while(in.hasNext()){
			String s=in.nextLine();
		}
        
//        int x[] = {2, 13, 1, 0};
//        int y[] = {3, 13, 2, 50};
//        int hasil = 0;
//        
//        for (int i = 0; i < x.length; i++) {
//            hasil = x[i] * y[i];
//            System.out.println(hasil);
//        }
        
//        System.out.println("Masukkan n: ");
//        int n = scan.nextInt();
//        int hasil = 0;
//        
//        for(int i = 1; i <= 10; i++){
//            hasil = n * i ;
//            System.out.println(n + " x " + i + " = " + hasil);   
//        }
    }
}
