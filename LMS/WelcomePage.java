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
        panel.setBackground(new Color(44, 62, 80)); // dark background
        panel.setBounds(0, 0, 700, 450);
        panel.setLayout(null);
        frame.add(panel);

        // Logo
        JLabel logo = new JLabel("📚", JLabel.CENTER);
        logo.setFont(new Font("SansSerif", Font.PLAIN, 80));
        logo.setBounds(280, 30, 120, 100);
        logo.setForeground(Color.WHITE);
        panel.add(logo);

        // Title
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

        // Login Button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(200, 260, 120, 40);
        loginBtn.setBackground(new Color(52, 152, 219)); // blue
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        loginBtn.setFocusPainted(false);
        panel.add(loginBtn);

        // Signup Button
        JButton signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(380, 260, 120, 40);
        signupBtn.setBackground(new Color(241, 196, 15)); // yellow
        signupBtn.setForeground(Color.BLACK);
        signupBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        signupBtn.setFocusPainted(false);
        panel.add(signupBtn);

        // Action Listeners for login page
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // To redirect to login page
                new LoginPage(); // to go to the login page
            }
        });
//        Action Listeners for signup page
        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // TO redirect to signup page
                new SignupPage(); // to go to signup page
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
