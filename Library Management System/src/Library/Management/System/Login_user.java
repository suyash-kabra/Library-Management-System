package Library.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Login_user extends JFrame  {

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;

    public Login_user()
    {
        setResizable(false);
        setTitle("Login Page");
        setLayout(null);
        setSize(400, 500);

        setBackground(new Color(169,169,169));
        setBounds(600,300,600,400);

        panel=new JPanel();
        panel.setBackground(new Color(176,224,230));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1=new JLabel("Username:");
        l1.setBounds(124,89,95,24);
        panel.add(l1);

        JLabel l2=new JLabel("Password:");
        l2.setBounds(124,124,95,24);
        panel.add(l2);

        textField=new JTextField();
        textField.setBounds(210,93,157,20);
        panel.add(textField);

        passwordField=new JPasswordField();
        passwordField.setBounds(210,128,157,20);
        panel.add(passwordField);
        panel.add(passwordField);

        b1=new JButton("Login");
        b1.setForeground(new Color(46,139,87));
        b1.setBackground(new Color(250,250,210));
        b1.setBounds(149,181,113,39);
        panel.add(b1);

        b2=new JButton("SignUp");
        b2.setForeground(new Color(139,69,19));
        b2.setBackground(new Color(255,235,205));
        b2.setBounds(289,181,113,39);
        panel.add(b2);

        b3=new JButton("Forgot Password");

        b3.setForeground(new Color(205,92,92));
        b3.setBackground(new Color(253,245,230));
        b3.setBounds(199,231,179,39);
        panel.add(b3);

        JLabel l3=new JLabel("Trouble in Login?");
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        l3.setForeground(new Color(255,0,0));
        l3.setBounds(70,240,130,20);
        panel.add(l3);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean status=false;
                try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        setVisible(false);
                        new Home().setVisible(true);
                    } else

                        JOptionPane.showMessageDialog(null, "Invalid Login!");

                }
                catch(Exception e2)
                {
                    e2.printStackTrace();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Signup su=new Signup();
                su.setVisible(true);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Forgot forgot=new Forgot();
                forgot.setVisible(true);
            }
        });


    }

    public static void main(String[] args) {
        new Login_user().setVisible(true);
    }
}
