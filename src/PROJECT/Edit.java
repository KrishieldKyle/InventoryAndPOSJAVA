
package PROJECT;
import static PROJECT.PROJECT_SWING.bookctr;
import static PROJECT.PROJECT_SWING.books;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Edit extends JFrame implements ActionListener 
{
    public static int editmarker=1, copymarker=-1;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3= new JPanel();
    JButton btn = new JButton("    Confirm    ");
    JButton btn2 = new JButton("       Clear       ");
    JButton btn3 = new JButton("       Cancel      ");
    JTextField editbook = new JTextField(28);
    JLabel lbl = new JLabel("Enter new name of the book: ");
    public static String cpy="";
    //JLabel first = new JLabel("P220   (1st Yr.)    ACT 113     ");
   
    Edit()
    {
        setSize(355, 160);
        setTitle("");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        //cpy=first.getText();
        panel1.add(panel2);
        panel2.add(panel3);
        panel2.setPreferredSize(new Dimension(190,130));
        panel2.setBorder(new TitledBorder("Edit name of Book"));
        
        panel2.add(lbl);
        
        panel2.add(editbook);
    
        panel2.add(btn);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.setLayout(new GridLayout(1,1,20,20));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panel1);
        add(panel2,BorderLayout.NORTH);
        add(panel3,BorderLayout.CENTER);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) 
    {
        Object src = new Object();
        src = e.getSource();
        
        if(src.equals(btn))
        {   
           
                cpy = editbook.getText();
                
                if(cpy.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Make sure you enter a title!", "title", JOptionPane.INFORMATION_MESSAGE);
                    editmarker=1;
                }
                else
                {
                    
                    PROJECT_SWING.books[admin.editX]=cpy;
                    editmarker=0;
                    copymarker=admin.editX;
                    dispose();
                    JOptionPane.showMessageDialog(null,"Log-in again to save your changes","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                }
            
        }
        if(src.equals(btn2))
        {
            editbook.setText("");
        }
        
        if(src.equals(btn3))
        {
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel editing?", "Cancel", JOptionPane.YES_NO_OPTION, WIDTH);
            if(x==0)
            {
                dispose();
            }
        }
    }
    public static void main(String[] args) 
    {
        Edit proj = new Edit();
    }
}


