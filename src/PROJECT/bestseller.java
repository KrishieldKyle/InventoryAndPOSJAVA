/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Justine
 */
public class bestseller extends JFrame //implements ActionListener
{

    public static int sell[]= new int[PROJECT_SWING.bookctr];
    int high[]=new int [PROJECT_SWING.bookctr];
    int low[]=new int [PROJECT_SWING.bookctr];
    int H=0, L=100;
    JPanel bestP = new JPanel();
    JPanel leastP = new JPanel();
    
    bestseller() 
    {
        setSize(500, 470);
        setTitle("Best & Least");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
       
        bestP.setPreferredSize(new Dimension(240,435));
        leastP.setPreferredSize(new Dimension(240,435));
        
        bestP.setBorder(new TitledBorder("Best Seller/s:"));
        leastP.setBorder(new TitledBorder("Least Seller/s:"));
        
        for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
            if(sell[x]>H)
            {
                H=sell[x];
            }
            if(sell[x]<L)
            {
                L=sell[x];
            }
        }
        for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
            if(H==sell[x])
            {
                bestP.add(new JLabel(H+" pcs.  "+PROJECT_SWING.Codes[x]+"  "+PROJECT_SWING.books[x]));
            }
            if(L==sell[x])
            {
                leastP.add(new JLabel(L+" pcs.  "+PROJECT_SWING.Codes[x]+"  "+PROJECT_SWING.books[x]));
            }
        }
       //bestP.setBackground(Color.yellow);
       //leastP.setBackground(Color.CYAN);
       
       bestP.setLayout(new GridLayout(PROJECT_SWING.bookctr,1));
       leastP.setLayout(new GridLayout(PROJECT_SWING.bookctr,1));
       
       add(bestP);
       add(leastP);
       
       
       
       setLayout(new FlowLayout(FlowLayout.LEFT));
   
     
    }

    public static void main(String[] args) {
        bestseller b = new bestseller();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
