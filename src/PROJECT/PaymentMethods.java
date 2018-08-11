
package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PaymentMethods extends JFrame //implements ActionListener
{
    
    PaymentMethods()
    {
        setSize(565, 320);
        setTitle("Payment Methods");  
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        
        JPanel Main = new JPanel();
        Main.setBackground(new Color(33, 33, 33));
        
        JLabel lbl1 = new JLabel ("CASH:                                                                                  ");
        JLabel lbl2 = new JLabel ("  Must pay the total bill upon checking out.                                                                   ");
        JLabel lbl3 = new JLabel ("INSTALLMENT:                                                                                                 ");
        JLabel lbl4 = new JLabel ("  First Installment:       Pay 60% of the total bill.                          ");
        JLabel lbl5 = new JLabel ("  Second Installment:   Pay the remaining balance.                                                                                           ");
        JLabel lbl6 = new JLabel ("NOTE:                                                                             ");
        JLabel lbl7 = new JLabel (" A 5% discount is applicable to those who bought at least three(3) books and pays                                      ");
        JLabel lbl8 = new JLabel (" via cash.                                                                                   ");
        Font font1 = new Font("Tahoma",Font.PLAIN,15); 
        Font font2 = new Font("Tahoma",Font.BOLD,16);
        lbl1.setFont(font2);
        lbl3.setFont(font2);
        lbl6.setFont(font2);
        lbl2.setFont(font1);
        lbl4.setFont(font1);
        lbl5.setFont(font1);
        lbl7.setFont(font1);
        lbl8.setFont(font1);
        
        lbl1.setForeground(Color.white);
        lbl2.setForeground(Color.white);
        lbl3.setForeground(Color.white);
        lbl4.setForeground(Color.white);
        lbl5.setForeground(Color.white);
        lbl6.setForeground(Color.white);
        lbl7.setForeground(Color.white);
        lbl8.setForeground(Color.white);
        
        Main.add(lbl1);
        Main.add(lbl2);
        Main.add(lbl3);
        Main.add(lbl4);
        Main.add(lbl5);
        Main.add(lbl6);
        Main.add(lbl7);
        Main.add(lbl8);
        
        JLabel backgroundimg=new JLabel(new ImageIcon("java.png"));
        backgroundimg.setPreferredSize(new Dimension(100,100));
        Main.add(backgroundimg);
        
        Main.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(Main);
        
    }
    public static void main(String[] args) 
    {
        PaymentMethods PM= new PaymentMethods();
        PM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}
