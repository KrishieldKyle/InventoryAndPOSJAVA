/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Justine
 */
public class year extends JFrame implements ActionListener
{
    public static JButton first = new JButton("1st Year");
    public static JButton second = new JButton("2nd Year");
    public static JLabel choose = new JLabel();
    public static JPanel panel1 = new JPanel();
    
    year()
    {
     setSize(350,120);
     setTitle("CHOOSE");
     setResizable(false);
     setVisible(true);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
     choose.setText("                         Choose what year:");
     choose.setFont(new Font("Tahoma",Font.BOLD,15));
     add(choose);
  
     panel1.setPreferredSize(new Dimension(335,50));
     panel1.setLayout(new GridLayout(1,2,10,10));
     
     first.setFont(new Font("Lucida Sans Typewriter",Font.BOLD,13));
     second.setFont(new Font("Lucida Sans Typewriter",Font.BOLD,13));
     
     panel1.add(first);
     panel1.add(second);
     add(panel1);
     setLayout(new FlowLayout(FlowLayout.LEFT));
     
     first.addActionListener(this);
     second.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(first))
        {
            first f = new first();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
        if(e.getSource().equals(second))
        {
            second f = new second();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    }
    public static void main(String[] args) 
    {
       year y = new year();
       y.setVisible(true);
    }
   
}
