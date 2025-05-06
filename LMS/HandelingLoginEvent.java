package LMS;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class HandelingLoginEvent {
    LoginPage loginPage;

    public HandelingLoginEvent(LoginPage loginPage) {
        this.loginPage = loginPage;
        addListeners();
    }

    private void addListeners() {
        loginPage.signinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String username = loginPage.usernameField.getText();
        String password = new String(loginPage.passwordField.getPassword());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "prabin2062");

            String query = "SELECT * FROM StudentDetails WHERE username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(loginPage.frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(loginPage.frame, "Invalid credentials.");
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(loginPage.frame, "Error: " + ex.getMessage());
        }
    }
}
