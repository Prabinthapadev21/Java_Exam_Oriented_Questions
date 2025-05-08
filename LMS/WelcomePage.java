package LMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage {
    public JFrame frame;

    public WelcomePage() {
        frame = new JFrame("Welcome to Library Management System");
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // center on screen

        // Background Panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(44, 62, 80)); // dark blue-gray
        panel.setBounds(0, 0, 700, 450);
        panel.setLayout(null);
        frame.add(panel);

        // Logo placeholder (can be replaced with an actual logo)
        JLabel logo = new JLabel("📚", JLabel.CENTER);
        logo.setFont(new Font("SansSerif", Font.PLAIN, 80));
        logo.setBounds(280, 30, 120, 100);
        logo.setForeground(Color.WHITE);
        panel.add(logo);

        // Title Label
        JLabel title = new JLabel("Library Management System", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBounds(100, 140, 500, 40);
        panel.add(title);

        // Subtitle
        JLabel subtitle = new JLabel("Manage books, students, and issues with ease", JLabel.CENTER);
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 16));
        subtitle.setForeground(Color.LIGHT_GRAY);
        subtitle.setBounds(100, 180, 500, 30);
        panel.add(subtitle);

        // Enter Button
        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(280, 250, 120, 40);
        enterButton.setBackground(new Color(46, 204, 113)); // green
        enterButton.setForeground(Color.WHITE);
        enterButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        enterButton.setFocusPainted(false);
        panel.add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close welcome page
                new LMSDashboard(); // Open dashboard
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
