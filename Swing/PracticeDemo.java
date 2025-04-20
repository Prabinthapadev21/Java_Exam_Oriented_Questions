package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PracticeDemo {
    public void Loginform() {
        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(60, 60, 80, 20);
        JTextField jf = new JTextField();
        jf.setBounds(160, 60, 100, 20);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(60, 100, 80, 20);
        JPasswordField jp = new JPasswordField();
        jp.setBounds(160, 100, 100, 20);

        JButton b = new JButton("Login");
        b.setBounds(160, 140, 100, 30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jf.getText();
                String password = new String(jp.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successfully");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Username or Password");
                }
            }
        });

        f.add(l1);
        f.add(jf);
        f.add(l2);
        f.add(jp);
        f.add(b);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        PracticeDemo d = new PracticeDemo();
        d.Loginform();
    }
}
