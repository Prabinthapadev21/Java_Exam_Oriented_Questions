package JDBC_Connection;
import java.sql.*;
public class PreparedExecute {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            PreparedStatement pst = con.prepareStatement("select * from student");
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
