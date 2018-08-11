
package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class username extends JFrame implements ActionListener
{
    JPanel panelN = new JPanel();
    JLabel your = new JLabel();
    JLabel usernameLabel = new JLabel("Enter new User Name: ");
    JTextField usertxt = new JTextField(20);
    JPanel mainpanel = new JPanel();
    JPanel panelS = new JPanel();
    JButton cancel = new JButton("CANCEL");
    JButton update = new JButton("UPDATE");
    
    int usermarker=1;
    
    public static String cpyCopy;
    username()
    {
        
       cpyCopy=SignIn.storeduserName[SignIn.copyX];
        
        
        setSize(450,200);
        setVisible(true);
        setTitle("Edit User Name");
        setLocationRelativeTo(null);
        panelN.add(your);
        your.setText("Your Current User Name: "+cpyCopy);
        mainpanel.add(new JLabel("                                                                                                                                                                                                                                                  "));
        mainpanel.add(usernameLabel);
        mainpanel.add(usertxt);
        
        panelS.add(update);
        panelS.add(cancel);
        
        update.setBackground(Color.DARK_GRAY);
        update.setForeground(Color.white);
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.white);
        
        add(panelN, BorderLayout.NORTH);
        add(mainpanel, BorderLayout.CENTER);
        add(panelS, BorderLayout.SOUTH);
        
        panelN.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        cancel.addActionListener(this);
        update.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        Object src = new Object();
        src = e.getSource();
        
        if(src.equals(update))
        {
            for(int x=0; x<100; x++)
            {
                if(usertxt.getText().equals(SignIn.storeduserName[x]))
                {
                    JOptionPane.showMessageDialog(null, "User Name Already Taken");
                    usermarker=1;
                    break;
                }
                else if(usertxt.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Fill up the Field");
                    usermarker=1;
                    break;
                }
                else
                {
                    usermarker=0;
                }
            }
            if(usermarker==0)
            {
                SignIn.storeduserName[SignIn.copyX]=usertxt.getText();
                JOptionPane.showMessageDialog(null, "User Name UPDATED!");
                //JOptionPane.showMessageDialog(null, "NEED TO LOGOUT TO SEE CHANGES!");
                PROJECT_SWING.username=usertxt.getText();
                PROJECT_SWING swing = new PROJECT_SWING();
                swing.dispose();
                swing.setVisible(true);
                dispose();
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
        username user = new username();
        
        
        
    }
}
