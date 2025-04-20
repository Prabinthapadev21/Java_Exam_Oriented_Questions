package Swing;
import javax.swing.*;
public class Demo {
    public Demo()
    {
        JFrame f = new JFrame("Example");
        JLabel l = new JLabel("Username");
        l.setBounds(60,60,80,20);
        JTextField t = new JFormattedTextField(20);
        t.setBounds(160,60,100,20);
        JButton b = new JButton("Ok");
        b.setBounds(160,100,80,20);
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(350,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
