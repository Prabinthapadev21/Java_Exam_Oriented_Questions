package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DemoExample implements KeyListener {
    JFrame f;
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b;

    public DemoExample() {
        f = new JFrame();

        l1 = new JLabel("First No");
        l2 = new JLabel("Second No");
        l3 = new JLabel("Result");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        b = new JButton("OK");

        // Adding components
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(b);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Important!

        // Add key listener to the button
        b.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            if (ke.getKeyChar() == 'a') {
                int c = a + b;
                t3.setText(String.valueOf(c));
            } else if (ke.getKeyChar() == 's') {
                int c = a - b;
                t3.setText(String.valueOf(c));
            } else {
                t3.setText("Wrong key Pressed");
            }
        } catch (NumberFormatException ex) {
            t3.setText("Invalid number input");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }

    public static void main(String[] args) {
        new DemoExample();
    }
}
