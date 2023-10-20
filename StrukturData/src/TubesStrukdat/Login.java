package TubesStrukdat;

import javax.swing.JOptionPane;
import java.util.Scanner;

class User {
    String username;
    String password;

    public User(String username, String password){
        this.username = "Katherin";
        this.password = "123";
    }
}

public class Login {
    // public static void login(){
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User(null, null);
        
        String username2 = JOptionPane.showInputDialog("Masukkan Username");
        String password2 = JOptionPane.showInputDialog("Masukkan Password");
        //while (username2 != username1) {
            //System.out.println("Masukkan username:");
            //user.username = scan.nextLine();
            //user.username = JOptionPane.showInputDialog("Masukkan Username");
            //user.password = JOptionPane.showInputDialog("Masukkan Password");
        //}
            if (user.username != username2 && user.password != password2) {
                JOptionPane.showMessageDialog(null, "Login berhasil");
                //System.out.println("Berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Username salah", "Login", JOptionPane.ERROR_MESSAGE);
                //System.out.println("Gagal");
            }
        // int count = 0;
        // int pin = 12345;
        // int temp = 0;
        // while (count < 3 && pin != temp) {
        //     System.out.println("Masukkan pin : ");
        //     temp = scan.nextInt();
        //     if (pin == temp) {
        //         System.out.println("Berhasil");
        //     } else {
        //         count++;
        //         System.out.println("Gagal");
        //     }
        // }
    }
}
