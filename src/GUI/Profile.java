package GUI;

import food_ordering_system.ConnectionManager;
import food_ordering_system.Main;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Profile {
    public static JTextField phone;
    public static JTextField email;
    public static JTextField textField_4;
    public static JPasswordField passwordField;
    public static JPasswordField passwordField_1;
    public static JPanel profileP;
    public static JFrame profileF;
    public Connection con;
    public Statement statement;
    ConnectionManager objd = new ConnectionManager();

    /**
     * Create the panel.
     */
    public Profile() {

        profileF = new JFrame("Manage Profile");
        profileF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        profileF.setSize(420, 400);
        profileF.setLayout(null);
        profileF.setVisible(false);
        profileP = new JPanel();
        profileP.setSize(400, 400);
        profileP.setLayout(null);
        profileP.setBackground(new Color(255, 255, 255));
        profileP.setLayout(null);


    }

    public void updateprofile() {
        profileF.setVisible(true);
        JLabel lblNewLabel = new JLabel("Phone Number");
        lblNewLabel.setBounds(25, 28, 86, 14);
        profileP.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Email");
        lblNewLabel_1.setBounds(25, 64, 46, 14);
        profileP.add(lblNewLabel_1);

        JLabel password = new JLabel("Password");
        password.setBounds(25, 101, 80, 14);
        profileP.add(password);

        JLabel passwordC = new JLabel("Confirm Password:");
        passwordC.setBounds(25, 129, 110, 14);
        profileP.add(passwordC);

        JLabel address = new JLabel("Address");
        address.setBounds(25, 192, 80, 14);
        profileP.add(address);

        phone = new JTextField();
        phone.setBounds(145, 25, 98, 20);
        profileP.add(phone);
        phone.setColumns(10);

        email = new JTextField();
        email.setBounds(145, 61, 140, 20);
        profileP.add(email);
        email.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(130, 176, 162, 70);
        profileP.add(textField_4);
        textField_4.setColumns(10);

        JButton saveButton = new JButton("Save");
        saveButton.setBackground(new Color(0, 204, 255));
        saveButton.setBounds(298, 280, 89, 23);
        profileP.add(saveButton);

        passwordField = new JPasswordField();
        passwordField.setBounds(145, 98, 98, 20);
        profileP.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(145, 126, 98, 20);
        profileP.add(passwordField_1);

        profileP.setVisible(true);
        profileF.add(profileP);
        profileF.setVisible(true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Profile obj = new Profile();
                Main objM = new Main();
                con = objd.getConnection();
                boolean ph = false, em = false, pass = false, address = false;
                try {
                    statement = con.createStatement();
                } catch (SQLException throwables) {
                    System.out.println(throwables);
                }
                if (!obj.phone.getText().equals(objM.phone) && !phone.getText().isEmpty()) {
                    try {
                        statement.executeUpdate("update Customer set cust_phone='" + phone.getText() + "'where cust_id='" + objM.id + "'");
                        ph = true;
                    } catch (SQLException throwables) {
                        System.out.println(throwables);
                    }
                }
                if (!obj.email.getText().equals(objM.email) && !email.getText().isEmpty()) {
                    try {
                        statement.executeUpdate("update Customer set cust_email='" + email.getText() + "'where cust_id='" + objM.id + "'");
                        em = true;
                    } catch (SQLException throwables) {
                        System.out.println(throwables);
                    }
                }
                if (obj.passwordField.getText().equals(obj.passwordField_1.getText()) && !obj.passwordField.getText().equals(objM.password) && !password.getText().isEmpty()) {
                    try {
                        statement.executeUpdate("update Customer set password='" + passwordField.getText() + "'where cust_id='" + objM.id + "'");
                        pass = true;
                    } catch (SQLException throwables) {
                        System.out.println(throwables);
                    }
                }
                if (!obj.textField_4.getText().equals(objM.address) && !textField_4.getText().isEmpty()) {
                    try {
                        statement.executeUpdate("update Customer set address='" + textField_4.getText() + "'where cust_id='" + objM.id + "'");
                        address = true;
                    } catch (SQLException throwables) {
                        System.out.println(throwables);
                    }
                }

                JOptionPane.showMessageDialog(null, "Updated List\n Phone: " + ph + "\nEmail: " + em + " \n Password: " + pass + "\n Address: " + address);
                profileF.setVisible(false);
                Menu objA = new Menu();
                objA.menu();
                objA.setVisible(true);
                Profile profile = new Profile();


            }
        });
    }


}
