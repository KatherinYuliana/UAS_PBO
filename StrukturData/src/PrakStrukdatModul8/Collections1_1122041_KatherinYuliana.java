package PrakStrukdatModul8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Member {
    String nama;
    String telepon;

    public Member (String nama, String telepon){
        this.nama = nama;
        this.telepon = telepon;
    }
}

class Buku {
    String idBuku;
    String judul;

    public Buku (String idBuku, String judul){
        this.idBuku = idBuku;
        this.judul = judul;
    }
}

class Peminjaman {
    String idMember;
    String idBuku;

    public Peminjaman (String idMember, String idBuku){
        this.idMember = idMember;
        this.idBuku = idBuku;
    }
}

public class Collections1_1122041_KatherinYuliana {
    public static void addDataMember(Member member, Peminjaman peminjaman){
        Scanner scan = new Scanner(System.in);

        HashMap <String, Member> members = new HashMap<String, Member>();
        System.out.println("Masukkan id member: ");
        peminjaman.idMember = scan.nextLine();
        System.out.println("Masukkan nama member: ");
        member.nama = scan.nextLine();
        System.out.println("Masukkan no telepon member: ");
        member.telepon = scan.nextLine();

        Member m1 = new Member(member.nama, member.telepon);
        members.put(peminjaman.idMember, m1);

        System.out.println("Data berhasil ditambahkan");
    }

    public static void hapusDataMember(Member member){
        Scanner scan = new Scanner(System.in);

        HashMap <String, Member> members = new HashMap<String, Member>();
        System.out.println("Masukkan nama member yang mau dihapus: ");
        member.nama = scan.nextLine();

        members.remove(member.nama);

        System.out.println("Data " + member.nama + " telah dihapus");
    }

    public static void addDataBuku(Buku buku){
        Scanner scan = new Scanner(System.in);

        ArrayList <Buku> books = new ArrayList<Buku>();
        System.out.println("Masukkan id buku: ");
        buku.idBuku = scan.nextLine();
        System.out.println("Masukkan judul buku: ");
        buku.judul = scan.nextLine();

        Buku b1 = new Buku(buku.idBuku, buku.judul);
        books.add(0, b1);

        System.out.println("Data berhasil ditambahkan");
    }

    public static void hapusDataBuku(Buku buku){
        Scanner scan = new Scanner(System.in);

        ArrayList <Buku> books = new ArrayList<Buku>();
        System.out.println("Masukkan id buku yang mau dihapus: ");
        buku.idBuku = scan.nextLine();

        books.remove(buku.idBuku);

        System.out.println("Data " + buku.idBuku + " telah dihapus");
    }

    public static void pinjam(Peminjaman peminjaman, Member member, Buku buku){
        Scanner scan = new Scanner(System.in);
        
        HashMap <String, Member> members = new HashMap<String, Member>();
        ArrayList <Buku> books = new ArrayList<Buku>();
        LinkedList <Peminjaman> listPeminjaman = new LinkedList<Peminjaman>();
        Member m1 = new Member(member.nama, member.telepon);

        System.out.println("Masukkan id member: ");
        peminjaman.idMember = scan.nextLine();
        System.out.println("Masukkan id buku yang mau dipinjam: ");
        peminjaman.idBuku = scan.nextLine();

        // if(peminjaman.idMember == members.put(peminjaman.idMember, m1) && peminjaman.idBuku == books.add(buku)){
        //     listPeminjaman.remove();
        // } else {
        //     System.out.println("Id yang dimasukkan tidak ada dalam daftar");
        // }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Member member = new Member(null, null);
        Buku buku = new Buku(null, null);
        Peminjaman peminjaman = new Peminjaman(null, null);

        int menu = 0;
        while (menu != 6){
            System.out.println("1. Tambah data member \n2. Hapus data member \n3. Tambah data buku \n4. Hapus data buku \n5. Peminjaman \n6. Selesai \nPilih menu :");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    addDataMember(member, peminjaman);
                    break;
                case 2:
                    hapusDataMember(member);
                    break;
                case 3:
                    addDataBuku(buku);
                    break;
                case 4:
                    hapusDataBuku(buku);
                    break;
                case 5:
                    pinjam(peminjaman, member, buku);
                    break;
                case 6:
                    System.out.println("Selesai");
                    break;
            }
        }
    }
}
