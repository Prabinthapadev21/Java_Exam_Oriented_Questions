package LMS;

import javax.swing.*;

public class LoginPage {
    public JFrame frame;
    public JTextField usernameField;
    public JPasswordField passwordField;
    public JButton signInButton;
    public LoginPage() {
        frame = new JFrame("Login Page");

        JLabel l1 = new JLabel("Sign in to LMS");
        l1.setBounds(60, 20, 150, 20);

        JLabel l2 = new JLabel("Username or email");
        l2.setBounds(60, 50, 150, 20);

        usernameField = new JTextField();
        usernameField.setBounds(60, 70, 200, 30);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(60, 110, 150, 20);

        passwordField = new JPasswordField();
        passwordField.setBounds(60, 130, 200, 30);

        signInButton = new JButton("Sign in");
        signInButton.setBounds(110, 180, 100, 30);

        JLabel l4 = new JLabel("Forgot Password?");
        l4.setBounds(110, 220, 150, 20);

        frame.add(l1);
        frame.add(l2);
        frame.add(usernameField);
        frame.add(l3);
        frame.add(passwordField);
        frame.add(signInButton);
        frame.add(l4);

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new HandelingLoginEvent(this);
    }

    public static void main(String[] args) {
         new LoginPage();
    }
}
