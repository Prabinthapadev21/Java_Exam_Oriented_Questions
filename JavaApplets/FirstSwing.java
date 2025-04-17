package JavaApplets;

import javax.swing.*;
import java.awt.*;

public class FirstSwing extends JFrame {

    public FirstSwing() {
        setTitle("Swing Version");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a custom panel to draw text
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Welcome", 150, 150);
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstSwing();
    }
}

