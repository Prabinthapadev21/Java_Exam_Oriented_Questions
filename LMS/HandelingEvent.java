package LMS;
import com.mysql.cj.jdbc.Driver;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class HandelingEvent extends SignupPage{
    public HandelingEvent(SignupPage signupPage) {
        this.usernameField=signupPage.usernameField;
        this.emailField=signupPage.emailField;
        this.passwordField=signupPage.passwordField;
        this.confirmPasswordField=signupPage.confirmPasswordField;
    }
    public HandelingEvent(LoginPage loginPage)
    {

    }

    public void datababaseConnectivity()
    {
        String username=usernameField.getText();
        String password =;
        String email =;
        String confirmpass=;
        String query = "Insert into studentDetails(username,email,password)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_schema","root","prabin2062");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,email);
            pst.setString(3,password);
            pst.setString(4,confirmpass);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(frame, "User saved successfully!");
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        
    }
}
