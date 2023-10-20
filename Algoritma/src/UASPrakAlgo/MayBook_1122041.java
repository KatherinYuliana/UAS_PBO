/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASPrakAlgo;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */

class Book {
    String ISBN;
    String title;
    int yearPublished;
    Author author = new Author();
    int stock;
}

class Customer {
    String customerID;
    String customerName;
    String phoneNum;
}

class Author {
    String authorID;
    String authorName;
    String phoneNum;
}

class Transaction {
    Customer customer = new Customer();
    Book[] arrBooksBorrowed = new Book[8];
    int dateBorrowed;
    int booksBorrowed;
}

class Admin {
    String userName;
    String password;
}

public class MayBook_1122041 {
    public static void pinjamBuku(Book book, Transaction[] arrTransaction, Customer customer) {
        book.ISBN = JOptionPane.showInputDialog("Masukkan ISBN");
        if (book.stock == 0) {
            JOptionPane.showMessageDialog(null, "Maaf, stok buku habis");
        }
        for (int i = 0; i < arrTransaction.length; i++) {
            arrTransaction[i].customer.customerID = JOptionPane.showInputDialog("Masukkan Customer ID");
            arrTransaction[i].customer.customerName = JOptionPane.showInputDialog("Masukkan Nama Customer");
            arrTransaction[i].customer.phoneNum = JOptionPane.showInputDialog("Masukkan Nomor Telepon");
            arrTransaction[i].dateBorrowed = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tanggal"));
            arrTransaction[i].booksBorrowed = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku yang dipinjam"));
        }
    }

    public static void pengembalianBuku(Book book, Customer customer, Transaction[] arrTransaction) {
        book.ISBN = JOptionPane.showInputDialog("Masukkan ISBN");
        customer.customerID = JOptionPane.showInputDialog("Masukkan Customer ID");
        customer.customerName = JOptionPane.showInputDialog("Masukkan Nama Customer");
        customer.phoneNum = JOptionPane.showInputDialog("Masukkan Nomor Telepon");
        int tanggalPengembalian = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tanggal Pengembalian"));
        
        String isbn = "";
        if (book.ISBN != isbn) {
            JOptionPane.showMessageDialog(null, "Maaf tidak ada data peminjaman");
        }

        int lamaPinjam = 0;
        int denda = 0;
        for (int i = 0; i < arrTransaction.length; i++) {
            lamaPinjam = tanggalPengembalian - arrTransaction[i].dateBorrowed;
        }
        if (lamaPinjam > 7) {
            denda = 10000;
        }
    }

    public static void cekPinjam(Book book, Transaction[] arrTransaction) {
        book.ISBN = JOptionPane.showInputDialog("Masukkan ISBN");
        String isbn = "";
        
        if (book.ISBN != isbn) {
            JOptionPane.showMessageDialog(null, "Buku tidak sedang dipinjam");
        } else {
            for (int i = 0; i < arrTransaction.length; i++) {
                arrTransaction[i].customer.customerID = JOptionPane.showInputDialog("Masukkan Customer ID");
                arrTransaction[i].customer.customerName = JOptionPane.showInputDialog("Masukkan Nama Customer");
                arrTransaction[i].customer.phoneNum = JOptionPane.showInputDialog("Masukkan Nomor Telepon");
                arrTransaction[i].dateBorrowed = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tanggal"));
                arrTransaction[i].booksBorrowed = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku yang dipinjam"));
            }
        }
    }

    public static void admin() {
        Book book = new Book();
        Transaction[] arrTransaction = new Transaction[7];
        Customer customer = new Customer();
        pinjamBuku(book, arrTransaction, customer);
        
        for (int i = 0; i < arrTransaction.length; i++) {
            JOptionPane.showMessageDialog(null, arrTransaction[i].customer.customerID);
            JOptionPane.showMessageDialog(null, arrTransaction[i].customer.customerName);
            JOptionPane.showMessageDialog(null, arrTransaction[i].customer.phoneNum);
            JOptionPane.showMessageDialog(null, arrTransaction[i].booksBorrowed);
            JOptionPane.showMessageDialog(null, arrTransaction[i].dateBorrowed);
        }
    }

    public static void main(String[] args) {
        Book[] arrBook = new Book[8];
        Transaction[] arrTransaction = new Transaction[7];
        Admin admin = new Admin();
        int count = 0;
        String username = "Katherin";
        String password = "123";

        while (count < 3 && admin.userName != username && admin.password != password) {
            admin.userName = JOptionPane.showInputDialog("Masukkan Username");
            admin.password = JOptionPane.showInputDialog("Masukkan Password");
            if (admin.userName != username && admin.password != password) {
                count++;
                JOptionPane.showMessageDialog(null, "Username atau password yang dimasukkan salah");
            }
        }

        Book book = new Book();
        Customer customer = new Customer();

        String input = JOptionPane.showInputDialog("Pilih Menu: " + "\n" + "A. Menu Peminjaman Buku" + "\n" + "B. Menu Pengembalian Buku" + "\n" + "C. Menu Cek" + "\n" + "D. Menu Admin");
        if (input == "A") {
            pinjamBuku(book, arrTransaction, customer);
        } else if (input == "B") {
            pengembalianBuku(book, customer, arrTransaction);
        } else if (input == "C") {
            cekPinjam(book, arrTransaction);
        } else if (input == "D") {
            admin();
        }
    }
}
