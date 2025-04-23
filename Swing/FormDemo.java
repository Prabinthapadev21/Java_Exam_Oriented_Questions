package Swing;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
public class FormDemo {
    public FormDemo() {
        JFrame f = new JFrame("Login Form");

// Menu for the JFrame
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Home");
        JMenu m2 = new JMenu("File");
        JMenu m3 = new JMenu("Layout");

//        for menu options
        JMenuItem i1 = new JMenuItem("New Text File");
        JMenuItem i2 = new JMenuItem("New File");
        JMenuItem i3 = new JMenuItem("Open Folder");
        JMenuItem i4 = new JMenuItem("Save");
        JMenuItem i5 = new JMenuItem("Open Folder");


//        adding the label
        JLabel l1 = new JLabel("User Login");
        l1.setForeground(Color.blue);

        JPanel p = new JPanel();
        p.setSize(1000,1000);
        p.setBackground(Color.LIGHT_GRAY);
        p.set

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);


//       Adding menu to the Frame
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        f.add(l1);
//        adding the label
        f.setLayout(fl);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.setJMenuBar(mb);

//        adding pannel
        f.add(p);
//   Default requirements of JFrame
        f.setVisible(true);
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FormDemo();
    }
}
