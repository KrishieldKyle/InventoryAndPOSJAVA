
package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class personalClass extends JFrame implements ActionListener
{
    
    JButton cancel = new JButton("CANCEL");
    JButton update = new JButton("UPDATE");
    JPanel panelS= new JPanel();
    JTextField fulltxt1 = new JTextField();
    JTextField fulltxt2 = new JTextField();
    JTextField fulltxt3 = new JTextField();
    JLabel fullLabel = new JLabel("Full Name: ");
    JLabel namespace = new JLabel("First Name");
    JLabel midspace = new JLabel("Middle Name");
    JLabel surspace = new JLabel("Surname");
    JPanel mainpanel = new JPanel();
    JPanel fullpanel = new JPanel();
    JPanel spacepanel = new JPanel();
    JPanel secspacePanel = new JPanel();
    JPanel secPanel = new JPanel();
    JTextField conttxt = new JTextField();
    JTextField addtxt = new JTextField();
    String grplist[] = new String []{"Group #","G1","G2"};
    String list[]= new String []{"Course", "ACT 1A","ACT 1B","ACT 1C","ACT 1D","ACT 1E","ACT 1F","ACT 1G","ACT 1H","ACT 1I","ACT 1J","ACT 1K","ACT 1L","ACT 1M","ACT 1N","ACT 1O","ACT 1P",
        "ACT 1Q","ACT 1R","ACT 1S","ACT 1T","ACT 2A","ACT 2B","ACT 2C","ACT 2D","ACT 2E","ACT 2F","ACT 2G","ACT 2H","ACT 2I","ACT 2J","ACT 2K","ACT 2L","ACT 2M","ACT 2N","ACT 2O","ACT 2P",
        "ACT 2Q","ACT 2R","ACT 2S","ACT 2T"};
    JComboBox sectxt1 = new JComboBox(list);
    JComboBox sectxt2 = new JComboBox(grplist);
    JLabel secspace = new JLabel("                            ");
    JLabel yearspace = new JLabel("      ");
    JLabel actspace = new JLabel("           ");
    JLabel contLabel = new JLabel("Contact Number: ");
    JLabel addLabel = new JLabel("Address: ");
    JLabel genderLabel = new JLabel("Gender: ");
    JLabel secLabel = new JLabel("Course, Year and Section: ");
    JPanel genderPanel = new JPanel();
    JRadioButton malerdo = new JRadioButton("Male");
    JRadioButton femalerdo = new JRadioButton("Female");
    JPanel panelW = new JPanel();
    
    int gendermarker=1;

    personalClass()
    {
        setVisible(true);
        setTitle("EDIT PERSONAL");
        setLocationRelativeTo(null);
        setSize(550,300);
        
        
       fulltxt1.setText(SignIn.strfulltxt1);
       fulltxt2.setText(SignIn.strfulltxt2);
       fulltxt3.setText(SignIn.strfulltxt3);
       sectxt1.setSelectedIndex(SignIn.intsection);
       sectxt2.setSelectedIndex(SignIn.intgroup);
       addtxt.setText(SignIn.storedAdd[SignIn.copyX]);
       conttxt.setText(SignIn.storedCont[SignIn.copyX]);
       if(SignIn.gender[SignIn.copyX].equals("Male"))
       {
           malerdo.setSelected(true);
       }
       else
       {
            femalerdo.setSelected(true);
       }
       
        mainpanel.setLayout(new GridLayout(7,2));
        fullpanel.setLayout(new GridLayout(1,3));
        spacepanel.setLayout(new GridLayout(1,3));
        secspacePanel.setLayout(new GridLayout(1, 2, 10, 10));
        secPanel.setLayout(new GridLayout(1, 2, 10, 0));
        
        update.setBackground(Color.DARK_GRAY);
        update.setForeground(Color.white);
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.white);
        
        mainpanel.add(new JLabel("               "));
        mainpanel.add(fullpanel);
            fullpanel.add(namespace);
            fullpanel.add(midspace);
            fullpanel.add(surspace);
        mainpanel.add(fullLabel);
        mainpanel.add(spacepanel);
            spacepanel.add(fulltxt1);
            spacepanel.add(fulltxt2);
            spacepanel.add(fulltxt3);
        mainpanel.add(secspace);
        mainpanel.add(secspacePanel);
            secspacePanel.add(yearspace);
            secspacePanel.add(actspace);
        mainpanel.add(secLabel);
        mainpanel.add(secPanel);
            secPanel.add(sectxt1);
            secPanel.add(sectxt2);
        mainpanel.add(contLabel);
        mainpanel.add(conttxt);
        mainpanel.add(addLabel);
        mainpanel.add(addtxt);
        mainpanel.add(genderLabel);
        mainpanel.add(genderPanel);
            genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
            genderPanel.add(malerdo);
            genderPanel.add(femalerdo);
                ButtonGroup grp = new ButtonGroup();
                grp.add(malerdo);
                grp.add(femalerdo);
        panelS.add(update);
        panelS.add(cancel);
        panelW.add(new JLabel("        "));
        
       
        
            
        
        add(mainpanel);
        add(panelS, BorderLayout.SOUTH);
        add(panelW, BorderLayout.WEST);
        
        
        
        cancel.addActionListener(this);
        update.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object src = new Object();
        src = e.getSource();
        if(src.equals(update))
        {
            int male=0,female=0;
            if(malerdo.isSelected())
                {
                    gendermarker=0;
                    male=1;
                }
                else if(femalerdo.isSelected())
                {
                    gendermarker=0;
                    female=1;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT YOUR GENDER!");
                    gendermarker=1;
                    
                }
            if(gendermarker==0)
            {
            if(fulltxt1.getText().isEmpty() || fulltxt2.getText().isEmpty() || fulltxt3.getText().isEmpty() || sectxt1.getSelectedItem().equals("Course") 
                    || sectxt2.getSelectedItem().equals("Section") || addtxt.getText().isEmpty() || conttxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "PLEASE DONT LEAVE A BLANK FIELD!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "YOUR PERSONAL INFORMATION HAS BEEN UPDATED!");
                SignIn.storedfullName[SignIn.copyX]=fulltxt1.getText()+" "+fulltxt2.getText()+" "+fulltxt3.getText();
                SignIn.storedAdd[SignIn.copyX]=addtxt.getText();
                SignIn.storedCourse[SignIn.copyX]=sectxt1.getSelectedItem()+""+"-"+sectxt2.getSelectedItem()+"";
                SignIn.storedCont[SignIn.copyX]=conttxt.getText();
                if(male==1)
                {
                    SignIn.gender[SignIn.copyX]=malerdo.getText();
                    male=0;
                }
                else if(female==1)
                {
                    SignIn.gender[SignIn.copyX]=femalerdo.getText();
                    female=0;
                }
                PROJECT_SWING swing = new PROJECT_SWING();
                swing.dispose();
                swing.setVisible(true);
                dispose();
            }
            }//gendermarker
        }
        else if(src.equals(cancel))
        {
           int x = JOptionPane.showConfirmDialog(null, "Are you Sure?", "BACK", JOptionPane.YES_NO_OPTION);
            if(x==0)
            {
                dispose();
                EditProfile edit = new EditProfile();
                edit.setVisible(true);
            }
        }
    }//action
    public void itemStateChanged(ItemEvent e)
    {
        Object src = new Object();
        src = e.getSource();
              for(int x=0; x<100; x++)
              {   
                  if(malerdo.isSelected() && SignIn.storeduserName[x]==null)
                  {
                      SignIn.gender[x]=malerdo.getText();
                      break;
                  }
                  else if(femalerdo.isSelected() && SignIn.storeduserName[x]==null)
                  {
                      SignIn.gender[x]=femalerdo.getText();
                      break;
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "PLEASE SELECT YOUR GENDER!!");
                  }
              }
    }//itemState
    
    
    public static void main(String[] args) {
     personalClass personalclass = new personalClass();
     personalclass.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     
     
    }
    
}
