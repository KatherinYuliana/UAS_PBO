package QuizPrakStrukdat2;

import java.util.Scanner;

public class KatherinYuliana_1122041_Quiz2_No2 {
    public static int jumlahVirus(int jumlahAwal, int lamaWaktu) {
        int jumlah = 0;
        int jumlah2 = 0;
        int jumlahVirus = 0;
        int sisaWaktu = 0;

        // 3 jam pertama
        while (sisaWaktu >= 3) {
            jumlah = jumlahAwal * 20;
            sisaWaktu = lamaWaktu - 3;
        }

        // sisa jam berikutnya
        jumlah2 = jumlah * 5 ^ sisaWaktu;

        jumlahVirus = jumlah + jumlah2;
        return jumlahVirus;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah awal: ");
        int jumlahAwal = scan.nextInt();
        System.out.println("Masukkan lama waktu: ");
        int lamaWaktu = scan.nextInt();

        if (jumlahAwal < 0 || lamaWaktu < 0) {
            System.out.println("Input Salah");
        }

        int jumlahVirus = jumlahVirus(jumlahAwal, lamaWaktu);
        System.out.println("Jumlah virus akhir: " + jumlahVirus);

    }
}