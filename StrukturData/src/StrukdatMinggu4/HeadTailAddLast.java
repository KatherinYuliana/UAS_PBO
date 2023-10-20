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

class Node{
    String nim, nama;
    Node next;
}

public class HeadTailAddLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        
        System.out.println("NIM: (0 = berhenti)");
        String nim = scan.next();
        
        //tidak ada while
        
        while(!nim.equals("0")){
            System.out.println("Nama: ");
            String nama = scan.next();
            Node newNode = new Node();
            newNode.nim = nim;
            newNode.nama = nama;
            
            if(head == null){
                tail = newNode;
            }
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
        
        //print data terakhir
        System.out.println("Data terakhir: " + tail.nim + " " + tail.nama);
    }
}
