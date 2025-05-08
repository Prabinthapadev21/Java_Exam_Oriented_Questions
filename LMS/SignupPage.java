package LMS;

import javax.swing.*;
import java.awt.*;

public class SignupPage {
    public JTextField usernameField;
    public JTextField emailField;
    public JPasswordField passwordField;
    public JPasswordField confirmPasswordField;
    public JButton continueButton;
    public JFrame frame;

    public SignupPage() {
        // Set global font
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));

        frame = new JFrame("Signup Page");
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(44,62 , 80)); // Very light purple

        JLabel title = new JLabel("Sign up to LMS");
        title.setBounds(110, 20, 200, 30);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setForeground(Color.WHITE);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(60, 60, 150, 20);
        usernameField = new JTextField();
        usernameField.setBounds(60, 80, 250, 30);
        userLabel.setForeground(Color.WHITE);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(60, 120, 150, 20);
        emailField = new JTextField();
        emailField.setBounds(60, 140, 250, 30);
        emailLabel.setForeground(Color.WHITE);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(60, 180, 150, 20);
        passwordField = new JPasswordField();
        passwordField.setBounds(60, 200, 250, 30);
        passLabel.setForeground(Color.WHITE);

        JLabel confirmLabel = new JLabel("Confirm Password");
        confirmLabel.setBounds(60, 240, 150, 20);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(60, 260, 250, 30);
        confirmLabel.setForeground(Color.WHITE);

        continueButton = new JButton("Continue >");
        continueButton.setBounds(120, 320, 140, 35);
        continueButton.setBackground(new Color(76, 175, 80));
        continueButton.setForeground(Color.BLACK);
        continueButton.setFocusPainted(false);

        frame.add(title);
        frame.add(userLabel);
        frame.add(usernameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passLabel);
        frame.add(passwordField);
        frame.add(confirmLabel);
        frame.add(confirmPasswordField);
        frame.add(continueButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new HandelingEvent(this); // connect event handling
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
