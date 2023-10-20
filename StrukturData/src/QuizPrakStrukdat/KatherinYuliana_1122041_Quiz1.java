/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPrakStrukdat;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
class Cabang {

    String nama[] = new String[3];
    String lokasi[] = new String[3];
    Kamar kamar[] = new Kamar[3];

    public Cabang(String nama, String lokasi) {
        this.nama[0] = "A";
        this.nama[1] = "B";
        this.nama[2] = "C";

        this.lokasi[0] = "Ganesha";
        this.lokasi[1] = "Jatinangor";
        this.lokasi[2] = "Dipati Ukur";
    }
}

class Kamar {

    int kodeKamar;
    int hargaPerMalam;
    int biayaPerawatanPerMalam;
    int lamaInap;

    public Kamar(int kodeKamar, int hargaPerMalam, int biayaPerawatanPerMalam, int lamaInap) {
        this.kodeKamar = kodeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.biayaPerawatanPerMalam = biayaPerawatanPerMalam;
        this.lamaInap = lamaInap;
    }
}

public class KatherinYuliana_1122041_Quiz1 {

    public static void checkIn() {
        Cabang cabang[] = new Cabang[3];
        int confirm = 0;

        String pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
        int pilihCabang2 = Integer.parseInt(pilihCabang);
        String kodeKamar = JOptionPane.showInputDialog("Pilih kamar{1,2,3): ");
        int kodeKamar2 = Integer.parseInt(kodeKamar);
        String lamaInap = JOptionPane.showInputDialog("Masukkan lama inap");
        int lamaInap2 = Integer.parseInt(lamaInap);

        confirm = JOptionPane.showConfirmDialog(null, "Apakah anda sudah yakin?", "Confirm", JOptionPane.YES_NO_OPTION);

        for (int i = 0; i < 1; i++) {
            while (confirm != JOptionPane.YES_OPTION) {
                pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
                pilihCabang2 = Integer.parseInt(pilihCabang);
                kodeKamar = JOptionPane.showInputDialog("Pilih kamar(1,2,3)");
                kodeKamar2 = Integer.parseInt(kodeKamar);
                lamaInap = JOptionPane.showInputDialog("Masukkan lama inap");
                lamaInap2 = Integer.parseInt(lamaInap);
                confirm = JOptionPane.showConfirmDialog(null, "Apakah anda sudah yakin?", "Confirm", JOptionPane.YES_NO_OPTION);
            }
        }

        int total1, total2, total3;
        total1 = total2 = total3 = 0;
        for (int i = 0; i < 1; i++) {
            if (pilihCabang2 == 1) {
                cabang[i].lokasi[0] = "Ganesha";
                total1++;
            } else if (pilihCabang2 == 2) {
                cabang[i].lokasi[1] = "Jatinangor";
                total2++;
            } else {
                cabang[i].lokasi[2] = "Dipati Ukur";
                total3++;
            }
        }
    }

    public static void menu2() {
        Kamar kamar[] = new Kamar[3];
        String pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
        int pilihCabang2 = Integer.parseInt(pilihCabang);

        if (pilihCabang2 == 1) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
            }
        } else if (pilihCabang2 == 2) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
            }
        } else if (pilihCabang2 == 3) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input salah", "HHB", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void menu3() {
        Kamar kamar[] = new Kamar[3];
        String pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
        int pilihCabang2 = Integer.parseInt(pilihCabang);
        String kodeKamar = JOptionPane.showInputDialog("Pilih kode kamar (1, 2, 3): ");
        int kodeKamar2 = Integer.parseInt(pilihCabang);

        if (pilihCabang2 == 1) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[0].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[0].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[0].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[0].lamaInap);
            }
        } else if (pilihCabang2 == 2) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[1].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[1].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[1].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[1].lamaInap);
            }
        } else if (pilihCabang2 == 3) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[2].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[2].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[2].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[2].lamaInap);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input salah", "HHB", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void menu4() {
        Kamar kamar[] = new Kamar[3];
        String pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
        int pilihCabang2 = Integer.parseInt(pilihCabang);
        String kodeKamar = JOptionPane.showInputDialog("Pilih kode kamar (1, 2, 3): ");
        int kodeKamar2 = Integer.parseInt(pilihCabang);

        int totalBiaya = 0;
        for (int i = 0; i < 1; i++) {
            totalBiaya = kamar[i].lamaInap * kamar[i].hargaPerMalam - kamar[i].biayaPerawatanPerMalam;
        }

        if (pilihCabang2 == 1) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else if (pilihCabang2 == 2) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else if (pilihCabang2 == 3) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Kamar: " + kamar[i].kodeKamar);
                JOptionPane.showMessageDialog(null, "Harga Per Malam: " + kamar[i].hargaPerMalam);
                JOptionPane.showMessageDialog(null, "Biaya Perawatan: " + kamar[i].biayaPerawatanPerMalam);
                JOptionPane.showMessageDialog(null, "Lama Inap: " + kamar[i].lamaInap);
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input salah", "HHB", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void menu5() {
        Kamar kamar[] = new Kamar[3];
        String pilihCabang = JOptionPane.showInputDialog("Pilih cabang: \n1. Ganesha \n2. Jatinangor \n3. Dipati Ukur");
        int pilihCabang2 = Integer.parseInt(pilihCabang);
        String kodeKamar = JOptionPane.showInputDialog("Pilih kode kamar (1, 2, 3): ");
        int kodeKamar2 = Integer.parseInt(pilihCabang);

        int total = 0;
        for (int i = 0; i < 1; i++) {
            total = kamar[i].lamaInap * kamar[i].hargaPerMalam - kamar[i].biayaPerawatanPerMalam;
        }
        int totalBiaya = 0;
        totalBiaya = total + totalBiaya;

        if (pilihCabang2 == 1) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else if (pilihCabang2 == 2) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else if (pilihCabang2 == 3) {
            for (int i = 0; i < 1; i++) {
                JOptionPane.showMessageDialog(null, "Total Biaya: " + totalBiaya);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input salah", "HHB", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("1. Check In \n2. Cek data seluruh kamar \n3. Cek kamar tertentu \n4. Total biaya per kamar \n5. Keuntungan seluruh kamar per cabang");
        int input2 = Integer.parseInt(input);

        if (input2 == 1) {
            checkIn();
        } else if (input2 == 2) {
            menu2();
        } else if (input2 == 3) {
            menu3();
        } else if (input2 == 4) {
            menu4();
        } else if (input2 == 5) {
            menu5();
        } else {
            JOptionPane.showMessageDialog(null, "Input salah", "HHB", JOptionPane.ERROR_MESSAGE);
        }
    }
}
