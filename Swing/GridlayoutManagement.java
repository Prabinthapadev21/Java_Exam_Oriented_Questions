package Swing;

import javax.swing.*;
import java.awt.*;

 class GridLayoutManagement {

    public GridLayoutManagement()
    {
        JFrame f = new JFrame();
        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");
        JButton b5 = new JButton("five");
        JButton b6 = new JButton("six");
        JButton b7 = new JButton("seven");
        JButton b8 = new JButton("eight");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        GridLayout gl = new GridLayout(3,3);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(gl);
    }

    public static void main(String[] args) {
        new GridLayoutManagement();
    }
}
