//Java database connectivity
/*
1.import the package --> java.sql
2.load and register the driver -->com.mysql.jdbc.Driver
3.create connection ---->Connection Interface
4.create the statement ----> Statement Interface
5.Execute the query ---->
6.Process the result
7.Close
 */
package JDBC_Connection;
import java.sql.*;
public class DatabaseConnectivity {
    public static void main(String[] args) throws Exception
    {
        String Url ="jdbc:mysql://localhost:3306/Connection";
        String username="root";
        String password="prabin2062";
        String Query ="Select * from Student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Query);

        String Userdata ="";
       while (rs.next()) {

           Userdata = rs.getInt(1) + " : "+ rs.getString(2);
           System.out.println(Userdata);
       }
           st.close();
           con.close();
    }
}
