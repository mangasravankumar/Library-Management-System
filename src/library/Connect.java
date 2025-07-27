package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection connectMysql() {
        Connection conn = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library",  // DB name
                "root",                                  // username
                ""                                       // password (blank in XAMPP)
            );

            System.out.println("✅ MySQL Connected Successfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Connection Failed: " + e.getMessage());
        }

        return conn;
    }

    // Optional: for testing
    public static void main(String[] args) {
        System.out.println("➡️ Classpath: " + System.getProperty("java.class.path"));
        connectMysql();
    }
}
