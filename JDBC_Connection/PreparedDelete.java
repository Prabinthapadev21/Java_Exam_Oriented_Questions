package JDBC_Connection;
import java.sql.*;
public class PreparedDelete {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            PreparedStatement pst = con.prepareStatement("delete from student where id = ?");
            pst.setInt(1,2);

            int result = pst.executeUpdate();
            System.out.println(result + "Row is deleted");
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
