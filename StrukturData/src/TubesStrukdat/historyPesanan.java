package TubesStrukdat;

import java.util.ArrayList;
import java.util.Scanner;

public class historyPesanan {
    public static void main(String[] args) {
        ArrayList<String> bookingHistory = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean continueBooking = true;
        
        while (continueBooking) {
            System.out.println("Selamat datang di layanan pemesanan tiket pesawat!");
            System.out.print("Masukkan nama anda: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan kota asal: ");
            String origin = scanner.nextLine();

            System.out.print("Masukkan kota tujuan: ");
            String destination = scanner.nextLine();

            System.out.print("Masukkan tanggal keberangkatan (dd/mm/yyyy): ");
            String departureDate = scanner.nextLine();

            System.out.print("Masukkan jumlah penumpang: ");
            int numberOfPassengers = scanner.nextInt();
            scanner.nextLine();

            String bookingDetail = "Nama: " + name + ", Kota asal: " + origin + ", Kota tujuan: " + destination + ", Tanggal keberangkatan: " + departureDate + ", Jumlah penumpang: " + numberOfPassengers;
            bookingHistory.add(bookingDetail);
            
            System.out.print("\nApakah anda ingin memesan tiket lagi? (y/n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                continueBooking = false;
            }
        }

        System.out.println("\nRiwayat pemesanan tiket:");
        for (String booking : bookingHistory) {
            System.out.println("- " + booking);
        }
    }
}
