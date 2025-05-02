package JDBC_Connection;
import java.sql.*;
public class PreparedUpdate {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            PreparedStatement pst = con.prepareStatement("Update student set values Name = ?, Address =? where Id = ?");
            pst.setString(1,"Sita");
            pst.setString(3,"Pkhr");
            // here the index is 3 and id is 2;
            pst.setInt(3,2);
            int result = pst.executeUpdate();
            System.out.println(result + "Row is updated");
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
