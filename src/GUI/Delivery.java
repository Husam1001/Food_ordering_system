package GUI;

import food_ordering_system.ConnectionManager;
import food_ordering_system.ManageDelivery;
import food_ordering_system.Register;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.DefaultMenuLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delivery extends JFrame {

    private JPanel contentPane;
    private JTextField idFild;
    private JTextField nametextField;
    private JTextField UserNametextField;
    private JTextField phonetextField;
    private JPasswordField passwordField;
    private JTextField name2textField;
    private JTextField userName2textField;
    private JTextField phone2textField;
    private JPasswordField passwordField2;
    //private JTable table;
    ManageDelivery objM = new ManageDelivery();

    public Delivery() {
        setTitle("Manage Delivery");
        setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1091, 601);
        contentPane = new JPanel();
        contentPane.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel addDeliverypanel = new JPanel();
        addDeliverypanel.setBackground(new Color(255, 255, 255));
        addDeliverypanel.setBounds(10, 58, 353, 493);
        contentPane.add(addDeliverypanel);
        addDeliverypanel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Add Delivery Man");
        lblNewLabel_1.setForeground(new Color(0, 0, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(96, 21, 103, 21);
        addDeliverypanel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Name");
        lblNewLabel_2.setBounds(29, 73, 60, 14);
        addDeliverypanel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("UserName");
        lblNewLabel_3.setBounds(29, 119, 60, 14);
        addDeliverypanel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Password");
        lblNewLabel_4.setBounds(29, 171, 60, 14);
        addDeliverypanel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Phone");
        lblNewLabel_5.setBounds(29, 217, 46, 14);
        addDeliverypanel.add(lblNewLabel_5);


        nametextField = new JTextField();
        nametextField.setBounds(115, 70, 103, 20);
        addDeliverypanel.add(nametextField);
        nametextField.setColumns(10);

        UserNametextField = new JTextField();
        UserNametextField.setBounds(115, 116, 103, 20);
        addDeliverypanel.add(UserNametextField);
        UserNametextField.setColumns(10);

        phonetextField = new JTextField();
        phonetextField.setBounds(115, 214, 103, 20);
        addDeliverypanel.add(phonetextField);
        phonetextField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(112, 168, 106, 20);
        addDeliverypanel.add(passwordField);

        JPanel updatepanel = new JPanel();
        updatepanel.setBackground(new Color(255, 255, 255));
        updatepanel.setBounds(373, 151, 345, 368);
        updatepanel.setVisible(false);
        contentPane.add(updatepanel);
        updatepanel.setLayout(null);

        JLabel lblNewLabel_6 = new JLabel("Update Info");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_6.setBounds(126, 11, 91, 22);
        updatepanel.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Name");
        lblNewLabel_7.setBounds(37, 76, 46, 14);
        updatepanel.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("UserNmae");
        lblNewLabel_8.setBounds(37, 124, 62, 14);
        updatepanel.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Password");
        lblNewLabel_9.setBounds(37, 175, 62, 14);
        updatepanel.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("Phone");
        lblNewLabel_10.setBounds(37, 230, 46, 14);
        updatepanel.add(lblNewLabel_10);

        name2textField = new JTextField();
        name2textField.setBounds(126, 73, 107, 20);
        updatepanel.add(name2textField);
        name2textField.setColumns(10);

        userName2textField = new JTextField();
        userName2textField.setBounds(126, 121, 107, 20);
        updatepanel.add(userName2textField);
        userName2textField.setColumns(10);

        phone2textField = new JTextField();
        phone2textField.setBounds(126, 227, 107, 20);
        updatepanel.add(phone2textField);
        phone2textField.setColumns(10);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(126, 172, 107, 20);
        updatepanel.add(passwordField2);

        JButton updateInfButton = new JButton("Update");
        updateInfButton.setBackground(new Color(0, 255, 255));
        updateInfButton.setBounds(112, 294, 89, 23);
        updateInfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objM.updateDeliveryMan(idFild.getText(), name2textField.getText(), userName2textField.getText(), passwordField2.getText(), phone2textField.getText());
            }
        });
        updatepanel.add(updateInfButton);

        JPanel DeliveryListpanel = new JPanel();
        DeliveryListpanel.setBackground(new Color(255, 255, 255));
        DeliveryListpanel.setBounds(728, 46, 323, 493);
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Phone"}, 0);
        JTable table = new JTable(model);
        JScrollPane tableContainer = new JScrollPane(table);
        contentPane.add(DeliveryListpanel);
        DeliveryListpanel.setLayout(null);
        //DeliveryListpanel.setLayout(new BorderLayout());


        JLabel lblNewLabel = new JLabel("Delivery Man List");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel.setBounds(94, 15, 122, 14);
        DeliveryListpanel.add(lblNewLabel);


        JButton updateButton = new JButton("Update");
        updateButton.setBackground(new Color(51, 204, 255));
        updateButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        updateButton.setBounds(393, 94, 89, 23);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (objM.isExistid(idFild.getText())) {
                    name2textField.setText("");
                    userName2textField.setText("");
                    passwordField2.setText("");
                    phone2textField.setText("");
                    updatepanel.setVisible(true);

                } else {
                    updatepanel.setVisible(false);
                    JOptionPane.showMessageDialog(null, "User not Exist\nTry again");
                }
            }
        });
        contentPane.add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBackground(new Color(255, 0, 102));
        deleteButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        deleteButton.setBounds(517, 94, 89, 23);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatepanel.setVisible(false);
                objM.deletDeliveryMan(idFild.getText());
            }
        });
        contentPane.add(deleteButton);

        JButton homeButton = new JButton("Home");
        homeButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        homeButton.setBounds(25, 11, 89, 23);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Restorant obj = new Restorant();
                obj.setVisible(true);
            }
        });
        contentPane.add(homeButton);

        idFild = new JTextField();
        idFild.setToolTipText("Enter Delivery Id\r\n");
        idFild.setBounds(461, 58, 86, 20);
        contentPane.add(idFild);
        idFild.setColumns(10);

        JLabel lblNewLabel_11 = new JLabel("ID");
        lblNewLabel_11.setToolTipText("Delivery Man Id\r\n");
        lblNewLabel_11.setBounds(426, 58, 29, 14);
        contentPane.add(lblNewLabel_11);

        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBackground(new Color(102, 204, 255));
        btnNewButton.setBounds(108, 283, 89, 23);
        ManageDelivery objMM = new ManageDelivery();
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objMM.addDeliveryMen(nametextField.getText(), UserNametextField.getText(), passwordField.getText(), phonetextField.getText());

            }
        });
        JButton refreshButton = new JButton("Refresh");
        refreshButton.setBackground(new Color(255, 255, 204));
        refreshButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
        refreshButton.setBounds(226, 11, 87, 23);
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Connection con;
                con = ConnectionManager.getConnection();

                try {
                    Statement st = con.createStatement();

                    String sql = "SELECT * FROM Delivery";


                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        String id = rs.getString(1);
                        String name = rs.getString(2);
                        String phone = rs.getString(5);
                        System.out.println(rs.getString("name"));

                        model.addRow(new Object[]{id, name, phone});

                    }

                } catch (Exception exx) {
                    System.out.println(exx);
                }

                // DeliveryListpanel.add(tableContainer, BorderLayout.CENTER);
                DeliveryListpanel.add(tableContainer);
                table.setVisible(true);
                DeliveryListpanel.setVisible(true);


            }
        });
        DeliveryListpanel.add(refreshButton);
        addDeliverypanel.add(btnNewButton);
        JLabel lblNewLabel_12 = new JLabel("Manage Delivery Man");
        lblNewLabel_12.setForeground(new Color(0, 0, 153));
        lblNewLabel_12.setBackground(new Color(0, 0, 204));
        lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel_12.setBounds(332, -2, 367, 37);
        contentPane.add(lblNewLabel_12);
    }
}
