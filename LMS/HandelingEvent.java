package LMS;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class HandelingEvent {
    SignupPage signupPage;

    public HandelingEvent(SignupPage signupPage) {
        this.signupPage = signupPage;
        buttonClicked();
    }

    public void buttonClicked() {
        signupPage.continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datababaseConnectivity();
            }
        });
    }

    public void datababaseConnectivity() {
        String username = signupPage.usernameField.getText();
        String email = signupPage.emailField.getText();
        String password = String.valueOf(signupPage.passwordField.getPassword());
        String confirmPass = String.valueOf(signupPage.confirmPasswordField.getPassword());

        if (!password.equals(confirmPass)) {
            JOptionPane.showMessageDialog(signupPage.frame, "Passwords do not match!");
            return;
        }

        String query = "INSERT INTO StudentDetails(username, email, password) VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, email);
            pst.setString(3, password);
            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(signupPage.frame, "Signup Successful!");

                // Close Signup window
                signupPage.frame.dispose();

                // Open Login page
                new LoginPage();
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(signupPage.frame, "Error: " + ex.getMessage());
        }
    }
}
