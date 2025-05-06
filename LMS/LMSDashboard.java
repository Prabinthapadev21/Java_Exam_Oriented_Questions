package LMS;

import javax.swing.*;
import java.awt.*;

public class LMSDashboard {
    JFrame frame;

    public LMSDashboard() {
        frame = new JFrame("Library Management System");
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // --- MENU BAR ---
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        menuBar.add(file);
        menuBar.add(edit);
        frame.setJMenuBar(menuBar);

        // --- LOGO & HEADER ---
        JLabel logo = new JLabel("LIBRARY", JLabel.LEFT); // You can set an icon here
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        logo.setBounds(20, 10, 200, 40);
        frame.add(logo);

        JLabel welcome = new JLabel("<html><font color='#0099cc'>#Welcome</font> to <br>Library Management System</html>", JLabel.RIGHT);
        welcome.setBounds(650, 10, 200, 50);
        frame.add(welcome);

        // --- OPERATION PANEL ---
        JPanel operationPanel = new JPanel(null);
        operationPanel.setBorder(BorderFactory.createTitledBorder("Operation"));
        operationPanel.setBounds(50, 80, 770, 200);

        JButton newBook = createIconButton("New Book", "book_icon.png");
        newBook.setBounds(50, 50, 150, 100);
        JButton stats = createIconButton("Statistics", "stats_icon.png");
        stats.setBounds(300, 50, 150, 100);
        JButton newStudent = createIconButton("New Student", "student_icon.png");
        newStudent.setBounds(550, 50, 150, 100);

        operationPanel.add(newBook);
        operationPanel.add(stats);
        operationPanel.add(newStudent);
        frame.add(operationPanel);

        // --- ACTION PANEL ---
        JPanel actionPanel = new JPanel(null);
        actionPanel.setBorder(BorderFactory.createTitledBorder("Action"));
        actionPanel.setBounds(50, 300, 770, 200);

        JButton issueBook = createIconButton("Issue Book", "issue_icon.png");
        issueBook.setBounds(50, 50, 150, 100);
        JButton returnBook = createIconButton("Return Book", "return_icon.png");
        returnBook.setBounds(300, 50, 150, 100);
        JButton about = createIconButton("About", "about_icon.png");
        about.setBounds(550, 50, 150, 100);

        actionPanel.add(issueBook);
        actionPanel.add(returnBook);
        actionPanel.add(about);
        frame.add(actionPanel);

        frame.setVisible(true);
    }

    private JButton createIconButton(String text, String iconPath) {
        JButton button = new JButton(text);
        // Use this line if you have actual icons:
        // button.setIcon(new ImageIcon(getClass().getResource(iconPath)));
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        return button;
    }

    public static void main(String[] args) {
        new LMSDashboard();
    }
}
