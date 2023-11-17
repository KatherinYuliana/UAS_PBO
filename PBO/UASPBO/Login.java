import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.*;

public class Login {
    private Connection connection;
    private Statement statement;
    private static String email, pass;
    public Login() {
        JFrame frame = new JFrame("Login");
        
        JLabel lEmail, lPass;
        JTextField tEmail;
        JPasswordField password;
        
        lEmail = new JLabel("Masukkan email: ");
        lEmail.setBounds(50, 100, 100, 30);
        frame.add(lEmail);
        tEmail = new JTextField();
        tEmail.setBounds(200, 100, 230, 30);
        frame.add(tEmail);
        
        lPass = new JLabel("Masukkan password: ");
        lPass.setBounds(50, 150, 200, 30);
        frame.add(lPass);
        password = new JPasswordField();
        password.setBounds(200, 150, 230, 30);
        frame.add(password);
        
        JButton login = new JButton("Login");
        login.setBounds(200, 250, 150, 30);
        frame.add(login);
        
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        //         // Menghubungkan ke database
        //         try {
        //             connection = DriverManager.getConnection("jdbc:mysql://localhost/game_store", "root", "");
        //             statement = connection.createStatement();
        //         } catch (SQLException d) {
        //             d.printStackTrace();
        //         }

        //         // email = tEmail.getText().toString();
        //         // String password = new String(password.getPassword());
        //         // pass = password.getText().toString();
        //         //// Ganti kode ini dengan pengecekan ke Tabel Users
        //         //boolean loginSuccessful = checkLoginCredentials(email, password);

        //         // try {
        //         //     sql = "SELECT * FROM admin WHERE username='"+txt_name.getText()+"' AND password='"+txt_pass.getText()+"'";
        //         //     rs = stat.executeQuery(sql);
        //         //     if(rs.next()){
        //         //         if(txt_name.getText().equals(rs.getString("username")) && txt_pass.getText().equals(rs.getString("password"))){
        //         //             JOptionPane.showMessageDialog(null, "berhasil login");
        //         //         }
        //         //     }else{
        //         //             JOptionPane.showMessageDialog(null, "username atau password salah");
        //         //         }
        //         // } catch (Exception e) {
        //         //     JOptionPane.showMessageDialog(this, e.getMessage());
        //         // }

        //         // if (loginSuccessful) {
        //         //     JOptionPane.showMessageDialog(null, "Login successful!");
        //             new GameList();
        //         // } else {
        //         //     JOptionPane.showMessageDialog(null, "Login failed. Invalid email or password.");
        //         // }
        //         frame.dispose();

        //         // Get the email and password from the text fields
        // String email = emailField.getText();
        // String password = new String(passwordField.getPassword());

        // // Check the email and password against the Users table in the database
        // try {
        //     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game_store", "root", "");
        //     Statement stmt = conn.createStatement();
        //     String query = "SELECT * FROM Users WHERE email='" + email + "' AND password='" + password + "'";
        //     ResultSet rs = stmt.executeQuery(query);

        //     // If the email and password match, display the Game List menu
        //     if (rs.next()) {
        //         // MenuGameList gameList = new MenuGameList();
        //         // dispose();
                new GameList();
        //     }
        //     // Otherwise, show a JOptionPane with a failure message
        //     else {
        //         JOptionPane.showMessageDialog(this, "Login failed. Please try again.");
        //     }

        //     // Close the database connection
        //     rs.close();
        //     stmt.close();
        //     conn.close();
        // } catch (SQLException ex) {
        //     ex.printStackTrace();
        // }
                
        //     }
            }
        });

    }
}
