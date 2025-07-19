package Final_Examination.set_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TwentyEighteenQuestion {
    public TwentyEighteenQuestion()
    {
        JFrame f = new JFrame("Odd and Even");

        JLabel l1 = new JLabel("Number");
        l1.setBounds(60, 60, 100, 20);

        JTextField f1 = new JTextField();
        f1.setBounds(160, 60, 100, 30);

        JButton jb1 = new JButton("Check");
        jb1.setBounds(160, 100, 80, 30);

        JTextField resulttext = new JTextField();
        resulttext.setBounds(50, 150, 250, 30);

        f.add(l1);
        f.add(f1);
        f.add(jb1);
        f.add(resulttext);

        // Default operations
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(f1.getText());
                    int square = num1*num1;
                    resulttext.setText("The square is "+square);
                } catch (Exception ex) {
                    resulttext.setText("Please enter a valid number");
                }
            }
        });

    }

    public static void main(String[] args) {
        new TwentyEighteenQuestion();
    }
}
