package Final_Examination.set_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Write a Java GUI program using Swing to input two numbers and calculate their product and quotient using buttons.
// Display results in a dialog box.
public class Problem_1 {
    public Problem_1()
    {
        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("Number-1:");
        l1.setBounds(60,60,100,20);

        JTextField t1 = new JTextField();
        t1.setBounds(180,60,80,30);

        JLabel l2 = new JLabel("Number-2");
        l2.setBounds(60,100,100,20);

        JTextField t2 = new JTextField();
        t2.setBounds(180,100,80,30);

        JButton b1 = new JButton("Product");
        b1.setBounds(60,130,80,30);

        JButton b2 = new JButton("Quotient");
        b2.setBounds(150,130,80,30);

        JTextField t3 = new JTextField();
        t3.setBounds(60,180,250,30);

//      Adding the components to the frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(t3);

//        default operations
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        logic for product of the number
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int product = num1*num2;

                t3.setText("The product of the two number is "+product);
            }
        });

        //        logic for quotient of the number
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int quotient = num1/num2;

                t3.setText("The quotient of the two number is "+quotient);
            }
        });
    }

    public static void main(String[] args) {
        new Problem_1();
    }
}
