package PrakStrukdatModul5;

import java.util.Scanner;

class Node{
    int data;
    Node next;
}


public class Modul5_No1_1122041_KatherinYuliana {
    static Node head = null;

    public static void addLast(Node number){
        Node temp = new Node();
        if (head == null){
            head = temp;
        } else {
            Node a = head;
            while(a.next != null){
                a = a.next;
            }
            a.next = temp;
        }
    }

    public static void addFirst(int angka){
        Node temp = new Node();
        temp.data = angka;
        temp.next = null;
        if(head == null){
            head =temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public static void deleteFirst(){
        if(head == null){
            System.out.println("Error");
        } else {
            Node a = head;
            head = head.next;
            a = null;
        }
    }

    public static void deleteLast(){
        if(head == null){
            System.out.println("Error");
        } else {
            if(head.next == null){
                head = null;
            } else {
                Node temp = head;
                while(temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public static void delete(int angka){
        Node temp = head;
        if(head == null){
            System.out.println("Error");
        } else {
            if(temp.data == angka){
                temp.next = head;
            } else {
                System.out.println("Error");
            }
        }
    }

    public static void showOrder(Node number, int angka){
        Node temp = head;
        int x = 1;
        
        if(head == null){
            System.out.println("Errror");
        } else {
            if(head.data == angka){
                System.out.println("Order: " + x);
            } else {
                while(temp.next != null && temp.data != angka){
                    temp = temp.next;
                    x++;
                }
                if(temp.data == angka){
                    System.out.println("Order: " + x);
                } else {
                    System.out.println("Angka yang dicari tidak ada");
                }
            }
        }
    }

    public static void show(Node number, int angka){
        Node temp = head;

        if(head == null){
            System.out.println("Error");
        } else {
            if(head.data == angka){
                System.out.println(head.data);
            } else {
                System.out.println("Angka yang dicari tidak ada");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node number = new Node();
        
        System.out.println("1. Add Last \n2. Add First \n3. Delete First \n4. Delete Last \n5. Delete \n6. Show Order \n7. Show \n8. Selesai");
        System.out.println("Pilih Menu: ");
        int menu = scan.nextInt();
        int angka = 0;
        
        while (menu != 8) {
            switch (menu) {
                case 1:
                    System.out.println("Masukkan angka: ");
                    angka = scan.nextInt();
                    addLast(number);
                    break;
                
                case 2:
                    System.out.println("Masukkan angka: ");
                    angka = scan.nextInt();
                    addFirst(angka);
                    break;

                case 3:
                    deleteFirst();
                    break;

                case 4:
                    deleteLast();
                    break;
                
                case 5:
                    System.out.println("Masukkan angka yang mau dihapus");
                    angka = scan.nextInt();
                    delete(angka);
                    break;

                case 6:
                    System.out.println("Pilih angka yang mau diprint");
                    angka = scan.nextInt();
                    showOrder(number, angka);
                    break;

                case 7:
                    System.out.println("Pilih angka yang mau diprint");
                    angka = scan.nextInt();
                    show(number,angka);
                    break;

                case 8:
                    System.out.println("Selesai");
                    break;
            }
            System.out.println("1. Add Last \n2. Add First \n3. Delete First \n4. Print Semua \n5. Selesai");
            System.out.println("Pilih Menu: ");
            menu = scan.nextInt();
        }
    }
}
