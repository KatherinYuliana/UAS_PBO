/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Node {

    String nim, nama;
    Node next;
}

public class MenuHeadTail {

    public static void addFirst() {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        System.out.println("NIM: ");
        String nim = scan.next();
        System.out.println("Nama: ");
        String nama = scan.next();
        Node newNode = new Node();
        newNode.nim = nim;
        newNode.nama = nama;

        if (head == null) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void printSemua(){
        Node head = null;
        Node tail = null;
        Node current = head;
        
        while (current != null){
            System.out.println(current.nim + current.nama);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add First \n2. Add Last \n3. Print data ke \n4. Print Semua \n5. Selesai");
        System.out.println("Pilih Menu: ");
        int menu = scan.nextInt();

        while (menu != 5) {
            switch (menu) {
                case 1:
                    addFirst();
                    break;
                    
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
            }

            System.out.println("1. Add First \n2. Add Last \n3. Print data ke \n4. Print Semua \n5. Selesai");
            System.out.println("Pilih Menu: ");
            menu = scan.nextInt();
        }
    }
}
