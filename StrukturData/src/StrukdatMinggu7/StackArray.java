package StrukdatMinggu7;

import java.util.Scanner;

class SStack{
    int MaxStack = 10;
    int s[] = new int[MaxStack];
    int top;
}

public class StackArray {
    public static boolean isFull(SStack stack) {
        return false;
    }

    public static boolean isEmpty(SStack stack) {
        return false;
    }
    
    public static void inisialisasi(SStack stack){
        System.out.println("Inisialisasi berhasil");
        stack.top = -1;
    }

    public static int push(SStack stack, int data){
        if(isFull(stack)){
            return 0;
        } else {
            return 1;
        }
    }

    public static int pop(SStack stack){
        
        return 0;
    }

    public static void printStack(SStack stack){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SStack stack = new SStack();
        SStack S1 = new SStack();
        SStack S2 = new SStack();

        int menu = 0;
        int pilih = 0;
        int data = 0;
        while(menu != 5){
            System.out.println("1. Inisialisasi \n2. Push \n3. Pop \n4. Lihat isi stack \n5. Exit");
            menu = scan.nextInt();

            if(menu == 1){
                System.out.println("Pilih stack 1 atau 2");
                pilih = scan.nextInt();
                if(pilih == 1){
                    inisialisasi(S1);
                } else {
                    inisialisasi(S2);
                }
            } else if(menu == 2){
                System.out.println("Pilih stack 1 atau 2");
                pilih = scan.nextInt();
                System.out.println("Masukkan data");
                data = scan.nextInt();
                if(pilih == 1){
                   
                } else {

                }
            } else if(menu == 3){
                System.out.println("Pilih stack 1 atau 2");
                pilih = scan.nextInt();
                System.out.println("Masukkan data");
                if(pilih == 1){
                    
                } else {

                }
            } else if(menu == 4){
                System.out.println("Pilih stack 1 atau 2");
                pilih = scan.nextInt();
                if(pilih == 1){
                    
                } else {

                }
            } else {

            } 
        }
    }
}
