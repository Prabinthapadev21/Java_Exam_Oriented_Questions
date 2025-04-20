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
        String Url ="";
        String username="";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(Url,username,password);
    }
}
