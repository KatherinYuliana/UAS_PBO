package TubesStrukdat;

import javax.swing.JOptionPane;

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
    int noKursi[][] = new int[20][9];
    int beratBagasi;
}

public class PesanTiketPesawat {
    public static int pesanTiket(Pesawat pesan, int asal2, int tujuan2) {
        if (asal2 == tujuan2) {
            pesan.harga = 0;
        } else if (asal2 == 1) {
            if (tujuan2 == 2) {
                pesan.harga = 100000;
            } else if (tujuan2 == 3) {
                pesan.harga = 200000;
            } else if (tujuan2 == 4) {
                pesan.harga = 300000;
            } else {
                pesan.harga = 400000;
            }
        } else if (asal2 == 2) {
            if (tujuan2 == 1) {
                pesan.harga = 150000;
            } else if (tujuan2 == 3) {
                pesan.harga = 250000;
            } else if (tujuan2 == 4) {
                pesan.harga = 350000;
            } else {
                pesan.harga = 450000;
            }
        } else if (asal2 == 3) {
            if (tujuan2 == 1) {
                pesan.harga = 120000;
            } else if (tujuan2 == 2) {
                pesan.harga = 240000;
            } else if (tujuan2 == 4) {
                pesan.harga = 360000;
            } else {
                pesan.harga = 480000;
            }
        } else if (asal2 == 4) {
            if (tujuan2 == 1) {
                pesan.harga = 120000;
            } else if (tujuan2 == 2) {
                pesan.harga = 220000;
            } else if (tujuan2 == 3) {
                pesan.harga = 320000;
            } else {
                pesan.harga = 420000;
            }
        } else {
            if (tujuan2 == 1) {
                pesan.harga = 180000;
            } else if (tujuan2 == 2) {
                pesan.harga = 280000;
            } else if (tujuan2 == 3) {
                pesan.harga = 380000;
            } else {
                pesan.harga = 480000;
            }
        }

        return pesan.harga;
    }

    public static void isiData(Data data) {
        data.nama = JOptionPane.showInputDialog(null, "Masukkan nama");
        String usia = JOptionPane.showInputDialog(null, "Masukkan usia");
        data.usia = Integer.parseInt(usia);
        data.noTelp = JOptionPane.showInputDialog(null, "Masukkan nomor telepon");
        String baris = JOptionPane.showInputDialog(null, "Masukkan baris kursi(1-20)");
        int baris2 = Integer.parseInt(baris);
        String kolom = JOptionPane.showInputDialog(null, "Masukkan kolom kursi(1-9)");
        int kolom2 = Integer.parseInt(kolom);
        String bagasi = JOptionPane.showInputDialog(null, "Masukkan berat bagasi");
        data.beratBagasi = Integer.parseInt(bagasi);
    }

    public static int totalHarga(int kelas2, int pesanTiket) {
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

    public static void tampilkanPesanan(Pesawat pesan, Data data, int asal2, int tujuan2, int kelas2, int totalHarga) {
        JOptionPane.showMessageDialog(null, 
        "Kota asal: " + pesan.kotaAsal[asal2-1] + 
        "\nKota tujuan: " + pesan.kotaTujuan[tujuan2-1] +
        "\nTanggal keberangkatan: " + pesan.tanggal +
        "\nJumlah penumpang: " + pesan.jumlahPenumpang +
        "\nKelas: " + pesan.kelas[kelas2-1] +
        "\n\nTotal harga: " + totalHarga);
    }

    public static void main(String[] args) {
        Pesawat pesan = new Pesawat();
        Data data = new Data();

        String asal = JOptionPane.showInputDialog(null, "1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
        int asal2 = Integer.parseInt(asal);
        String tujuan = JOptionPane.showInputDialog(null, "1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
        int tujuan2 = Integer.parseInt(tujuan);
        pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
        String jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
        pesan.jumlahPenumpang = Integer.parseInt(jumlah);
        String kelas = JOptionPane.showInputDialog(null, "1. Economy \n2. Business \n3. First Class \nPilih kelas");
        int kelas2 = Integer.parseInt(kelas);

        int pesanTiket = pesanTiket(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;
        int totalHarga = totalHarga(kelas2, pesanTiket);

        
        
        isiData(data);
        tampilkanPesanan(pesan, data, asal2, tujuan2, kelas2, totalHarga);
    }
}
