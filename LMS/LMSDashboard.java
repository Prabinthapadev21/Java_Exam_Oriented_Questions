package LMS;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LMSDashboard {
    public JFrame frame;

    public LMSDashboard() {
        frame = new JFrame("LMS Dashboard");

        // Title Label
        JLabel title = new JLabel("Library Management System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(150, 20, 500, 40);
        frame.add(title);

        // Buttons with icons from LMS package
        JButton booksButton = createIconButton("Books", "book_icon.png");
        booksButton.setBounds(100, 100, 120, 120);

        JButton membersButton = createIconButton("Members", "member_icon.png");
        membersButton.setBounds(250, 100, 120, 120);

        JButton issueButton = createIconButton("Issue", "issue_icon.png");
        issueButton.setBounds(400, 100, 120, 120);

        JButton returnButton = createIconButton("Return", "return_icon.png");
        returnButton.setBounds(550, 100, 120, 120);

        JButton reportButton = createIconButton("Reports", "report_icon.png");
        reportButton.setBounds(325, 250, 120, 120);

        // Add buttons to frame
        frame.add(booksButton);
        frame.add(membersButton);
        frame.add(issueButton);
        frame.add(returnButton);
        frame.add(reportButton);

        // Frame settings
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JButton createIconButton(String text, String imageName) {
        JButton button = new JButton(text);
        URL imageURL = getClass().getResource(imageName); // Image inside LMS package

        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            button.setIcon(icon);
        } else {
            System.out.println("Image not found: " + imageName);
        }

        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        return button;
    }

    public static void main(String[] args) {
        new LMSDashboard();
    }
}
