import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.*;

public class Hasil {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public Hasil(){
        JFrame frame = new JFrame("Form Input");
        Color color = new Color(153, 239, 242);
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(color);

        JLabel judul, nik, nama, tl, tglLahir, gender, goldar, alamat, rtrw, kel, kec, agama, status, pekerjaan, kewarganegaraan, foto, ttd, tglBerlaku, kotaPembuatan, tglPembuatan;
        judul = new JLabel("Republik Harapan Bangsa");
        judul.setBounds(180, 5, 400, 30);
        judul.setFont(new Font("Serif", Font.PLAIN, 22));
        frame.add(judul);

        nik = new JLabel("NIK: ");
        nik.setBounds(30, 40, 400, 30);
        nik.setFont(new Font("Serif", Font.PLAIN, 16));
        frame.add(nik);

        nama = new JLabel("Nama: ");
        nama.setBounds(30, 65, 200, 30);
        frame.add(nama);

        tl = new JLabel("Tempat Lahir: ");
        tl.setBounds(30, 80, 200, 30);
        frame.add(tl);

        tglLahir = new JLabel("Tanggal Lahir: ");
        tglLahir.setBounds(30, 95, 200, 30);
        frame.add(tglLahir);

        gender = new JLabel("Jenis Kelamin: ");
        gender.setBounds(30, 110, 200, 30);
        frame.add(gender);

        goldar = new JLabel("Gol. darah: ");
        goldar.setBounds(30, 125, 200, 30);
        frame.add(goldar);

        alamat = new JLabel("Alamat: ");
        alamat.setBounds(30, 140, 200, 30);
        frame.add(alamat);

        rtrw = new JLabel("RT/RW: ");
        rtrw.setBounds(50, 155, 200, 30);
        frame.add(rtrw);

        kel = new JLabel("Kel/Desa: ");
        kel.setBounds(50, 170, 200, 30);
        frame.add(kel);

        kec = new JLabel("Kecamatan: ");
        kec.setBounds(50, 185, 200, 30);
        frame.add(kec);

        agama = new JLabel("Agama: ");
        agama.setBounds(30, 200, 200, 30);
        frame.add(agama);

        status = new JLabel("Status Pernikahan: ");
        status.setBounds(30, 215, 200, 30);
        frame.add(status);

        pekerjaan = new JLabel("Pekerjaan: ");
        pekerjaan.setBounds(30, 230, 200, 30);
        frame.add(pekerjaan);

        kewarganegaraan = new JLabel("Kewarganegaraan: ");
        kewarganegaraan.setBounds(30, 245, 200, 30);
        frame.add(kewarganegaraan);

        tglBerlaku = new JLabel("Berlaku Hingga: ");
        tglBerlaku.setBounds(30, 260, 200, 30);
        frame.add(tglBerlaku);

        JButton back = new JButton("Back to Main Menu");
        back.setBounds(30, 305, 150, 30);
        frame.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Main();
            }
        });
    }

    public void searchData(int nik) {
        // Menghubungkan ke database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db_ktp", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Mencari data berdasarkan NIK
        try {
            String searchDataQuery = "SELECT * FROM ktp WHERE nik = " + nik;
            resultSet = statement.executeQuery(searchDataQuery);
                    
            // Menampilkan data yang ditemukan
            if (resultSet.next()) {
                String foundNik = resultSet.getString("nik");
                String foundNama = resultSet.getString("nama");
                String foundAlamat = resultSet.getString("alamat");
                String foundTtl = resultSet.getString("ttl");

                new Hasil();

            } else {
                System.out.println("Data tidak ditemukan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
