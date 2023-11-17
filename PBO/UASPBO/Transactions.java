import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class Transactions {
    private JTable table;
    private JTable transactionsTable;

    public Transactions() {
        JFrame frame = new JFrame("Transactions");

        String data[][]={ {" "," "," ", " ", " ", " "}};    
        String column[]={"ID","User ID","User Name", "Game ID", "Game Name", "Total Price"};         
        JTable jt=new JTable(data,column);    
        jt.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(jt);  
        frame.add(sp);
        
        frame.setSize(700, 700);
        frame.setVisible(true);

    }
}
