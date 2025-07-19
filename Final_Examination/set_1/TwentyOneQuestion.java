package Final_Examination.set_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TwentyOneQuestion {
    public TwentyOneQuestion()
    {
        JFrame f = new JFrame("Add and subtract");

        JLabel l1 = new JLabel("NumberOne:");
        l1.setBounds(60,60,100,20);

        JTextField f1 = new JTextField();
        f1.setBounds(160,60,100,30);

        JLabel l2 = new JLabel("NUmberTwo:");
        l2.setBounds(60,100,100,20);

        JTextField f2 = new JTextField();
        f2.setBounds(160,100,100,30);

        JButton b1 = new JButton("Add");
        b1.setBounds(60,140,80,30);

        JButton b2 = new JButton("Sub");
        b2.setBounds(160,140,80,30);

        JTextField f3 = new JTextField();
        f3.setBounds(60,180,200,30);


        f.add(l1);
        f.add(l2);
        f.add(f1);
        f.add(f2);
        f.add(b1);
        f.add(b2);
        f.add(f3);
//        default operations
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(f1.getText());
                    int num2 = Integer.parseInt(f2.getText());

                    int sum = num1 + num2;

                    f3.setText("The sum is " + sum);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter valid number");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(f1.getText());
                    int num2 = Integer.parseInt(f2.getText());

                    int diff = num1 - num2;

                    f3.setText("The diff is " + diff);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(f,"Please enter valid number");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TwentyOneQuestion();
    }
}
