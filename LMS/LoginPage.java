package LMS;
import javax.swing.*;

public class LoginPage {
    public LoginPage() {
        JFrame f = new JFrame("Login Page");

        JLabel l1 = new JLabel("Sign in to LMS");
        l1.setBounds(60, 20, 150, 20);

        JLabel l2 = new JLabel("Username or email");
        l2.setBounds(60, 50, 150, 20);

        JTextField t1 = new JTextField();
        t1.setBounds(60, 70, 200, 30);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(60, 110, 150, 20);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(60, 130, 200, 30);

        JButton b = new JButton("Sign in");
        b.setBounds(110, 180, 100, 30);

        JLabel l4 = new JLabel("Forgot Password?");
        l4.setBounds(110, 220, 150, 20);

        // Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(b);
        f.add(l4);

        // Frame settings
        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
