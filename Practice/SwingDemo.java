package Practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    public SwingDemo() {
        JFrame f = new JFrame("Square Calculation");

        JLabel l1 = new JLabel("Enter a number:");
        l1.setBounds(50, 50, 120, 30);

        JTextField t = new JTextField();
        t.setBounds(180, 50, 100, 30);

        JButton b = new JButton("Calculate");
        b.setBounds(140, 100, 100, 30);

        JLabel l2 = new JLabel("Square of the number:");
        l2.setBounds(30, 150, 140, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 150, 100, 30);
        t1.setEditable(false); // optional: prevents editing result

        f.add(l1);
        f.add(t);
        f.add(b);
        f.add(l2);
        f.add(t1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(t.getText());
                    int square = num * num;
                    t1.setText(String.valueOf(square));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
