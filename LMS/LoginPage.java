package LMS;

import javax.swing.*;

public class LoginPage{

    public LoginPage()
    {
        JFrame f = new JFrame("Login Page");


        JLabel l1 = new JLabel("Sign up to LMS");
        l1.setBounds(60,60,120,30);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(60,80,100,20);

        JTextField t1 = new JTextField();
        t1.setBounds(60,100,100,30);


        JLabel l3 = new JLabel("Email");
        l2.setBounds(60,120,100,20);

        JTextField t2 = new JTextField();
        t1.setBounds(60,140,100,30);


//            adding the components to the frame
        f.add(l1);


//            default operations starts
        f.setSize(500,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            default operations closes
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

