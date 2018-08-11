package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.text.DecimalFormat;
public class checkout extends JFrame implements ActionListener {
    static DecimalFormat format = new DecimalFormat("0.00");
    JRadioButton cash = new JRadioButton("Cash");
    JRadioButton install = new JRadioButton("Installment");

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    public static JLabel books[] = new JLabel[PROJECT_SWING.bookctr];
    public static int Bcounter[] = new int[PROJECT_SWING.bookctr];
    int total = 0;
    int ctr = 0;
    JLabel tit = new JLabel("List of your books");
    JLabel choose = new JLabel("Payment Method:  ");
    JLabel subtotal = new JLabel("Sub Total: ");
    JLabel realtotal = new JLabel("Final Total: ");
    JLabel vat = new JLabel("Total +12% Vat: ");
    JButton pur = new JButton("Purchase");

    JLabel yourmet = new JLabel("Your Method: ");
    public static double b;
    JButton ok = new JButton("OK");
    JPanel panel6 = new JPanel();
    JLabel name;
    JLabel section;
    double n=0;
    checkout() {
        tit.setFont(new Font("Century Gothic",Font.BOLD,15));
        choose.setFont(new Font("Century Gothic",Font.BOLD,15));
        subtotal.setFont(new Font("Century Gothic",Font.BOLD,15));
        realtotal.setFont(new Font("Century Gothic",Font.BOLD,15));
        vat.setFont(new Font("Century Gothic",Font.BOLD,15));
        pur.setFont(new Font("Century Gothic",Font.BOLD,15));
        
        setSize(700, 450);
        setTitle("Check Out");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 2));

       
        books[0] = new JLabel("ACT 113     ICT Fundamentals");
        books[1] = new JLabel("ACT 133     Fundamentals of Programming Language");
        books[2] = new JLabel("ACT 153     Digital and Logic Circuits");
        books[3] = new JLabel("ACT 103     Discrete Structure");
        books[4] = new JLabel("ACT 123     Advanced Programming Language");
        books[5] = new JLabel("ACT 143     Data Structure and Algorithm");
        books[6] = new JLabel("ACT 163     Computer Hardware Fundamentals");
        books[7] = new JLabel("ACT 213     Database Management System");
        books[8] = new JLabel("ACT 233     Object Oriented Programming");
        books[9] = new JLabel("ACT 253     Multimedia and Web Design");
        books[10] = new JLabel("ACT 273     Computer System Organization");
        books[11] = new JLabel("ACT 293     Network and Communications");
        books[12] = new JLabel("ACT 203     Human Computer Interaction");
        books[13] = new JLabel("ACT 223     Systems Analysis, Design and Prototyping");
        books[14] = new JLabel("ACT 243     Code of Ethics of the ITE Professionals");
        books[15] = new JLabel("ACT 263     Operating System Principle and Applications");
        books[16] = new JLabel("ACT 283A    Web Application Development");
        books[17] = new JLabel("ACT 283B    Elective 1");
        
        for(int b=18; b<PROJECT_SWING.bookctr; b++)
        {
           
              books[b]= new JLabel(PROJECT_SWING.Codes[b]+"     "+PROJECT_SWING.books[b]);
            
            
        }
        
        panel1.setPreferredSize(new Dimension(340, 420));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setPreferredSize(new Dimension(340, 420));
       
        ButtonGroup grp = new ButtonGroup();
        grp.add(cash);
        grp.add(install);

        panel3.setPreferredSize(new Dimension(330, 380));
        panel2.add(tit, BorderLayout.NORTH);

        panel4.setPreferredSize(new Dimension(330, 150));
        panel4.add(subtotal);
        panel4.add(new JLabel("₱ "+format.format(PROJECT_SWING.total) + ""));

        double a = PROJECT_SWING.total;
        b = a;
        a = a / 100;
        a = a * 12;
        b = b + a;
        panel4.add(vat);
        panel4.add(new JLabel("₱ "+format.format(b) + ""));

        panel4.add(realtotal);

        panel4.setLayout(new GridLayout(3, 2));
  
        for (int x = 0; x <PROJECT_SWING.bookctr; x++) {
           
            if (PROJECT_SWING.cartCtr[x]>0)
            {
                Bcounter[x] = PROJECT_SWING.cartCtr[x];
                if(books[x]!=null)
                {
                String c = Bcounter[x] + "pc/s.  " + books[x].getText();
                JLabel temp = new JLabel(c);
                
                panel3.add(temp);
                ctr++;
                }
            }
        }
        panel3.setBorder(new TitledBorder(""));
       
        panel3.setLayout(new GridLayout(ctr, 1));
        panel2.add(panel3);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        a = 0;
        b = PROJECT_SWING.total;
        a = b;
        b = a;
        a = a / 100;
        a = a * 12;
        b = b + a;
        if (PROJECT_SWING.strMethod.equals("Cash")) {
            double t = b * 0.05;
            System.out.println();
            Double cop = PROJECT_SWING.total;
            if (cop>=660) {
                yourmet = new JLabel("Cash w/ 5% Discount");
                yourmet.setFont(new Font("Century Gothic",Font.BOLD,15));
        
                panel1.add(yourmet);
                b = b - t;
                
                panel4.add(new JLabel("₱ "+format.format(b) + ""));
            } else {
                yourmet = new JLabel("Cash");
                yourmet.setFont(new Font("Century Gothic",Font.BOLD,15));
        
                panel1.add(yourmet);
                panel4.add(new JLabel("₱ "+format.format(b)+ ""));
            }

        } else if (PROJECT_SWING.strMethod.equals("Partial")) {
            yourmet = new JLabel("Installment");
            yourmet.setFont(new Font("Century Gothic",Font.BOLD,15));
            panel1.add(yourmet);
            n = b;
            b = b / 100;
            b = b * 60;
            n = n - b;
            panel5.setLayout(new GridLayout(2, 1));
            panel5.add(new JLabel("1st Give: ₱" + format.format(b)));
            panel5.add(new JLabel("2nd Give: ₱" + format.format(n)));
            panel4.add(panel5);
        }
        panel4.setBorder(new TitledBorder(""));
      
       
       ok.setPreferredSize(new Dimension(330,30));
       ok.setFont(new Font("Lucida Sans Typewriter",Font.BOLD,15));
       ok.setForeground(Color.WHITE);
       ok.setBackground(new Color(33,118,42));
       
        name = new JLabel(SignIn.storedfullName[SignIn.copyX]);
        section = new JLabel(SignIn.storedCourse[SignIn.copyX]);
        panel6.setLayout(new GridLayout(2,1));
        panel6.add(name);
        panel6.add(section);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
         section.setFont(new Font("Tahoma",Font.BOLD,14));
         panel6.setPreferredSize(new Dimension(330,80));
         panel6.setBorder(new TitledBorder(""));
        panel1.add(panel6); 
         panel1.add(panel4);
      panel1.add(ok);
      
       
   //     panel6.setBackground(Color.yellow);
        
        add(panel2);
 //       panel1.setBackground(Color.yellow);
 
        add(panel1);
       

            ok.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(ok))
        {
            
            JOptionPane.showMessageDialog(null,"Ok, Thank you for cooperation. Go to the cashier your show your receipt", "NOTICE",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            for(int v=0; v<PROJECT_SWING.bookctr; v++)
            {
                bestseller.sell[v]+=PROJECT_SWING.cartCtr[v];
                PROJECT_SWING.priceTxt[v].setText("0");
                PROJECT_SWING.cartCtr[v]=0;
            }
            admin.tot+=b+n;
            PROJECT_SWING.total=0;
            PROJECT_SWING.realtotal.setText("₱ 0.0");
           
        }

    }

    public static void main(String[] args) {
        checkout check = new checkout();
    }

}
