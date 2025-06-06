package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PracticeDemo {
    public void Loginform() {
        JFrame f = new JFrame("Login Form");
        f.setBackground(Color.RED);
        f.getContentPane().setBackground(new Color(240, 248, 255));

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");

        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Save");
        m1.add(i1);
        m1.add(i2);
        m2.add(new JMenuItem("Cut"));
        m2.add(new JMenuItem("Paste"));
        mb.add(m1);
        mb.add(m2);
        f.setJMenuBar(mb);

        JLabel l1 = new JLabel("Username:");
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 60, 80, 20);
        JTextField jf = new JTextField();
        jf.setBounds(160, 60, 150, 20);

        JLabel l2 = new JLabel("Password:");
        l2.setForeground(Color.RED);
        l2.setBounds(60, 100, 80, 20);
        JPasswordField jp = new JPasswordField();
        jp.setBounds(160, 100, 150, 20);

        JLabel lEmail = new JLabel("Email:");
        lEmail.setBounds(60, 140, 80, 20);
        JTextField tfEmail = new JTextField();
        tfEmail.setBounds(160, 140, 150, 20);

        JLabel lPhone = new JLabel("Phone:");
        lPhone.setBounds(60, 180, 80, 20);
        JTextField tfPhone = new JTextField();
        tfPhone.setBounds(160, 180, 150, 20);

        JLabel lDob = new JLabel("DOB:");
        lDob.setBounds(60, 220, 80, 20);
        JTextField tfDob = new JTextField("YYYY-MM-DD");
        tfDob.setBounds(160, 220, 150, 20);

        JLabel l3 = new JLabel("Course Selection");
        l3.setBounds(60, 260, 150, 20);
        JCheckBox c1 = new JCheckBox("Java");
        c1.setBounds(160, 280, 100, 20);
        JCheckBox c2 = new JCheckBox("Python");
        c2.setBounds(160, 300, 100, 20);
        JCheckBox c3 = new JCheckBox("PHP");
        c3.setBounds(160, 320, 100, 20);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(60, 350, 100, 20);
        JRadioButton jb1 = new JRadioButton("Male");
        jb1.setBounds(160, 350, 100, 20);
        JRadioButton jb2 = new JRadioButton("Female");
        jb2.setBounds(160, 370, 100, 20);
        JRadioButton jb3 = new JRadioButton("Others");
        jb3.setBounds(160, 390, 100, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);

        JLabel l5 = new JLabel("Country");
        l5.setBounds(60, 420, 100, 20);
        String country[] = {"Nepal", "India", "China", "USA"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(160, 420, 150, 20);

        JCheckBox cbTerms = new JCheckBox("I agree to the Terms and Conditions");
        cbTerms.setBounds(60, 460, 300, 20);

        JButton b = new JButton("Login");
        b.setBounds(160, 500, 100, 30);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jf.getText();
                String password = new String(jp.getPassword());

                if (!cbTerms.isSelected()) {
                    JOptionPane.showMessageDialog(f, "Please agree to the Terms and Conditions.");
                    return;
                }

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successfully");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Username or Password");
                }
            }
        });

        f.add(l1); f.add(jf);
        f.add(l2); f.add(jp);
        f.add(lEmail); f.add(tfEmail);
        f.add(lPhone); f.add(tfPhone);
        f.add(lDob); f.add(tfDob);
        f.add(l3); f.add(c1); f.add(c2); f.add(c3);
        f.add(l4); f.add(jb1); f.add(jb2); f.add(jb3);
        f.add(l5); f.add(cb);
        f.add(cbTerms);
        f.add(b);

        f.setSize(600, 750);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        PracticeDemo d = new PracticeDemo();
        d.Loginform();
    }
}
