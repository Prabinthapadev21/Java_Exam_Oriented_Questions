package LMS;
import javax.swing.*;
import java.sql.*;
public class LMSDashboard {
    public JFrame frame;
    public JTextField textField;
    public JButton button;


    public LMSDashboard()
    {
        frame = new JFrame("LMS DashBoard");

        button  = new JButton("Welcome to our DashBoard");

//        adding components to the frame
        frame.add(button);
//        default operations
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new LMSDashboard();
    }
}
