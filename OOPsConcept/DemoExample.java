package OOPsConcept;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
class SwingDemo
{
    public SwingDemo()
    {
        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username");
        l1.setBounds(60,60,80,20);
        JTextField t1 = new JTextField();
        t1.setBounds(160,60,100,30);


        JLabel l2 = new JLabel("Password");
        l2.setBounds(60,80,80,20);
        JPasswordField p = new JPasswordField();
        p.setBounds(160,80,100,30);

        JButton b = new JButton("Submit");
        b.setBounds(160,100,80,30);


//        adding the components to the frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p);
        f.add(b);
//        Default close operations
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    String correctUsername = "Prabin";
                    String correctPass = "prabin123";

                    String username = t1.getText();
                    String password =new String( p.getPassword());


                    if (correctUsername.equals(username) && correctPass.equals(password)) {
                        try (FileWriter fw = new FileWriter("exam.txt")) {
                            fw.write("USername = " + username);
                            fw.write("Password = " + password);
                            JOptionPane.showMessageDialog(f,"LoginSuccessfully");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    else
                        {
                            JOptionPane.showMessageDialog(f, "Please accept the terms and condition first");
                        }
            }
        });
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}