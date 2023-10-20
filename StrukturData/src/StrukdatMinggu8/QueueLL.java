package StrukdatMinggu8;

import java.util.Scanner;

class Node{
    char q;
    Node next;
}

class Queue{
    Node head = null;
    Node tail = null;
}

public class QueueLL {
    public static void inisialisasi(Queue q){
        
    }

    public static void insert(Queue q){

    }

    public static void delete(Queue q){

    }

    public static void print(Queue q){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue q = new Queue();
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();

        int menu = 0;
        int pilih = 0;
        int data = 0;
        while(menu != 5){
            System.out.println("1. Inisialisasi \n2. Insert Q \n3. Delete Q \n4. Print Q \n5. Selesai");
            menu = scan.nextInt();

            if(menu == 1){
                System.out.println("Pilih Q1 atau Q2");
                pilih = scan.nextInt();
                if(pilih == 1){
                    inisialisasi(Q1);
                } else {
                    inisialisasi(Q2);
                }
            } else if(menu == 2){
                System.out.println("Pilih Q1 atau Q2");
                pilih = scan.nextInt();
                System.out.println("Masukkan data");
                data = scan.nextInt();
                if(pilih == 1){
                   
                } else {

                }
            } else if(menu == 3){
                System.out.println("Pilih Q1 atau Q2");
                pilih = scan.nextInt();
                System.out.println("Masukkan data");
                if(pilih == 1){
                    
                } else {

                }
            } else if(menu == 4){
                System.out.println("Pilih Q1 atau Q2");
                pilih = scan.nextInt();
                if(pilih == 1){
                    
                } else {

                }
            } else {

            } 
        }
    }
}
