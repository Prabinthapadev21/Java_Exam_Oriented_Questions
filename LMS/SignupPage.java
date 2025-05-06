package LMS;

import javax.swing.*;

public class SignupPage {

    public JFrame frame;
    public JTextField usernameField;
    public JTextField emailField;
    public JPasswordField passwordField;
    public JPasswordField confirmPasswordField;
    public JButton continueButton;

    public SignupPage() {
        frame = new JFrame("Signup Page");

        JLabel l1 = new JLabel("Sign up to LMS");
        l1.setBounds(60, 20, 200, 30);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(60, 60, 100, 20);

        usernameField = new JTextField();
        usernameField.setBounds(60, 80, 200, 30);

        JLabel l3 = new JLabel("Email");
        l3.setBounds(60, 120, 100, 20);

        emailField = new JTextField();
        emailField.setBounds(60, 140, 200, 30);

        JLabel l4 = new JLabel("Password");
        l4.setBounds(60, 180, 100, 20);

        passwordField = new JPasswordField();
        passwordField.setBounds(60, 200, 200, 30);

        JLabel l5 = new JLabel("Confirm Password");
        l5.setBounds(60, 240, 150, 20);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(60, 260, 200, 30);

        continueButton = new JButton("Continue >");
        continueButton.setBounds(100, 310, 120, 30);

        // Add components to frame
        frame.add(l1);
        frame.add(l2);
        frame.add(usernameField);
        frame.add(l3);
        frame.add(emailField);
        frame.add(l4);
        frame.add(passwordField);
        frame.add(l5);
        frame.add(confirmPasswordField);
        frame.add(continueButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pass reference to event handler
        new HandelingEvent(this);
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
