/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Justine
 */
public class Create extends JFrame implements ActionListener
{
    public static JPanel panel1 = new JPanel();
    public static JPanel panel2 = new JPanel();
    public static JLabel BookCode = new JLabel("  Enter Book Code:");
    public static JLabel BookName = new JLabel("  Enter Book Name:");
    public static JTextField TxtCode = new JTextField();
    public static JTextField TxtName = new JTextField();
    public static  JButton create= new JButton("CREATE");
    public static JRadioButton first = new JRadioButton("1st Year");
    public static JRadioButton second = new JRadioButton("2nd Year");
    ButtonGroup grp = new ButtonGroup();
    int mark=0; 
    int p=0;
    int p2=0;
    int mark1=0;
    int mark2=0;
    public static int ctr=0;
    Create()
    {
     setSize(500,170);
     setTitle("CREATE");
     setResizable(false);
     setVisible(true);
     setLocationRelativeTo(null);
        
     grp.add(first);
     grp.add(second);
     
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
     add(new JLabel("                                                       "));
     add(first);
     add(second);
        
     add(new JLabel("                                                            "));
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
         if(admin.create==1)
         {
         ctr=PROJECT_SWING.bookctr;
         int marker=0;
         if(first.isSelected())
         {
             marker=1;
         }
         else if(second.isSelected())
         {
             marker=2;
         }
         else
         {
             marker=0;
            
             JOptionPane.showMessageDialog(null, "Please SELECT a YEAR");
             
         }
         if(marker!=0)
         {
             int asd=0;
            for(int x=0; x<100; x++)
                {
                if(TxtCode.getText().equalsIgnoreCase(PROJECT_SWING.Codes[x]))
                    {
                    JOptionPane.showMessageDialog(null, "Sorry the book CODE is already TAKEN","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                    admin.create=0;
                    asd=1;
                    dispose();
                    break;
                    }
                }//forloop
               
                if(asd==0)
                {
                        if(TxtCode.getText().isEmpty() || TxtName.getText().isEmpty()||TxtCode.getText().endsWith("Enter Book Code")||TxtName.getText().equals("Enter Book Name"))
                        {
                          
                            JOptionPane.showMessageDialog(null, "Please Fill up the Fields", "NOTICE",JOptionPane.INFORMATION_MESSAGE);
                          
                            asd=1;
                        }//empty
                        else
                        {
                            if(marker==1)
                            {
                                String cpy=TxtCode.getText().replaceAll(" ", "");
                                cpy=cpy.toUpperCase();
                                PROJECT_SWING.Codes[PROJECT_SWING.bookctr]=cpy;
                                PROJECT_SWING.books[PROJECT_SWING.bookctr]=TxtName.getText();
                                PROJECT_SWING.Books[PROJECT_SWING.bookctr]= new JLabel("P220   (1st Yr.)    "+PROJECT_SWING.Codes[PROJECT_SWING.bookctr]+"    "+PROJECT_SWING.books[PROJECT_SWING.bookctr]);
                                PROJECT_SWING.bookctr++;
                                admin.create=0;
                                asd=1;
                                JOptionPane.showMessageDialog(null,"Book Successfully created","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                                dispose();
                                TxtCode.setText("Enter Book Code");
                                TxtName.setText("Enter Book Name");
                                
                            }
                            else if(marker==2)
                            {
                                String cpy=TxtCode.getText().replaceAll(" ", "");
                                cpy=cpy.toUpperCase();
                                PROJECT_SWING.Codes[PROJECT_SWING.bookctr]=cpy;
                                PROJECT_SWING.books[PROJECT_SWING.bookctr]=TxtName.getText();
                                PROJECT_SWING.Books[PROJECT_SWING.bookctr]= new JLabel("P220   (2nd Yr.)    "+PROJECT_SWING.Codes[PROJECT_SWING.bookctr]+"    "+PROJECT_SWING.books[PROJECT_SWING.bookctr]);
                                PROJECT_SWING.bookctr++;
                                admin.create=0;
                                asd=1;
                                JOptionPane.showMessageDialog(null,"Book Successfully created","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                                dispose();
                                TxtCode.setText("Enter Book Code");
                                TxtName.setText("Enter Book Name");
                                
                            }
                        }//else empty
                }//mark
         }//if
         }//crete
     }
    }//action
    
    public static void main(String[] args) 
    {
     Create c = new Create();
    }

   
    
}
