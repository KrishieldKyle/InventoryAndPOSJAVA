
package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class AboutUs extends JFrame implements ActionListener
{
   
      ImageIcon img = new ImageIcon("user.png");
      JButton carlbtn = new JButton(img);
      JButton pntbtn = new JButton(img);
      JButton jrbtn = new JButton(img);
      JButton kylbtn = new JButton(img);
      

    AboutUs()
    {
        setSize(565, 370);
        setTitle("About Us");  
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        
        JPanel Main = new JPanel();
        Main.setBackground(new Color(33, 33, 33));
        
        JLabel lbl1 = new JLabel ("PRESENTED BY:                                                                                  ");
        JLabel lbl2 = new JLabel ("De Guzman,Carl Justine,M.    ACT 2I-G1           #-935538306         ");
        JLabel lbl3 = new JLabel ("Santoyo,Krishield Kyle           ACT 2I-G1           #-9061036901         ");
        JLabel lbl4 = new JLabel ("Reyes,John Raineal              ACT 2I-G1           #-9258086427       ");
        JLabel lbl5 = new JLabel ("Ponti,Carlo,Jesus                 ACT 21-G1           #-1234567890");
        JLabel lbl6 = new JLabel ("PRESENTED TO:                                                                              ");
        JLabel lbl7 = new JLabel ("   Evelyn C. Samson                                                         ");
        JLabel lbl8 = new JLabel ("     INSTRUCTOR                                                                               ");
        Font font1 = new Font("Tahoma",Font.PLAIN,15);
        Font font2 = new Font("Tahoma",Font.BOLD,16);
        
        
        lbl1.setFont(font2);
        lbl6.setFont(font2);
        lbl2.setFont(font1);
        lbl3.setFont(font1);
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
        
        carlbtn.setFont(font2);
        kylbtn.setFont(font2);
        jrbtn.setFont(font2);
        pntbtn.setFont(font2);
        
        carlbtn.setPreferredSize(new Dimension (50, 30));
        kylbtn.setPreferredSize(new Dimension (50, 30));
        jrbtn.setPreferredSize(new Dimension (50, 30));
        pntbtn.setPreferredSize(new Dimension (50, 30));
        
       
        Main.add(lbl1);
        Main.add(carlbtn);
        Main.add(lbl2);
        Main.add(kylbtn);
        Main.add(lbl3);
        Main.add(jrbtn);
        Main.add(lbl4);
        Main.add(pntbtn);
        Main.add(lbl5);
        
 
        Main.add(lbl6);
        Main.add(lbl7);
        Main.add(lbl8);
       
        JLabel backgroundimg=new JLabel(new ImageIcon("java.png"));
        backgroundimg.setPreferredSize(new Dimension(100,100));
        Main.add(backgroundimg);
        
        Main.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(Main);
        
       carlbtn.addActionListener(this);
       kylbtn.addActionListener(this);
       jrbtn.addActionListener(this);
       pntbtn.addActionListener(this);
        
    }
     public void actionPerformed(ActionEvent e)
    {
      Object src = new Object();
        src = e.getSource();
        
      
        if(src.equals(carlbtn))
        {
         crlbtn me = new crlbtn();
         me.setVisible(true);
        }
                
        if(src.equals(kylbtn))
        {
         kylebtn me = new kylebtn();
         me.setVisible(true);
        }
        
        if(src.equals(jrbtn))
        {
         johnbtn me = new johnbtn();
         me.setVisible(true);
        }
        
        if(src.equals(pntbtn))
        {
          pntbtn me = new pntbtn();
          me.setVisible(true);
        }
       
    }
    public static void main(String[] args) 
    {
        AboutUs au= new AboutUs();
        au.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
