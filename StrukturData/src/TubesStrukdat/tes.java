package TubesStrukdat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Member{
    String nama;
    int umur;
    public Member(String nama, int umur){
        this.nama = "Katherin";
        this.umur = 20;
    }
}

class Pesawat {
    String kotaAsal[] = { "Jakarta", "Tokyo", "New York", "Sydney", "Bangkok" };
    String kotaTujuan[] = { "Jakarta", "Tokyo", "New York", "Sydney", "Bangkok" };
    String tanggal;
    int jumlahPenumpang;
    String kelas[] = { "Economy", "Business", "First Class" };
    int harga;
}

class Data {
    String nama;
    int usia;
    String noTelp;
    int beratBagasi;
}

public class tes {
    public static int hargaTiketPesawat(Pesawat pesan, int asal2, int tujuan2) {
        if (asal2 == tujuan2) {
            pesan.harga = 0;
        } else if (asal2 == 1) {
            if (tujuan2 == 2) {
                pesan.harga = 1000000;
            } else if (tujuan2 == 3) {
                pesan.harga = 2000000;
            } else if (tujuan2 == 4) {
                pesan.harga = 3000000;
            } else {
                pesan.harga = 4000000;
            }
        } else if (asal2 == 2) {
            if (tujuan2 == 1) {
                pesan.harga = 1500000;
            } else if (tujuan2 == 3) {
                pesan.harga = 2500000;
            } else if (tujuan2 == 4) {
                pesan.harga = 3500000;
            } else {
                pesan.harga = 4500000;
            }
        } else if (asal2 == 3) {
            if (tujuan2 == 1) {
                pesan.harga = 1200000;
            } else if (tujuan2 == 2) {
                pesan.harga = 2400000;
            } else if (tujuan2 == 4) {
                pesan.harga = 3600000;
            } else {
                pesan.harga = 4800000;
            }
        } else if (asal2 == 4) {
            if (tujuan2 == 1) {
                pesan.harga = 1200000;
            } else if (tujuan2 == 2) {
                pesan.harga = 2200000;
            } else if (tujuan2 == 3) {
                pesan.harga = 3200000;
            } else {
                pesan.harga = 4200000;
            }
        } else {
            if (tujuan2 == 1) {
                pesan.harga = 1800000;
            } else if (tujuan2 == 2) {
                pesan.harga = 2800000;
            } else if (tujuan2 == 3) {
                pesan.harga = 3800000;
            } else {
                pesan.harga = 4800000;
            }
        }

        return pesan.harga;
    }

    public static int totalHargaTiketPesawat(int kelas2, int pesanTiket, Data data) {
        int total = 0;
        if (kelas2 == 1) {
            total = pesanTiket;
        } else if (kelas2 == 2) {
            total = pesanTiket + 300000;
        } else {
            total = pesanTiket + 500000;
        }
        return total;
    }

    public static void pesanananTiketPesawat(Pesawat pesan, int asal2, int tujuan2, int kelas2, int totalHarga) {
        JOptionPane.showMessageDialog(null,
        "Kota asal: " + pesan.kotaAsal[asal2 - 1] +
        "\nKota tujuan: " + pesan.kotaTujuan[tujuan2 - 1] +
        "\nTanggal keberangkatan: " + pesan.tanggal +
        "\nJumlah penumpang: " + pesan.jumlahPenumpang +
        "\nKelas: " + pesan.kelas[kelas2 - 1] +
        "\n\nTotal harga: " + totalHarga);
    }
    
    public static void isiData(Data data, Pesawat pesan) {
        LinkedList<String>name = new LinkedList<String>();
        data.nama = JOptionPane.showInputDialog(null, "Masukkan nama");
        name.add(data.nama);
        String usia = JOptionPane.showInputDialog(null, "Masukkan usia");
        data.usia = Integer.parseInt(usia);
        data.noTelp = JOptionPane.showInputDialog(null, "Masukkan nomor telepon");
    }

    public static void main(String[] args) {
        LinkedList<String>history = new LinkedList<String>();
        LinkedList<Integer>total = new LinkedList<Integer>();
        ArrayList<String> bookingHistory = new ArrayList<String>();


        Pesawat pesan = new Pesawat();
        Data data = new Data();
        
        int pilih2 = 0;
        while (pilih2 != 3){
            String pilih = JOptionPane.showInputDialog("Pilih menu: \n1. Tiket Pesawat \n2. History Pesanan \n3. Keluar");
            pilih2 = Integer.parseInt(pilih);

            switch(pilih2){
                case 1:
                String asal = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
                int asal2 = Integer.parseInt(asal);
                history.add(pesan.kotaAsal[asal2-1]);
                String tujuan = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
                int tujuan2 = Integer.parseInt(tujuan);
                history.add(pesan.kotaTujuan[tujuan2-1]);
                pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
                String jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
                pesan.jumlahPenumpang = Integer.parseInt(jumlah);
                String kelas = JOptionPane.showInputDialog(null,"1. Economy \n2. Business \n3. First Class \nPilih kelas");
                int kelas2 = Integer.parseInt(kelas);
                history.add(pesan.kelas[kelas2-1]);

                int pesanTiket = hargaTiketPesawat(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;
                // diskon = diskon();
                int totalHarga = 0;
                // if(diskon == 0){
                    totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data);
                //         } else {
                //             totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data) * diskon / 100;
                //         }
                        total.add(totalHarga);
                        isiData(data, pesan);
                        pesanananTiketPesawat(pesan, asal2, tujuan2, kelas2, totalHarga);
                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + "\t\t | " + totalHarga);
                String a = "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + "\t\t | " + totalHarga;
                    bookingHistory.add(a);
                        break;
                case 2:
                if(history.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "History pesanan kosong");
                } else {
                    for (String booking : bookingHistory) {
                        //System.out.println("- " + booking);
                        JOptionPane.showMessageDialog(null, booking);
                    }
                    // String temp[] = new String[6];
                    //     int temp2 = 0;
                    //     int i = 0;
                        
                    // for(String datum : history) {
                    //     temp[i] = datum;
                    //     i++;
                    // }
                    // for(Integer harga : total){
                    //     temp2 = harga;
                    // }
                    // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + "\t\t | " + temp2);
                }
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Terima Kasih");
                break;
            }
        }
    }
}
