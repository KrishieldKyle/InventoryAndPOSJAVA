package PROJECT;

import javax.swing.*;
import java.awt.*;

public class johnbtn extends JFrame{
    
    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JLabel lbl1 = new JLabel("Krishield Kyle Santoyo");
    Font font = new Font("Calbiri",Font.BOLD,16);
    
    johnbtn()
    {
      setSize(230, 370);
      setTitle("This is me!");  
      setResizable(false);
      setVisible(true);
      setLocationRelativeTo(null); 
      
      JLabel picture = new JLabel(new ImageIcon("c.jpg"));
      picture.setPreferredSize(new Dimension(200,300));
      pnl1.setLayout(new FlowLayout(FlowLayout.CENTER));
      pnl1.add(picture);
      pnl1.add(lbl1);
      lbl1.setFont(font);
      lbl1.setForeground(Color.white);
      pnl1.setBackground(Color.black);
     
     add(pnl1);
                
    }
    
    public static void main(String[] args) {
     kylebtn me = new kylebtn();
    }
    
}
