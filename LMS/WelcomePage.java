package LMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage {
    public JFrame frame;

    public WelcomePage() {
        frame = new JFrame("Welcome to LMS");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // center on screen

        JLabel welcomeLabel = new JLabel("Library Management System", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setBounds(50, 50, 400, 30);
        frame.add(welcomeLabel);

        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(200, 150, 100, 40);
        frame.add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close welcome window
                new LMSDashboard(); // Open dashboard
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
