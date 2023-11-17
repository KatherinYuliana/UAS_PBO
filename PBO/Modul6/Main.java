import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main {
    public Main() {
        JFrame frame = new JFrame("Menu");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton perekaman = new JButton("Perekaman");
        JButton pencarian = new JButton("Pencarian");
        JButton exit = new JButton("Exit");
    
        perekaman.setBounds(150, 100, 150, 30);
        frame.add(perekaman);
        pencarian.setBounds(150, 150, 150, 30);
        frame.add(pencarian);
        exit.setBounds(150, 200, 150, 30);
        frame.add(exit);

        perekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Form();
            }
        });

        pencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame = new JFrame("Search");
                frame.setSize(500, 400);
                frame.setLayout(null);
                frame.setVisible(true);

                JLabel lNik;
                JTextField tNik;
                lNik = new JLabel("NIK: ");
                lNik.setBounds(10, 40, 200, 30);
                frame.add(lNik);
                tNik = new JTextField();
                tNik.setBounds(50, 45, 200, 20);
                frame.add(tNik);

                JButton cari = new JButton("Cari");
                cari.setBounds(300, 45, 60, 20);
                frame.add(cari);

                cari.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        new Form();
                    }
                });
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}