package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        frame.setSize(750, 400);
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

        // LMS Logo
        JLabel logo = new JLabel("LMS", JLabel.LEFT);
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        logo.setBounds(20, 10, 100, 30);
        frame.add(logo);

        // Row 1 Buttons
        newBook = new JButton("New Book");
        newBook.setBounds(50, 60, 200, 60);
        frame.add(newBook);

        report = new JButton("Generate Report");
        report.setBounds(270, 60, 200, 60);
        frame.add(report);

        newStudent = new JButton("New Student");
        newStudent.setBounds(490, 60, 200, 60);
        frame.add(newStudent);

        // Separator
        JSeparator separator = new JSeparator();
        separator.setBounds(30, 140, 670, 2);
        frame.add(separator);

        // Row 2 Buttons
        issueBook = new JButton("Issue Book");
        issueBook.setBounds(50, 160, 200, 60);
        frame.add(issueBook);

        returnBook = new JButton("Return Book");
        returnBook.setBounds(270, 160, 200, 60);
        frame.add(returnBook);

        about = new JButton("About");
        about.setBounds(490, 160, 200, 60);
        frame.add(about);

        frame.setVisible(true);


        newBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDesktopPane d = new JDesktopPane();
                JInternalFrame frame1 = new JInternalFrame("Add new Book",true,true,true,true);
                frame1.setSize(400,400);
                JLabel fl1 = new JLabel("")
            }
        });
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
