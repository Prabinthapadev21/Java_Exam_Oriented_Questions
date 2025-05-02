package Swing;
import OOPsConcept.InterfaceDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculation {
    public Calculation()
    {
        JFrame f = new JFrame("Calculation");

        JLabel l1 = new JLabel("Enter a number");
        l1.setBounds(50,60,100,20);

        JTextField t1 = new JTextField();
        t1.setBounds(160,60,80,30);

        JButton b1 = new JButton("Reverse");
        b1.setBounds(160,100,50,30);

        JButton b2 = new JButton("Palindrome");
        b1.setBounds(160,130,50,30);

        JButton b3 = new JButton("Prime");
        b1.setBounds(160,160,50,30);

        JButton b4 = new JButton("Armstrong");
        b1.setBounds(160,190,50,30);

        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());

//                for reverse
                int rem,rev =0;
                while(num!=0)
                {
                    rem = num%10;
                    rev = rem +(rev*10);
                    num=num/10;
                }
                JOptionPane.showMessageDialog(f,"The reverse of number is "+rev);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());

//                for reverse
                int rem,rev =0;
                int pali = num;
                while(num!=0)
                {
                    rem = num%10;
                    rev = rem +(rev*10);
                    num=num/10;
                }
                if(pali==num)
                JOptionPane.showMessageDialog(f,"The number is Palindrome");
                else
                    JOptionPane.showMessageDialog(f,"The number is not palindroem");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());

//                for reverse
                int rem,rev =0;
                while(num!=0)
                {
                    rem = num%10;
                    rev = rem +(rev*10);
                    num=num/10;
                }
                JOptionPane.showMessageDialog(f,"The reverse of number is "+rev);
            }
        });


//        Default operations
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculation();
    }
}
