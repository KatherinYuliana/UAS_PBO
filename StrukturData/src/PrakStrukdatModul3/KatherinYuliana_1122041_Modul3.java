/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul3;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
class Studio {

    String kode;
    int kapasitas;
    String kursi[][] = new String[6][5];

    public Studio(String kode, int kapasitas, String kursi[][]) {
        this.kode = kode;
        this.kapasitas = kapasitas;
        this.kursi = kursi;

        this.kursi[0][0] = "A1";
        this.kursi[0][1] = "A2";
        this.kursi[0][2] = "A3";
        this.kursi[0][3] = "A4";
        this.kursi[0][4] = "A5";
        this.kursi[1][0] = "B1";
        this.kursi[1][1] = "B2";
        this.kursi[1][2] = "B3";
        this.kursi[1][3] = "B4";
        this.kursi[1][4] = "B5";
        this.kursi[2][0] = "C1";
        this.kursi[2][1] = "C2";
        this.kursi[2][2] = "C3";
        this.kursi[2][3] = "C4";
        this.kursi[2][4] = "C5";
        this.kursi[3][0] = "D1";
        this.kursi[3][1] = "D2";
        this.kursi[3][2] = "D3";
        this.kursi[3][3] = "D4";
        this.kursi[3][4] = "D5";
        this.kursi[4][0] = "E1";
        this.kursi[4][1] = "E2";
        this.kursi[4][2] = "E3";
        this.kursi[4][3] = "E4";
        this.kursi[4][4] = "E5";
        this.kursi[5][0] = "F1";
        this.kursi[5][1] = "F2";
        this.kursi[5][2] = "F3";
        this.kursi[5][3] = "F4";
        this.kursi[5][4] = "F5";
    }
}

class Film {

    String judul[] = new String[3];
    String genre;
    int durasi;
    String jadwal[] = new String[6];

    public Film(String judul[], String genre, int durasi, String jadwal[]) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.jadwal = jadwal;

        this.judul[0] = "Spiderman";
        this.judul[1] = "Avatar";
        this.judul[2] = "Star Wars";

        this.jadwal[0] = "10.00 - 12.00";
        this.jadwal[1] = "12.00 - 14.00";
        this.jadwal[2] = "14.00 - 16.00";
    }
}

class Menu {

    String namaMakanan, namaMinuman;
    int hargaMakanan, hargaMinuman;

    public Menu(String namaMakanan, String namaMinuman, int hargaMakanan, int hargaMinuman) {
        this.namaMakanan = namaMakanan;
        this.namaMinuman = namaMinuman;
        this.hargaMakanan = hargaMakanan;
        this.hargaMinuman = hargaMinuman;
    }
}

class User {

    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

public class KatherinYuliana_1122041_Modul3 {

    public static void login() {
        User user[] = new User[3];
        Studio studio[] = new Studio[3];
        int count = 0;
        String username = "Katherin";
        String password = "123";

        for (int i = 0; i < 1; i++) {
            while (count < 3 && user[i].userName != username && user[i].password != password) {
                user[i].userName = JOptionPane.showInputDialog("Masukkan Username");
                user[i].password = JOptionPane.showInputDialog("Masukkan Password");
                if (user[i].userName == username && user[i].password == password) {
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                } else {
                    count++;
                    JOptionPane.showMessageDialog(null, "Username atau password yang dimasukkan salah", "Bioskop HB", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        int confirm = 0;
        String login = JOptionPane.showInputDialog("Pilih cabang: \n1. Jalan Tupai \n2. Jalan Cemara \n3. Jalan Jawa");
        int login2 = Integer.parseInt(login);
        confirm = JOptionPane.showConfirmDialog(null, "Apakah anda sudah yakin?", "Confirm", JOptionPane.YES_NO_OPTION);
        while (confirm != JOptionPane.YES_OPTION) {
            login = JOptionPane.showInputDialog("Pilih cabang: \n1. Jalan Tupai \n2. Jalan Cemara \n3. Jalan Jawa");
            login2 = Integer.parseInt(login);
            confirm = JOptionPane.showConfirmDialog(null, "Apakah anda sudah yakin?", "Confirm", JOptionPane.YES_NO_OPTION);
        }

        for (int i = 0; i < 1; i++) {
            if (login2 == 1) {
                studio[i].kode = "Jalan Tupai";
            } else if (login2 == 2) {
                studio[i].kode = "Jalan Cemara";
            } else {
                studio[i].kode = "Jalan Jawa";
            }
        }
    }

    public static void pilihFilm() {
        Studio studio[] = new Studio[1];
        Film film[] = new Film[1];
        String judul = JOptionPane.showInputDialog("Pilih judul film: \n1. Spiderman \n2. Avatar \n3. Star wars");
        int judul2 = Integer.parseInt(judul);
        String judulFilm = "";
        for (int i = 0; i < 1; i++) {
            judulFilm = film[i].judul[judul2 - 1];
        }

        String barisKursi = JOptionPane.showInputDialog("Pilih tempat duduk (baris): ");
        int barisKursi2 = Integer.parseInt(barisKursi);
        String kolomKursi = JOptionPane.showInputDialog("Pilih tempat duduk (kolom): ");
        int kolomKursi2 = Integer.parseInt(kolomKursi);
        String noKursi = "";
        for (int i = 0; i < 1; i++) {
            noKursi = studio[i].kursi[barisKursi2 - 1][kolomKursi2 - 1];
        }

        String jadwal = JOptionPane.showInputDialog("Pilih jadwal film: \n1. 10.00 - 12.00 \n2. 12.00 - 14.00 \n3. 14.00 - 16.00");
        int jadwal2 = Integer.parseInt(jadwal);
        String jadwalFilm = "";
        for (int i = 0; i < 1; i++) {
            jadwalFilm = film[i].jadwal[jadwal2 - 1];
        }
    }

    public static void pilihMakanan() {
        Menu pesan[] = new Menu[6];
        String makanan = JOptionPane.showInputDialog("Pilih makanan: \n1. Popcorn \n2. Kentang Goreng \n3. Burger \n4. Tidak memilih");
        int makanan2 = Integer.parseInt(makanan);
        String minuman = JOptionPane.showInputDialog("Pilih minuman: \n1. Coca Cola \n2. Lemon Tea \n3. Kopi \n4. Tidak memilih");
        int minuman2 = Integer.parseInt(minuman);
        for (int i = 0; i < 1; i++) {
            if (makanan2 == 1) {
                pesan[i].namaMakanan = "Popcorn";
                pesan[i].hargaMakanan = 20000;
            } else if (makanan2 == 2) {
                pesan[i].namaMakanan = "Kentang Goreng";
                pesan[i].hargaMakanan = 12000;
            } else if (makanan2 == 3) {
                pesan[i].namaMakanan = "Burger";
                pesan[i].hargaMakanan = 15000;
            } else {
                pesan[i].hargaMakanan = 0;
            }
        }

        for (int i = 0; i < 1; i++) {
            if (minuman2 == 1) {
                pesan[i].namaMinuman = "Coca Cola";
                pesan[i].hargaMinuman = 10000;
            } else if (makanan2 == 2) {
                pesan[i].namaMinuman = "Lemon Tea";
                pesan[i].hargaMinuman = 6000;
            } else if (makanan2 == 3) {
                pesan[i].namaMinuman = "Kopi";
                pesan[i].hargaMinuman = 9000;
            } else {
                pesan[i].hargaMinuman = 0;
            }
        }
    }

    public static int totalTiketPerCabang(Studio studio[]) {
        int total = 0;
        for (int i = 0; i < 1; i++) {
            if (studio[i].kode != "") {
                total = 40000;
            }
        }
        return total;
    }

    public static int totalMakanan(Menu pesan[]) {
        int totalMakanan = 0;
        for (int i = 0; i < 1; i++) {
            totalMakanan = pesan[i].hargaMakanan + pesan[i].hargaMinuman;
        }
        return totalMakanan;
    }

    public static void konfirmasi(Studio studio[], Film film[], int totalTiket, int totalMakanan) {
        for (int i = 0; i < 1; i++) {
            JOptionPane.showMessageDialog(null, "Studio: " + studio[i].kode);
            JOptionPane.showMessageDialog(null, "Judul Film: " + film[i].judul);
            JOptionPane.showMessageDialog(null, "Jadwal Film: " + film[i].jadwal);
            JOptionPane.showMessageDialog(null, "Total Tiket: " + totalTiket);
            JOptionPane.showMessageDialog(null, "Total Makanan: " + totalMakanan);
        }
    }

    public static void main(String[] args) {
        Studio studio[] = new Studio[3];
        Film film[] = new Film[3];
        Menu pesan[] = new Menu[6];
        int totalTiket = totalTiketPerCabang(studio);
        int totalMakanan = totalMakanan(pesan);

        String input = JOptionPane.showInputDialog("1. User \n2. Admin");
        int input2 = Integer.parseInt(input);

        if (input2 == 1) {
            int confirm = 0;
            login();
            while (confirm != JOptionPane.YES_OPTION) {
                pilihFilm();
                pilihMakanan();
                konfirmasi(studio, film, totalMakanan, totalTiket);
                confirm = JOptionPane.showConfirmDialog(null, "Apakah anda sudah yakin?", "Confirm", JOptionPane.YES_NO_OPTION);
            }

        } else {
            String pilih = JOptionPane.showInputDialog("1. Total Penjualan Tiket Per Cabang \n2. Total Penjualan Makanan Per Cabang \n3. Total Penjualan Tiket Semua Cabang");
            int pilih2 = Integer.parseInt(pilih);
            if (pilih2 == 1) {
                int totalTiketPerCabang = totalTiketPerCabang(studio);
                JOptionPane.showMessageDialog(null, "Total tiket per cabang: " + totalTiketPerCabang);
            } else if (pilih2 == 2) {
                int totalPenjualanMakanan = totalMakanan(pesan);
                JOptionPane.showMessageDialog(null, "Total makanan: " + totalPenjualanMakanan);
            } else {
                int totalTiketSemuaCabang = totalTiket + totalTiket;
                JOptionPane.showMessageDialog(null, "Total semua tiket: " + totalTiketSemuaCabang);
            }
        }
    }
}
