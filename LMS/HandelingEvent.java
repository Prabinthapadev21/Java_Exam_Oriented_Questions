package LMS;
import com.mysql.cj.jdbc.Driver;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class HandelingEvent extends SignupPage{
    public HandelingEvent(SignupPage signupPage) {
    }
    public HandelingEvent(LoginPage loginPage)
    {

    }

    public void datababaseConnectivity()
    {
        String username="";
        String password ="";
        String email ="";
        String query = "Insert into studentDetails(username,email,password)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_schema","root","prabin2062");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,email);
            pst.setString(3,password);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(frame, "User saved successfully!");
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    public static void main(String[] args) {
        
    }
}
