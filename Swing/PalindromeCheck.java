package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class PalindromeCheck {
    public PalindromeCheck()
    {
        JFrame f = new JFrame("Palindrome Checker");
        JLabel l1 = new JLabel("Enter 1st Number");
        l1.setBounds(60,60,100,20);
        JTextField jf1 = new JTextField();
        jf1.setBounds(160,60,80,20);

        JLabel l2 = new JLabel("Enter 1st Number");
        l1.setBounds(60,60,100,20);
        JTextField jf2 = new JTextField();
        jf2.setBounds(160,60,80,20);

        JButton jb = new JButton("Check");
        jb.setBounds(100,80,60,30);

        // for logic

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  number =  jf1.getText();
                try {
                    int num = Integer.parseInt(number);

                    int rem, rev = 0, pali = num;
                    while (num != 0) {
                        rem = num % 10;
                        rev = rem + (rev * 10);
                        num = num / 10;
                    }
                    if (pali == rev) {
                        JOptionPane.showMessageDialog(f, "It is a Palindrome");
                    } else {
                        JOptionPane.showMessageDialog(f, "It is not a Palindrome");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f,"Please enter a numeric value");
                }
            }
        });

        f.add(l1);
        f.add(jf1);
        f.add(jb);
        f.setSize(600,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PalindromeCheck();
    }
}
