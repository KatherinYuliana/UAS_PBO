package TubesStrukdat;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = "Katherin";
        this.password = "123";
    }
}

class Hotel {
    String kota[] = { "Bandung", "Jakarta", "Bali" };
    String namaHotel[] = new String[3];
    int lamaInap;
    int jumlahKamar;
    String tipeKamar[] = { "Standard Room", "Deluxe Room", "Presidential Suite" };
    String tipeKasur[] = { "Single Bed", "Queen Size", "King Size" };
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

public class Menu2 {

    public static void login() {
        User user = new User(null, null);

        String username2 = JOptionPane.showInputDialog("Masukkan Username");
        String password2 = JOptionPane.showInputDialog("Masukkan Password");

        if (user.username != username2 && user.password != password2) {
            JOptionPane.showMessageDialog(null, "Login berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Login gagal", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }

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

    public static int totalHargaTiketHotel(Hotel hotel, int tipeKamar2, int tipeKasur2) {
        int total = 0;
        if (tipeKamar2 == 1) {
            if (tipeKasur2 == 1) {
                total = 500000;
            } else if (tipeKasur2 == 2) {
                total = 750000;
            } else {
                total = 800000;
            }
        } else if (tipeKamar2 == 2) {
            if (tipeKasur2 == 1) {
                total = 550000;
            } else if (tipeKasur2 == 2) {
                total = 800000;
            } else {
                total = 850000;
            }
        } else {
            if (tipeKasur2 == 1) {
                total = 650000;
            } else if (tipeKasur2 == 2) {
                total = 900000;
            } else {
                total = 950000;
            }
        }
        total = total * hotel.lamaInap * hotel.jumlahKamar;
        return total;
    }

    public static void pesananTiketHotel(Hotel hotel, String hotelName, int tipeKamar2, int tipeKasur2, int totalHargaTiketHotel) {
        JOptionPane.showMessageDialog(null,
        "Nama Hotel: " + hotelName +
        "\nLama Inap: " + hotel.lamaInap +
        "\nJumlah Kamar: " + hotel.jumlahKamar +
        "\nTipe Kamar: " + hotel.tipeKamar[tipeKamar2 - 1] +
        "\nTipe Kasur: " + hotel.tipeKasur[tipeKasur2 - 1] +
        "\n\nTotal harga: " + totalHargaTiketHotel);
    }

    public static void pesananTiketHotelDanPesawat(Pesawat pesan, int asal2, int tujuan2, int kelas2, int totalHarga, Hotel hotel, String hotelName, int tipeKamar2, int tipeKasur2) {
        JOptionPane.showMessageDialog(null,
        "Kota asal: " + pesan.kotaAsal[asal2 - 1] +
        "\nKota tujuan: " + pesan.kotaTujuan[tujuan2 - 1] +
        "\nTanggal keberangkatan: " + pesan.tanggal +
        "\nJumlah penumpang: " + pesan.jumlahPenumpang +
        "\nKelas: " + pesan.kelas[kelas2 - 1] + "\n\n" +
        "Nama Hotel: " + hotelName +
        "\nLama Inap: " + hotel.lamaInap +
        "\nJumlah Kamar: " + hotel.jumlahKamar +
        "\nTipe Kamar: " + hotel.tipeKamar[tipeKamar2 - 1] +
        "\nTipe Kasur: " + hotel.tipeKasur[tipeKasur2 - 1] +
        "\n\nTotal harga: " + totalHarga);
    }

    public static void isiData(Data data, Pesawat pesan, int menu2) {
        LinkedList<String>name = new LinkedList<String>();
        data.nama = JOptionPane.showInputDialog(null, "Masukkan nama");
        name.add(data.nama);
        String usia = JOptionPane.showInputDialog(null, "Masukkan usia");
        data.usia = Integer.parseInt(usia);
        data.noTelp = JOptionPane.showInputDialog(null, "Masukkan nomor telepon");
    }

    public static int diskon(){
        ArrayList<Integer> discounts = new ArrayList<Integer>();
        discounts.add(10);
        discounts.add(15);
        discounts.add(20);
        discounts.add(25);
        discounts.add(30);

        int diskon = 0;
        int pilih = JOptionPane.showConfirmDialog(null, "Ingin menggunakan diskon?", "Diskon", JOptionPane.YES_NO_OPTION);
            
        if (pilih == JOptionPane.YES_OPTION) {
            String pilihDiskon = JOptionPane.showInputDialog(null, "1. Diskon 10% \n2. Diskon 15% \n3. Diskon 20% \n4. Diskon 25% \n5. Diskon 30%");
            int pilihDiskon2 = Integer.parseInt(pilihDiskon);
                    
            diskon = discounts.get(pilihDiskon2-1);
                    
            //discounts.remove(pilihDiskon2 - 1);
            //JOptionPane.showMessageDialog(null, "Diskon yang tersedia: \n" + discounts);
        }
        return diskon;
    }

    public static void main(String[] args) {
        LinkedList<String> historyPesawat = new LinkedList<String>();
        LinkedList<Integer> historyPesawat2 = new LinkedList<Integer>();
        LinkedList<String> historyHotel = new LinkedList<String>();
        LinkedList<Integer> historyHotel2 = new LinkedList<Integer>();
        LinkedList<Integer> history = new LinkedList<Integer>();
        ArrayList<String> bookingPesawat = new ArrayList<String>();
        ArrayList<String> bookingHotel = new ArrayList<String>();
        ArrayList<String> booking = new ArrayList<String>();

        Pesawat pesan = new Pesawat();
        Data data = new Data();
        Hotel hotel = new Hotel();
        int asal2 = 0;

        int menu2 = 0;
        int login = JOptionPane.showConfirmDialog(null, "Apakah anda mau login?", "Login", JOptionPane.YES_NO_OPTION);

        if (login == JOptionPane.YES_OPTION) {
            login();
            while (menu2 != 5) {
                String menu = JOptionPane.showInputDialog("Pilih menu: \n1. Tiket Hotel \n2. Tiket Pesawat \n3. Tiket Pesawat & Hotel \n4. History Pesanan \n5. Keluar");
                menu2 = Integer.parseInt(menu);
                switch (menu2) {
                    case 1:
                        String kota = JOptionPane.showInputDialog(null, "1. Bandung \n2. Jakarta \n3. Bali");
                        int kota2 = Integer.parseInt(kota);
                        historyHotel.add(hotel.kota[kota2-1]);
                        String hotelName = "";
                        if (kota2 == 1) {
                            hotel.namaHotel[0] = "West Point Hotel";
                            hotel.namaHotel[1] = "Harris Hotel";
                            hotel.namaHotel[2] = "Hotel Serela";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. West Point Hotel \n2. Harris Hotel \n3. Hotel Serela");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (kota2 == 2) {
                            hotel.namaHotel[0] = "Hotel Mulia Senayan";
                            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
                            hotel.namaHotel[2] = "Topaz Residence";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else {
                            hotel.namaHotel[0] = "Melia Purosani Yogyakarta";
                            hotel.namaHotel[1] = "Sheraton Mustika Yogyakarta";
                            hotel.namaHotel[2] = "The Alana Yogyakarta Hotel";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Melia Purosani Yogyakarta \n2. Sheraton Mustika Yogyakarta \n3. The Alana Yogyakarta Hotel");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        }

                        String checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
                        int checkIn2 = Integer.parseInt(checkIn);
                        String checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
                        int checkOut2 = Integer.parseInt(checkOut);
                        String jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
                        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);
                        String tipeKamar = JOptionPane.showInputDialog(null,"1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
                        int tipeKamar2 = Integer.parseInt(tipeKamar);
                        historyHotel.add(hotel.tipeKamar[tipeKamar2-1]);
                        String tipeKasur = JOptionPane.showInputDialog(null,"1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
                        int tipeKasur2 = Integer.parseInt(tipeKasur);

                        hotel.lamaInap = checkOut2 - checkIn2;
                        int diskon = diskon();
                        int totalHargaTiketHotel = 0;
                        if(diskon == 0){
                            totalHargaTiketHotel = totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2);
                        } else {
                            totalHargaTiketHotel = totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2) * diskon / 100;
                        }
                        historyHotel2.add(totalHargaTiketHotel);
                        isiData(data, pesan, menu2);
                        pesananTiketHotel(hotel, hotelName, tipeKamar2, tipeKasur2, totalHargaTiketHotel);
                        String a = "Nama: \t" + data.nama + "\nKota asal \t | Nama hotel \t | Tipe Kamar \t | Total \n" + hotel.kota[kota2-1] + "\t\t | " + hotelName + "\t\t | " + hotel.tipeKamar[tipeKamar2-1] + "\t\t | " + totalHargaTiketHotel;
                        bookingHotel.add(a);
                        break;

                    case 2:
                        String asal = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
                        asal2 = Integer.parseInt(asal);
                        historyPesawat.add(pesan.kotaAsal[asal2-1]);
                        String tujuan = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
                        int tujuan2 = Integer.parseInt(tujuan);
                        historyPesawat.add(pesan.kotaTujuan[tujuan2-1]);
                        pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
                        String jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
                        pesan.jumlahPenumpang = Integer.parseInt(jumlah);
                        String kelas = JOptionPane.showInputDialog(null,"1. Economy \n2. Business \n3. First Class \nPilih kelas");
                        int kelas2 = Integer.parseInt(kelas);
                        historyPesawat.add(pesan.kelas[kelas2-1]);

                        int pesanTiket = hargaTiketPesawat(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;
                        diskon = diskon();
                        int totalHarga = 0;
                        if(diskon == 0){
                            totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data);
                        } else {
                            totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data) * diskon / 100;
                        }
                        historyPesawat2.add(totalHarga);
                        isiData(data, pesan, menu2);
                        pesanananTiketPesawat(pesan, asal2, tujuan2, kelas2, totalHarga);
                        String b = "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + "\t\t | " + totalHarga;
                        bookingPesawat.add(b);
                        break;

                    case 3:
                        asal = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
                        asal2 = Integer.parseInt(asal);
                        historyPesawat.add(pesan.kotaAsal[asal2-1]);
                        tujuan = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
                        tujuan2 = Integer.parseInt(tujuan);
                        historyPesawat.add(pesan.kotaTujuan[tujuan2-1]);
                        pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
                        jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
                        pesan.jumlahPenumpang = Integer.parseInt(jumlah);
                        kelas = JOptionPane.showInputDialog(null,"1. Economy \n2. Business \n3. First Class \nPilih kelas");
                        kelas2 = Integer.parseInt(kelas);
                        historyPesawat.add(pesan.kelas[kelas2-1]);

                        pesanTiket = hargaTiketPesawat(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;

                        hotelName = "";
                        if (tujuan2 == 1) {
                            hotel.namaHotel[0] = "Hotel Mulia Senayan";
                            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
                            hotel.namaHotel[2] = "Topaz Residence";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 2) {
                            hotel.namaHotel[0] = "Keio Plaza Hotel Tokyo";
                            hotel.namaHotel[1] = "Shibuya Excel Hotel Tokyo";
                            hotel.namaHotel[2] = "Hyatt Centric Ginza Tokyo";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1.Keio Plaza Hotel Tokyo \n2. Shibuya Excel Hotel Tokyo \n3. Hyatt Centric Ginza Tokyo");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 3) {
                            hotel.namaHotel[0] = "Galaxy Motel";
                            hotel.namaHotel[1] = "Hotel 369 Brooklyn";
                            hotel.namaHotel[2] = "Best Western Jamaica Inn";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Galaxy Motel \n2. Hotel 369 Brooklyn \n3. Best Western Jamaica Inn");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 4) {
                            hotel.namaHotel[0] = "Rydges World Square";
                            hotel.namaHotel[1] = "Swissotel Sydney";
                            hotel.namaHotel[2] = "Mercure Sydney";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Rydges World Square \n2. Swissotel Sydney \n3. Mercure Sydney");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else {
                            hotel.namaHotel[0] = "First House Hotel";
                            hotel.namaHotel[1] = "Amari Watergate Bangkok";
                            hotel.namaHotel[2] = "Novotel Bangkok Platinum";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. First House Hotel \n2. Amari Watergate Bangkok \n3. Novotel Bangkok Platinum");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        }

                        checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
                        checkIn2 = Integer.parseInt(checkIn);
                        checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
                        checkOut2 = Integer.parseInt(checkOut);
                        jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
                        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);
                        tipeKamar = JOptionPane.showInputDialog(null,"1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
                        tipeKamar2 = Integer.parseInt(tipeKamar);
                        historyHotel.add(hotel.tipeKamar[tipeKamar2-1]);
                        tipeKasur = JOptionPane.showInputDialog(null,"1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
                        tipeKasur2 = Integer.parseInt(tipeKasur);

                        hotel.lamaInap = checkOut2 - checkIn2;
                        isiData(data, pesan, menu2);
                        diskon = diskon();
                        totalHarga = 0;
                        if(diskon == 0){
                            totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data) + totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2);
                        } else {
                            totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data) + totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2) * diskon / 100;
                        }
                        history.add(totalHarga);
                        pesananTiketHotelDanPesawat(pesan, asal2, tujuan2, kelas2, totalHarga, hotel, hotelName, tipeKamar2, tipeKasur2);
                        String c = "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Nama hotel \t | Tipe Kamar \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + hotelName + "\t\t | " + hotel.tipeKamar[tipeKamar2-1] + "\t\t | " + totalHarga;
                        booking.add(c);
                        break;

                    case 4:
                        // String temp[] = new String[6];
                        // int temp2 = 0;
                        // int i = 0;
                        String pilih = JOptionPane.showInputDialog("Pilih menu: \n1. History Pesan Hotel \n2. History Pesan Pesawat \n3. History Pesan Pesawat & Hotel");
                        int pilih2 = Integer.parseInt(pilih);

                        if(pilih2 == 1){
                            if(bookingHotel.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking1 : bookingHotel) {
                                    JOptionPane.showMessageDialog(null, booking1);
                                }
                                // for(String datum : historyHotel) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : historyHotel2){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Nama hotel \t | Tipe Kamar \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + temp2);
                            }
                        } else if (pilih2 == 2){
                            if(bookingPesawat.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking2 : bookingPesawat) {
                                    JOptionPane.showMessageDialog(null, booking2);
                                }
                                // for(String datum : historyPesawat) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : historyPesawat2){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + "\t\t | " + temp2);
                            }
                        } else {
                            if(booking.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking3 : booking) {
                                    JOptionPane.showMessageDialog(null, booking3);
                                }
                                // for(String datum : historyPesawat) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(String datum : historyHotel) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : history){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Nama hotel \t | Tipe Kamar \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + temp[3] + "\t\t | " + temp[4] + "\t\t | " + temp2);
                            }
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Terima Kasih");
                        break;
                }
            }
        } else {
            while (menu2 != 5) {
                String menu = JOptionPane.showInputDialog("Pilih menu: \n1. Tiket Hotel \n2. Tiket Pesawat \n3. Tiket Pesawat & Hotel \n4. History Pesanan \n5. Keluar");
                menu2 = Integer.parseInt(menu);
                switch (menu2) {
                    case 1:
                        String kota = JOptionPane.showInputDialog(null, "1. Bandung \n2. Jakarta \n3. Bali");
                        int kota2 = Integer.parseInt(kota);
                        historyHotel.add(hotel.kota[kota2-1]);
                        String hotelName = "";
                        if (kota2 == 1) {
                            hotel.namaHotel[0] = "West Point Hotel";
                            hotel.namaHotel[1] = "Harris Hotel";
                            hotel.namaHotel[2] = "Hotel Serela";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. West Point Hotel \n2. Harris Hotel \n3. Hotel Serela");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (kota2 == 2) {
                            hotel.namaHotel[0] = "Hotel Mulia Senayan";
                            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
                            hotel.namaHotel[2] = "Topaz Residence";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else {
                            hotel.namaHotel[0] = "Melia Purosani Yogyakarta";
                            hotel.namaHotel[1] = "Sheraton Mustika Yogyakarta";
                            hotel.namaHotel[2] = "The Alana Yogyakarta Hotel";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Melia Purosani Yogyakarta \n2. Sheraton Mustika Yogyakarta \n3. The Alana Yogyakarta Hotel");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        }

                        String checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
                        int checkIn2 = Integer.parseInt(checkIn);
                        String checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
                        int checkOut2 = Integer.parseInt(checkOut);
                        String jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
                        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);
                        String tipeKamar = JOptionPane.showInputDialog(null,"1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
                        int tipeKamar2 = Integer.parseInt(tipeKamar);
                        historyHotel.add(hotel.tipeKamar[tipeKamar2-1]);
                        String tipeKasur = JOptionPane.showInputDialog(null,"1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
                        int tipeKasur2 = Integer.parseInt(tipeKasur);

                        hotel.lamaInap = checkOut2 - checkIn2;
                        int totalHargaTiketHotel = totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2);
                        historyHotel2.add(totalHargaTiketHotel);
                        isiData(data, pesan, menu2);
                        pesananTiketHotel(hotel, hotelName, tipeKamar2, tipeKasur2, totalHargaTiketHotel);
                        String a = "Nama: \t" + data.nama + "\nKota asal \t | Nama hotel \t | Tipe Kamar \t | Total \n" + hotel.kota[kota2-1] + "\t\t | " + hotelName + "\t\t | " + hotel.tipeKamar[tipeKamar2-1] + "\t\t | " + totalHargaTiketHotel;
                        bookingHotel.add(a);
                        break;

                    case 2:
                        String asal = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
                        asal2 = Integer.parseInt(asal);
                        historyPesawat.add(pesan.kotaAsal[asal2-1]);
                        String tujuan = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
                        int tujuan2 = Integer.parseInt(tujuan);
                        historyPesawat.add(pesan.kotaTujuan[tujuan2-1]);
                        pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
                        String jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
                        pesan.jumlahPenumpang = Integer.parseInt(jumlah);
                        String kelas = JOptionPane.showInputDialog(null, "1. Economy \n2. Business \n3. First Class \nPilih kelas");
                        int kelas2 = Integer.parseInt(kelas);
                        historyPesawat.add(pesan.kelas[kelas2-1]);

                        int pesanTiket = hargaTiketPesawat(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;
                        int totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data);
                        historyPesawat2.add(totalHarga);
                        isiData(data, pesan, menu2);
                        pesanananTiketPesawat(pesan, asal2, tujuan2, kelas2, totalHarga);
                        String b = "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + "\t\t | " + totalHarga;
                        bookingPesawat.add(b);
                        break;

                    case 3:
                        asal = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota asal:");
                        asal2 = Integer.parseInt(asal);
                        historyPesawat.add(pesan.kotaAsal[asal2-1]);
                        tujuan = JOptionPane.showInputDialog(null,"1. Jakarta \n2. Tokyo \n3. New York \n4. Sydney \n5. Bangkok \nMasukkan kota tujuan:");
                        tujuan2 = Integer.parseInt(tujuan);
                        historyPesawat.add(pesan.kotaTujuan[tujuan2-1]);
                        pesan.tanggal = JOptionPane.showInputDialog(null, "Masukkan tanggal ");
                        jumlah = JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang ");
                        pesan.jumlahPenumpang = Integer.parseInt(jumlah);
                        kelas = JOptionPane.showInputDialog(null,"1. Economy \n2. Business \n3. First Class \nPilih kelas");
                        kelas2 = Integer.parseInt(kelas);
                        historyPesawat.add(pesan.kelas[kelas2-1]);

                        pesanTiket = hargaTiketPesawat(pesan, asal2, tujuan2) * pesan.jumlahPenumpang;

                        hotelName = "";
                        if (tujuan2 == 1) {
                            hotel.namaHotel[0] = "Hotel Mulia Senayan";
                            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
                            hotel.namaHotel[2] = "Topaz Residence";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 2) {
                            hotel.namaHotel[0] = "Keio Plaza Hotel Tokyo";
                            hotel.namaHotel[1] = "Shibuya Excel Hotel Tokyo";
                            hotel.namaHotel[2] = "Hyatt Centric Ginza Tokyo";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1.Keio Plaza Hotel Tokyo \n2. Shibuya Excel Hotel Tokyo \n3. Hyatt Centric Ginza Tokyo");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 3) {
                            hotel.namaHotel[0] = "Galaxy Motel";
                            hotel.namaHotel[1] = "Hotel 369 Brooklyn";
                            hotel.namaHotel[2] = "Best Western Jamaica Inn";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Galaxy Motel \n2. Hotel 369 Brooklyn \n3. Best Western Jamaica Inn");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else if (tujuan2 == 4) {
                            hotel.namaHotel[0] = "Rydges World Square";
                            hotel.namaHotel[1] = "Swissotel Sydney";
                            hotel.namaHotel[2] = "Mercure Sydney";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. Rydges World Square \n2. Swissotel Sydney \n3. Mercure Sydney");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        } else {
                            hotel.namaHotel[0] = "First House Hotel";
                            hotel.namaHotel[1] = "Amari Watergate Bangkok";
                            hotel.namaHotel[2] = "Novotel Bangkok Platinum";
                            String pilihHotel = JOptionPane.showInputDialog(null,"1. First House Hotel \n2. Amari Watergate Bangkok \n3. Novotel Bangkok Platinum");
                            int pilihHotel2 = Integer.parseInt(pilihHotel);
                            hotelName = hotel.namaHotel[pilihHotel2 - 1];
                            historyHotel.add(hotel.namaHotel[pilihHotel2-1]);
                        }

                        checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
                        checkIn2 = Integer.parseInt(checkIn);
                        checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
                        checkOut2 = Integer.parseInt(checkOut);
                        jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
                        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);
                        tipeKamar = JOptionPane.showInputDialog(null,"1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
                        tipeKamar2 = Integer.parseInt(tipeKamar);
                        historyHotel.add(hotel.tipeKamar[tipeKamar2-1]);
                        tipeKasur = JOptionPane.showInputDialog(null,"1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
                        tipeKasur2 = Integer.parseInt(tipeKasur);

                        hotel.lamaInap = checkOut2 - checkIn2;
                        isiData(data, pesan, menu2);
                        totalHarga = totalHargaTiketPesawat(kelas2, pesanTiket, data) + totalHargaTiketHotel(hotel, tipeKamar2, tipeKasur2);
                        history.add(totalHarga);
                        pesananTiketHotelDanPesawat(pesan, asal2, tujuan2, kelas2, totalHarga, hotel, hotelName, tipeKamar2, tipeKasur2);
                        String c = "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Nama hotel \t | Tipe Kamar \t | Total \n" + pesan.kotaAsal[asal2-1] + "\t\t | " + pesan.kotaTujuan[tujuan2-1] + "\t\t | " + pesan.kelas[kelas2-1] + "\t\t | " + hotelName + "\t\t | " + hotel.tipeKamar[tipeKamar2-1] + "\t\t | " + totalHarga;
                        booking.add(c);
                        break;

                    case 4:
                        // String temp[] = new String[6];
                        // int temp2 = 0;
                        // int i = 0;
                        String pilih = JOptionPane.showInputDialog("Pilih menu: \n1. History Pesan Hotel \n2. History Pesan Pesawat \n3. History Pesan Pesawat & Hotel");
                        int pilih2 = Integer.parseInt(pilih);

                        if(pilih2 == 1){
                            if(bookingHotel.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking1 : bookingHotel) {
                                    JOptionPane.showMessageDialog(null, booking1);
                                }
                                // for(String datum : historyHotel) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : historyHotel2){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Nama hotel \t | Tipe Kamar \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + temp2);
                            }
                        } else if (pilih2 == 2){
                            if(bookingPesawat.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking2 : bookingPesawat) {
                                    JOptionPane.showMessageDialog(null, booking2);
                                }
                                // for(String datum : historyPesawat) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : historyPesawat2){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + "\t\t | " + temp2);
                            }
                        } else {
                            if(booking.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "History pesanan kosong");
                            } else {
                                for(String booking3 : booking) {
                                    JOptionPane.showMessageDialog(null, booking3);
                                }
                                // for(String datum : historyPesawat) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(String datum : historyHotel) {
                                //     temp[i] = datum;
                                //     i++;
                                // }
                                // for(Integer total : history){
                                //     temp2 = total;
                                // }
                                // JOptionPane.showMessageDialog(null, "Nama: \t" + data.nama + "\nKota asal \t | Kota tujuan \t | Kelas \t | Nama hotel \t | Tipe Kamar \t | Total \n" + temp[0] + "\t\t | " + temp[1] + "\t\t | " + temp[2] + "\t\t | " + temp[3] + "\t\t | " + temp[4] + "\t\t | " + temp2);
                            }
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Terima Kasih");
                        break;
                }
            }
        }
    }
}