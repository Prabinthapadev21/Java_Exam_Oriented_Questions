package Final_Examination.set_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
public class TwentyTwoQuestion {
    public TwentyTwoQuestion()
    {
        JFrame f = new JFrame("Factorial and Cube");

        JLabel l1 = new JLabel("Number");
        l1.setBounds(60,60,100,20);

        JTextField f1 = new JTextField();
        f1.setBounds(160,60,100,30);

        JButton b1 = new JButton("Calculation");
        b1.setBounds(160,100,80,30);

        JLabel resultLabel = new JLabel("Result will be shown here");
        resultLabel.setBounds(50, 150, 250, 30);


        f.add(l1);
        f.add(f1);
        f.add(b1);
        f.add(resultLabel);

//        default operations
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int num = Integer.parseInt(f1.getText());
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    resultLabel.setText("Factorial: " + fact);
                } catch (Exception ex) {
                    resultLabel.setText("Enter a valid number");
                }

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int num = Integer.parseInt(f1.getText());
                    int cube = num * num * num;
                    resultLabel.setText("Cube: " + cube);
                } catch (Exception ex) {
                    resultLabel.setText("Enter a valid number");
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new TwentyTwoQuestion();
    }
}
