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

public class GameList {
    private ArrayList<Game> games;

    private class Game {
        private int id;
        private String name;
        private String genre;
        private double price;
        private String imagePath;

        public Game(int id, String name, String genre, double price, String imagePath) {
            this.id = id;
            this.name = name;
            this.genre = genre;
            this.price = price;
            this.imagePath = imagePath;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getGenre() {
            return genre;
        }

        public double getPrice() {
            return price;
        }

        public String getImagePath() {
            return imagePath;
        }
    }

    public GameList() {
        JFrame frame = new JFrame("Game List");

        JButton transactionsButton = new JButton("Transactions");
        transactionsButton.setBounds(20, 20, 150, 20);
        transactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Transactions();
            }
        });
        frame.add(transactionsButton);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(50, 80, 100, 30);
        frame.add(nameLabel);
        JLabel genreLabel = new JLabel("Genre: ");
        genreLabel.setBounds(50, 100, 100, 30);
        frame.add(genreLabel);
        JLabel priceLabel = new JLabel("Price: " );
        priceLabel.setBounds(50, 120, 100, 30);
        frame.add(priceLabel);

        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private ArrayList<Game> fetchGamesFromDatabase() {
        // Simulasi pengambilan data games dari database
        // Gantilah bagian ini dengan query yang sesuai dengan basis data Anda
        ArrayList<Game> games = new ArrayList<>();
        // Contoh pengisian data games (simulasi data dari database)
        games.add(new Game(1, "Game 1", "Action", 19.99, "path_to_image1.jpg"));
        games.add(new Game(2, "Game 2", "Adventure", 24.99, "path_to_image2.jpg"));
        games.add(new Game(3, "Game 3", "Puzzle", 14.99, "path_to_image3.jpg"));
        return games;
    }

    

}
