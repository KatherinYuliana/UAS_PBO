/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakAlgoModul7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Karyawan{
    String nama, jabatan;
    Alamat alamat = new Alamat();
    Penghasilan penghasilan = new Penghasilan();
}

class Alamat{
    String jalan, kota, provinsi;
}

class Penghasilan{
    double gaji, tunjanganTransport, tunjanganMakan;
}

public class KatherinYuliana_1122041_Modul7_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        System.out.println("Nama: ");
        karyawan.nama = scan.nextLine();
        System.out.println("Jabatan: ");
        karyawan.jabatan = scan.nextLine();
        System.out.println("Jalan: ");
        karyawan.alamat.jalan = scan.nextLine();
        System.out.println("Kota: ");
        karyawan.alamat.kota = scan.nextLine();
        System.out.println("Provinsi: ");
        karyawan.alamat.provinsi = scan.nextLine();
        System.out.println("Gaji: ");
        karyawan.penghasilan.gaji = scan.nextDouble();
        System.out.println("Tunjangan Transport: ");
        karyawan.penghasilan.tunjanganTransport = scan.nextDouble();
        System.out.println("Tunjangan Makan: ");
        karyawan.penghasilan.tunjanganMakan = scan.nextDouble();
        
        System.out.println("Nama: " + karyawan.nama);
        System.out.println("Jabatan: " + karyawan.jabatan);
        System.out.println("Alamat: " + karyawan.alamat.jalan + ", " + karyawan.alamat.kota + ", " + karyawan.alamat.provinsi);
        System.out.println("Gaji: " + karyawan.penghasilan.gaji);
        System.out.println("Tunjangan Transport: " + karyawan.penghasilan.tunjanganTransport);
        System.out.println("Tunjangan Makan: " + karyawan.penghasilan.tunjanganMakan);
    }
}
