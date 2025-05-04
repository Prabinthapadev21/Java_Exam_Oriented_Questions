package JDBC_Connection;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class JavaDatabase
{
    JFrame f;
    JTextField t;
    JPasswordField p;
    JButton b;
    public JavaDatabase()
    {
        f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username");
        l1.setBounds(50,50,100,30);

        t = new JTextField();
        t.setBounds(160,50,100,30);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,100,100,30);

        p = new JPasswordField();
        p.setBounds(160,100,100,30);

        b = new JButton("Save");
        b.setBounds(160,150,50,30);

        f.add(l1);
        f.add(t);
        f.add(l2);
        f.add(p);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userDatabase();
            }
        });
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void userDatabase()
    {
        String username = t.getText();
        String password = String.valueOf(p.getPassword());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_schema", "root", "prabin2062");
                    String query = "Insert into users(username,password) values(?,?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, username);
                    pst.setString(2, password);

                    int row = pst.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(f, "Saved Successfully");
                    }
                    con.close();
                }
                 catch(Exception ex)
                    {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(f,"Error"+ex.getMessage());
                    }
                }

    public static void main(String[] args) {
        new JavaDatabase();
    }
    }

