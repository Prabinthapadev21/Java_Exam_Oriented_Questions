package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard {
    public JFrame frame;
    public JDesktopPane desktopPane;
    public JButton newBook, report, newStudent, issueBook, returnBook, about;

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
                JInternalFrame frame1 = new JInternalFrame("Add New Book", true, true, true, true);
                frame1.setLayout(null);
                frame1.setSize(500, 400);
                frame1.setVisible(true);

                // Labels
                JLabel l1 = new JLabel("Book ID:");
                l1.setBounds(50, 30, 100, 25);
                frame1.add(l1);

                JLabel l2 = new JLabel("Name:");
                l2.setBounds(50, 70, 100, 25);
                frame1.add(l2);

                JLabel l3 = new JLabel("Edition:");
                l3.setBounds(50, 110, 100, 25);
                frame1.add(l3);

                JLabel l4 = new JLabel("Publisher:");
                l4.setBounds(50, 150, 100, 25);
                frame1.add(l4);

                JLabel l5 = new JLabel("Price:");
                l5.setBounds(50, 190, 100, 25);
                frame1.add(l5);

                JLabel l6 = new JLabel("Pages:");
                l6.setBounds(50, 230, 100, 25);
                frame1.add(l6);

                // TextFields
                JTextField t1 = new JTextField();
                t1.setBounds(160, 30, 250, 25);
                frame1.add(t1);

                JTextField t2 = new JTextField();
                t2.setBounds(160, 70, 250, 25);
                frame1.add(t2);

                JTextField t3 = new JTextField();
                t3.setBounds(160, 110, 250, 25);
                frame1.add(t3);

                JTextField t4 = new JTextField();
                t4.setBounds(160, 150, 250, 25);
                frame1.add(t4);

                JTextField t5 = new JTextField();
                t5.setBounds(160, 190, 250, 25);
                frame1.add(t5);

                JTextField t6 = new JTextField();
                t6.setBounds(160, 230, 250, 25);
                frame1.add(t6);

                // Buttons
                JButton addBtn = new JButton("Add");
                addBtn.setBounds(160, 280, 100, 30);
                frame1.add(addBtn);

                JButton backBtn = new JButton("Back");
                backBtn.setBounds(310, 280, 100, 30);
                frame1.add(backBtn);

                // Back button closes the internal frame
                backBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame1.dispose();
                    }
                });

                // Add internal frame to desktopPane
                desktopPane.add(frame1);
                try {
                    frame1.setSelected(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
