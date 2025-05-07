package Swing;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Dashboard {
    public JFrame frame;
    public JButton newBook;
    public JButton report;
    public JButton newStudent;
    public JButton issueBook;
    public JButton returnBook;
    public JButton about;
    public Dashboard()
    {
        frame = new JFrame("Library Management System");
        frame.setSize(900,900);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem mi1 = new JMenuItem("new");
        JMenuItem mi2 = new JMenuItem("save");

        m1.add(mi1);
        m2.add(mi2);
        mb.add(m1);
        mb.add(m2);
        frame.setJMenuBar(mb);

//        adding the buttons into the frame

        newBook = new JButton("New Book");
        newBook.setBounds(80,80,100,40);
        frame.add(newBook);

        report = new JButton("Generate Report");
        report.setBounds(120,80,100,40);
        frame.add(report);

        newStudent = new JButton("New Student");
        newStudent.setBounds(160,80,100,40);
        frame.add(newStudent);


        issueBook = new JButton("Issue Book");
        issueBook.setBounds(80,120,100,40);
        frame.add(issueBook);

        returnBook = new JButton("Return Book");
        returnBook.setBounds(120,80,100,40);
        frame.add(returnBook);

        about = new JButton("About");
        about.setBounds(160,80,100,40);
        frame.add(about);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
