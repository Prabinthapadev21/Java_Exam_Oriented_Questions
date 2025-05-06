package LMS;

import javax.swing.*;

public class SignupPage {

    public SignupPage() {
        JFrame f = new JFrame("Login Page");

        JLabel l1 = new JLabel("Sign up to LMS");
        l1.setBounds(60, 20, 200, 30);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(60, 60, 100, 20);

        JTextField t1 = new JTextField();
        t1.setBounds(60, 80, 200, 30);

        JLabel l3 = new JLabel("Email");
        l3.setBounds(60, 120, 100, 20);

        JTextField t2 = new JTextField();
        t2.setBounds(60, 140, 200, 30);

        JLabel l4 = new JLabel("Password");
        l4.setBounds(60, 180, 100, 20);

        JPasswordField t3 = new JPasswordField();
        t3.setBounds(60, 200, 200, 30);

        JLabel l5 = new JLabel("Confirm Password");
        l5.setBounds(60, 240, 150, 20);

        JPasswordField t4 = new JPasswordField();
        t4.setBounds(60, 260, 200, 30);

        JButton b = new JButton("Continue >");
        b.setBounds(100, 310, 120, 30);

        // Add components to frame
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
