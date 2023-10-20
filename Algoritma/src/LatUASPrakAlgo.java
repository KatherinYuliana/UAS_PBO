
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class Seat {
    String seatCode;
    boolean seatState;
}

class Film {
    String title;
    double duration;
    String releaseDate;
    double rating;
}

class Studio{
    Seat seats[] = new Seat[2];
    double ticketPrice;
    Film film = new Film();
}

class Transaction{
    String transactionCode;
    String filmName;
    String chairCode;
    String paymentMethod;
    long totalOrder;
}

class Member{
    String userName;
    String password;
    Transaction transactions[] = new Transaction[5];
}
public class LatUASPrakAlgo {
    public static void main(String[] args) {
//        menampilkan pesan
//        JOptionPane.showMessageDialog(null,"Selamat datang");
//        menginput data
//        JOptionPane.showInputDialog("Masukkan password");
//        menampilkan eror message
//        JOptionPane.showMessageDialog(null, "Password Anda Salah", "Bioskop HB",JOptionPane.ERROR_MESSAGE);

        String input = JOptionPane.showInputDialog("Anda adalah: " + "\n" + "1. Admin" + "\n" + "2. Member" + "\n" + "3. Keluar");
        int scan = Integer.parseInt(input);
        if(scan == 1){
            JOptionPane.showInputDialog("Masukkan password anda");
        }
    }
}
