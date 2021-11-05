package Library.Management.System;

import javax.swing.*;
import java.awt.*;

public class aboutUs extends JFrame
{
private JPanel contentPane;

public static void main(String[] args)
{
    new aboutUs().setVisible(true);
}

public aboutUs()
{
    super("About Us - TCR Innovation");
    setBackground(new Color(173,216,230));
    setBounds(500,250,700,500);

    contentPane=new JPanel();
    setContentPane(contentPane);
    contentPane.setLayout(null);
}
}
