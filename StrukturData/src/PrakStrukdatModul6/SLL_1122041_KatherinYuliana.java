package PrakStrukdatModul6;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(){

    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL_1122041_KatherinYuliana {
    static Node head = null;
    static Node tail = null;
    
    public static void addFirst(int number){
        if(head == null){
            head = new Node(number);
            tail = head;
        } else {
            Node temp = new Node(number);
            temp.next = head;
            head = temp;
        }
    }

    public static void addLast(int number){
        if(head == null && tail == null){
            head = new Node(number);
            tail = head;
        } else {
            Node temp = new Node();
            tail.next = temp;
            tail = temp;
        }
    }

    public static void deleteLast(){
        if(head == null && tail == null){
            System.out.println("List kosong");
        } else if(head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public static void show(){
        Node current = head;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }
        System.out.println(tail);
    }

    public static void showReverse(){
        Node current = head;
        System.out.println(tail);
        while(current != null){
            current = current.next;
            System.out.println(current);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Add First \n2. Add Last \n3. Delete Last \n4. Show \n5. Show Reverse \n6. Selesai");
        System.out.println("Pilih Menu: ");
        int menu = scan.nextInt();
        int number = 0;
        
        while (menu != 8) {
            switch (menu) {
                case 1:
                    System.out.println("Masukkan angka: ");
                    number = scan.nextInt();
                    addFirst(number);
                    break;
                
                case 2:
                    System.out.println("Masukkan angka: ");
                    number = scan.nextInt();
                    addLast(number);
                    break;

                case 3:
                    deleteLast();
                    break;

                case 4:
                    show();
                    break;

                case 5:
                    showReverse();
                    break;
                
                case 6:
                    System.out.println("Selesai");
                    break;
            }
            System.out.println("1. Add First \n2. Add Last \n3. Delete Last \n4. Show \n5. Show Reverse \n6. Selesai");
            System.out.println("Pilih Menu: ");
            menu = scan.nextInt();
        }
    }
}
