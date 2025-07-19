package Final_Examination.set_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TwentyFourQuestion {
    public TwentyFourQuestion()
    {
        JFrame f = new JFrame("User Details");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(60,60,80,20);

        JTextField f1 = new JTextField();
        f1.setBounds(160,60,100,30);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(60,100,80,20);

        JTextField f2 = new JTextField();
        f2.setBounds(160,100,100,30);

        JLabel l3 = new JLabel("Password:");
        l3.setBounds(60,140,80,20);

        JPasswordField f3 = new JPasswordField();
        f3.setBounds(160,140,100,30);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(60,180,80,20);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(160,180,100,30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(230,180,100,30);
        JLabel l5 = new JLabel("DOB");
        l5.setBounds(60,220,80,20);
        String day[] = {"1","2","3","4","5"};
        String month[] = {"Jan","Feb","Mar","Apr","May"};
        String year[] = {"2006","2005","2004","2003"};
        JComboBox box = new JComboBox(day);
        JComboBox box1 = new JComboBox(month);
        JComboBox box2 = new JComboBox(year);
        box.setBounds(160,220,60,20);
        box1.setBounds(200,220,75,20);
        box2.setBounds(260,220,90,20);

        JCheckBox check = new JCheckBox("Terms and Condition");
        check.setBounds(60,260,200,20);

        JButton jb = new JButton("Submit");
        jb.setBounds(160,300,100,30);

//        Default operations
        f.setSize(400,500);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.add(l4);
        f.add(r1);
        f.add(r2);
        f.add(l5);
        f.add(box);
        f.add(box1);
        f.add(box2);
        f.add(check);
        f.add(jb);


        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = f1.getText();
                String email = f2.getText();
                String password = new String(f3.getPassword());
                String gender ="";
                String dob ="";

                if(r1.isSelected())
                {
                     gender = r1.getText();
                }
                else {
                     gender = r2.getText();
                }
                dob = box.getSelectedItem()+ " "+box1.getSelectedItem()+ " "+box2.getSelectedItem();

                if (check.isSelected()) {
                    try (FileWriter fw = new FileWriter("exam.txt")) {
                        fw.write("Name = " + name + "\n");
                        fw.write("Email = " + email + "\n");
                        fw.write("Password = " + password + "\n");
                        fw.write("Gender = "+gender+"\n");
                        fw.write("Dob = "+dob + "\n" );
                        JOptionPane.showMessageDialog(f, "Data saved successfully!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Please accept the Terms and Conditions.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TwentyFourQuestion();
    }
}
