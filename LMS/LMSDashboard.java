package LMS;

import javax.swing.*;
import java.awt.*;

public class LMSDashboard {
    public JFrame frame;

    public LMSDashboard() {
        frame = new JFrame("LMS Dashboard");
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("#Welcome to Library Management System");
        welcomeLabel.setBounds(600, 10, 300, 30);
        welcomeLabel.setForeground(new Color(0, 128, 128));
        frame.add(welcomeLabel);

        // Logo
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("Images/logo.jpeg"));
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(20, 10, 150, 100);
        frame.add(logoLabel);

        // Operation Panel
        JPanel operationPanel = new JPanel();
        operationPanel.setBorder(BorderFactory.createTitledBorder("Operation"));
        operationPanel.setBounds(20, 120, 850, 200);
        operationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));

        JButton newBookButton = createIconButton("Images/newbook.webp", "New Book");
        JButton statsButton = createIconButton("Images/stats.png", "Statistics");
        JButton newStudentButton = createIconButton("Images/student.jpeg", "New Student");

        operationPanel.add(newBookButton);
        operationPanel.add(statsButton);
        operationPanel.add(newStudentButton);

        // Action Panel
        JPanel actionPanel = new JPanel();
        actionPanel.setBorder(BorderFactory.createTitledBorder("Action"));
        actionPanel.setBounds(20, 340, 850, 200);
        actionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));

        JButton issueBookButton = createIconButton("Images/book.png", "Issue Book");
        JButton returnBookButton = createIconButton("Images/return.jpeg", "Return Book");
        JButton aboutButton = createIconButton("Images/about.png", "About");

        actionPanel.add(issueBookButton);
        actionPanel.add(returnBookButton);
        actionPanel.add(aboutButton);

        // Adding Panels to Frame
        frame.add(operationPanel);
        frame.add(actionPanel);

        frame.setVisible(true);
    }

    private JButton createIconButton(String imagePath, String text) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        JButton button = new JButton(text, icon);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setPreferredSize(new Dimension(150, 150));
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LMSDashboard::new);
    }
}
