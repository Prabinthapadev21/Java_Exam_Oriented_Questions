package LMS;
import javax.swing.*;
public class LoginPage {
    public LoginPage()
    {
        JFrame f = new JFrame("Login Page");

        JLabel l1 = new JLabel("Sign in to LMS");
        l1.setBounds(60,60,150,20);

        JLabel l2 = new JLabel("Username or email");
        l2.setBounds(60,80,150,20);

        JTextField t1 = new JTextField();
        t1.setBounds(60,100,150,30);


        JLabel l3 = new JLabel("Username or email");
        l3.setBounds(60,120,150,20);

        JTextField t2 = new JTextField();
        t2.setBounds(60,140,150,30);


        JButton b = new JButton("Sign in");

        b.setBounds(150,160,100,30);

        JLabel l4 = new JLabel("Forget Password ?");

        l4.setBounds(170,180,100,30);


//        adding the components into the frame.

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(b);
        f.add(l4);


//        default operations
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
