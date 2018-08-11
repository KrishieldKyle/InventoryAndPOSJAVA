/*package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Cart extends JFrame
{
    JLabel books [] = new JLabel[PROJECT_SWING.bookctr];
    JButton minus[] = new JButton[PROJECT_SWING.bookctr];
    JTextField txt [] = new JTextField[PROJECT_SWING.bookctr];
    JButton plus [] = new JButton[PROJECT_SWING.bookctr];
    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
  
    Cart()
    {
        setSize(700,700);
        setTitle("Know the Basics");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
         
        
        
        pnl1.setBackground(Color.yellow);
        pnl2.setBackground(Color.DARK_GRAY);
        for(int v=1; v<PROJECT_SWING.CTR; v++)
        {
           
            pnl1.add(PROJECT_SWING.cart[v]);
            //pnl1.add(new JLabel("    "));
            pnl2.add(minus[v]= new JButton("-"));
            pnl2.add(txt[v]= new JTextField(3));
            pnl2.add(plus[v]= new JButton("+"));
            pnl2.add(new JLabel("                                                                    "));
            pnl2.setLayout(new GridLayout(PROJECT_SWING.bookctr,9,3,3));
            pnl2.setLayout(new FlowLayout(FlowLayout.LEFT));
            //pnl1.add(PROJECT_SWING.qty[v]);
        }
        
        
        
        
       pnl1.setLayout(new GridLayout(PROJECT_SWING.bookctr,1));
       // pnl1.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(pnl1);
        add(pnl2);
        
        setLayout(new GridLayout(1,2,5,5));
    }
    public static void main(String[] args)
    {
        Cart c = new Cart();
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}*/
