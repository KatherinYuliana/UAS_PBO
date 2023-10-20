package PrakStrukdatModul6;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(){

    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DLL_1122041_KatherinYuliana {
    static Node head = null;
    static Node tail = null;

    public static void addFirst(int number){
        if(head == null){
            head = new Node(number);
        } else {
            Node temp = new Node(number);
            temp.next = head;
            head = temp;
            head.next.prev = head;
        }
    }

    public static void addLast(int number){
        Node temp = new Node(number);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void insertAfter(int key, int number){
        if(key == number){
            Node temp = new Node(key);
            temp.next = new Node(number);
        } else {
            System.out.println("Key tidak ada di LL");
        }
    }

    public static void displayForward(){
        Node current = head;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }
        System.out.println(tail);
    }

    public static void displayBackward(){
        Node current = head;
        System.out.println(tail);
        while(current != null){
            current = current.next;
            System.out.println(current);
        }
    }

    public static void addOrdered(int nilai, int number){
        if(nilai == number){
            Node temp = new Node(nilai);
            temp.next = temp;
        } else {

        }
    }

    public static double average(){
        Node x = new Node();
        double rata = 0;
        int count = 0;
        if(x == head){
            count += 1;
        }
        while(x != tail){
            count++;
        }
        if(x == tail){
            count += 1;
        }
        rata = x.data + count;
        return rata;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Add First \n2. Add Last \n3. Insert After \n4. Display Forward \n5. Display Backward \n6. Add Ordered \n7. Average \n8. Selesai");
        System.out.println("Pilih Menu: ");
        int menu = scan.nextInt();
        int number = 0;
        int key = 0;
        int nilai = 0;
        
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
                    System.out.println("Masukkan key:");
                    key = scan.nextInt();
                    System.out.println("Masukkan angka yang mau di insert: ");
                    number = scan.nextInt();
                    insertAfter(key, number);
                    break;

                case 4:
                    displayForward();
                    break;
                
                case 5:
                    displayBackward();
                    break;

                case 6:
                    System.out.println("Masukkan angka yang mau di sisipkan: ");
                    nilai = scan.nextInt();
                    addOrdered(nilai, number);
                    break;

                case 7:
                    double average = average();
                    System.out.println("Average: " + average);
                    break;

                case 8:
                    System.out.println("Selesai");
                    break;
            }
            System.out.println("1. Add First \n2. Add Last \n3. Insert After \n4. Display Forward \n5. Display Backward \n6. Add Ordered \n7. Average \n8. Selesai");
            System.out.println("Pilih Menu: ");
            menu = scan.nextInt();
        }
    }
}
