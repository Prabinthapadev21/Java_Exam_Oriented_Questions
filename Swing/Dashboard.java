package Swing;
import javax.swing.*;
import java.awt.*;

public class Dashboard {
    public JFrame frame;
    public JButton newBook;
    public JButton report;
    public JButton newStudent;
    public JButton issueBook;
    public JButton returnBook;
    public JButton about;

    public Dashboard() {
        frame = new JFrame("Library Management System");
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu Bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Save");

        m1.add(mi1);
        m2.add(mi2);
        mb.add(m1);
        mb.add(m2);
        frame.setJMenuBar(mb);

//        for lms logo
        JLabel logo = new JLabel("LMS",JLabel.LEFT);
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        logo.setBounds(20, 10, 200, 40);
        frame.add(logo);

        // Row 1 Buttons
        newBook = new JButton("New Book");
        newBook.setBounds(50, 50, 180, 60);
        frame.add(newBook);

        report = new JButton("Generate Report");
        report.setBounds(260, 50, 180, 60);
        frame.add(report);

        newStudent = new JButton("New Student");
        newStudent.setBounds(470, 50, 180, 60);
        frame.add(newStudent);

        // Separator between rows
        JSeparator separator = new JSeparator();
        separator.setBounds(30, 130, 630, 2);
        frame.add(separator);

        // Row 2 Buttons
        issueBook = new JButton("Issue Book");
        issueBook.setBounds(50, 150, 180, 60);
        frame.add(issueBook);

        returnBook = new JButton("Return Book");
        returnBook.setBounds(260, 150, 180, 60);
        frame.add(returnBook);

        about = new JButton("About");
        about.setBounds(470, 150, 180, 60);
        frame.add(about);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
