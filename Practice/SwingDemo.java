package Practice;
import OOPsConcept.InterfaceDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    public SwingDemo()
    {
        JFrame f = new JFrame("Square Calculation");

        JLabel l = new JLabel("Enter a number");
        l.setBounds(60,60,100,30);
        JTextField t = new JTextField();
        t.setBounds(160,60,80,30);

        JButton b = new JButton("Calculate");
        b.setBounds(160,140,100,30);

        JTextField t1 = new JTextField();
        t1.setBounds(160,160,100,30);

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(t1);

//        default operations
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t.getText());
                int square = num*num;
                t1.setText("The square of number is "+square);
            }
        });
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
