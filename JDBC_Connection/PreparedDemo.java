package JDBC_Connection;
import java.sql.*;
public class PreparedDemo {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
            pst.setInt(1,2);
            pst.setString(2,"ram");
            pst.setString(3,"ktm");
            int result = pst.executeUpdate();
            System.out.println(result + "Row is inserted");
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
