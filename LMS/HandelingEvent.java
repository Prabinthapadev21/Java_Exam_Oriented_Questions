package LMS;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class HandelingEvent {

    SignupPage signupPage;

    public HandelingEvent(SignupPage signupPage) {
        this.signupPage = signupPage;
        addListeners();
    }
    private void addListeners() {
        signupPage.continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                databaseConnectivity();
            }
        });
    }

    private void databaseConnectivity() {
        String username = signupPage.usernameField.getText();
        String email = signupPage.emailField.getText();
        String password = new String(signupPage.passwordField.getPassword());
        String confirmPassword = new String(signupPage.confirmPasswordField.getPassword());

        // Validation
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(signupPage.frame, "Passwords do not match!");
            return;
        }

        String query = "INSERT INTO StudentDetails(username, email, password) VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, email);
            pst.setString(3, password);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(signupPage.frame, "User saved successfully!");
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(signupPage.frame, "Error: " + ex.getMessage());
        }
    }
}

