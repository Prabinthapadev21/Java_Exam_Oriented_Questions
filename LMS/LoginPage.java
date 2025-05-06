package LMS;

import javax.swing.*;

public class LoginPage{

    public LoginPage()
    {
        JFrame f = new JFrame("Login Page");


        JLabel l1 = new JLabel("Sign up to LMS");
        l1.setBounds(60,60,120,30);

        
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

