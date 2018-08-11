/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Justine
 */
public class first extends JFrame implements ActionListener
{
    public static JPanel panel1 = new JPanel();
    public static JPanel panel2 = new JPanel();
    public static JLabel BookCode = new JLabel("  Enter Book Code:");
    public static JLabel BookName = new JLabel("  Enter Book Name:");
    public static JTextField TxtCode = new JTextField();
    public static JTextField TxtName = new JTextField();
    public static  JButton create= new JButton("CREATE");
   
    int mark=0; 
    int p1=0;
    int p2=0;
    int p3=0;
    int p4=0;
    
    first()
    {
     
     setSize(500,170);
     setTitle("CREATE");
     setResizable(false);
     setVisible(true);
     setLocationRelativeTo(null);
   
     System.out.println(p2);
 
     panel1.setPreferredSize(new Dimension(150,50));
     panel2.setPreferredSize(new Dimension(330,50));
     //panel1.setBackground(Color.yellow);
     //panel2.setBackground(Color.ORANGE);
     panel1.setLayout(new GridLayout(2,1));
     panel2.setLayout(new GridLayout(2,1));
     
     TxtCode.setText("Enter Book Code");
     TxtName.setText("Enter Book Name");
     
     panel1.add(BookCode);
     panel1.add(BookName);
     
     panel2.add(TxtCode);
     panel2.add(TxtName);
     
     add(panel1);
     add(panel2);
     
     BookCode.setFont(new Font("Century Gothic",Font.BOLD,13));
     BookName.setFont(new Font("Century Gothic",Font.BOLD,13));
     add(new JLabel("                                                  "));
   
     create.setPreferredSize(new Dimension(250,35));  
     create.setForeground(new Color(236, 240, 241));
     create.setBackground(new Color(33, 118, 42));
     
     add(create);
     setLayout(new FlowLayout(FlowLayout.LEFT));
    
     create.addActionListener(this);
     
    }

    public void actionPerformed(ActionEvent e) 
    {
     if(e.getSource().equals(create))
     {

            mark=PROJECT_SWING.bookctr;
            String code = TxtCode.getText().replaceAll(" ", "");
             //System.out.println(code);
             for(int x=0; x<PROJECT_SWING.bookctr; x++)
             {
                 //System.out.println(code);
                 //System.out.println(admin.Codes[x]);
                 //System.out.println(PROJECT_SWING.Codes[x]);
                 if(code.equalsIgnoreCase(PROJECT_SWING.Codes[x]))
                 {
                     if(p3==0)
                     {
                         p3=1;
                     JOptionPane.showMessageDialog(null,"Sorry but this Code is already taken","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                     mark--;
                     
                     break;
                     }
                 }
             }
             if(mark==PROJECT_SWING.bookctr)
             {
                if(TxtCode.getText().isEmpty()||TxtName.getText().isEmpty()||TxtCode.getText().equals("EnterBookCode")||TxtName.getText().equals("Enter Book Name"))
                {
                    if(p2==0)
                    {
                        p2=1;
                 JOptionPane.showMessageDialog(null, "Please Fill Up All the Fields","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                   
                    
                    }
                }
                else if(TxtCode.getText()!=""&&TxtName.getText()!="")
                {
                    
                    if(p1==0)
                    {
                 p1=1;
                JOptionPane.showMessageDialog(null,"Book Successfully created","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                PROJECT_SWING.Codes[PROJECT_SWING.bookctr]=TxtCode.getText().replaceAll(" ", "");
                PROJECT_SWING.books[PROJECT_SWING.bookctr]=TxtName.getText();
                PROJECT_SWING.Books[PROJECT_SWING.bookctr]= new JLabel("P220   (1st Yr.)    "+PROJECT_SWING.Codes[PROJECT_SWING.bookctr]+"    "+PROJECT_SWING.books[PROJECT_SWING.bookctr]);
               
                //admin.Books[PROJECT_SWING.bookctr]= new JLabel(admin.Codes[PROJECT_SWING.bookctr]+"    "+PROJECT_SWING.books[PROJECT_SWING.bookctr]);
                PROJECT_SWING.bookctr++;
                //admin.bookctr++;
                //PROJECT_SWING.cartCtr++;
                //admin.bookctr++;
                TxtCode.setText("Enter Book Code");
                TxtName.setText("Enter Book Name");
                dispose();
               
                    }
                }
                
                   
                
             
                //PROJECT_SWING.bookctr++;
                //admin.bookctr++;
               
             
            
         }//creatbtn
      
    }//action
    }
    public static void main(String[] args) 
    {
     first c = new first();
     c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    
}
    