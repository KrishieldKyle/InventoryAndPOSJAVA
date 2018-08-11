package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.UIManager.LookAndFeelInfo;
public class ADD_TO_CART extends JFrame implements ActionListener
{
     String added="";
    
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel pSouth=new JPanel();
    JPanel pNorth=new JPanel();
    JPanel panelbook1=new JPanel();
    JPanel panelbook2=new JPanel();
    JPanel panelbook3=new JPanel();
    JPanel panelbook4=new JPanel();
    JPanel panelbook5=new JPanel();
    JPanel panelbook6=new JPanel();
    JPanel panelbook7=new JPanel();
    JPanel panelbook8=new JPanel();
    JPanel panelbook9=new JPanel();
    JPanel panelbook10=new JPanel();
    JPanel panelbook11=new JPanel();
    JPanel panelbook12=new JPanel();
    JPanel panelbook13=new JPanel();
    JPanel panelbook14=new JPanel();
    JPanel panelbook15=new JPanel();
    JPanel panelbook16=new JPanel();
    JPanel panelbook17=new JPanel();
    JPanel panelbook18=new JPanel();
    
    JLabel book1=new JLabel(" (1st Yr.)    ACT 113     ICT Fundamentals");
    JLabel book2=new JLabel(" (1st Yr.)    ACT 133     Fundamentals of Programming Language");
    JLabel book3=new JLabel(" (1st Yr.)    ACT 153     Digital and Logic Circuits");
    JLabel book4=new JLabel(" (1st Yr.)    ACT 103     Discrete Structure");
    JLabel book5=new JLabel(" (1st Yr.)    ACT 123     Advanced Programming Language");
    JLabel book6=new JLabel(" (1st Yr.)    ACT 143     Data Structure and Algorithm");
    JLabel book7=new JLabel(" (1st Yr.)    ACT 163     Computer Hardware Fundamentals");
    JLabel book8=new JLabel(" (2nd Yr.)    ACT 213     Database Management System");
    JLabel book9=new JLabel(" (2nd Yr.)    ACT 233     Object Oriented Programming");
    JLabel book10=new JLabel(" (2nd Yr.)    ACT 253     Multimedia and Web Design");
    JLabel book11=new JLabel(" (2nd Yr.)    ACT 273     Computer System Organization");
    JLabel book12=new JLabel(" (2nd Yr.)    ACT 293     Network and Communications");
    JLabel book13=new JLabel(" (2nd Yr.)    ACT 203     Human Computer Interaction");
    JLabel book14=new JLabel(" (2nd Yr.)    ACT 223     Systems Analysis, Design and Prototyping");
    JLabel book15=new JLabel(" (2nd Yr.)    ACT 243     Code of Ethics of the ITE Professionals");
    JLabel book16=new JLabel(" (2nd Yr.)    ACT 263     Operating System Principle and Applications");
    JLabel book17=new JLabel(" (2nd Yr.)    ACT 283A    Web Application Development");
    JLabel book18=new JLabel(" (2nd Yr.)    ACT 283B    Elective 1");
    
    JTextField qty=new JTextField(8);
    JTextField qty1=new JTextField(8);
    JTextField qty2=new JTextField(8);
    JTextField qty3=new JTextField(8);
    JTextField qty4=new JTextField(8);
    JTextField qty5=new JTextField(8);
    JTextField qty6=new JTextField(8);
    JTextField qty7=new JTextField(8);
    JTextField qty8=new JTextField(8);
    JTextField qty9=new JTextField(8);
    JTextField qty10=new JTextField(8);
    JTextField qty11=new JTextField(8);
    JTextField qty12=new JTextField(8);
    JTextField qty13=new JTextField(8);
    JTextField qty14=new JTextField(8);
    JTextField qty15=new JTextField(8);
    JTextField qty16=new JTextField(8);
    JTextField qty17=new JTextField(8);
    JTextField price=new JTextField(8);
    JTextField price1=new JTextField(8);
    JTextField price2=new JTextField(8);
    JTextField price3=new JTextField(8);
    JTextField price4=new JTextField(8);
    JTextField price5=new JTextField(8);
    JTextField price6=new JTextField(8);
    JTextField price7=new JTextField(8);
    JTextField price8=new JTextField(8);
    JTextField price9=new JTextField(8);
    JTextField price10=new JTextField(8);
    JTextField price11=new JTextField(8);
    JTextField price12=new JTextField(8);
    JTextField price13=new JTextField(8);
    JTextField price14=new JTextField(8);
    JTextField price15=new JTextField(8);
    JTextField price16=new JTextField(8);
    JTextField price17=new JTextField(8);
    JTextField total=new JTextField(8);
    JTextField total17=new JTextField(8);
    JTextField total1=new JTextField(8);
    JTextField total2=new JTextField(8);
    JTextField total3=new JTextField(8);
    JTextField total4=new JTextField(8);
    JTextField total5=new JTextField(8);
    JTextField total6=new JTextField(8);
    JTextField total7=new JTextField(8);
    JTextField total8=new JTextField(8);
    JTextField total9=new JTextField(8);
    JTextField total10=new JTextField(8);
    JTextField total11=new JTextField(8);
    JTextField total12=new JTextField(8);
    JTextField total13=new JTextField(8);
    JTextField total14=new JTextField(8);
    JTextField total15=new JTextField(8);
    JTextField total16=new JTextField(8);
    
    JButton cont=new JButton("           Continue Shopping            ");
    JButton checkout=new JButton("           Checkout            ");
    JButton remove=new JButton("   REMOVE   ");
    JButton remove17=new JButton("   REMOVE   ");
    JButton remove1=new JButton("   REMOVE   ");
    JButton remove2=new JButton("   REMOVE   ");
    JButton remove3=new JButton("   REMOVE   ");
    JButton remove4=new JButton("   REMOVE   ");
    JButton remove5=new JButton("   REMOVE   ");
    JButton remove6=new JButton("   REMOVE   ");
    JButton remove7=new JButton("   REMOVE   ");
    JButton remove8=new JButton("   REMOVE   ");
    JButton remove9=new JButton("    REMOVE   ");
    JButton remove10=new JButton("   REMOVE   ");
    JButton remove11=new JButton("   REMOVE   ");
    JButton remove12=new JButton("   REMOVE   ");
    JButton remove13=new JButton("   REMOVE   ");
    JButton remove14=new JButton("   REMOVE   ");
    JButton remove15=new JButton("   REMOVE   ");
    JButton remove16=new JButton("   REMOVE   ");
    
    
    JLabel lbl[] = new JLabel[18];
    int ctr=0;
    JLabel booklist []= new JLabel[PROJECT_SWING.bookctr];
    ADD_TO_CART()
    {
        setSize(920,700);
        setVisible(true);
        setTitle("CART");
        setLocationRelativeTo(null);
        
        
        
        PROJECT_SWING swing = new PROJECT_SWING();
        
        
        
        panel2.setBackground(Color.white);
        panel3.setBackground(Color.LIGHT_GRAY);
        
        cont.setForeground(Color.white);
        cont.setBackground(Color.green);
        checkout.setForeground(Color.white);
        checkout.setBackground(Color.green);
        
        pSouth.add(cont);
        pSouth.add(checkout);
        panel2.setBorder(new TitledBorder("             Product"));
          
        panel3.setBorder(new TitledBorder("         Quantity                     Price                       Total"));
        qty.setEditable(false);
        qty1.setEditable(false);
        qty2.setEditable(false);
        qty3.setEditable(false);
        qty4.setEditable(false);
        qty5.setEditable(false);
        qty6.setEditable(false);
        qty7.setEditable(false);
        qty8.setEditable(false);
        qty9.setEditable(false);
        qty10.setEditable(false);
        qty11.setEditable(false);
        qty12.setEditable(false);
        qty13.setEditable(false);
        qty14.setEditable(false);
        qty15.setEditable(false);
        qty16.setEditable(false);
        qty17.setEditable(false);
        
        price.setEditable(false);
        price1.setEditable(false);
        price2.setEditable(false);
        price3.setEditable(false);
        price4.setEditable(false);
        price5.setEditable(false);
        price6.setEditable(false);
        price7.setEditable(false);
        price8.setEditable(false);
        price9.setEditable(false);
        price10.setEditable(false);
        price11.setEditable(false);
        price12.setEditable(false);
        price13.setEditable(false);
        price14.setEditable(false);
        price15.setEditable(false);
        price16.setEditable(false);
        price17.setEditable(false);
        
        total.setEditable(false);
        total1.setEditable(false);
        total2.setEditable(false);
        total3.setEditable(false);
        total4.setEditable(false);
        total5.setEditable(false);
        total6.setEditable(false);
        total7.setEditable(false);
        total8.setEditable(false);
        total9.setEditable(false);
        total10.setEditable(false);
        total11.setEditable(false);
        total12.setEditable(false);
        total13.setEditable(false);
        total14.setEditable(false);
        total15.setEditable(false);
        total16.setEditable(false);
        total17.setEditable(false);
        
        
        
        qty.setText("              0");
        price.setText("P 0.00");
        total.setText("P 0.00");
        
        qty1.setText("              0");
        price1.setText("P 0.00");
        total1.setText("P 0.00");
        
        qty2.setText("              0");
        price2.setText("P 0.00");
        total2.setText("P 0.00");
        
        qty3.setText("              0");
        price3.setText("P 0.00");
        total3.setText("P 0.00");
        
        qty4.setText("              0");
        price4.setText("P 0.00");
        total4.setText("P 0.00");
        
        qty5.setText("              0");
        price5.setText("P 0.00");
        total5.setText("P 0.00");
        
        qty6.setText("              0");
        price6.setText("P 0.00");
        total6.setText("P 0.00");
        
        qty7.setText("              0");
        price7.setText("P 0.00");
        total7.setText("P 0.00");
        
        qty8.setText("              0");
        price8.setText("P 0.00");
        total8.setText("P 0.00");
        
        qty9.setText("              0");
        price9.setText("P 0.00");
        total9.setText("P 0.00");
        
        qty10.setText("              0");
        price10.setText("P 0.00");
        total10.setText("P 0.00");
        
        qty11.setText("              0");
        price11.setText("P 0.00");
        total11.setText("P 0.00");
        
        qty12.setText("              0");
        price12.setText("P 0.00");
        total12.setText("P 0.00");
        
        qty13.setText("              0");
        price13.setText("P 0.00");
        total13.setText("P 0.00");
        
        qty14.setText("              0");
        price14.setText("P 0.00");
        total14.setText("P 0.00");
        
        qty15.setText("              0");
        price15.setText("P 0.00");
        total15.setText("P 0.00");
        
        qty16.setText("              0");
        price16.setText("P 0.00");
        total16.setText("P 0.00");
        
        qty17.setText("              0");
        price17.setText("P 0.00");
        total17.setText("P 0.00");
        
        if(PROJECT_SWING.cpy.equals(book1.getText()))
        {
        panel2.add(book1);
        qty.setText(PROJECT_SWING.qtyctr[1]+"");
        panel3.add(qty);
        panel3.add(price);
        panel3.add(total);
        panel3.add(remove);
        }
        
        if(PROJECT_SWING.cpy.equals(book2.getText()))
        {
        panel2.add(book2);
        qty1.setText(PROJECT_SWING.qtyctr[2]+"");
        panel3.add(qty1);
        panel3.add(price1);
        panel3.add(total1);
        panel3.add(remove1);
        }
        
        if(PROJECT_SWING.cpy.equals(book3.getText()))
        {
        panel2.add(book3);
        qty2.setText(PROJECT_SWING.qtyctr[3]+"");
        panel3.add(qty2);
        panel3.add(price2);
        panel3.add(total2);
        panel3.add(remove2);
        }
        
        if(PROJECT_SWING.cpy.equals(book4.getText()))
        {
        panel2.add(book4);
        qty3.setText(PROJECT_SWING.qtyctr[4]+"");
        panel3.add(qty3);
        panel3.add(price3);
        panel3.add(total3);
        panel3.add(remove3);
        }
        
        if(PROJECT_SWING.cpy.equals(book5.getText()))
        {
        panel2.add(book5);
        qty4.setText(PROJECT_SWING.qtyctr[5]+"");
        panel3.add(qty4);
        panel3.add(price4);
        panel3.add(total4);
        panel3.add(remove4);
        }
        
        if(PROJECT_SWING.cpy.equals(book6.getText()))
        {
        panel2.add(book6);
        qty5.setText(PROJECT_SWING.qtyctr[6]+"");
        panel3.add(qty5);
        panel3.add(price5);
        panel3.add(total5);
        panel3.add(remove5);
        }
        
        if(PROJECT_SWING.cpy.equals(book7.getText()))
        {
        panel2.add(book7);
        qty6.setText(PROJECT_SWING.qtyctr[7]+"");
        panel3.add(qty6);
        panel3.add(price6);
        panel3.add(total6);
        panel3.add(remove6);
        }
        
        if(PROJECT_SWING.cpy.equals(book8.getText()))
        {
        panel2.add(book8);
        qty7.setText(PROJECT_SWING.qtyctr[8]+"");
        panel3.add(qty7);
        panel3.add(price7);
        panel3.add(total7);
        panel3.add(remove7);
        }
        
        if(PROJECT_SWING.cpy.equals(book9.getText()))
        {
        panel2.add(book9);
        qty8.setText(PROJECT_SWING.qtyctr[9]+"");
        panel3.add(qty8);
        panel3.add(price8);
        panel3.add(total8);
        panel3.add(remove8);
        }
        
        if(PROJECT_SWING.cpy.equals(book10.getText()))
        {
        panel2.add(book10);
        qty9.setText(PROJECT_SWING.qtyctr[10]+"");
        panel3.add(qty9);
        panel3.add(price9);
        panel3.add(total9);
        panel3.add(remove9);
        }
        
        if(PROJECT_SWING.cpy.equals(book11.getText()))
        {
        panel2.add(book11);
        qty10.setText(PROJECT_SWING.qtyctr[11]+"");
        panel3.add(qty10);
        panel3.add(price10);
        panel3.add(total10);
        panel3.add(remove10);
        }
        if(PROJECT_SWING.cpy.equals(book12.getText()))
        {
        panel2.add(book12);
        qty11.setText(PROJECT_SWING.qtyctr[1]+"");
        panel3.add(qty11);
        panel3.add(price11);
        panel3.add(total11);
        panel3.add(remove11);
        }
        
        if(PROJECT_SWING.cpy.equals(book13.getText()))
        {
        panel2.add(book13);
        qty12.setText(PROJECT_SWING.qtyctr[13]+"");
        panel3.add(qty12);
        panel3.add(price12);
        panel3.add(total12);
        panel3.add(remove12);
        }
        
        if(PROJECT_SWING.cpy.equals(book14.getText()))
        {
        panel2.add(book14);
        qty13.setText(PROJECT_SWING.qtyctr[14]+"");
        panel3.add(qty13);
        panel3.add(price13);
        panel3.add(total13);
        panel3.add(remove13);
        }
        if(PROJECT_SWING.cpy.equals(book15.getText()))
        {
        panel2.add(book15);
        qty14.setText(PROJECT_SWING.qtyctr[15]+"");
        panel3.add(qty14);
        panel3.add(price14);
        panel3.add(total14);
        panel3.add(remove14);
        }
        
        if(PROJECT_SWING.cpy.equals(book16.getText()))
        {
        panel2.add(book16);
        qty15.setText(PROJECT_SWING.qtyctr[16]+"");
        panel3.add(qty15);
        panel3.add(price15);
        panel3.add(total15);
        panel3.add(remove15);
        }
        if(PROJECT_SWING.cpy.equals(book17.getText()))
        {
        panel2.add(book17);
        qty16.setText(PROJECT_SWING.qtyctr[17]+"");
        panel3.add(qty16);
        panel3.add(price16);
        panel3.add(total16);
        panel3.add(remove16);
        }
        
        if(PROJECT_SWING.cpy.equals(book18.getText()))
        {
        panel2.add(book18);
        qty17.setText(PROJECT_SWING.qtyctr[18]+"");
        panel3.add(qty17);
        panel3.add(price17);
        panel3.add(total17);
        panel3.add(remove17);
        }
       
        panel1.add(panel2);
        panel1.add(panel3);
        
       
       
        
        panel1.setLayout(new GridLayout(1,2));
        panel2.setLayout(new GridLayout(18,1));
        //panel3.setLayout(new GridLayout(18,4));
        
        
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        pNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(pNorth,BorderLayout.NORTH);
        add(panel1);
        add(pSouth,BorderLayout.SOUTH);
      
        
        
    }
    public static void main(String[] args)
    { 
        ADD_TO_CART myFrame=new ADD_TO_CART();
        myFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
        
    }
    public void actionPerformed(ActionEvent e)
    {
        
    }
}