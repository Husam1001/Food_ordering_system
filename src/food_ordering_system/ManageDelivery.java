package food_ordering_system;

import GUI.Delivery;

import javax.swing.*;
import java.sql.*;


public class ManageDelivery extends ConnectionManager {
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
            resultSet = statement.executeQuery("SELECT userName,password FROM restaurant WHERE userName='" + userName + "'AND password='" + password + "'");
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

    public boolean isExistD(String userName, String password) {
        boolean isExist = false;
        con = ConnectionManager.getConnection();

        try {
            statement = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery("SELECT userName,password FROM Delivery WHERE userName='" + userName + "'AND password='" + password + "'");
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

    public boolean isExistid(String id) {
        boolean isExist = false;
        con = ConnectionManager.getConnection();

        try {
            statement = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery("SELECT delivery_id FROM Delivery WHERE delivery_id='" + id + "'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            isExist = false;
        }
        try {
            while (resultSet.next()) {
                if (resultSet.getString("delivery_id").equals(id)) isExist = true;
            }
        } catch (SQLException nullex) {
            isExist = false;
        }
        return isExist;
    }

    public void addDeliveryMen(String name, String userName, String password, String phone) {

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name cannot be Empty");
        } else if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "UserName cannot be Empty");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be Empty");
        } else if (phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phone cannot be Empty");
        } else if (isExistD(userName, password)) {
            JOptionPane.showMessageDialog(null, "Delivery Man is Exist");
        } else if (!isExistD(userName, password)) {
            try {
                statement.executeUpdate("INSERT INTO Delivery VALUES (DEFAULT,'" + name + "','" + userName + "','" + password + "','" + phone + "') ");
            } catch (SQLException throwables) {
                System.out.println(throwables);
            }
            JOptionPane.showMessageDialog(null, "Delivery Man has been add successfully");
        }


    }

    public void updateDeliveryMan(String id, String name, String userName, String password, String phone) {
        Register obj = new Register();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name cannot be Empty");
        } else if (!obj.ischar(name)) {
            JOptionPane.showMessageDialog(null, "Invalid Name\nTry again");
        } else if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "UserName cannot be Empty");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be Empty");
        } else if (phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phone cannot be Empty");
        } else if (isExistD(userName, password)) {
            JOptionPane.showMessageDialog(null, "User info is Exist\nTry again");
        } else {
            try {
                statement.executeUpdate("update Delivery set name='" + name + "', userName='" + userName + "', password='" + password + "', Delivery_phone='" + phone + "'where Delivery_id='" + id + "'");
                JOptionPane.showMessageDialog(null, "Delivery man info Updated successfully");
            } catch (SQLException throwables) {
                System.out.println(throwables);
            }
        }
    }

    public void deletDeliveryMan(String id) {
        if (isExistid(id)) {
            try {
                statement.executeUpdate("delete from Delivery where delivery_id='" + id + "'");
                JOptionPane.showMessageDialog(null, "User has been deleted successfully");
            } catch (SQLException throwables) {
                System.out.println(throwables);
            }
        } else {
            JOptionPane.showMessageDialog(null, "User  is NOT Exist");
        }
    }

}
