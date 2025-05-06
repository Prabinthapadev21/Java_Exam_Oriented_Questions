package LMS;

import javax.swing.*;
import java.awt.*;

public class LoginPage {
    public JTextField usernameField;
    public JPasswordField passwordField;
    public JButton signInButton;
    public JFrame frame;

    public LoginPage() {
        // Global font setup
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));

        frame = new JFrame("Login Page");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // Light blue

        JLabel title = new JLabel("Sign in to LMS");
        title.setBounds(120, 20, 200, 30);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));

        JLabel userLabel = new JLabel("Username or Email");
        userLabel.setBounds(60, 70, 150, 20);

        usernameField = new JTextField();
        usernameField.setBounds(60, 90, 250, 30);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(60, 130, 150, 20);

        passwordField = new JPasswordField();
        passwordField.setBounds(60, 150, 250, 30);

        signInButton = new JButton("Sign In");
        signInButton.setBounds(120, 200, 140, 35);
        signInButton.setBackground(new Color(33, 150, 243));
        signInButton.setForeground(Color.BLACK);
        signInButton.setFocusPainted(false);

        JLabel forgotLabel = new JLabel("Forgot Password?");
        forgotLabel.setBounds(130, 250, 150, 20);
        forgotLabel.setForeground(Color.BLUE);

        frame.add(title);
        frame.add(userLabel);
        frame.add(usernameField);
        frame.add(passLabel);
        frame.add(passwordField);
        frame.add(signInButton);
        frame.add(forgotLabel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new HandelingLoginEvent(this); // connect event handling
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
