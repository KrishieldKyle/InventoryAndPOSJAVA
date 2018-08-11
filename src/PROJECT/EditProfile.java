package PROJECT;

import static PROJECT.PROJECT_SWING.dp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
    

public class EditProfile extends JFrame implements ActionListener, ItemListener
{
    JButton personal = new JButton("PERSONAL");
    JButton password = new JButton("PASSWORD");
    JButton username = new JButton("USERNAME");
    JButton delete = new JButton("Deactivate");
    JButton back = new JButton("BACK");
    JPanel mainpanelS = new JPanel();
    JPanel Npanel = new JPanel();
    JPanel Spanel = new JPanel();
    JPanel Epanel = new JPanel();
    JPanel Wpanel = new JPanel();
    JPanel UserImage = new JPanel();
    JPanel Panel1 = new JPanel();
    JPanel Panel2 = new JPanel();
    JPanel Panel3 = new JPanel();
    JPanel Panel4 = new JPanel();
    JPanel Panel5 = new JPanel();
    JPanel Panel6 = new JPanel();
    JPanel Panel7 = new JPanel();
    JPanel Panel8 = new JPanel();
    JPanel imgsouth = new JPanel();
    JButton browse = new JButton("Browse");
    JPanel west = new JPanel();
    public static JLabel userIM=new JLabel(new ImageIcon("def.jpg"));
    public static String user_Name;
    public static String path="";
    
    
    
    EditProfile()
    {
        setSize(500,285);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Profile");
       
        user_Name = SignIn.storeduserName[SignIn.copyX];
        mainpanelS.add(Npanel);
        mainpanelS.add(Epanel);
        mainpanelS.add(Wpanel);
        Npanel.add(Spanel);
       delete.setBackground(Color.red);
       delete.setForeground(Color.white);
       userIM.setPreferredSize(new Dimension(100,100));
       UserImage.add(userIM);
       UserImage.setPreferredSize(new Dimension(100,100));
       mainpanelS.setLayout(new GridLayout(1,3,20,20));
       Npanel.setLayout(new GridLayout(1,2));
       
       Spanel.add(personal);
       Spanel.add(username);
       Spanel.add(password);
       String N = SignIn.storedfullName[SignIn.copyX];
       String S = SignIn.storedCourse[SignIn.copyX];
       String c = SignIn.storedCont[SignIn.copyX];
       String a = SignIn.storedAdd[SignIn.copyX];
       String g = SignIn.gender[SignIn.copyX];
       String i = "User Information:";
       Npanel.setBorder(new TitledBorder(i));
       Font font1 = new Font("Century Gothic",Font.BOLD,13);
        Color c1 = new Color(0,0,0);
        JLabel User = new JLabel("User Name: "); 
        User.setFont(font1);
        User.setForeground(c1);
        JLabel UserName = new JLabel(user_Name); 
        UserName.setFont(font1);
        UserName.setForeground(c1);
       Font font2 = new Font("Century Gothic",Font.BOLD,13);
        Color c2 = new Color(0,0,0);
        JLabel name = new JLabel("Name: ");
        name.setFont(font2);
        name.setForeground(c2);
        JLabel Name = new JLabel(N);
        Name.setFont(font2);
        Name.setForeground(c2);
        JLabel section = new JLabel("Section: ");
        section.setFont(font2);
        section.setForeground(c2);
        JLabel Section = new JLabel(S);
        Section.setFont(font2);
        Section.setForeground(c2);
        
        JLabel contact = new JLabel("Contact: ");
        contact.setFont(font2);
        contact.setForeground(c2);
        JLabel Contact = new JLabel(c);
        Contact.setFont(font2);
        Contact.setForeground(c2);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(font2);
        gender.setForeground(c2);
        JLabel Gender = new JLabel(g);
        //System.out.println(g);
        Gender.setFont(font2);
        Gender.setForeground(c2);
        
        JLabel add = new JLabel("Address: ");
        add.setFont(font2);
        add.setForeground(c2);
        JLabel Add = new JLabel(a);
        Add.setFont(font2);
        Add.setForeground(c2);
        west.setLayout(new FlowLayout(FlowLayout.LEFT));
        west.setPreferredSize(new Dimension(110,165));
        //west.setBackground(Color.red);
       browse.setPreferredSize(new Dimension(100,20)); 
       delete.setPreferredSize(new Dimension(100,20)); 
      //Npanel.add(UserImage);
       Npanel.add(west,BorderLayout.WEST);
       west.add(UserImage);
       west.add(browse);
       west.add(delete);
       //Npanel.add(browse);
       Panel1.add(User);
       Panel1.add(UserName);
       Panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        Panel2.add(name);
        Panel2.add(Name);
        Panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
    
        Panel4.add(section);
        Panel4.add(Section);
        Panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Panel6.add(contact);
        Panel6.add(Contact);
        Panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Panel7.add(add);
        Panel7.add(Add);
        Panel7.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Panel8.add(gender);
        Panel8.add(Gender);
        Panel8.setLayout(new FlowLayout(FlowLayout.LEFT));
        Panel5.add(Panel1);
        Panel5.add(Panel2);
        Panel5.add(Panel6);
        Panel5.add(Panel7);
        Panel5.add(Panel8);
        Panel5.add(Panel4);
        Panel5.setLayout(new GridLayout(6,1));
        
        Panel3.add(Panel5);
        Panel3.setLayout(new GridLayout(1,3));
        Npanel.add(Panel3);
       Spanel.add(back);
       back.setBackground(Color.red);
       back.setForeground(Color.white);
       personal.setBackground(Color.DARK_GRAY);
       password.setBackground(Color.DARK_GRAY);
       username.setBackground(Color.DARK_GRAY);
       personal.setForeground(Color.white);
       password.setForeground(Color.white);
       username.setForeground(Color.white);
       Epanel.add(new JLabel("    "));
       Wpanel.add(new JLabel("    "));
        
       
        
        add(mainpanelS);
        Npanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(Npanel,BorderLayout.NORTH);
        add(Spanel,BorderLayout.SOUTH);
        add(Epanel,BorderLayout.EAST);
        add(Wpanel,BorderLayout.WEST);
        
        
        personal.addActionListener(this);
        password.addActionListener(this);
        username.addActionListener(this);
        back.addActionListener(this);
        delete.addActionListener(this);
        browse.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            
                if(result == JFileChooser.APPROVE_OPTION)
                {
                File selectedFile = file.getSelectedFile();
                path = selectedFile.getAbsolutePath();
                userIM.setIcon(ResizeImage(path));
                PROJECT_SWING.dp=path;
                }
            }

            private Icon ResizeImage(String ImagePath) {
               
                ImageIcon MyImage = new ImageIcon(ImagePath);
                Image img = MyImage.getImage();
                Image newImg = img.getScaledInstance(userIM.getWidth(), userIM.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                return image;
            }

            
        });
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        Object src = new Object();
        src = e.getSource();
        
        
       
        
        if(src.equals(personal))
        {
            personalClass personalclass = new personalClass();
            personalclass.setVisible(true);
            personalclass.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            dispose();
        }
        else if(src.equals(password))
        {
            passwordClass passclass = new passwordClass();
            passclass.setVisible(true);
            passclass.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            dispose();
        }
        else if(src.equals(username))
        {
           username user = new username();
           user.setVisible(true);
           user.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
           dispose();
        }
        else if(src.equals(back))
        {
            dispose();
            PROJECT_SWING w = new PROJECT_SWING();
            w.setVisible(true);
        }
        else if(src.equals(delete))
        {
            int q =JOptionPane.showConfirmDialog(null, "Do you relly want to DEACTIVATE your account?", "DEACTIVATE", JOptionPane.YES_NO_OPTION);
            if(q==0)
            {
                SignIn.storeduserName[SignIn.copyX]=null;
                SignIn.storedpassWord[SignIn.copyX]=null;
                SignIn.storedAdd[SignIn.copyX]=null;
                SignIn.storedCont[SignIn.copyX]=null;
                SignIn.storedfullName[SignIn.copyX]=null;
                SignIn.gender[SignIn.copyX]=null;
                SignIn.storedCourse[SignIn.copyX]=null;
                dispose();
                SignIn w = new SignIn();
                w.setVisible(true);
                JOptionPane.showMessageDialog(null, "Your Account has been DEACTIVATED\nPlease Logout to see Changes");
            }
        }
        
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        Object src = new Object();
        src = e.getSource();
              
    }//itemState
    
    public static void main(String[] args) {
  
        EditProfile edit = new EditProfile();
        edit.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
