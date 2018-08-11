/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
/**
 *
 * @author Justine
 */
public class Details12 extends JFrame implements ActionListener
{
     JButton del = new JButton("                                                                  ASK FOR STOCK                                                                      ");
    Details12()
    {
        setSize(540,390);
        setTitle("NETWORK AND COMMUNICATIONS");  
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        
        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel();
        JLabel lbl1 = new JLabel(" DATA COMMUNICATIONS AND");
        JLabel lbl9 = new JLabel(" COMPUTER NETWORKS");
        JLabel lbl2 = new JLabel(" PRICE - P220");
        JLabel lbl3 = new JLabel("          ");
        JLabel lbl4 = new JLabel(" By:");
        JLabel lbl5 = new JLabel("  Rajneesh Agrawal");
        JLabel lbl6 = new JLabel("  Bharat Bhushan Tiwari");
        
        
        pnl2.add(lbl1);
        pnl2.add(lbl9);
        pnl2.add(lbl2);
        pnl2.add(lbl3);
        pnl2.add(lbl4);
        pnl2.add(lbl5);
        pnl2.add(lbl6);
       
        
        Font font1 = new Font("Lucida Sans Typewriter",Font.PLAIN,17);
        Font font2 = new Font("Lucida Sans Typewriter",Font.BOLD,18);
        lbl1.setFont(font2);
        lbl9.setFont(font2);
        lbl2.setFont(font1);
        lbl3.setFont(font1);
        lbl4.setFont(font1);
        lbl5.setFont(font1);
        lbl6.setFont(font1);
        
        
        /*lbl1.setForeground(Color.white);
        lbl2.setForeground(Color.white);
        lbl3.setForeground(Color.white);
        lbl4.setForeground(Color.white);
        lbl5.setForeground(Color.white);
        lbl6.setForeground(Color.white);
        lbl7.setForeground(Color.white);
        lbl8.setForeground(Color.white);
        */
        //pnl2.setBackground(new Color(72, 201, 176));
        pnl2.setLayout(new GridLayout(10,1,2,2));
        
        //pnl1.setBackground(new Color(72, 201, 176));
        JLabel backgroundimg=new JLabel(new ImageIcon("C:\\Users\\justine\\Desktop\\logos\\jepreybols.png"));
        backgroundimg.setPreferredSize(new Dimension(200,300));
        pnl1.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl1.add(backgroundimg);
        
        pnl1.add(pnl2);
        
        add(pnl1,BorderLayout.NORTH);
        
       
        del.setForeground(Color.WHITE);
        del.setBackground(new Color(33, 118, 42));
        add(del,BorderLayout.WEST);
        del.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(del))
        {
            JOptionPane.showMessageDialog(null, "OK, Stocks are being Delivered","NOTICE",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) 
    {
        Details12 D12= new Details12();
        D12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}
