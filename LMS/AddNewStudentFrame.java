package LMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewStudentFrame extends JInternalFrame {

    public AddNewStudentFrame(JDesktopPane desktopPane) {
        super("Add New Student", true, true, true, true);
        setLayout(null);
        setSize(600, 400);

        // Labels
        JLabel l1 = new JLabel("Student ID:");
        l1.setBounds(50, 30, 100, 25);
        add(l1);

        JLabel l2 = new JLabel("Name:");
        l2.setBounds(50, 70, 100, 25);
        add(l2);

        JLabel l3 = new JLabel("Father:");
        l3.setBounds(50, 110, 100, 25);
        add(l3);

        JLabel l4 = new JLabel("Course:");
        l4.setBounds(50, 150, 100, 25);
        add(l4);

        JLabel l5 = new JLabel("Branch:");
        l5.setBounds(50, 190, 100, 25);
        add(l5);

        JLabel l6 = new JLabel("Year:");
        l6.setBounds(50, 230, 100, 25);
        add(l6);

        JLabel l7 = new JLabel("Semester:");
        l7.setBounds(50, 270, 100, 25);
        add(l7);

        // Text Fields
        JTextField t1 = new JTextField();
        t1.setBounds(160, 30, 250, 25);
        add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 70, 250, 25);
        add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 110, 250, 25);
        add(t3);

        JTextField t5 = new JTextField(); // branch
        t5.setBounds(160, 190, 250, 25);
        add(t5);

        // Course Radio Buttons
        JRadioButton bca = new JRadioButton("BCA");
        bca.setBounds(160, 150, 60, 25);
        JRadioButton csit = new JRadioButton("CSIT");
        csit.setBounds(230, 150, 60, 25);
        JRadioButton bim = new JRadioButton("BIM");
        bim.setBounds(300, 150, 60, 25);
        JRadioButton bhm = new JRadioButton("BHM");
        bhm.setBounds(370, 150, 60, 25);

        ButtonGroup courseGroup = new ButtonGroup();
        courseGroup.add(bca);
        courseGroup.add(csit);
        courseGroup.add(bim);
        courseGroup.add(bhm);

        add(bca); add(csit); add(bim); add(bhm);

        // Year Radio Buttons
        JRadioButton y1 = new JRadioButton("1");
        y1.setBounds(160, 230, 40, 25);
        JRadioButton y2 = new JRadioButton("2");
        y2.setBounds(210, 230, 40, 25);
        JRadioButton y3 = new JRadioButton("3");
        y3.setBounds(260, 230, 40, 25);
        JRadioButton y4 = new JRadioButton("4");
        y4.setBounds(310, 230, 40, 25);

        ButtonGroup yearGroup = new ButtonGroup();
        yearGroup.add(y1); yearGroup.add(y2); yearGroup.add(y3); yearGroup.add(y4);

        add(y1); add(y2); add(y3); add(y4);

        // Semester Radio Buttons
        JRadioButton[] semButtons = new JRadioButton[8];
        ButtonGroup semGroup = new ButtonGroup();
        for (int i = 0; i < 8; i++) {
            semButtons[i] = new JRadioButton(String.valueOf(i + 1));
            semButtons[i].setBounds(160 + i * 40, 270, 40, 25);
            semGroup.add(semButtons[i]);
            add(semButtons[i]);
        }

        // Buttons
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(160, 310, 100, 30);
        add(addBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(310, 310, 100, 30);
        add(backBtn);

        // Back button closes frame
        backBtn.addActionListener(e -> dispose());

        // Add button saves to DB
        addBtn.addActionListener(e -> {
            try {
                int studentid = Integer.parseInt(t1.getText());
                String name = t2.getText();
                String father = t3.getText();
                String branch = t5.getText();

                String course = null;
                if (bca.isSelected()) course = "BCA";
                else if (csit.isSelected()) course = "CSIT";
                else if (bim.isSelected()) course = "BIM";
                else if (bhm.isSelected()) course = "BHM";

                int year = y1.isSelected() ? 1 : y2.isSelected() ? 2 : y3.isSelected() ? 3 : y4.isSelected() ? 4 : 0;
                int sem = 0;
                for (int i = 0; i < 8; i++) {
                    if (semButtons[i].isSelected()) {
                        sem = i + 1;
                        break;
                    }
                }

                // Save to DB
                new_studentDatabase(studentid, name, father, course, branch, year, sem);
                dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid Student ID");
            }
        });

        // Add to desktopPane
        desktopPane.add(this);
        Dimension dSize = desktopPane.getSize();
        setLocation((dSize.width - getWidth()) / 2, (dSize.height - getHeight()) / 2);
        setVisible(true);

    }

    public void new_studentDatabase(int studentid, String name, String father, String course, String branch, int year, int sem) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");

            String query = "INSERT INTO student_info(studentid, name, father, course, branch, year, sem) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, studentid);
            pst.setString(2, name);
            pst.setString(3, father);
            pst.setString(4, course);
            pst.setString(5, branch);
            pst.setInt(6, year);
            pst.setInt(7, sem);

            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Saved Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error Occurred");
            }

            pst.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Unexpected Error: " + ex.getMessage());
        }
    }
}
