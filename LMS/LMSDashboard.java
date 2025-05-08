package LMS;
import StringFunction.StringSearchingIndexOf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LMSDashboard {
    public JFrame frame;
    public JDesktopPane desktopPane;
    public JButton newBook, report, newStudent, issueBook, returnBook, about,logout;
    public JTextField t1,t2,t3,t4,t5,t6,t7;

    public LMSDashboard() {
        frame = new JFrame("Library Management System");
        frame.setSize(750, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Desktop Pane
        desktopPane = new JDesktopPane();
        desktopPane.setBounds(0, 0, 750, 400);
        frame.add(desktopPane);

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
        desktopPane.add(logo);

        // Row 1 Buttons
        newBook = new JButton("New Book");
        newBook.setBounds(50, 60, 200, 60);
        desktopPane.add(newBook);

        report = new JButton("Generate Report");
        report.setBounds(270, 60, 200, 60);
        desktopPane.add(report);

        newStudent = new JButton("New Student");
        newStudent.setBounds(490, 60, 200, 60);
        desktopPane.add(newStudent);

        // Separator
        JSeparator separator = new JSeparator();
        separator.setBounds(30, 140, 670, 2);
        desktopPane.add(separator);

        // Row 2 Buttons
        issueBook = new JButton("Issue Book");
        issueBook.setBounds(50, 160, 200, 60);
        desktopPane.add(issueBook);

        returnBook = new JButton("Return Book");
        returnBook.setBounds(270, 160, 200, 60);
        desktopPane.add(returnBook);

        about = new JButton("About");
        about.setBounds(490, 160, 200, 60);
        desktopPane.add(about);

        JButton logout = new JButton("Logout");
        logout.setBounds(600, 240, 100, 30);
        desktopPane.add(logout);


        frame.setVisible(true);

        // New Book Button Action
        newBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame frame1 = new JInternalFrame("Add New Book", true, true, true, true);
                frame1.setLayout(null);
                frame1.setSize(500, 400);

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
                t1 = new JTextField();
                t1.setBounds(160, 30, 250, 25);
                frame1.add(t1);

                t2 = new JTextField();
                t2.setBounds(160, 70, 250, 25);
                frame1.add(t2);

                t3 = new JTextField();
                t3.setBounds(160, 110, 250, 25);
                frame1.add(t3);

                t4 = new JTextField();
                t4.setBounds(160, 150, 250, 25);
                frame1.add(t4);

                t5 = new JTextField();
                t5.setBounds(160, 190, 250, 25);
                frame1.add(t5);

                t6 = new JTextField();
                t6.setBounds(160, 230, 250, 25);
                frame1.add(t6);


                // Add internal frame to desktopPane
                desktopPane.add(frame1);

                // Centering the internal frame
                Dimension desktopSize = desktopPane.getSize();
                Dimension jInternalFrameSize = frame1.getSize();
                int x = (desktopSize.width - jInternalFrameSize.width) / 2;
                int y = (desktopSize.height - jInternalFrameSize.height) / 2;
                frame1.setLocation(x, y);

                frame1.setVisible(true);

                try {
                    frame1.setSelected(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


                // Buttons
                JButton addBtn = new JButton("Add");
                addBtn.setBounds(160, 280, 100, 30);
                frame1.add(addBtn);

                JButton backBtn = new JButton("Back");
                backBtn.setBounds(310, 280, 100, 30);
                frame1.add(backBtn);


//                dispose for the back button
                backBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame1.dispose();
                    }
                });

//                for the add button
                addBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newBookConnection();
                    }
                });
            }
        });

//                for the logout button
                logout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose(); // Closes the LMSDashboard window
                        new WelcomePage(); // Opens the WelcomePage
                    }
                });




//                for about us section

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame frame2 = new JInternalFrame("About Us", true, true, true, true);
                frame2.setSize(630, 400);
                frame2.setLayout(null);
                frame2.setBackground(new Color(44,62,80));

                // Developer Labels
                JLabel title = new JLabel("Library Management System - Developers");
                title.setBounds(140, 10, 350, 25);
                title.setFont(new Font("Arial", Font.BOLD, 16));
                frame2.add(title);
                title.setForeground(Color.WHITE);

                // Load Images
                ImageIcon icon1 = new ImageIcon("LMS/photo.jpeg");
                ImageIcon icon2 = new ImageIcon("LMS/sasin.jpeg");
                ImageIcon icon3 = new ImageIcon("LMS/dada.jpeg");

                // Resize images
                Image img1 = icon1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                Image img2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                Image img3 = icon3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);

                // Image Labels
                JLabel pic1 = new JLabel(new ImageIcon(img1));
                pic1.setBounds(60, 60, 80, 80);
                frame2.add(pic1);

                JLabel pic2 = new JLabel(new ImageIcon(img2));
                pic2.setBounds(250, 60, 80, 80);
                frame2.add(pic2);

                JLabel pic3 = new JLabel(new ImageIcon(img3));
                pic3.setBounds(440, 60, 80, 80);
                frame2.add(pic3);

                // Names and Roles
                JLabel name1 = new JLabel("Prabin Thapa", JLabel.CENTER);
                name1.setBounds(40, 150, 120, 25);
                frame2.add(name1);
                name1.setForeground(Color.WHITE);

                JLabel role1 = new JLabel("Full Stack Developer", JLabel.CENTER);
                role1.setBounds(40, 175, 130, 25);
                frame2.add(role1);
                role1.setForeground(Color.WHITE);

                JLabel name2 = new JLabel("Sasin Godar", JLabel.CENTER);
                name2.setBounds(230, 150, 120, 25);
                frame2.add(name2);
                name2.setForeground(Color.WHITE);

                JLabel role2 = new JLabel("Backend Developer", JLabel.CENTER);
                role2.setBounds(230, 175, 130, 25);
                frame2.add(role2);
                role2.setForeground(Color.WHITE);

                JLabel name3 = new JLabel("Anuz Dhakal", JLabel.CENTER);
                name3.setBounds(420, 150, 120, 25);
                frame2.add(name3);
                name3.setForeground(Color.WHITE);

                JLabel role3 = new JLabel("Frontend + UI Developer", JLabel.CENTER);
                role3.setBounds(420, 175, 160, 25);
                frame2.add(role3);
                role3.setForeground(Color.WHITE);

                // Description
                JLabel desc = new JLabel("<html><center>This Library Management System was developed<br>"
                        + "as part of a software engineering project to handle books,<br>"
                        + "students, and issue/return transactions efficiently.</center></html>");
                desc.setBounds(100, 200, 400, 80);
                frame2.add(desc);
                desc.setForeground(Color.WHITE);

                frame2.setVisible(true);
                desktopPane.add(frame2);

                // Center the internal frame
                Dimension desktopSize = desktopPane.getSize();
                Dimension jInternalFrameSize = frame2.getSize();
                int x = (desktopSize.width - jInternalFrameSize.width) / 2;
                int y = (desktopSize.height - jInternalFrameSize.height) / 2;
                frame2.setLocation(x, y);

                try {
                    frame2.setSelected(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

//    for adding the new books into the database.
    public void newBookConnection() {
        try {
            // Validate inputs
            if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields must be filled.");
                return;
            }

            int book_id = Integer.parseInt(t1.getText());
            String name = t2.getText();
            String edition = t3.getText();
            String publisher = t4.getText();
            int price = Integer.parseInt(t5.getText());
            int page = Integer.parseInt(t6.getText());

            // Connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");
                 PreparedStatement pst = con.prepareStatement("INSERT INTO books(book_id, name, edition, publisher, price, page) VALUES (?, ?, ?, ?, ?, ?)")) {

                pst.setInt(1, book_id);
                pst.setString(2, name);
                pst.setString(3, edition);
                pst.setString(4, publisher);
                pst.setInt(5, price);
                pst.setInt(6, page);

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(frame, "Book inserted successfully.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Book insertion failed.");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for Book ID, Price, and Pages.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Unexpected error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new LMSDashboard();
    }
}
