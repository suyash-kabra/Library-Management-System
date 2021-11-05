package Library.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReadMe extends JFrame  {
    private JPanel contentPane;

    public static void main(String[] args)
    {
        new ReadMe().setVisible(true);
    }

    public ReadMe()
    {
        super("Read Me - Library Management System");
        setBounds(500,250,700,500);

        contentPane =new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l3=new JLabel("Library");
        l3.setForeground(new Color(0,250,154));
        l3.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,34));
        l3.setBounds(160,40,150,55);
        contentPane.add(l3);

        JLabel l4=new JLabel("Management System");
        l4.setForeground(new Color(127,255,0));
        l4.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,34));
        l4.setBounds(70,90,405,40);
        contentPane.add(l4);

        JLabel l5=new JLabel("v1.0");
        l5.setForeground(new Color(30,144,255));
        l5.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,25));
        l5.setBounds(185,140,100,21);
        contentPane.add(l5);

        JLabel l6=new JLabel("Developed By : Suyash Kabra");
        l6.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,34));
        l6.setBounds(70,198,600,35);
        contentPane.add(l6);

        JLabel l7=new JLabel("Management System");
        l7.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,34));
        l7.setBounds(70,90,405,40);
        contentPane.add(l7);

        contentPane.setBackground(Color.white);
    }
}
