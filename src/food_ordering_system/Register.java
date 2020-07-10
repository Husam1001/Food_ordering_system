package food_ordering_system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {
    private Connection con;
    private Statement statement;
    private ResultSet resultSet;

    public Register() {
    }

    public boolean isExist(String userName, String email) {
        boolean isExist = false;
        con = ConnectionManager.getConnection();

        try {
            statement = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery("SELECT userName,cust_email FROM Customer WHERE userName='" + userName + "'AND cust_email='" + email + "'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            isExist = false;
        }
        try {
            while (resultSet.next()) {
                if (resultSet.getString("userName").equals(userName) && resultSet.getString("cust_email").equals(email))
                    isExist = true;
            }
        } catch (SQLException nullex) {
            isExist = false;
        }
        return isExist;
    }

    public boolean register(String userName, String password, String cust_name, String phone, String email, String address) {
        boolean registered = false;
        if (!isExist(userName, email)) {
            con = ConnectionManager.getConnection();
            try {
                statement = con.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.executeUpdate("INSERT INTO Customer VALUES (DEFAULT,'" + cust_name + "','" + userName + "','" + password + "','" + email + "','" + phone + "','" + address + "') ");
                registered = true;
            } catch (SQLException throwables) {
                System.out.println(throwables);
                registered = false;
            }

        }
        return registered;
    }

    public boolean ischar(String s) {
        if (s == null) { // checks if the String is null
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // checks whether the character is not a letter
            // if it is not a letter ,it will return false
            if ((Character.isLetter(s.charAt(i)) == false) && s.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean emailisValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }


}
