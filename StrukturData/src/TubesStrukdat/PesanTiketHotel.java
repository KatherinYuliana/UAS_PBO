package TubesStrukdat;

import javax.swing.JOptionPane;

class Hotel {
    String kota[] = { "Bandung", "Jakarta", "Bali" };
    String namaHotel[] = new String[3];
    int pilihHotel;
    int lamaInap;
    int jumlahKamar;
    String tipeKamar[] = {"Standard Room", "Deluxe Room", "Presidential Suite"}; //new String[3];
    String tipeKasur[] = {"Single Bed", "Queen Size", "King Size"};

}

class Data {
    String nama;
    int usia;
    String noTelp;
}

public class PesanTiketHotel {
    public static String cariHotel(Hotel hotel, int kota2) {
        String hotelName = "";
        if (kota2 == 1) {
            hotel.namaHotel[0] = "West Point Hotel";
            hotel.namaHotel[1] = "Harris Hotel";
            hotel.namaHotel[2] = "Hotel Serela";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. West Point Hotel \n2. Harris Hotel \n3. Hotel Serela");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        } else if (kota2 == 2){
            hotel.namaHotel[0] = "Hotel Mulia Senayan";
            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
            hotel.namaHotel[2] = "Topaz Residence";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        } else {
            hotel.namaHotel[0] = "Melia Purosani Yogyakarta";
            hotel.namaHotel[1] = "Sheraton Mustika Yogyakarta";
            hotel.namaHotel[2] = "The Alana Yogyakarta Hotel";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. Melia Purosani Yogyakarta \n2. Sheraton Mustika Yogyakarta \n3. The Alana Yogyakarta Hotel");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        }
        return hotelName;
    }

    public static void pesanTiketHotel(Hotel hotel){
        String checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
        int checkIn2 = Integer.parseInt(checkIn);
        String checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
        int checkOut2 = Integer.parseInt(checkOut);
        String jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);
        String tipeKamar = JOptionPane.showInputDialog(null, "1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
        int tipeKamar2 = Integer.parseInt(tipeKamar);
        String tipeKasur = JOptionPane.showInputDialog(null, "1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
        int tipeKasur2 = Integer.parseInt(tipeKasur);

        hotel.lamaInap = checkOut2 - checkIn2;
    }

    public static void show(Hotel hotel, String hotelName, String tipeKamar0){
        JOptionPane.showMessageDialog(null, 
        "Nama Hotel: " + hotelName + 
        "\nLama Inap: " + hotel.lamaInap +
        "\nJumlah Kamar: " + hotel.jumlahKamar +
        "\nTipe Kamar: " + tipeKamar0 +
        // "\nTipe Kasur: " + hotel.tipeKasur[tipeKasur2 - 1] +
        "\n\nTotal harga: ");
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Data data = new Data();
        String kota = JOptionPane.showInputDialog(null, "1. Bandung \n2. Jakarta \n3. Bali");
        int kota2 = Integer.parseInt(kota);
        String hotelName = "";
        String tipeKamar0 = "";
        if (kota2 == 1) {
            hotel.namaHotel[0] = "West Point Hotel";
            hotel.namaHotel[1] = "Harris Hotel";
            hotel.namaHotel[2] = "Hotel Serela";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. West Point Hotel \n2. Harris Hotel \n3. Hotel Serela");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        } else if (kota2 == 2){
            hotel.namaHotel[0] = "Hotel Mulia Senayan";
            hotel.namaHotel[1] = "Hotel Indonesia Kempinski";
            hotel.namaHotel[2] = "Topaz Residence";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. Hotel Mulia Senayan \n2. Hotel Indonesia Kempinski \n3. Topaz Residence");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        } else {
            hotel.namaHotel[0] = "Melia Purosani Yogyakarta";
            hotel.namaHotel[1] = "Sheraton Mustika Yogyakarta";
            hotel.namaHotel[2] = "The Alana Yogyakarta Hotel";
            String pilihHotel = JOptionPane.showInputDialog(null, "1. Melia Purosani Yogyakarta \n2. Sheraton Mustika Yogyakarta \n3. The Alana Yogyakarta Hotel");
            int pilihHotel2 = Integer.parseInt(pilihHotel);
            hotelName = hotel.namaHotel[pilihHotel2 - 1];
        }

        String checkIn = JOptionPane.showInputDialog(null, "Masukkan tanggal check in: ");
        int checkIn2 = Integer.parseInt(checkIn);
        String checkOut = JOptionPane.showInputDialog(null, "Masukkan tanggal check out: ");
        int checkOut2 = Integer.parseInt(checkOut);
        String jumlahKamar = JOptionPane.showInputDialog(null, "Masukkan jumlah kamar: ");
        hotel.jumlahKamar = Integer.parseInt(jumlahKamar);

        // hotel.tipeKamar[0] = "Standard Room";
        // hotel.tipeKamar[1] = "Deluxe Room";
        // hotel.tipeKamar[2] = "Presidential Suite";
        String tipeKamar = JOptionPane.showInputDialog(null, "1. Standard Room \n2. Deluxe Room \n3. Presidential Suite \nPilih tipe kamar: ");
        int tipeKamar2 = Integer.parseInt(tipeKamar);
        // tipeKamar0 = hotel.tipeKamar[tipeKamar2-1];
        System.out.println(hotel.tipeKamar[tipeKamar2-1]);
        // String tipeKasur = JOptionPane.showInputDialog(null, "1. Single Bed \n2. Queen Size \n3. King Size \nPilih tipe kasur: ");
        // int tipeKasur2 = Integer.parseInt(tipeKasur);

        //hotel.lamaInap = checkOut2 - checkIn2;

        //cariHotel(hotel, kota2);
        //pesanTiketHotel(hotel);
        //show(hotel, hotelName, tipeKamar0);
    }
}
