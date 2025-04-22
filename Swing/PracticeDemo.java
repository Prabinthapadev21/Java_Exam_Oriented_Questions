package Swing;

import javax.lang.model.element.Name;
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

        JLabel l1 = new JLabel("Username:");
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 60, 80, 20);
        JTextField jf = new JTextField();
        jf.setBounds(160, 60, 100, 20);

        JLabel l2 = new JLabel("Password:");
        jf.setForeground(Color.RED);
        l2.setBounds(60, 100, 80, 20);
        JPasswordField jp = new JPasswordField();
        jp.setBounds(160, 100, 100, 20);

        JLabel l3 = new JLabel("Course Selection");
        l3.setBounds(60,125,150,20);
        JCheckBox c1 = new JCheckBox("Java");
        c1.setBounds(160,160,100,20);
        JCheckBox c2 = new JCheckBox("Python");
        c2.setBounds(160,180,100,20);
        JCheckBox c3 = new JCheckBox("PHP");
        c3.setBounds(160,200,100,20);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(60,220,100,20);
        JRadioButton jb1 = new JRadioButton("Male");
        jb1.setBounds(60,240,100,20);
        JRadioButton jb2 = new JRadioButton("Female");
        jb2.setBounds(60,260,100,20);
        JRadioButton jb3 = new JRadioButton("Others");
        jb3.setBounds(60,280,100,20);

        JLabel l5 = new JLabel("Country");
        l5.setBounds(60,300,100,20);

        String country[] = {"Nepal","India","China","Usa"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(160,300,100,20);

        JButton b = new JButton("Login");
        b.setBounds(160, 340, 100, 30);

        JLabel l6 = new JLabel("Employee Details");
        l6.setBounds(80,380,120,20);
        String col[] ={"ID","Name","Address"};
        String data[][]={{"1","Ram","GDkT"},{"2","Prabin","Gaindakot"},{"3","Sasin","Chitwan"}};
        JTable jt = new JTable(data,col);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(160,410,160,80);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jf.getText();
                String password = new String(jp.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successfully");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Username or Password");
                }
            }
        });
        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        f.add(l1);
        f.add(jf);
        f.add(l2);
        f.add(jp);
        f.add(b);
        f.add(l3);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(jb1);
        f.add(jb2);
        f.add(jb3);
        f.add(cb);
        f.add(sp);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        PracticeDemo d = new PracticeDemo();
        d.Loginform();
    }
}
