package JDBC_Connection;
import java.sql.*;
public class FetchDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
