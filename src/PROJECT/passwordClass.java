
package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class passwordClass extends JFrame implements ActionListener
{
    
    JPasswordField curPasstxt = new JPasswordField();
    JPasswordField  passtxt= new JPasswordField();
    JPasswordField repasstxt = new JPasswordField();
    JLabel curLabel = new JLabel("Enter Current Password: ");
    JLabel passLabel = new JLabel("Enter New Password: ");
    JLabel repassLabel = new JLabel("Re-Enter New Password: ");
    JPanel mainpanel = new JPanel();
    JButton cancel = new JButton("CANCEL");
    JButton update = new JButton("UPDATE");
    JPanel panelS= new JPanel();
    JPanel Epanel = new JPanel();
    JPanel Wpanel = new JPanel();
    
    passwordClass()
    {
        setSize(420,200);
        setVisible(true);
        setTitle("Edit Password");
        setLocationRelativeTo(null);
        update.setBackground(Color.DARK_GRAY);
        update.setForeground(Color.white);
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.white);
        mainpanel.setLayout(new GridLayout(4,2));
        mainpanel.add(curLabel);
        mainpanel.add(curPasstxt);
        mainpanel.add(new JLabel("                       "));
        mainpanel.add(new JLabel("                       "));
        mainpanel.add(passLabel);
        mainpanel.add(passtxt);
        mainpanel.add(repassLabel);
        mainpanel.add(repasstxt);
        panelS.add(update);
        panelS.add(cancel);
        Epanel.add(new JLabel("    "));
       Wpanel.add(new JLabel("    "));
        
        
        
        add(mainpanel);
        add(panelS, BorderLayout.SOUTH);
        add(Epanel,BorderLayout.EAST);
        add(Wpanel,BorderLayout.WEST);
        
        cancel.addActionListener(this);
        update.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        
        Object src = new Object();
        src = e.getSource();
        
        
        if(src.equals(update))
        {
            
            if(SignIn.storedpassWord[SignIn.copyX].equals(curPasstxt.getText()))
            {
                if(passtxt.getText().isEmpty() && repasstxt.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR NEW PASSWORD!");
                }
                else
                {   
                    if(passtxt.getText().equals(repasstxt.getText()))
                    {
                        int y=0;
                        for(int x=0; x<100; x++)
                        {
                            if(passtxt.getText().equals(SignIn.storedpassWord[x]))
                            {
                                JOptionPane.showMessageDialog(null, "Please Enter NEW! password");
                                y=1;
                                break;
                            }
                        }
                        
                        if(y==0)
                        {
                            SignIn.storedpassWord[SignIn.copyX]=passtxt.getText();
                            JOptionPane.showMessageDialog(null, "PASSWORD UPDATED!");
                            PROJECT_SWING swing = new PROJECT_SWING();
                            swing.setVisible(true);
                            dispose();
                        }
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "MAKE SURE THAT THE PASSWORDS ARE THE SAME!");
                    }
                }
                
            }
            else if(curPasstxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter your CURRENT password", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                
                JOptionPane.showMessageDialog(null, "INVALID CURRENT PASSWORD!");
            }
            
            
            
            
        }
        else if(src.equals(cancel))
        {
           
                dispose();
                EditProfile edit = new EditProfile();
                edit.setVisible(true);
            
        }
        
      
    }
    
    public static void main(String[] args) {
        
        passwordClass passclass = new passwordClass();
        
        
    }
    
}
