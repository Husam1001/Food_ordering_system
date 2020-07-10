package food_ordering_system;

import GUI.Delivery;
import GUI.Restorant;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private Connection con;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public boolean isExist(String userName, String password) {
        boolean isExist = false;
        con = ConnectionManager.getConnection();

        try {
            statement = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery("SELECT userName,password FROM Customer WHERE userName='" + userName + "'AND password='" + password + "'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            isExist = false;
        }
        try {
            while (resultSet.next()) {
                if (resultSet.getString("userName").equals(userName) && resultSet.getString("password").equals(password))
                    isExist = true;
            }
        } catch (SQLException nullex) {
            isExist = false;
        }
        return isExist;
    }

    public HashMap login(String userName, String password) {

        HashMap<String, String> userinfo = new HashMap<String, String>();
        if (isExist(userName, password)) {
            con = ConnectionManager.getConnection();
            try {
                statement = con.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                resultSet = statement.executeQuery("SELECT *FROM Customer where userName='" + userName + "'AND password='" + password + "'");
                while (resultSet.next()) {
                    userinfo.put("id", resultSet.getString("cust_id"));
                    userinfo.put("userName", resultSet.getString("userName"));
                    userinfo.put("name", resultSet.getString("cust_name"));
                    userinfo.put("password", resultSet.getString("password"));
                    userinfo.put("phone", resultSet.getString("cust_phone"));
                    userinfo.put("email", resultSet.getString("cust_email"));
                    userinfo.put("address", resultSet.getString("address"));


                }
            } catch (SQLException throwables) {
                System.out.println(throwables);
            }


        }


        return userinfo;
    }

}
