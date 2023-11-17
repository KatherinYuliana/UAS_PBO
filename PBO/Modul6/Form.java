import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.*;

public class Form implements ActionListener {
    private Connection connection;
    private Statement statement;
    private static String nik, nama, tempatLahir, tglLahir, gender, goldar, alamat, rtrw, kel, kec, agama, status, pekerjaan, kewarganegaraan, tglBerlaku, kotaPembuatan, tglPembuatan;
    
    public Form() {
        JFrame frame = new JFrame("Form Input");
        
        JLabel label1, lNik, lNama, lTl, lTglLahir, lGender, lGoldar, lAlamat, lRtrw, lKel, lKec, lAgama, lStatus, lPekerjaan, lKewarganegaraan, lFoto, lTtd, lTglBerlaku, lKotaPembuatan, lTglPembuatan;
        JTextField tNik, tNama, tTl, tAlamat, tRtrw, tKel, tKec, tBerlaku, tKota;
        ButtonGroup group = new ButtonGroup();

        label1 = new JLabel("Input Data Penduduk");
        label1.setBounds(10, 3, 200, 30);
        frame.add(label1);

        lNik = new JLabel("NIK: ");
        lNik.setBounds(10, 40, 200, 30);
        frame.add(lNik);
        tNik = new JTextField();
        tNik.setBounds(150, 45, 200, 20);
        frame.add(tNik);

        lNama = new JLabel("Nama: ");
        lNama.setBounds(10, 70, 200, 30);
        frame.add(lNama);
        tNama = new JTextField();
        tNama.setBounds(150, 75, 200, 20);
        frame.add(tNama);

        lTl = new JLabel("Tempat Lahir: ");
        lTl.setBounds(10, 100, 200, 30);
        frame.add(lTl);
        tTl = new JTextField();
        tTl.setBounds(150, 105, 200, 20);
        frame.add(tTl);
        
        lTglLahir = new JLabel("Tanggal Lahir: ");
        lTglLahir.setBounds(10, 130, 200, 30);
        frame.add(lTglLahir);
        
        lGender = new JLabel("Jenis Kelamin: ");
        lGender.setBounds(10, 160, 200, 30);
        frame.add(lGender);
        JRadioButton pria = new JRadioButton("Pria");
        JRadioButton wanita = new JRadioButton("Wanita");
        pria.setBounds(150, 160, 50, 30);
        wanita.setBounds(200, 160, 100, 30);
        group.add(pria);
        pria.addActionListener(this);
        frame.add(pria);
        frame.add(wanita);

        lGoldar = new JLabel("Gol. darah: ");
        lGoldar.setBounds(10, 190, 200, 30);
        frame.add(lGoldar);
        JRadioButton a = new JRadioButton("A");
        JRadioButton b = new JRadioButton("B");
        JRadioButton o = new JRadioButton("O");
        JRadioButton ab = new JRadioButton("AB");
        a.setBounds(150, 190, 50, 30);
        b.setBounds(200, 190, 50, 30);
        o.setBounds(250, 190, 50, 30);
        ab.setBounds(300, 190, 50, 30);
        frame.add(a);
        frame.add(b);
        frame.add(o);
        frame.add(ab);
        
        lAlamat = new JLabel("Alamat: ");
        lAlamat.setBounds(10, 220, 200, 30);
        frame.add(lAlamat);
        tAlamat = new JTextField();
        tAlamat.setBounds(150, 225, 200, 20);
        frame.add(tAlamat);

        lRtrw = new JLabel("RT/RW: ");
        lRtrw.setBounds(10, 250, 200, 30);
        frame.add(lRtrw);
        tRtrw = new JTextField();
        tRtrw.setBounds(150, 255, 200, 20);
        frame.add(tRtrw);
        
        lKel = new JLabel("Kel/Desa: ");
        lKel.setBounds(10, 280, 200, 30);
        frame.add(lKel);
        tKel = new JTextField();
        tKel.setBounds(150, 285, 200, 20);
        frame.add(tKel);

        lKec = new JLabel("Kecamatan: ");
        lKec.setBounds(10, 310, 200, 30);
        frame.add(lKec);
        tKec = new JTextField();
        tKec.setBounds(150, 315, 200, 20);
        frame.add(tKec);
        
        lAgama = new JLabel("Agama: ");
        lAgama.setBounds(10, 340, 200, 30);
        frame.add(lAgama);
        String arrAgama[] = { " ", "Islam", "Kristen", "Katolik", "Hindu", "Buddha" };
        JComboBox cbAgama = new JComboBox(arrAgama);
        cbAgama.setBounds(150, 345, 200, 20);
        frame.add(cbAgama);

        lStatus = new JLabel("Status Pernikahan: ");
        lStatus.setBounds(10, 370, 200, 30);
        frame.add(lStatus);
        String arrStatus[] = { " ", "Belum Menikah", "Menikah", "Janda/Duda" };
        JComboBox cbStatus = new JComboBox(arrStatus);
        cbStatus.setBounds(150, 375, 200, 20);
        frame.add(cbStatus);
        
        lPekerjaan = new JLabel("Pekerjaan: ");
        lPekerjaan.setBounds(10, 400, 200, 30);
        frame.add(lPekerjaan);
        JCheckBox karyawanSwasta = new JCheckBox("Karyawan Swasta");
        karyawanSwasta.setBounds(150, 400, 150, 30);
        JCheckBox pns = new JCheckBox("PNS");
        pns.setBounds(300, 400, 50, 30);
        JCheckBox wiraswasta = new JCheckBox("Wiraswasta");
        wiraswasta.setBounds(350, 400, 100, 30);
        JCheckBox akademisi = new JCheckBox("Akademisi");
        akademisi.setBounds(450, 400, 100, 30);
        JCheckBox pengangguran = new JCheckBox("Pengangguran");
        pengangguran.setBounds(550, 400, 120, 30);
        frame.add(karyawanSwasta);
        frame.add(pns);
        frame.add(wiraswasta);
        frame.add(akademisi);
        frame.add(pengangguran);
        
        lKewarganegaraan = new JLabel("Kewarganegaraan: ");
        lKewarganegaraan.setBounds(10, 430, 200, 30);
        frame.add(lKewarganegaraan);
        JRadioButton wni = new JRadioButton("WNI");
        JRadioButton wna = new JRadioButton("WNA");
        wni.setBounds(150, 430, 50, 30);
        wna.setBounds(200, 430, 100, 30);
        frame.add(wni);
        frame.add(wna);
        
        lFoto = new JLabel("Foto: ");
        lFoto.setBounds(10, 460, 200, 30);
        frame.add(lFoto);
        
        lTtd = new JLabel("Tanda Tangan: ");
        lTtd.setBounds(10, 490, 200, 30);
        frame.add(lTtd);
        
        lTglBerlaku = new JLabel("Tanggal Berlaku: ");
        lTglBerlaku.setBounds(10, 520, 200, 30);
        frame.add(lTglBerlaku);
        tBerlaku = new JTextField();
        tBerlaku.setBounds(150, 525, 200, 20);
        frame.add(tBerlaku);
        
        lKotaPembuatan = new JLabel("Kota Pembuatan: ");
        lKotaPembuatan.setBounds(10, 550, 200, 30);
        frame.add(lKotaPembuatan);
        tKota = new JTextField();
        tKota.setBounds(150, 555, 200, 20);
        frame.add(tKota);
        
        lTglPembuatan = new JLabel("Tanggal pembuatan: ");
        lTglPembuatan.setBounds(10, 580, 200, 30);
        frame.add(lTglPembuatan);
        
        JButton insert = new JButton("Insert");
        insert.setBounds(10, 620, 80, 30);
        frame.add(insert);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                nik = tNik.getText().toString();
                nama = tNama.getText().toString();
                tempatLahir = tTl.getText().toString();
                // tgl lahir
                // gender = gender.getText().toString().trim();
                // goldar
                alamat = tAlamat.getText().toString();
                rtrw = tRtrw.getText().toString();
                kel = tKel.getText().toString();
                kec = tKec.getText().toString();

                tglBerlaku = tBerlaku.getText().toString();
                kotaPembuatan = tKota.getText().toString();

                insertData(nik, nama, tempatLahir, alamat);
                new Hasil();
            }
        });
        
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void insertData(String nik, String nama, String tempatLahir, String alamat) {
        
        // Menghubungkan ke database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db_ktp", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
                
        // Memasukkan data ke tabel
        try {
            String insertDataQuery = "INSERT INTO data (nik, nama, tempat_lahir, alamat) VALUES (" + nik + ", '" + nama + "', '" + tempatLahir + "', '" + alamat + "')";
            statement.executeUpdate(insertDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(int nik, String nama, String alamat, String ttl) {
        // Menghubungkan ke database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db_ktp", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Mengupdate data berdasarkan NIK
        try {
            String updateDataQuery = "UPDATE data SET nama = '" + nama + "', alamat = '" + alamat + "', ttl = '" + ttl + "' WHERE nik = " + nik;
            statement.executeUpdate(updateDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
            
    public void deleteData(int nik) {
        // Menghubungkan ke database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db_ktp", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Menghapus data berdasarkan NIK
        try {
            String deleteDataQuery = "DELETE FROM data WHERE nik = " + nik;
            statement.executeUpdate(deleteDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
