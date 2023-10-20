package PBO;

import java.util.Scanner;

class Pasien {
    String nama;
    JenisKamar rawatInap[] = new JenisKamar[10];
    JenisPerawatan perawatan[] = new JenisPerawatan[5];
    boolean pakaiBPJS;
}

class JenisKamar {
    String kelas;
    int hargaPerHari;
}

class JenisPerawatan {
    String nama;
    int biaya;
}

class RumahSakit {
    Pasien patients[] = new Pasien[150];

    public int totalBiayaPasien(Pasien pasien) {
        int totalBiaya = 0;
        for (JenisKamar kamar : pasien.rawatInap) {
            totalBiaya += kamar.hargaPerHari;
        }
        for (JenisPerawatan perawatan : pasien.perawatan) {
            totalBiaya += perawatan.biaya;
        }
        if (pasien.pakaiBPJS) {
            totalBiaya -= totalBiaya / 2;
        }

        return totalBiaya;
    }

    public int totalPendapatanRS() {
        int totalPendapatan = 0;
        for (Pasien pasien : patients) {
            totalPendapatan += totalBiayaPasien(pasien);
        }
        return totalPendapatan;
    }

    public int jumlahPasien(String namaPerawatan) {
        int jumlahPasien = 0;
        for (Pasien pasien : patients) {
            for (JenisPerawatan perawatan : pasien.perawatan) {
                if (perawatan.nama.equals(namaPerawatan)) {
                    jumlahPasien++;
                    break;
                }
            }
        }
        return jumlahPasien;
    }
}

public class SistemRawatInapRS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RumahSakit rs = new RumahSakit();
        Pasien pasien = new Pasien();

        int menu = 0;
        int i = 0;
        while (menu != 4) {

            System.out.println(
                    "Pilih menu: \n1. Masukkan data pasien \n2. Total pendapatan rumah sakit \n3. Jumlah pasien \n4. Exit");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan nama pasien: ");
                    pasien.nama = scan.nextLine();
                    pasien.rawatInap[i] = new JenisKamar();
                    System.out.println("Masukkan kelas: ");
                    pasien.rawatInap[i].kelas = scan.nextLine();
                    System.out.println("Masukkan harga per hari: ");
                    pasien.rawatInap[i].hargaPerHari = scan.nextInt();
                    pasien.perawatan[i] = new JenisPerawatan();
                    System.out.println("Masukkan nama perawatan: ");
                    pasien.perawatan[i].nama = scan.nextLine();
                    System.out.println("Masukkan biaya: ");
                    pasien.perawatan[i].biaya = scan.nextInt();
                    System.out.println("Pakai BPJS ?");
                    pasien.pakaiBPJS = scan.nextBoolean();

                    i++;
                    int total = rs.totalBiayaPasien(pasien);
                    System.out.println("Total biaya pasien: " + total);
                    break;

                case 2:
                    int pendapatan = rs.totalPendapatanRS();
                    System.out.println("Total pendapatan rs: " + pendapatan);
                    break;

                case 3:
                    int jumlah = rs.jumlahPasien("Operasi");
                    System.out.println("Jumlah pasien: " + jumlah);
                    break;

                case 4:
                    System.out.println("Selesai");
                    break;

            }

        }
    }
}
