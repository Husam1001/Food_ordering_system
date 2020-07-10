package food_ordering_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306/food_order_db?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "";
    private static Connection con;

    public static Connection getConnection() {
        //  Class.forName(driverName);
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            // log an exception. fro example:
            System.out.println(ex);
        }
        return con;
    }
}
