package Swing;
import javax.swing.*;

public class Dashboard {
    public JFrame frame;
    public JButton newBook;
    public JButton report;
    public JButton newStudent;
    public JButton issueBook;
    public JButton returnBook;
    public JButton about;

    public Dashboard() {
        frame = new JFrame("Library Management System");
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu Bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Save");

        m1.add(mi1);
        m2.add(mi2);
        mb.add(m1);
        mb.add(m2);
        frame.setJMenuBar(mb);

        // Buttons with proper spacing
        newBook = new JButton("New Book");
        newBook.setBounds(50, 50, 150, 40);
        frame.add(newBook);

        report = new JButton("Generate Report");
        report.setBounds(220, 50, 150, 40);
        frame.add(report);

        newStudent = new JButton("New Student");
        newStudent.setBounds(390, 50, 150, 40);
        frame.add(newStudent);

        issueBook = new JButton("Issue Book");
        issueBook.setBounds(50, 120, 150, 40);
        frame.add(issueBook);

        returnBook = new JButton("Return Book");
        returnBook.setBounds(220, 120, 150, 40);
        frame.add(returnBook);

        about = new JButton("About");
        about.setBounds(390, 120, 150, 40);
        frame.add(about);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
