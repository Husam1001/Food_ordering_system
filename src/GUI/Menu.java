package GUI;


import food_ordering_system.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

    private JPanel contentPane;
    public JLabel iteam2N;
    public JButton ProfileButton = new JButton();
    public JPanel panel_1;
    public JPanel panel;
    Home_page obj = new Home_page();


    /**
     * Launch the application.
     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Menu frame = new Menu();
//
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    /**
     * Create the frame.
     */
    public Menu() {
        setTitle("Menu");
        setFont(new Font("Lucida Fax", Font.PLAIN, 12));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 793, 553);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


    }

    public void menu() {

        panel = new JPanel();
        panel.setBounds(0, 63, 777, 452);
        contentPane.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.pink);
        panel.setBackground(new java.awt.Color(255, 255, 255, 255));

        JLabel img1 = new JLabel("iteam1");
        img1.setBounds(20, 23, 82, 69);
        //ImageIcon img_1=new ImageIcon("C:\\Users\\Husam\\Desktop\\1.jpg");
        img1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\1.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        // img1.setIcon(img_1);
        panel.add(img1);

        JLabel iteam1N = new JLabel("Chicken fried rice");
        iteam1N.setBounds(20, 103, 101, 17);
        panel.add(iteam1N);

        JSpinner iteam1s = new JSpinner();
        iteam1s.setBounds(72, 123, 30, 20);
        panel.add(iteam1s);

        JLabel img2 = new JLabel("New label");
        img2.setBounds(171, 23, 82, 69);
        img2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\2.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img2);

        JLabel img3 = new JLabel("New label");
        img3.setBounds(310, 23, 82, 69);
        img3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\3.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img3);

        JLabel img4 = new JLabel("New label");
        img4.setBounds(440, 23, 82, 69);
        img4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\4.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img4);

        JLabel img5 = new JLabel("New label");
        img5.setBounds(569, 23, 82, 69);
        img5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\5.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img5);

        JLabel img6 = new JLabel("New label");
        img6.setBounds(20, 154, 82, 69);
        img6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\6.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img6);

        JLabel img7 = new JLabel("New label");
        img7.setBounds(171, 154, 82, 69);
        img7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\7.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img7);

        JLabel img8 = new JLabel("New label");
        img8.setBounds(310, 154, 82, 69);
        img8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\8.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img8);

        JLabel img9 = new JLabel("New label");
        img9.setBounds(440, 154, 82, 69);
        img9.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\9.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img9);

        JLabel img10 = new JLabel("New label");
        img10.setBounds(569, 154, 82, 69);
        img10.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\10.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img10);

        JLabel img11 = new JLabel("New label");
        img11.setBounds(32, 314, 82, 69);
        img11.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\11.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img11);

        JLabel img12 = new JLabel("New label");
        img12.setBounds(181, 314, 82, 69);
        img12.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\12.jpeg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img12);

        JLabel img13 = new JLabel("New label");
        img13.setBounds(310, 314, 82, 69);
        img13.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Husam\\Desktop\\Food ordering system\\img\\13.jpg").getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(img13);

        iteam2N = new JLabel("Chicken Biryani");
        iteam2N.setBounds(171, 104, 92, 14);
        panel.add(iteam2N);

        JLabel iteam3N = new JLabel("Chilly Chicken");
        iteam3N.setBounds(310, 104, 82, 14);
        panel.add(iteam3N);

        JLabel iteam4N = new JLabel("Spicy Chicken");
        iteam4N.setBounds(450, 104, 92, 14);
        panel.add(iteam4N);

        JLabel iteam5N = new JLabel("Beef Burger");
        iteam5N.setBounds(584, 104, 87, 14);
        panel.add(iteam5N);

        JLabel iteam6N = new JLabel("Chicken Sandwich");
        iteam6N.setBounds(20, 240, 112, 14);
        panel.add(iteam6N);

        JLabel iteam7N = new JLabel("Chowmein");
        iteam7N.setBounds(189, 234, 64, 14);
        panel.add(iteam7N);

        JLabel iteam8N = new JLabel("Fruit salad");
        iteam8N.setBounds(326, 234, 66, 14);
        panel.add(iteam8N);

        JLabel iteam9N = new JLabel("Chicken deluxe");
        iteam9N.setBounds(440, 234, 102, 14);
        panel.add(iteam9N);

        JSpinner iteam2s = new JSpinner();
        iteam2s.setBounds(223, 123, 30, 20);
        panel.add(iteam2s);

        JSpinner iteam3s = new JSpinner();
        iteam3s.setBounds(362, 123, 30, 20);
        panel.add(iteam3s);

        JSpinner iteam4s = new JSpinner();
        iteam4s.setBounds(492, 123, 30, 20);
        panel.add(iteam4s);

        JSpinner iteam5s = new JSpinner();
        iteam5s.setBounds(627, 123, 30, 20);
        panel.add(iteam5s);

        JSpinner iteam6s = new JSpinner();
        iteam6s.setBounds(72, 258, 30, 20);
        panel.add(iteam6s);

        JSpinner iteam7s = new JSpinner();
        iteam7s.setBounds(233, 258, 30, 20);
        panel.add(iteam7s);

        JSpinner iteam8s = new JSpinner();
        iteam8s.setBounds(362, 258, 30, 20);
        panel.add(iteam8s);

        JSpinner iteam9s = new JSpinner();
        iteam9s.setBounds(492, 258, 30, 20);
        panel.add(iteam9s);

        JSpinner iteam10s = new JSpinner();
        iteam10s.setBounds(627, 258, 30, 20);
        panel.add(iteam10s);

        JSpinner iteam11s = new JSpinner();
        iteam11s.setBounds(91, 411, 30, 20);
        panel.add(iteam11s);

        JSpinner iteam12s = new JSpinner();
        iteam12s.setBounds(241, 411, 30, 20);
        panel.add(iteam12s);

        JSpinner iteam13s = new JSpinner();
        iteam13s.setBounds(362, 411, 30, 20);
        panel.add(iteam13s);

        JLabel iteam10N = new JLabel("Chicken chop combo");
        iteam10N.setBounds(569, 234, 126, 14);
        panel.add(iteam10N);

        JLabel iteam11N = new JLabel("Pepsi");
        iteam11N.setBounds(52, 394, 50, 14);
        panel.add(iteam11N);

        JLabel iteam12N = new JLabel("Coke");
        iteam12N.setBounds(206, 394, 44, 14);
        panel.add(iteam12N);

        JLabel iteam13N = new JLabel("Watermelon smoothie");
        iteam13N.setBounds(293, 394, 135, 14);
        panel.add(iteam13N);

        JLabel iteam1p = new JLabel("12 RM");
        iteam1p.setBounds(20, 125, 44, 17);
        panel.add(iteam1p);

        JLabel iteam2p = new JLabel("20 RM");
        iteam2p.setBounds(171, 126, 44, 17);
        panel.add(iteam2p);

        JLabel iteam3p = new JLabel("16 RM");
        iteam3p.setBounds(308, 126, 44, 17);
        panel.add(iteam3p);

        JLabel iteam4p = new JLabel("14 RM");
        iteam4p.setBounds(438, 126, 44, 17);
        panel.add(iteam4p);

        JLabel iteam5p = new JLabel("25 RM");
        iteam5p.setBounds(573, 126, 44, 17);
        panel.add(iteam5p);

        JLabel iteam6p = new JLabel("22 RM");
        iteam6p.setBounds(20, 261, 44, 17);
        panel.add(iteam6p);

        JLabel iteam7p = new JLabel("10 RM");
        iteam7p.setBounds(181, 259, 44, 17);
        panel.add(iteam7p);

        JLabel iteam8p = new JLabel("16 RM");
        iteam8p.setBounds(308, 259, 44, 17);
        panel.add(iteam8p);

        JLabel iteam9p = new JLabel("25 RM");
        iteam9p.setBounds(440, 259, 44, 17);
        panel.add(iteam9p);

        JLabel iteam10p = new JLabel("14 RM");
        iteam10p.setBounds(573, 261, 44, 17);
        panel.add(iteam10p);

        JLabel iteam11p = new JLabel("3 RM");
        iteam11p.setBounds(37, 414, 44, 17);
        panel.add(iteam11p);

        JLabel iteam12p = new JLabel("3 RM");
        iteam12p.setBounds(181, 414, 44, 17);
        panel.add(iteam12p);

        JLabel iteam13p = new JLabel("8 RM");
        iteam13p.setBounds(308, 414, 44, 17);
        panel.add(iteam13p);

        JButton btnNewButton = new JButton("Next");
        btnNewButton.setForeground(new Color(0, 4, 9));
        btnNewButton.setBackground(new Color(0, 204, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.setBounds(537, 359, 92, 35);
        panel.add(btnNewButton);

        panel_1 = new JPanel();
        panel_1.setBackground(new Color(153, 204, 255));
        panel_1.setBounds(0, 0, 777, 62);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton homeButton = new JButton("Home");
        homeButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        homeButton.setBounds(45, 11, 89, 23);
        panel_1.add(homeButton);

        ProfileButton = new JButton("Manage profile");
        ProfileButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        ProfileButton.setBounds(180, 11, 131, 23);
        panel_1.add(ProfileButton);
        ProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Profile obj = new Profile();
                Main objm = new Main();
                obj.updateprofile();
                obj.phone.setText(objm.phone);
                obj.email.setText(objm.email);
                obj.textField_4.setText(objm.address);
                obj.passwordField.setText(objm.password);
                setVisible(false);
                Main objx = new Main();
            }
        });
        JButton logoutButton = new JButton("Logout");
        logoutButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        logoutButton.setBounds(678, 11, 89, 23);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.mainFrame.setVisible(true);
                obj.loginPanel();
            }
        });
        panel_1.add(logoutButton);

        JButton ConnecttUsButton = new JButton("Contact Us");
        ConnecttUsButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        ConnecttUsButton.setBounds(351, 11, 103, 23);
        panel_1.add(ConnecttUsButton);

        JButton aboutButton = new JButton("About Us");
        aboutButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        aboutButton.setBounds(501, 11, 89, 23);
        panel_1.add(aboutButton);

    }

}






