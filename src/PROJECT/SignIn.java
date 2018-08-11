
package PROJECT;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.UIManager.LookAndFeelInfo;
//user: admin   pass: admin
public class SignIn extends JFrame implements ActionListener, ItemListener
{ 
    //J's
    JPanel inputPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JPanel txtPanel = new JPanel();
    JTextField nametxt = new JTextField();
    JPasswordField txtPass = new JPasswordField();
    JLabel mainLabel = new JLabel("ACT BOOK STORE");
    JLabel userLabel = new JLabel("User Name");
    JLabel passwordLabel = new JLabel("Pass word");
    //regisvars
    JLabel regLabel = new JLabel("                     ");
    JLabel reguserLabel = new JLabel("Enter User Name: ");
    JLabel regpassLabel = new JLabel("Enter PassWord: ");
    JLabel repassLabel = new JLabel("Re-Enter PassWord: ");
    JLabel contLabel = new JLabel("Contact Number: ");
    JLabel addLabel = new JLabel("Address: ");
    JLabel genderLabel = new JLabel("Gender: ");
    JLabel fullLabel = new JLabel("Full Name: ");
    JLabel cutLabel1 = new JLabel("                            ");
    JLabel cutLabel2 = new JLabel("                            ");
    JLabel secLabel = new JLabel("Course, Year and Section: ");
    JLabel fullspace = new JLabel("                            ");
    JLabel namespace = new JLabel("First Name");
    JLabel midspace = new JLabel("Middle Name");
    JLabel surspace = new JLabel("Surname");
    JLabel secspace = new JLabel("                            ");
    JLabel yearspace = new JLabel("      ");
    JLabel actspace = new JLabel("           ");
    JRadioButton malerdo = new JRadioButton("Male");
    JRadioButton femalerdo = new JRadioButton("Female");
    ImageIcon regiimg = new ImageIcon("PROJECT\\register.png");
    JButton regibtn = new JButton("REGISTER",regiimg);
    ImageIcon signimg = new ImageIcon("PROJECT\\icon-login.png");
    JButton signbtn = new JButton("SIGN IN",signimg);
    JTextField usertxt = new JTextField();
    JTextField conttxt = new JTextField();
    JTextField addtxt = new JTextField();
    JTextField fulltxt1 = new JTextField();
    JTextField fulltxt2 = new JTextField();
    JTextField fulltxt3 = new JTextField();
    String grplist[] = new String []{"Group #","G1","G2"};
    String list[]= new String []{"Course", "ACT 1A","ACT 1B","ACT 1C","ACT 1D","ACT 1E","ACT 1F","ACT 1G","ACT 1H","ACT 1I","ACT 1J","ACT 1K","ACT 1L","ACT 1M","ACT 1N","ACT 1O","ACT 1P",
        "ACT 1Q","ACT 1R","ACT 1S","ACT 1T","ACT 2A","ACT 2B","ACT 2C","ACT 2D","ACT 2E","ACT 2F","ACT 2G","ACT 2H","ACT 2I","ACT 2J","ACT 2K","ACT 2L","ACT 2M","ACT 2N","ACT 2O","ACT 2P",
        "ACT 2Q","ACT 2R","ACT 2S","ACT 2T"};
    JComboBox sectxt1 = new JComboBox(list);
    JComboBox sectxt2 = new JComboBox(grplist);
    JPasswordField passtxt = new JPasswordField();
    JPasswordField repasstxt = new JPasswordField();
    JPanel genderPanel = new JPanel();
    JPanel regPanel = new JPanel();
    JPanel fillPanel = new JPanel();
    JPanel fullPanel = new JPanel();
    JPanel cutPanel = new JPanel();
    JPanel secPanel = new JPanel();
    JPanel spacePanel = new JPanel();
    JPanel secspacePanel = new JPanel();
    JPanel rebtnPanel = new JPanel();
    JPanel signPanel = new JPanel();
    JPanel marginPanelwest = new JPanel();
    JPanel marginPaneleast = new JPanel();
    JPanel marginPanelsouth = new JPanel();
    JPanel fillPanelwest = new JPanel();
    JPanel regPanelNorth = new JPanel();
    JPanel back = new JPanel();
    JPanel banner = new JPanel();
    JPanel mainInputPanel = new JPanel();
    JLabel backLabel = new JLabel(new ImageIcon("PROJECT\\banner3.png"));
    JLabel backlogo = new JLabel(new ImageIcon("PROJECT\\logo.png"));
    //vars
    public static String storeduserName[]= new String[100];
    public static String storedpassWord []= new String[100];
    public static String storedfullName []= new String [100];
    public static String storedCourse []= new String[100];
    public static String storedCont[]= new String [100];
    public static String storedAdd [] = new String [100];
    public static String gender[]= new String[100];
    public static String strfulltxt1="";
    public static String strfulltxt2="";
    public static String strfulltxt3="";
    public static int marker=1,passmarker=1,ifnullmarker=1,gendermarker=1,sectionmarker=1, copyX=0, intsection=0, intgroup=0;
    public static int done=1;
    int attctr=0;
    SignIn()
    {
        setSize(1100, 700);
        setTitle("WELCOME TO ACT BOOK STORE");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        mainPanel.setLayout(new GridLayout(1, 2, 20, 20));
        inputPanel.setLayout(new GridLayout(2, 3,20,0));
        txtPanel.setLayout(new GridLayout(1, 3, 10, 10));
        fillPanel.setLayout(new GridLayout(13, 3, 10, 10));
        mainInputPanel.setLayout(new GridLayout(1, 1, 10, 10));
        fillPanel.setBorder(new TitledBorder("CREATE AN ACCOUNT"));
        inputPanel.setBorder(new TitledBorder("SIGN IN"));
        banner.setBorder(new TitledBorder("     "));
        fullPanel.setLayout(new GridLayout(1, 3, 10, 0));
        spacePanel.setLayout(new GridLayout(1, 3, 10, 0));
        secspacePanel.setLayout(new GridLayout(1, 2, 10, 10));
        secPanel.setLayout(new GridLayout(1, 2, 10, 0));
        back.setBackground(Color.gray);
        signbtn.setBackground(Color.DARK_GRAY);
        signbtn.setForeground(Color.white);
        regibtn.setBackground(Color.DARK_GRAY);
        regibtn.setForeground(Color.white);
        
        
        mainInputPanel.add(banner);
            banner.add(backLabel);
        mainInputPanel.add(inputPanel);
        inputPanel.add(userLabel);
        inputPanel.add(passwordLabel);
        inputPanel.add(new JLabel("                   "));
        inputPanel.add(nametxt);
        inputPanel.add(txtPass);
        inputPanel.add(signbtn);
        mainPanel.add(back);
            back.add(backlogo);
        mainPanel.add(fillPanel);
            fillPanel.add(new JLabel("               "));
            fillPanel.add(regPanelNorth,BorderLayout.NORTH);
            fillPanel.add(reguserLabel);
            fillPanel.add(usertxt);
            fillPanel.add(regpassLabel);
            fillPanel.add(passtxt);
            fillPanel.add(repassLabel);
            fillPanel.add(repasstxt);
            fillPanel.add(cutLabel1);
            fillPanel.add(cutLabel2);
            fillPanel.add(fullspace);
            fillPanel.add(spacePanel);
                spacePanel.add(namespace);
                spacePanel.add(midspace);
                spacePanel.add(surspace);
            fillPanel.add(fullLabel);
            fillPanel.add(fullPanel);
                fullPanel.add(fulltxt1);
                fullPanel.add(fulltxt2);
                fullPanel.add(fulltxt3);
            fillPanel.add(secspace);
            fillPanel.add(secspacePanel);
                secspacePanel.add(yearspace);
                secspacePanel.add(actspace);
            fillPanel.add(secLabel);
            fillPanel.add(secPanel);
                secPanel.add(sectxt1);
                secPanel.add(sectxt2);
            fillPanel.add(contLabel);
            fillPanel.add(conttxt);
            fillPanel.add(addLabel);
            fillPanel.add(addtxt);
            fillPanel.add(genderLabel);
            fillPanel.add(genderPanel);
                genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                genderPanel.add(malerdo);
                genderPanel.add(femalerdo);
                ButtonGroup grp = new ButtonGroup();
                grp.add(malerdo);
                grp.add(femalerdo);
            fillPanel.add(new JLabel("                          "));
            fillPanel.add(regibtn);
            marginPaneleast.add(new JLabel(" "));
            marginPanelwest.add(new JLabel(" "));
            marginPanelsouth.add(new JLabel(" "));
        
        
        
        add(mainPanel);
        add(mainInputPanel,BorderLayout.NORTH);
        add(marginPaneleast,BorderLayout.EAST);
        add(marginPanelwest,BorderLayout.WEST);
        add(marginPanelsouth,BorderLayout.SOUTH);
        
        signbtn.addActionListener(this);
        regibtn.addActionListener(this);
        regibtn.addItemListener(this);
        
    }//sign
    
    public void actionPerformed(ActionEvent e) {
        Object src = new Object();
        src = e.getSource();
        
        storeduserName[0]="admin";
        storedpassWord[0]="admin";
        storedfullName[0]="admin";
        storedCourse[0]="admin";
        storedCont[0]="admin";
        storedAdd[0]="admin";
        gender[0]="admin";
        if(src.equals(regibtn))
        {
            String pass = passtxt.getText();
            String repass = repasstxt.getText();
            String inputuser = usertxt.getText();
            String fullname = fulltxt1.getText() + " " +fulltxt2.getText()+" "+fulltxt3.getText();
            String section = sectxt1.getSelectedItem() + "";
            String group = sectxt2.getSelectedItem()+"";
            String contact = conttxt.getText();
            String address = addtxt.getText();
            
                if(section.equals("Course") || group.equals("Group #") )
                {
                    JOptionPane.showMessageDialog(null, "Please Fill Up All the Fields");
                    secLabel.setForeground(Color.red);
                    sectionmarker=1;
                }
                else
                {
                    sectionmarker=0;
                    secLabel.setForeground(Color.black);
                }
            if(pass.equals(repass))
            {
               regpassLabel.setForeground(Color.black);
               repassLabel.setForeground(Color.black);
               passmarker=0;
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Make Sure That Passwords are the same");
               regpassLabel.setForeground(Color.red);
               repassLabel.setForeground(Color.red);
               passmarker=1;
            }
            for(int x=0; x<100; x++)
                {
                    if(inputuser.equalsIgnoreCase(storeduserName[x]))
                    {
                        if(inputuser.equalsIgnoreCase("admin"))
                        {
                            JOptionPane.showMessageDialog(null, "Cannot use ADMIN as a user name!");
                            marker=1;
                            break;
                        }
                        else
                        {
                        JOptionPane.showMessageDialog(null, "User Name already taken");
                        reguserLabel.setForeground(Color.red);
                        marker=1;
                        break;
                        }
                    }
                    else
                    {
                        reguserLabel.setForeground(Color.black);
                        marker=0;
                    }
                }//forx
            if(sectionmarker==0)
            {
            if(usertxt.getText().isEmpty() || passtxt.getText().isEmpty() || repasstxt.getText().isEmpty() || fulltxt1.getText().isEmpty() || fulltxt2.getText().isEmpty() ||
                    fulltxt3.getText().isEmpty() ||  conttxt.getText().isEmpty() || addtxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Fill Up All the Fields");
                ifnullmarker=1;
            }
            else 
            {
                ifnullmarker=0;
            }
            }
            //inputing userInputs
            if(marker==0 && passmarker==0 && ifnullmarker==0 && sectionmarker==0)
            {
                int male=0,female=0;
                for(int x=1; x<100; x++)
                {
                    gendermarker=1;
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
                        gendermarker=1;
                    }
                        if(storeduserName[x]==null && storedpassWord[x]==null && storedfullName[x]==null && storedCourse[x]==null &&
                            storedCont[x]==null && storedAdd[x]==null && gendermarker==0 && gender[x]==null)
                        {
                        storeduserName[x]=inputuser;
                        storedpassWord[x]=pass;
                        storedfullName[x]=fullname;
                        storedCourse[x]=section+"-"+group;
                        storedCont[x]=contact;
                        storedAdd[x]=address;
                        if(male==1)
                        {
                            gender[x]="Male";
                            male=0;
                        }
                        else if(female==1)
                        {
                            gender[x]="Female";
                            female=0;
                        }
                        strfulltxt1=fulltxt1.getText();
                        strfulltxt2=fulltxt2.getText();
                        strfulltxt3=fulltxt3.getText();
                        intsection = sectxt1.getSelectedIndex();
                        intgroup = sectxt2.getSelectedIndex();
                        JOptionPane.showMessageDialog(null, "REGISTERED. PLEASE SIGN IN, YOUR USERNAME IS " + storeduserName[x]);
                             //clearing 
                        passtxt.setText(null);
                        repasstxt.setText(null);
                        usertxt.setText(null);
                        fulltxt1.setText(null);
                        fulltxt2.setText(null);
                        fulltxt3.setText(null);
                        sectxt1.setSelectedIndex(0);
                        sectxt2.setSelectedIndex(0);
                        conttxt.setText(null);
                        addtxt.setText(null);
                        malerdo.setSelected(false);
                        femalerdo.setSelected(false);
                        marker=1;
                        passmarker=1;
                        ifnullmarker=1;
                        gendermarker=1;
                        sectionmarker=1;
                        break;
                        }
                        else if(gendermarker==1)
                        {
                            JOptionPane.showMessageDialog(null, "Please Select Your Gender");
                            gendermarker=1;
                            break;
                        }
                }//forx
            }//inputing
        }//regibtn
        if(src.equals(signbtn))
        {
            String input = nametxt.getText();
            String passinput = txtPass.getText();
            int signmarker=1;
            for(int x=0; x<100; x++)
            {
                    if(input.equals(storeduserName[x]) && passinput.equals(storedpassWord[x]))
                    {
                        if(x==0)
                        {
                            JOptionPane.showMessageDialog(null, "Admin signed in");
                             copyX=x;
                             signmarker=0;
                            nametxt.setText(null);
                            txtPass.setText(null);
                            admin proj = new admin();
                            proj.setVisible(true);
                            dispose();
                            proj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                            break;
                        }
                        else
                        {
                        copyX=x;
                        JOptionPane.showMessageDialog(null, "Thank you for Signing in");
                        signmarker=0;
                        nametxt.setText(null);
                        txtPass.setText(null);
                        PROJECT_SWING proj = new PROJECT_SWING();
                        proj.setVisible(true);
                        dispose();
                        proj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        break;
                        }
                    }
            }//for
            
          
            if(signmarker==1)
                    {
                        if(nametxt.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill up the Fields");
                        }
                        else
                        {
                            attctr++;
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password   \n Login Attemp: "+attctr);
                        }
                    }
            if(attctr==3)
            {
                JOptionPane.showMessageDialog(null, "You got 3 wrong attemps.. \n\n PROGRAM CLOSE");
                System.exit(0);
            }
        }//signbtn
    }//actionlistener
    public void itemStateChanged(ItemEvent e)
    {
        Object src = new Object();
        src = e.getSource();
              for(int x=0; x<100; x++)
              {   
                  if(malerdo.isSelected() && storeduserName[x]==null)
                  {
                      gender[x]=malerdo.getText();
                      break;
                  }
                  else if(femalerdo.isSelected() && storeduserName[x]==null)
                  {
                      gender[x]=femalerdo.getText();
                      break;
                  }
              }
    }//itemState
    public static void main(String[] args) {
        
                
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Thread.sleep(4000);
                }
                catch(Exception e)
                {
                }
                new SignIn().setVisible(true);
                
            }
        });
    }//main
}//class
