
package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PROJECT_SWING extends JFrame implements ActionListener
{
    
        public static int in=0;
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
        JButton Restock[] = new JButton[100];
        public static String dp = "def.jpg";
        public static JLabel userIM = new JLabel(new ImageIcon(dp));
        public static int bookctr=18;
        public static JLabel Books[] = new JLabel[100];
        public static String Codes[] = new String[100];
        JButton PaymentM;
        JButton ContactUs;
        JButton Exit;
        JRadioButton cash = new JRadioButton("CASH");
        JRadioButton install = new JRadioButton("PARTIAL");
        JPanel method = new JPanel();
        ButtonGroup met = new ButtonGroup();
        public static int bookCtr[]=new int[100];
        public static int copyBtnIndex[] = new int[100];
        public static JButton minus[] = new JButton[100];
        public static JTextField priceTxt[] = new JTextField[100];
        public static JButton plus[] = new JButton[100];
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
        public static String books[] = new String[100];
        public static int bestseller[] = new int [bookctr];
       
        PROJECT_SWING()
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
        
        
        userIM=new JLabel(new ImageIcon(dp));
        userIM.setPreferredSize(new Dimension(100,100));
        UserImage.add(userIM); 
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
        LogOut.setFocusPainted(false);
        Panel9.add(EditProfile);
        Panel9.add(LogOut);
        Panel9.setLayout(new GridLayout(2,1,10,10));
        MainFrame.add(Panel9);
        
        
        
        String about = "Contact\nUs";
        String payment = "Payment\nMethods";
        String best = "Best\nSellers";
        String exit = "Exit\nProgram";
        ImageIcon cartimg = new ImageIcon("star.png");
        Getting = new JButton("<html>" + best.replaceAll("\\n", "<br>") + "</html>",cartimg);
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
        Getting.setBackground(Color.DARK_GRAY);
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
        
        //LeftBanner.setBackground(Color.LIGHT_GRAY);
        LeftBanner.setPreferredSize(new Dimension(140,460)); 
        JLabel LBannerP=new JLabel(new ImageIcon("build2.png"));
        LBannerP.setPreferredSize(new Dimension(160,450));
        LeftBanner.add(LBannerP);
        MainFrame.add(LeftBanner);
        
        CenterBanner.setBackground(new Color(120, 144, 156));
        CenterBanner.setPreferredSize(new Dimension(700,715));
        ViewBooks.setBackground(Color.white);
        ViewBooks.setPreferredSize(new Dimension(470,700)); 
        //qttyP.setBackground(Color.GREEN);
        qttyP.setPreferredSize(new Dimension(35,700)); 
        qttyP.setBackground(new Color(120, 144, 156));
       // BooksAndCodes[0]=("LIST OF BOOKS");
       for(int x=0; x<bookctr; x++)
       {
           quantity[x]=new JTextField();
           quantity[x].setEditable(false);
           qttyP.add(quantity[x]);
       }
       for(int x=0; x<bookctr; x++)
       {
           bookCtr[x]=10;
           quantity[x].setText(bookCtr[x]+"");
       }
       if(Edit.editmarker==1)
       {
        books[0]="ICT Fundamentals";
        books[1]="Fundamentals of Programming Language";
        books[2]="Digital and Logic Circuits";
        books[3]="Discrete Structure";
        books[4]="Advanced Programming Language";
        books[5]="Data Structure and Algorithm";
        books[6]="Computer Hardware Fundamentals";
        books[7]="Database Management System";
        books[8]="Object Oriented Programming";
        books[9]="Multimedia and Web Design";
        books[10]="Computer System Organization";
        books[11]="Network and Communications";
        books[12]="Human Computer Interaction";
        books[13]="Systems Analysis, Design and Prototyping";
        books[14]="Code of Ethics of the ITE Professionals";
        books[15]="Operating System Principle and Applications";
        books[16]="Web Application Development";
        books[17]="Elective 1";
       }
       
       for(int x=0; x<bookctr; x++)
       {
           if(Edit.editmarker==1)
           {
               if(Edit.copymarker==x)
               {
                   books[x]=Edit.cpy;
               }
           }
       }
       
       
        Books[0]=new JLabel("P220   (1st Yr.)    ACT 113     "+books[0]);
        Books[1]=new JLabel("P220   (1st Yr.)    ACT 133     "+books[1]);
        Books[2]=new JLabel("P220   (1st Yr.)    ACT 153     "+books[2]);
        Books[3]=new JLabel("P220   (1st Yr.)    ACT 103     "+books[3]);
        Books[4]=new JLabel("P220   (1st Yr.)    ACT 123     "+books[4]);
        Books[5]=new JLabel("P220   (1st Yr.)    ACT 143     "+books[5]);
        Books[6]=new JLabel("P220   (1st Yr.)    ACT 163     "+books[6]);
        Books[7]=new JLabel("P220   (2nd Yr.)    ACT 213     "+books[7]);
        Books[8]=new JLabel("P220   (2nd Yr.)    ACT 233     "+books[8]);
        Books[9]=new JLabel("P220   (2nd Yr.)    ACT 253     "+books[9]);
        Books[10]=new JLabel("P220   (2nd Yr.)    ACT 273     "+books[10]);
        Books[11]=new JLabel("P220   (2nd Yr.)    ACT 293     "+books[11]);
        Books[12]=new JLabel("P220   (2nd Yr.)    ACT 203     "+books[12]);
        Books[13]=new JLabel("P220   (2nd Yr.)    ACT 223     "+books[13]);
        Books[14]=new JLabel("P220   (2nd Yr.)    ACT 243     "+books[14]);
        Books[15]=new JLabel("P220   (2nd Yr.)    ACT 263     "+books[15]);
        Books[16]=new JLabel("P220   (2nd Yr.)    ACT 283A    "+books[16]);
        Books[17]=new JLabel("P220   (2nd Yr.)    ACT 283B    "+books[17]);
        
        Codes[0]="ACT113";
        Codes[1]="ACT133";
        Codes[2]="ACT153";
        Codes[3]="ACT103";
        Codes[4]="ACT123";
        Codes[5]="ACT143";
        Codes[6]="ACT163";
        Codes[7]="ACT213";
        Codes[8]="ACT233";
        Codes[9]="ACT253";
        Codes[10]="ACT273";
        Codes[11]="ACT293";
        Codes[12]="ACT203";
        Codes[13]="ACT223";
        Codes[14]="ACT243";
        Codes[15]="ACT263";
        Codes[16]="ACT283A";
        Codes[17]="ACT283B";
       
      
        for(int x=0; x<bookctr; x++)
        {
             Books[x].setForeground(Color.BLACK);
             Books[x].setFont(new Font("Century Gothic",Font.BOLD,15));
             ViewBooks.add(Books[x]);
           
        }
        
        
        qttyP.setLayout(new GridLayout(bookctr,1,2,3));
        CenterBanner.add(qttyP);
        ViewBooks.setLayout(new GridLayout(bookctr,1,2,3));
        CenterBanner.add(ViewBooks);
        BookButtonP.setBackground(new Color(120, 144, 156));
        BookButtonP.setPreferredSize(new Dimension(200,700));
        for(int x=0; x<bookctr; x++)
        {
            cartCtr[x]=0;
        }
        
       
        BookButtonP2.setBackground(new Color(120, 144, 156));
       

        BookButtonP.setLayout(new GridLayout(bookctr,1));
        BookButtonP2.setLayout(new GridLayout(bookctr,4));
        CenterBanner.add(BookButtonP);
        CenterBanner.add(BookButtonP2);
        
        
        CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        CenterPanel.setPreferredSize(new Dimension(740,460));
        
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
        
        CenterBanner.setLayout(new FlowLayout(FlowLayout.LEFT));
        JScrollPane jsp = new JScrollPane(CenterBanner,v,h);
        jsp.setPreferredSize(new Dimension(730,380));
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
        CenterPanel.add(TotalPanel);
        
        
        MainFrame.add(CenterPanel);
        //RightBanner.setBackground(Color.DARK_GRAY);
        RightBanner.setPreferredSize(new Dimension(140,460));
        JLabel RBannerP=new JLabel(new ImageIcon("build1.png"));
        RBannerP.setPreferredSize(new Dimension(160,450));
        RightBanner.add(RBannerP);
        MainFrame.add(RightBanner);
        
        MainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
      
         
         for(int x=0; x<bookctr; x++)
        {

            Restock[x] = new JButton("Restock");
            minus[x] = new JButton("-");
            priceTxt[x]= new JTextField(5);
            priceTxt[x].setEditable(false);
            String c = cartCtr[x]+"";
            priceTxt[x].setText(c);
            plus[x] = new JButton("+");
           
        }
        
          for(int x=0; x<bookctr; x++)
        {
             
                BookButtonP.setPreferredSize(new Dimension(74,710));
                BookButtonP2.setPreferredSize(new Dimension(110,710));
                Restock[x].setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,11));
                Restock[x].setForeground(new Color(236, 240, 241));
                Restock[x].setBackground(new Color(33, 118, 42));
                BookButtonP.add(Restock[x]);
                minus[x].setForeground(Color.BLACK);
                minus[x].setBackground(Color.white);
                BookButtonP2.add(minus[x]);
                BookButtonP2.add(priceTxt[x]);
                plus[x].setForeground(Color.BLACK);
                plus[x].setBackground(Color.white);
                BookButtonP2.add(plus[x]);
               
           
        }
          for(int x=0; x<bookctr; x++)
        {
            if(admin.deletemarker==1)
            {
                if(copyBtnIndex[x]==1)
                {
                    Books[x].setText(" ");
                    plus[x].setVisible(false);
                    minus[x].setVisible(false);
                    quantity[x].setVisible(false);
                    Restock[x].setVisible(false);
                    priceTxt[x].setVisible(false);
                }
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
        for(int x=0; x<bookctr; x++)
        {
         
                Restock[x].addActionListener(this);
                minus[x].addActionListener(this);
                plus[x].addActionListener(this);
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
           bestseller b = new bestseller();
           b.setVisible(true);
       }
        if(src.equals(EditProfile))
            {
                EditProfile edit = new EditProfile();
                edit.setVisible(true);
                dispose();
            }
        for(int x=0; x<bookctr; x++)
        {
            
            if(src.equals(plus[x]))
            {
                String y = quantity[x].getText();
                int qty = Integer.parseInt(y);
                
                if(qty==0)
                {
                    JOptionPane.showMessageDialog(null, "Umm, There's no more stock.(Click the Restock Button)", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                int result = Integer.parseInt(priceTxt[x].getText());
                int sum = qty+result;
                if(bookCtr[x]==(sum/2))
                {
                    JOptionPane.showMessageDialog(null, "Book quantity is Critical", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    Books[x].setForeground(Color.red);
                    qty--;
                    bookCtr[x]--;
                }
                
                
                else 
                {
                    qty--;
                    bookCtr[x]--;
                }
                
                quantity[x].setText(qty+"");
                cartCtr[x]++;
                String c = cartCtr[x]+"";
                priceTxt[x].setText(c);
                total+=220;
                realtotal.setText("₱ "+total+"");
            }
             if(src.equals(minus[x]))
            {
                String y = quantity[x].getText();
                int qty = Integer.parseInt(y);
                int sum = qty+cartCtr[x];
                if(qty==sum)
                {
                    break;
                }
                int result2 = Integer.parseInt(priceTxt[x].getText());
                int sum2 = qty+result2;
                if(bookCtr[x]>=(sum2/2)-1)
                {
                    qty++;
                    bookCtr[x]++;
                    Books[x].setForeground(Color.black);
                }
                else
                {
                    qty++;
                    bookCtr[x]++;
                }
                
                
                quantity[x].setText(qty+"");
                if(cartCtr[x]==0)
                {
                cartCtr[x]=0;
                String c = cartCtr[x]+"";
                priceTxt[x].setText(c);
                }
                else
                {
                cartCtr[x]--;
                String c = cartCtr[x]+"";
                priceTxt[x].setText(c);
                total-=220;
                realtotal.setText("₱ "+total+"");
                }
                
            }            
        }
           if(src.equals(ContactUs))
        {
            AboutUs newWindow = new AboutUs();
            newWindow.setVisible(true);
            
        }
        if(src.equals(PaymentM))
        {
            PaymentMethods newWindow = new PaymentMethods();
            newWindow.setVisible(true);
           
        }
               if(src.equals(Exit))
        {
            int x = JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","EXIT", JOptionPane.YES_NO_OPTION);
            if(x==0)
            {
                System.exit(0);
            }
            
        }
       for(int x=0; x<bookctr; x++)
       {
           if(src.equals(Restock[x]))
           {
            int q = JOptionPane.showConfirmDialog(null,"Request for Stock? "+"("+Codes[x]+")","NOTICE", JOptionPane.YES_NO_OPTION);
            if(q==0)
            { 
            JOptionPane.showMessageDialog(null, "OK, Stocks are being Delivered","NOTICE",JOptionPane.INFORMATION_MESSAGE);
            Books[x].setForeground(Color.BLACK);
            bookCtr[x]=bookCtr[x]+10;
            quantity[x].setText(bookCtr[x]+"");
            }
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
           for(int x=0; x<bookctr; x++)
           {
               cartCtr[x]=0;
               Books[x].setForeground(Color.BLACK);
           }
           total=0;
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
        
       PROJECT_SWING proj = new PROJECT_SWING();
       proj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}