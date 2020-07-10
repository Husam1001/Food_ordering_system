package GUI;


import food_ordering_system.ManageDelivery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Canvas;

public class Restorant extends JFrame {

    private JPanel contentPane;


    public Restorant() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 926, 570);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 910, 531);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(57, 225, 140, 118);
        lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\report.png").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), lblNewLabel.CENTER)));
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(276, 220, 140, 128);
        lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\menu.png").getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), lblNewLabel_1.CENTER)));
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(465, 220, 120, 128);
        lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\delivery.png").getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), lblNewLabel_2.CENTER)));
        panel.add(lblNewLabel_2);

        JButton btnNewButton = new JButton("Generate Sales Report");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(57, 367, 160, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Manage Menu");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_1.setBounds(276, 367, 120, 23);
        panel.add(btnNewButton_1);

        JButton manageDButton = new JButton("Manage Delivery Man");
        manageDButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        manageDButton.setBounds(450, 367, 165, 23);
        manageDButton.addActionListener(new ActionListener() {
            Delivery objMM = new Delivery();

            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                objMM.setVisible(true);
            }
        });
        panel.add(manageDButton);

        JLabel lblNewLabel_2_1 = new JLabel("New label");
        lblNewLabel_2_1.setBounds(665, 230, 134, 118);
        lblNewLabel_2_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\order.png").getImage().getScaledInstance(lblNewLabel_2_1.getWidth(), lblNewLabel_2_1.getHeight(), lblNewLabel_2_1.CENTER)));
        panel.add(lblNewLabel_2_1);

        JButton btnNewButton_3 = new JButton("View Orders");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));

        btnNewButton_3.setBounds(684, 367, 103, 23);
        panel.add(btnNewButton_3);

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(367, 63, 140, 97);
        lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\logo.png").getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), lblNewLabel_3.CENTER)));
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Welcome to Quick Chef");
        lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
        lblNewLabel_4.setBounds(316, 11, 231, 41);
        panel.add(lblNewLabel_4);
    }
}

