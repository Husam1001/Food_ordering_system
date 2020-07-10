package GUI;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.HashMap;

public class Home_page {
    public JFrame mainFrame;
    public JPanel login;
    public JPanel register;
    public JLabel user;
    public JTextField userText;
    public JLabel passwordLabel;
    public JButton loginButton;
    public JButton registerButton;
    public JPasswordField passwordField;
    public JLabel imge2;
    public JLabel imge;
    //Registration()

    public JButton registerButtonRe;
    public JLabel nameLabel;
    public JLabel usernameLabel;
    public JLabel passwordLabelR;
    public JLabel emailLabel;
    public JLabel phoneLabel;
    public JLabel addressLabel;

    public JTextField nameTextField;
    public JTextField userNameTextField;
    public JPasswordField passwordFieldR;
    public JTextField emailTextField;
    public JTextField phoneTextField;
    public JTextField addressTextField;


    public Home_page() {
        ImageIcon img = new ImageIcon("C:\\Users\\Husam\\Desktop\\Logo1\\iconM.png");
        imge = new JLabel(new ImageIcon("C:\\Users\\Husam\\Desktop\\Logo1\\facebook_cover_photo_2.png"));
        mainFrame = new JFrame("Food Ordering System");
        mainFrame.setIconImage(img.getImage());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setSize(680, 650);
        mainFrame.setLayout(null);
        imge.setBounds(0, 0, 680, 400);
        // mainFrame.add(imge);
        mainFrame.getContentPane().setBackground(new java.awt.Color(255, 255, 255, 248));
        imge.setVisible(true);
        // mainFrame.getContentPane().setBackground(Color.lightGray);
        mainFrame.add(imge);

    }

    public void loginPanel() {
        login = new JPanel();
        login.setBounds(200, 420, 250, 150);
        //useName label
        user = new JLabel("UserName");
        user.setBounds(10, 10, 80, 20);

        //userName Input text
        userText = new JTextField();
        userText.setBounds(90, 10, 120, 20);

        //password Label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 20);
        //password field
        passwordField = new JPasswordField();
        passwordField.setBounds(90, 40, 120, 20);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 100, 80, 25);

        // Login Register
        registerButton = new JButton("Register");
        registerButton.setBounds(10, 100, 100, 25);
        registerButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setBackground(new java.awt.Color(54, 54, 52, 248));
        loginButton.setBackground(new java.awt.Color(120, 198, 255, 248));
        //add component to panel
        login.add(user);
        login.add(userText);
        login.add(passwordLabel);
        login.add(passwordField);
        login.add(loginButton);
        login.add(registerButton);


        mainFrame.add(login);

        login.setBackground(new java.awt.Color(255, 255, 255, 248));
        login.setLayout(null);
    }

    public void registerPanel() {
        imge2 = new JLabel(new ImageIcon("C:\\Users\\Husam\\Desktop\\Logo1\\2122.png"));
        imge2.setBounds(0, 0, 660, 160);
        mainFrame.add(imge2);

        register = new JPanel();
        register.setBounds(160, 170, 350, 300);
        register.setLayout(null);

        //add name Lapel +text Field
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 10, 80, 20);
        nameTextField = new JTextField();
        nameTextField.setBounds(90, 10, 140, 20);

//add userName label + text field

        usernameLabel = new JLabel("User Name");
        usernameLabel.setBounds(10, 40, 80, 20);
        userNameTextField = new JTextField();
        userNameTextField.setBounds(90, 40, 140, 20);

//add password label + password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 70, 80, 20);
        passwordFieldR = new JPasswordField();
        passwordFieldR.setBounds(90, 70, 140, 20);


//add Email label + Email text field
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 100, 80, 20);
        emailTextField = new JTextField();
        emailTextField.setBounds(90, 100, 140, 20);

//add phone label + phone text field
        phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(10, 130, 80, 20);
        phoneTextField = new JTextField();
        phoneTextField.setBounds(90, 130, 140, 20);

//add address label + address text field
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(10, 160, 80, 20);
        addressTextField = new JTextField();
        addressTextField.setBounds(90, 160, 140, 20);

//add register Button
        registerButtonRe = new JButton("Register");
        registerButtonRe.setBounds(100, 200, 120, 40);
        registerButtonRe.setBackground(new java.awt.Color(120, 198, 255, 248));

//add component to the register panel
        register.setBackground(new java.awt.Color(255, 255, 255, 248));
        register.add(nameLabel);
        register.add(nameTextField);
        register.add(usernameLabel);
        register.add(userNameTextField);
        register.add(passwordLabel);
        register.add(passwordFieldR);
        register.add(emailLabel);
        register.add(emailTextField);
        register.add(phoneLabel);
        register.add(phoneTextField);
        register.add(addressLabel);
        register.add(addressTextField);
        register.add(registerButtonRe);


        mainFrame.add(register);
        imge2.setVisible(false);
        register.setVisible(false);

    }

}
