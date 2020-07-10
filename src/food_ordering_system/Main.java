package food_ordering_system;

import GUI.Home_page;
import GUI.Menu;
import GUI.Profile;
import GUI.Restorant;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.HashMap;

public class Main {
    private static Connection con1;
    private static ConnectionManager con = new ConnectionManager();
    public static String id;
    public static String phone;
    public static String email;
    public static String address;
    public static String password;

    public static void main(String[] args) throws ClassNotFoundException {
        HashMap<String, String> userinfo = new HashMap<>();
        Register objR = new Register();
        Login objL = new Login();
        Home_page obj = new Home_page();
        FlatLightLaf.install();
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        obj.loginPanel();
        obj.registerPanel();
        obj.mainFrame.setVisible(true);
//
//
        obj.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        obj.registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obj.imge.setVisible(false);
                obj.imge2.setVisible(true);
                obj.login.setVisible(false);
                obj.register.setVisible(true);

            }
        });

        obj.registerButtonRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = obj.nameTextField.getText();
                String email = obj.emailTextField.getText();
                String phone = obj.phoneTextField.getText();
                String password = obj.passwordFieldR.getText();
                String userName = obj.userNameTextField.getText();
                String address = obj.addressTextField.getText();
                if (!objR.ischar(name)) {
                    JOptionPane.showMessageDialog(null, "Invalid Name");
                } else if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name can not be Empty");
                } else if (userName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "UserName can not be Empty");
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password can not be Empty");
                } else if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "email can not be Empty");
                } else if (!objR.emailisValid(email)) {
                    JOptionPane.showMessageDialog(null, "Invalid Email");
                } else if (phone.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Phone can not be Empaty");
                } else if (address.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Address can not be Empaty");
                } else if (!objR.isExist(obj.userNameTextField.getText(), obj.emailTextField.getText()) && objR.ischar(name) && objR.emailisValid(email)) {
                    objR.register(obj.userNameTextField.getText(), obj.passwordFieldR.getText(), obj.nameTextField.getText(), obj.phoneTextField.getText(), obj.emailTextField.getText(), obj.addressTextField.getText());
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                    obj.register.setVisible(false);
                    obj.imge.setVisible(true);
                    obj.login.setVisible(true);

                } else if (objR.isExist(obj.userNameTextField.getText(), obj.emailTextField.getText())) {
                    JOptionPane.showMessageDialog(null, "UserName or Email is exist");
                }
//                else {
//                    JOptionPane.showMessageDialog(null, "User is Exist\nTry Login");
//                    obj.register.setVisible(false);
//                    obj.imge.setVisible(true);
//                    obj.login.setVisible(true);
//                }

            }
        });
        obj.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (objL.isExist(obj.userText.getText(), String.valueOf(obj.passwordField.getPassword()))) {
                    userinfo.putAll(objL.login(obj.userText.getText(), String.valueOf(obj.passwordField.getPassword())));
                    Main objx = new Main();
                    objx.id = userinfo.get("id");
                    objx.email = userinfo.get("email");
                    objx.phone = userinfo.get("phone");
                    objx.address = userinfo.get("address");
                    objx.password = userinfo.get("password");
                    JOptionPane.showMessageDialog(null, "login Successfully");
                    obj.mainFrame.setVisible(false);
                    try {
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                        unsupportedLookAndFeelException.printStackTrace();
                    } catch (IllegalAccessException illegalAccessException) {
                        illegalAccessException.printStackTrace();
                    } catch (InstantiationException instantiationException) {
                        instantiationException.printStackTrace();
                    } catch (ClassNotFoundException classNotFoundException) {
                        classNotFoundException.printStackTrace();
                    }
                    EventQueue.invokeLater(new Runnable() {
                                               public void run() {
                                                   try {
                                                       Menu frame = new Menu();
                                                       frame.menu();
                                                       frame.setVisible(true);
                                                   } catch (Exception e) {
                                                       e.printStackTrace();
                                                   }
                                               }
                                           }

                    );

                }
                ManageDelivery obj2 = new ManageDelivery();
                if (obj2.isExist(obj.userText.getText(), String.valueOf(obj.passwordField.getPassword()))) {
                    Restorant obj1 = new Restorant();
                    obj1.setVisible(true);
                    obj.mainFrame.setVisible(false);

                }

                if (!objL.isExist(obj.userText.getText(), String.valueOf(obj.passwordField.getPassword())) && !(obj2.isExist(obj.userText.getText(), String.valueOf(obj.passwordField.getPassword())))) {
                    JOptionPane.showMessageDialog(null, "Invalid UserName or Password\n       Please Try again");

                }


            }


        });


    }

}
        
