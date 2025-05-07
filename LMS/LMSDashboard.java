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
    public JTextField t1,t2,t3,t4,t5,t6;

    public LMSDashboard() {
        frame = new JFrame("Library Management System");
        frame.setSize(750, 400);
        frame.setLayout(null);
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
            }
        });
    }
    public void newBookConnection() {
        try {
            int  bookid = Integer.parseInt(t1.getText());
            String bookname = t2.getText();
            String edition = t3.getText();
            String publisher = t4.getText();
            int price =Integer.parseInt( t5.getText());
            int  page = Integer.parseInt(t6.getText());

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");
            String query = "INSERT INTO books(bookid, bookname, edition, publisher, price, page) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, bookid);
            pst.setString(2, bookname);
            pst.setString(3, edition);
            pst.setString(4, publisher);
            pst.setInt(5, price);
            pst.setInt(6, page);

            // Execute the insert
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Book inserted successfully.");
            } else {
                System.out.println("Book insertion failed.");
            }

            pst.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new LMSDashboard();
    }
}
