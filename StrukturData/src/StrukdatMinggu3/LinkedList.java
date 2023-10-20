/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Node{
    String nim, nama;
    Node next;
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        
        System.out.println("NIM: (0 = berhenti)");
        String nim = scan.next();
        while(!nim.equals("0")){
            System.out.println("Nama: ");
            String nama = scan.next();
            Node newNode = new Node();
            newNode.nim = nim;
            newNode.nama = nama;
            
            newNode.next = head;
            head = newNode;
            
            System.out.println("NIM: (0 = berhenti)");
            nim = scan.next();
        }
        
        Node current = head;
        System.out.println("Linked list add first");
        while(current != null){
            System.out.println(current.nim + " " + current.nama);
            current = current.next;
        }
        
        System.out.println("NIM yang akan dihapus: ");
        String hapus = scan.next();
        while(!nim.equals("0")){
            Node newNode = new Node();
             if (head == null){
                // addFirst
                newNode.next = head;
                head = newNode;
            } else {
                current = head;
                while (current.next != null){
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }
}
