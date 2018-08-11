
package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class admin extends JFrame implements ActionListener
{
        public static int in=0, editX=-1, deletemarker=0, create=0, pareho=0;
        public static int forMain[]= new int[PROJECT_SWING.bookctr];
        static String cpy="";
        static int qtyctr[] = new int[100];
        JPanel MainFrame = new JPanel();
        JPanel UserImage = new JPanel();
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();
        JPanel Panel6 = new JPanel();
        JPanel Panel7 = new JPanel();
        JPanel Panel9 = new JPanel();
        JPanel Panel10 = new JPanel();
        JPanel LeftBanner = new JPanel();
        JPanel CenterBanner = new JPanel();
        JPanel RightBanner = new JPanel();
        ImageIcon img1 = new ImageIcon("gear.png");
        JButton EditProfile = new JButton(img1);
        ImageIcon img2 = new ImageIcon("x.png");
        JButton LogOut = new JButton(img2);
        JButton Getting;
        JPanel ViewBooks = new JPanel();
        JPanel BookButtonP = new JPanel();
        JPanel BookButtonP2 = new JPanel();
        
        JButton Create = new JButton("Create");
       
        public static JLabel Books[] = new JLabel[100];
        public static String Codes[] = new String[100];
        JButton delete[] = new JButton[100];
        JButton edit[] = new JButton[100];
        JButton PaymentM;
        JButton ContactUs;
        JButton Exit;
        JRadioButton cash = new JRadioButton("CASH");
        JRadioButton install = new JRadioButton("PARTIAL");
        JPanel method = new JPanel();
        ButtonGroup met = new ButtonGroup();
        public static int bookCtr[]=new int[100];
       
        public static JButton minus[] = new JButton[PROJECT_SWING.bookctr];
        public static JTextField priceTxt[] = new JTextField[PROJECT_SWING.bookctr];
        public static JButton plus[] = new JButton[PROJECT_SWING.bookctr];
        
        public static int cartCtr[]= new int[100];
        
        public static String copyCtr[]= new String[100];
        
        public static JTextField quantity[]= new JTextField[100];
        
        JPanel qttyP= new JPanel();
        
        JPanel CenterPanel = new JPanel();
        JPanel TotalPanel = new JPanel();
        public static String username="";
        public static JLabel totallabel = new JLabel("(w/o Vat) Total Amount:   ");
        ImageIcon img3 = new ImageIcon("cart.png");
        JButton check = new JButton("Checkout",img3);
        public static JTextField realtotal = new JTextField(10);
        public static int totalqty[] = new int[100];
        public static String strMethod="";
        public static double total;
        public static double tot=0;
       admin()
       {
        setSize(1050,760);
        setTitle("ACT BOOKSTORE");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        
        met.add(cash);
        met.add(install);
        JLabel backgroundimg=new JLabel(new ImageIcon("bsulogo.png"));
        backgroundimg.setPreferredSize(new Dimension(100,100));
        Panel10.add(backgroundimg);
         Create.setPreferredSize(new Dimension(115,30));
        JLabel banner=new JLabel(new ImageIcon("actbookstore.png"));
        banner.setPreferredSize(new Dimension(800,90));
        Panel10.add(banner);
        
        JLabel backgroundimg2=new JLabel(new ImageIcon("CICT.png"));
        backgroundimg2.setPreferredSize(new Dimension(100,100));
        Panel10.add(backgroundimg2); 
        
        add(Panel10,BorderLayout.NORTH);
        
        String info = "USER INFO: ";
        Panel6.setPreferredSize(new Dimension(440,150));
        Panel6.setBorder(new TitledBorder(info));
        Panel1.setPreferredSize(new Dimension(300,20));
        username = SignIn.storeduserName[SignIn.copyX];
        Font font1 = new Font("Tahoma",Font.BOLD,15);
        Color c1 = new Color(0,0,0);
        JLabel User = new JLabel("User Name: "); 
        User.setFont(font1);
        User.setForeground(c1);
        JLabel UserName = new JLabel(username); 
        UserName.setFont(font1);
        UserName.setForeground(c1);
        
        String dp = "admin.gif";
        JLabel userIM=new JLabel(new ImageIcon(dp));
        userIM.setPreferredSize(new Dimension(100,100));
        UserImage.add(userIM); 
        //UserImage.setBackground(Color.gray);
        UserImage.setPreferredSize(new Dimension(100,100));
        Panel6.add(UserImage);
        Panel1.add(User);
        Panel1.add(UserName);
        Panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        String N = SignIn.storedfullName[SignIn.copyX];
        String S = SignIn.storedCourse[SignIn.copyX];
        Font font2 = new Font("Tahoma",Font.BOLD,13);
        Color c2 = new Color(0,0,0);
        JLabel name = new JLabel("Name:");
        name.setFont(font2);
        name.setForeground(c2);
        JLabel Name = new JLabel(N);
        Name.setFont(font2);
        Name.setForeground(c2);
        JLabel section = new JLabel("Section:");
        section.setFont(font2);
        section.setForeground(c2);
        JLabel Section = new JLabel(S);
        Section.setFont(font2);
        Section.setForeground(c2);
      
        Panel2.add(name);
        Panel2.add(Name);
        Panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
    
        Panel4.add(section);
        Panel4.add(Section);
        Panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Panel5.add(Panel2);
        Panel5.add(Panel4);
        Panel5.setLayout(new GridLayout(2,1));
        Panel3.add(Panel1);
        Panel3.add(Panel5);
        Panel3.setLayout(new GridLayout(2,1));
        Panel6.add(Panel3);
        
        MainFrame.add(Panel6);
        MainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        EditProfile.setPreferredSize(new Dimension(100,35));
        EditProfile.setBackground(Color.darkGray);
        LogOut.setBackground(new Color(183, 28, 28));
        EditProfile.setForeground(Color.DARK_GRAY);
        LogOut.setForeground(Color.WHITE);
        EditProfile.setFocusPainted(false);
        //EditProfile.setEnabled(false);
        LogOut.setFocusPainted(false);
        Panel9.add(EditProfile);
        Panel9.add(LogOut);
        Panel9.setLayout(new GridLayout(2,1,10,10));
        MainFrame.add(Panel9);
        
        
        
        String about = "Contact\nUs";
        String payment = "Total\nProfit";
        String create = "Create\nBook";
        String exit = "Exit\nProgram";
        ImageIcon cartimg = new ImageIcon("book.png");
        Getting = new JButton("<html>" + create.replaceAll("\\n", "<br>") + "</html>",cartimg);
        Getting.setPreferredSize(new Dimension(115,30));
       
        Panel7.add(Getting);
        
        ImageIcon payimg = new ImageIcon("payment.png");
        PaymentM = new JButton("<html>" + payment.replaceAll("\\n", "<br>") + "</html>",payimg);
        Panel7.add(PaymentM);
        ImageIcon questimg = new ImageIcon("tele.png");
        ContactUs = new JButton("<html>" + about.replaceAll("\\n", "<br>") + "</html>",questimg);
        Panel7.add(ContactUs);
        ImageIcon ximg = new ImageIcon("exit.png");
        Exit = new JButton("<html>" + exit.replaceAll("\\n", "<br>") + "</html>",ximg);
        Panel7.add(Exit);
        Panel7.setLayout(new GridLayout(1,4,5,5));
        Getting.setBackground(new Color(33, 118, 42));
        Getting.setForeground(Color.WHITE);
        Getting.setFocusPainted(false);
        PaymentM.setBackground(Color.DARK_GRAY);
        PaymentM.setForeground(Color.WHITE);
        PaymentM.setFocusPainted(false);
        ContactUs.setBackground(Color.DARK_GRAY);
        ContactUs.setForeground(Color.WHITE);
        ContactUs.setFocusPainted(false);
        Exit.setBackground(new Color(183, 28, 28));
        Exit.setForeground(Color.WHITE);
        Exit.setFocusPainted(false);
        MainFrame.add(Panel7);
        
        LeftBanner.setPreferredSize(new Dimension(140,460)); 
        JLabel LBannerP=new JLabel(new ImageIcon("build2.png"));
        LBannerP.setPreferredSize(new Dimension(160,450));
        LeftBanner.add(LBannerP);
        MainFrame.add(LeftBanner);
        
        CenterBanner.setBackground(new Color(120, 144, 156));
        CenterBanner.setPreferredSize(new Dimension(700,700));
        ViewBooks.setBackground(Color.white);
        ViewBooks.setPreferredSize(new Dimension(510,700)); 
        qttyP.setPreferredSize(new Dimension(35,450)); 
        qttyP.setBackground(new Color(120, 144, 156));
       for(int x=0; x<PROJECT_SWING.bookctr; x++)
       {
           quantity[x]=new JTextField();
           quantity[x].setEditable(false);
           qttyP.add(quantity[x]);
       }
       for(int x=0; x<PROJECT_SWING.bookctr; x++)
       {
           bookCtr[x]=10;
           quantity[x].setText(bookCtr[x]+"");
       }
    
       for(int v=0; v<PROJECT_SWING.bookctr; v++)
       {
          Books[v]= new JLabel(PROJECT_SWING.Codes[v]+"     "+PROJECT_SWING.books[v]);
           
       }
      
        for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
             Books[x].setFont(new Font("Century Gothic",Font.BOLD,15));
             ViewBooks.add(Books[x]);
        }
        
        qttyP.setLayout(new GridLayout(PROJECT_SWING.bookctr,1,2,3));
        ViewBooks.setLayout(new GridLayout(PROJECT_SWING.bookctr,1,2,3));
        CenterBanner.add(ViewBooks);
        BookButtonP.setBackground(new Color(120, 144, 156));
        BookButtonP.setPreferredSize(new Dimension(200,700));
        for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
            cartCtr[x]=0;
        }
        
       
        BookButtonP2.setBackground(new Color(120, 144, 156));
       
        BookButtonP.setLayout(new GridLayout(PROJECT_SWING.bookctr,2));
        CenterBanner.add(BookButtonP);
        
        CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        CenterPanel.setPreferredSize(new Dimension(740,450));
        
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
        
        CenterBanner.setLayout(new FlowLayout(FlowLayout.LEFT));
        JScrollPane jsp = new JScrollPane(CenterBanner,v,h);
        jsp.setPreferredSize(new Dimension(730,450));
        jsp.setBounds(150,670,850,200);
        
        CenterPanel.add(jsp);
        check.setForeground(new Color(236, 240, 241));
        check.setBackground(new Color(33, 118, 42));
        check.setPreferredSize(new Dimension(120,35));
        method.setLayout(new GridLayout(2,1));
        totallabel.setFont(new Font("Century Gothic",Font.BOLD,15));
       
        method.add(cash);
        method.add(install);
        realtotal.setText("₱ "+total+"");
        realtotal.setEditable(false);
        TotalPanel.add(totallabel);
        TotalPanel.add(realtotal);
        TotalPanel.add(method);
        TotalPanel.add(check);
        TotalPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        TotalPanel.setPreferredSize(new Dimension(730,44));
        
        MainFrame.add(CenterPanel);
        RightBanner.setPreferredSize(new Dimension(140,460));
        JLabel RBannerP=new JLabel(new ImageIcon("build1.png"));
        RBannerP.setPreferredSize(new Dimension(160,450));
        RightBanner.add(RBannerP);
        MainFrame.add(RightBanner);
        
        MainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
      
         
         for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {

            delete[x] = new JButton("Delete");
            edit[x] = new JButton("Edit");
        }
        
          for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
                BookButtonP.setPreferredSize(new Dimension(180,700));
                delete[x].setFont(new Font("Lucida Sans Typewriter",Font.PLAIN,13));
                delete[x].setForeground(new Color(236, 240, 241));
                delete[x].setBackground(new Color(183, 28, 28));
                edit[x].setFont(new Font("Lucida Sans Typewriter",Font.PLAIN,13));
                edit[x].setForeground(new Color(236, 240, 241));
                edit[x].setBackground(new Color(33, 118, 42));
                BookButtonP.add(delete[x]);
                BookButtonP.add(edit[x]);
                
        }
          
          for(int x=0; x<PROJECT_SWING.bookctr; x++)
          {
              if(PROJECT_SWING.copyBtnIndex[x]==1)
              {
                  delete[x].setVisible(false);
                  edit[x].setVisible(false);
                  Books[x].setText(" ");
                  Codes[x]=null;
                  PROJECT_SWING.Codes[x]=null;
                  PROJECT_SWING.Books[x].setText(" ");
              }
          }
       
        add(MainFrame);
     
        
        EditProfile.addActionListener(this);
        LogOut.addActionListener(this);
        Getting.addActionListener(this);
        PaymentM.addActionListener(this);
        ContactUs.addActionListener(this);
        Exit.addActionListener(this);
        check.addActionListener(this);
        for(int x=0; x<PROJECT_SWING.bookctr; x++)
        {
                edit[x].addActionListener(this);
                delete[x].addActionListener(this);
        }
        
         
       }
       public void actionPerformed(ActionEvent e)
       {
           
        Object src = new Object();           
        src = e.getSource();
        
        Font font2 = new Font("Tahoma",Font.BOLD,12);
        int holder=0;
        
        if(src.equals(Getting))
        {
            Create c= new Create();
            c.setVisible(true);
            create=1;
            pareho=1;
        }
        
        if(src.equals(EditProfile))
            {
                JOptionPane.showMessageDialog(null,"Oops, You cannot change admin's profile", "NOTICE",JOptionPane.INFORMATION_MESSAGE);
            }
        
           if(src.equals(ContactUs))
        {
            AboutUs newWindow = new AboutUs();
            newWindow.setVisible(true);
        }
        if(src.equals(PaymentM))
        {
           
           
           JOptionPane.showMessageDialog(null,"Total Profit: ₱"+tot,"NOTICE",JOptionPane.INFORMATION_MESSAGE);
        }
               if(src.equals(Exit))
        {
            int x = JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","EXIT", JOptionPane.YES_NO_OPTION);
            if(x==0)
            {
                System.exit(0);
            }
            
        }
       for(int x=0; x<PROJECT_SWING.bookctr; x++)
       {
           if(src.equals(delete[x]))
           {
                String pass = JOptionPane.showInputDialog(null, "Please enter ADMIN's Password..");
                if(pass.equals("admin"))
                {
                Books[x].setText(" ");
                delete[x].setVisible(false);
                edit[x].setVisible(false);
                Codes[x]=null;
                PROJECT_SWING.copyBtnIndex[x]=1;
                deletemarker=1;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                }
            
           }
           if(src.equals(edit[x]))
           {
               Edit t = new Edit();
               editX=x;
           }
       }
       
       if(src.equals(check))
       {
           int marker=2, rekta=0;
           if(cash.isSelected())
           {
               marker=1;
               rekta=1;
           }
           else if(install.isSelected())
           {
               marker=0;
               rekta=1;
           }
           if(rekta==1)
           {
           if(total==0)
           {
               JOptionPane.showMessageDialog(null,"There's nothing in your cart","NOTICE",JOptionPane.INFORMATION_MESSAGE);
           }
           else
           {
               
           int x = JOptionPane.showConfirmDialog(null,"Do you really want to checkout","NOTICE",JOptionPane.YES_NO_OPTION);
           if(x==0)
           {
               if(marker==1)
               {
                   strMethod="Cash";
                   marker=2;
               }
               else if(marker==0)
               {
                   strMethod="Partial";
                   marker=2;
               }
               checkout asd = new checkout();
               asd.setVisible(true);
           }
          }
         }
           else
           {
               JOptionPane.showMessageDialog(null, "Please Choose your Payment Method..");
           }
       }
       
       if(src.equals(LogOut))
       {
           int l= JOptionPane.showConfirmDialog(null,"Log Out?","NOTICE",JOptionPane.YES_NO_OPTION);
           if(l==0)
           {
          
           dispose();
           SignIn s = new SignIn();
           s.setVisible(true);
           }
           
       }
       }
    public static void main(String[] args)
    {
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
        
       admin proj = new admin();
       proj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}