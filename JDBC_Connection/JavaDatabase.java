package JDBC_Connection;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class JavaDatabase {
    public static void main(String[] args) {
        try {
            String url = "";
            String username = "";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("");
        }
    }
}
