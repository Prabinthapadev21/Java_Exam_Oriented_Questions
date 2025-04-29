package Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandelingDemo {
    public EventHandelingDemo()
    {
        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("Enter number1:");
        l1.setBounds(80,60,100,20);
        JTextField t1 = new JTextField();
        t1.setBounds(180,60,100,20);

         JLabel l2 = new JLabel("Enter number2:");
        l2.setBounds(80,100,100,20);
        JTextField t2 = new JTextField();
        t2.setBounds(180,100,100,20);

        JButton b1 = new JButton("Add");
        b1.setBounds(180,130,80,30);

        JButton b2 = new JButton("Sub");
        b2.setBounds(180,160,80,30);

        JButton b3 = new JButton("Mul");
        b3.setBounds(180,190,80,30);

        JButton b4 = new JButton("Div");
        b4.setBounds(180,220,80,30);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int sum = num1 + num2;
                    JOptionPane.showMessageDialog(f, "The sum is " + sum);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter numeric value");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int sub = num1 - num2;
                    JOptionPane.showMessageDialog(f, "The subtraction is " + sub);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter numeric value");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int mul = num1 * num2;
                    JOptionPane.showMessageDialog(f, "The multiplication is " + mul);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter numeric value");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int div = num1 / num2;
                    JOptionPane.showMessageDialog(f, "The sum is " + div);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter numeric value");
                }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
//        Default operations
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EventHandelingDemo();
    }
}
