package javaproject;
import java.awt.Font;
import java.sql.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 


public class JavaProject                           /////Main Class///////
{
    JFrame f= new JFrame("Login");                 ////Login Frame//////
    JLabel A,B,C,F,G,H,I,J;
    JTextField T1,T3;
    JButton D,E,AL;
    public void JavaProject()                        //////Method/////////
    {                                                   /////////LABEL//////
       

        
        A = new JLabel("WELCOME TO GST CALCULATOR");  
        B = new JLabel("USERNAME");                          ////Akshit////
        C = new JLabel("PASSWORD");                           ////root/////
        F = new JLabel("LOGIN");
        G = new JLabel("Don't Have an Account?");
        H = new JLabel("ADMIN");
        I = new JLabel("USERNAME");
        J = new JLabel("PASSWORD");
        
        A.setBounds(180,5,450,100);               //x,y,width,height of heading
        A.setFont(new Font("Serif", Font.BOLD, 25));         //For Font
    
        B.setBounds(20,20,200,280);                         // USername wali field
        B.setFont(new Font("Serif", Font.BOLD, 15));
    
        C.setBounds(20,20,200,400);                 // Password wali field
        C.setFont(new Font("Serif", Font.BOLD, 15));
        
        F.setBounds(50,50,200,150);
        F.setFont(new Font("Serif", Font.BOLD, 23));
        
        G.setBounds(20,20,200,600);
        G.setFont(new Font("Serif", Font.BOLD, 15));
        
        H.setBounds(550,50,200,150);
        H.setFont(new Font("Serif", Font.BOLD, 23));
        
        I.setBounds(450,20,200,280);
        I.setFont(new Font("Serif", Font.BOLD, 15));
    
        J.setBounds(450,20,200,400);
        J.setFont(new Font("Serif", Font.BOLD, 15));
    
        f.add(A);                               //Frame pe add karne ke liye use karte hai
        f.add(B);
        f.add(C);   
        f.add(F);    
        f.add(G);
        f.add(H); 
        f.add(I);
        f.add(J);                    //////LABEL////////
    
    
                                        ///////TextField///
        T1=new JTextField(" Ex: Mute_0211");  
        T1.setBounds(130,150,150,30);         ////Text field of username/////
        
        T3 = new JTextField();
        T3.setBounds(550,150,150,30);
        
        JPasswordField T2 = new JPasswordField();  ////Isse ... aata hai///// 
        T2.setBounds(130,210,150,30);         ////text Field of Password/////
        
        JPasswordField T4 = new JPasswordField();
        T4.setBounds(550,210,150,30);
        
        
        f.add(T1);
        f.add(T2); 
        f.add(T3);
        f.add(T4);                     ///////TextField///////
    
    
                                                ///////Button///////
        D = new JButton("Login");  
        D.setBounds(130,250,100,40);  
        E= new JButton("SignUp");                 /////Yeh Second Frame pe le jayega////  
        E.setBounds(130,350,100,40);  
        
        AL = new JButton("Login");  
        AL.setBounds(550,250,100,40);
        f.getContentPane().add(D);                                                                
        f.getContentPane().add(E);  
        f.getContentPane().add(AL);               //////Button////////

    
        E.addActionListener(new ActionListener(){   ////Action for Button E(Signup)//////
        public void actionPerformed(ActionEvent e)
        {
            f.dispose();                            ///First Frame will Close//////
            JavaProject1 p2 = new JavaProject1();  ////SignUp wala Frame////////
            p2.JavaProject1();                                                             
        }
        });
        AL.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            f.dispose();                          
            JavaProject0 p0 = new JavaProject0();   
            String s1 = T3.getText();
            String s2 = T4.getText();
            if(s1.equals("Akshit") && s2.equals("root"))
            {
                p0.JavaProject0();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
        }
        });
        D.addActionListener(new ActionListener(){  /////Action for Login Frame/////////
        public void actionPerformed(ActionEvent e)
        {
            f.dispose();                        //////First Frame will close////////
            JavaProject2 p3 = new JavaProject2();
            String s1 = T1.getText();
            String s2 = T2.getText();
            if(s1.equals("Aks") && s2.equals("123") || s1.equals("Ama") && s2.equals("123") || s1.equals("Shri") && s2.equals("123") || s1.equals("Singh") && s2.equals("123"))
            {
                JOptionPane.showMessageDialog(null, "Welcome To GST Calculator");
                p3.JavaProject2();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid UserId or Password");
                JavaProject p1 = new JavaProject();
                p1.JavaProject();
            }
            }
            });
        ImageIcon img = new ImageIcon("1.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,800,450);
        f.add(label);
            f.setSize(800,450);  //Window Size ke liye
            f.setLayout(null);  
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); /////////First frame will open next frame then close itself////
        
    }
    
public static void main(String args[])
{
    JavaProject p1 = new JavaProject();
    p1.JavaProject();  
    
}
}
/////////////////////////////



   //////////////////////////////////////////////////////////////////////// 
   //Second Jframe
class JavaProject1
{
    JFrame f1 = new JFrame("SignUp");
    JLabel P,Q,R,S,T,U; 
    JTextField T3,T4,T5; 
    JButton G;
    JPasswordField T6,T7;
    public void JavaProject1()               //////Method//////////////
    {
        P = new JLabel("First Name");          ///////Label/////////
        Q = new JLabel("Last Name");
        R = new JLabel("Username");
        S = new JLabel("Password");
        T = new JLabel("Confirm Password");
        U = new JLabel("CREATE YOUR ACCOUNT");
    
        P.setBounds(50,50,200,150);        //x,y,width,height of heading
        P.setFont(new Font("Serif", Font.BOLD, 20)); //For Font
    
        Q.setBounds(300,50,200,150);                    
        Q.setFont(new Font("Serif", Font.BOLD, 20));
    
        R.setBounds(50,120,200,150);                    
        R.setFont(new Font("Serif", Font.BOLD, 20));
    
        S.setBounds(50,180,200,150);                    
        S.setFont(new Font("Serif", Font.BOLD, 20));
    
        T.setBounds(300,180,250,150);                    
        T.setFont(new Font("Serif", Font.BOLD, 20));
        
        U.setBounds(50,40,250,40);                    
        U.setFont(new Font("Serif", Font.BOLD, 20));
        
    
        f1.add(P);   
        f1.add(Q);
        f1.add(R);
        f1.add(S);
        f1.add(T);                        /////////Label////////////
        f1.add(U);
    
    
                                          ///////TextField///
        T3=new JTextField();  
        T3.setBounds(50,140,200,25);  
        T4=new JTextField();  
        T4.setBounds(300,140,200,25); 
        T5=new JTextField();  
        T5.setBounds(50,210,200,25); 
        T6=new JPasswordField();  
        T6.setBounds(50,270,200,25); 
        T7=new JPasswordField();  
        T7.setBounds(300,270,200,25); 
        

    
        f1.add(T3);
        f1.add(T4);
        f1.add(T5);
        f1.add(T6);
        f1.add(T7);                  //////TextField////////////
    
                                          ///////Button///////
        G = new JButton("SIGN UP");  
        G.setBounds(200,330,100,40);   
        f1.getContentPane().add(G);       //////Button///////////
    
        G.addActionListener(new ActionListener(){      ///Action for SignUp frame Login Button/////
        public void actionPerformed(ActionEvent e)
        {
            f1.dispose();              /////SignUp frame will close///////////
            JavaProject2 p3 = new JavaProject2();  
            
        String S3 = T3.getText();
        String S4 = T4.getText();
        String S5 = T5.getText();
        String S6 = T6.getText();
            String s1 = T6.getText();
            String s2 = T7.getText();
            if(s1.equals(s2))
            {
                f1.dispose();
                p3.JavaProject2();
            }
            else
            {
               JavaProject1 p2 = new JavaProject1();  ////SignUp wala Frame////////
               JOptionPane.showMessageDialog(null,"Try Again, Password Didn't Match");
               p2.JavaProject1();
            }
            
        }
        });
        ImageIcon img = new ImageIcon("2.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,600,450);
        f1.add(label);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);////This line will close this frame and open the next frame///
        f1.setSize(600,450);  //Window Size ke liye
        f1.setLayout(null);  ///write everything in this code by myself because of null////
        f1.setVisible(true); //////It will make this frame visible//////
    }  
}
/////////////
class JavaProject0 
{
    public void JavaProject0()
    {
    JFrame f = new JFrame("Table");  
    String data[][] = {{"Akshit","Sharma","Aks","123"},
                       {"Aman","Rai","Ama","123"},
                       {"Aman","Shrivastav","Shri","123"},
                       {"Aman","Singh","Singh","123"}};    
    String column[]={"First Name","Second Name","Username","Password"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(40,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(600,450);    
    f.setVisible(true); 
    }
}




/////////////////////////////Third JFrame////////////////////
class JavaProject2 
{
    JFrame f2 = new JFrame("Info");
    JLabel U,V,v1,v2;
    JTextField T8,T9;
    JButton H,I;
    JComboBox cb;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "aks";
String pass = "alo264";
    public void JavaProject2()                                                     //////Method///////////
    {
        U = new JLabel("Select Product Name");              ///////Label//////
        U.setBounds(50,40,200,20);                    
        U.setFont(new Font("Serif", Font.BOLD, 15));
        f2.add(U);
        V = new JLabel("Net Price");
        V.setBounds(350,40,150,20);
        V.setFont(new Font("Serif", Font.BOLD, 15));
        f2.add(V);
    
        v1 = new JLabel("GST %");                          
        v1.setBounds(350,150,200,40);
        v1.setFont(new Font("Serif", Font.BOLD, 15));
        f2.add(v1);
        v2 = new JLabel("Enter Product Name(if not listed)");
        v2.setBounds(50,150,250,40);
        v2.setFont(new Font("Serif", Font.BOLD, 15));
        f2.add(v2); 
                                                                          /////Label/////  
        ////Combobox/////
        cb = new JComboBox();
        cb.setBounds(50,80,200,40);
        f2.add(cb);
try
{
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con = DriverManager.getConnection(url,user,pass);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select Product_Names from Products");

    while(rs.next())
    {
       cb.addItem(rs.getString("Product_Names"));
    }
    
    con.close();
}
catch(Exception ex)
{
    System.err.println(ex);
}
 
       


    
        String Product1[] = {"Standard - 18%","Farm Products - 0%","Mustard oil, Tea, Spices,etc. - 5%","Processed Foods - 12%","Cars and White Goods - 28%"};
        final JComboBox cb1 = new JComboBox(Product1);
        cb1.setBounds(350,190,200,40);
        f2.add(cb1);                                    ////////Combobox//////////
    
        T8 = new JTextField();                             /////TextField//////
        T8.setBounds(350,80,200,40);
        f2.add(T8);
        T9 = new JTextField();
        T9.setBounds(50,190,200,40);
        f2.add(T9);                                       /////////TextField//////
    
        H = new JButton("Add GST");                     /////////Button/////
        H.setBounds(100,280,130,50);   
        f2.getContentPane().add(H);
        
        H.addActionListener(new ActionListener(){                                       
        public void actionPerformed(ActionEvent ev)
        {
            f2.dispose();                                                               
            JavaProject3 p4 = new JavaProject3();
    
            String s1 = T9.getText();
            String s2 = T8.getText();
            String a1 = null;
            String s3 = (String) cb.getItemAt(cb.getSelectedIndex());
            String gst = (String) cb1.getItemAt(cb1.getSelectedIndex());
            
            if (cb.getSelectedItem().toString().equals(" "))
            {
                a1 = s1;
            }
            else
            {
                a1 = s3;
            }
            
            int ans=0;
            int grossprice = 0;
            int a = Integer.parseInt(s2);
            if(gst.equals("Standard - 18%"))
            {
                ans = (int) ((0.18)*(a));  
            }
            else if (gst.equals("Farm Products - 0%"))
            {
                ans = 0;
            }
            else if (gst.equals("Mustard oil, Tea, Spices,etc. - 5%"))
            {
                ans = (int)((0.05)*(a));
            }
            else if (gst.equals("Processed Foods - 12%"))
            {
                ans = (int) ((0.12)*(a));
            }
            else if (gst.equals("Cars and White Goods - 28%"))
            {
                ans = (int)  ((0.28)*(a));
            }
            grossprice = (a+ans);
            p4.JavaProject3(a1,s2,gst,ans,grossprice); 
            }
            });
        
            I = new JButton("Remove GST");
            I.setBounds(350,280,130,50);   
            f2.getContentPane().add(I);
            
        I.addActionListener(new ActionListener(){                                       
        public void actionPerformed(ActionEvent e)
        {
               f2.dispose();                                                               
               JavaProject4 p5 = new JavaProject4();
    
               String s1 = T9.getText(); ////////////Getting the information from TextField/////// 
               String s2 = T8.getText();
               String a1 = null;
               String s3 = (String) cb.getItemAt(cb.getSelectedIndex());
               String gst = (String) cb1.getItemAt(cb1.getSelectedIndex()); //////Putting values of Combobox in a variable/// 
                
            if (cb.getSelectedItem().toString().equals(" "))
            {
                a1 = s1;
            }
            else
            {
                a1 = s3;
            }
               int ans=0;
               int grossprice = 0;
               int a = Integer.parseInt(s2);         /////Converting String into Integer///
               if(gst.equals("Standard - 18%"))    /////Gst Combobox used/////
               {
                    ans = (int) ((0.18)*(a));    
               }
               else if (gst.equals("Farm Products - 0%"))
               {
                    ans = 0;
               }
               else if (gst.equals("Mustard oil, Tea, Spices,etc. - 5%"))
               {
                    ans = (int)((0.05)*(a));
               }
               else if (gst.equals("Processed Foods - 12%"))
               {
                    ans = (int) ((0.12)*(a));
               }
               else if (gst.equals("Cars and White Goods - 28%"))
               {
                    ans = (int)  ((0.28)*(a));
               }
               grossprice = (a-ans);
               p5.JavaProject4(a1,s2,gst,ans,grossprice);
        }
        });                                   ////Button////////////
        ImageIcon img = new ImageIcon("3.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,600,450);
        f2.add(label);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f2.setLayout(null);
    f2.setSize(600,450);
    f2.setVisible(true);
    
}

}




//////////////Fourth Frame/////////
class JavaProject3 extends JavaProject2
{
    JFrame f3 = new JFrame("Added GST");
    JLabel W,X,W1,X1,w;
    private JTextField T1,T2,T3,T4,T5;
    JButton B1;

public void JavaProject3(String a1, String s2, String gst,int ans, int grossprice)                                                      //////Method///////////
{
    W = new JLabel("Product Name: ");
    W.setBounds(50,50,200,40);                    
    W.setFont(new Font("Serif", Font.BOLD, 20));
    f3.add(W);
    X = new JLabel("Net Price: ");
    X.setBounds(50,100,200,40);
    X.setFont(new Font("Serif", Font.BOLD, 20));
    f3.add(X);
    W1 = new JLabel("GST %: ");
    W1.setBounds(50,150,200,40);                    
    W1.setFont(new Font("Serif", Font.BOLD, 20));
    f3.add(W1);
    X1 = new JLabel("GST Amount: ");
    X1.setBounds(50,200,200,40);
    X1.setFont(new Font("Serif", Font.BOLD, 20));
    f3.add(X1);
    w = new JLabel("Gross Price Including GST: ");
    w.setBounds(50,250,320,40);                    
    w.setFont(new Font("Serif", Font.BOLD, 20));
    f3.add(w);
    T1 = new JTextField();
    this.T1.setText(a1);
    T1.setBounds(200,50,200,40);                    
    T1.setFont(new Font("Serif", Font.BOLD, 15));
    T1.setEditable(false);
    f3.add(T1);
    T2 = new JTextField();
    this.T2.setText(s2);
    T2.setBounds(200,100,200,40);
    T2.setFont(new Font("Serif", Font.BOLD, 15));
    T2.setEditable(false);
    f3.add(T2);
    T3 = new JTextField();
    this.T3.setText(gst);
    T3.setBounds(200,150,200,40);                    
    T3.setFont(new Font("Serif", Font.BOLD, 15));
    T3.setEditable(false);
    f3.add(T3);
    T4 = new JTextField();
    this.T4.setText(Integer.toString(ans));
    T4.setBounds(200,200,200,40);
    T4.setFont(new Font("Serif", Font.BOLD, 15));
    T4.setEditable(false);
    f3.add(T4);
    T5 = new JTextField();
    this.T5.setText(Integer.toString(grossprice));
    T5.setBounds(300,250,200,40);
    T5.setFont(new Font("Serif", Font.BOLD, 15));
    T5.setEditable(false);
    f3.add(T5);
    
    B1 = new JButton("Back");
    B1.setBounds(250,350,100,40);
    f3.getContentPane().add(B1);
B1.addActionListener(new ActionListener(){                                       ///Action for SignUp frame Login Button/////
public void actionPerformed(ActionEvent e)
{
    f3.dispose();                                                               /////SignUp frame will close///////////
    JavaProject2 p3 = new JavaProject2();
    p3.JavaProject2();
}
});
        ImageIcon img = new ImageIcon("5.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,600,450);
        f3.add(label);
    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f3.setLayout(null);
    f3.setSize(600,450);
    f3.setVisible(true);
}
}



/////////////////Fifth Frame///////////////////
class JavaProject4 extends JavaProject2
{
    JFrame f4 = new JFrame("Removed GST");
    JLabel W,X,W1,X1,Y,Y1,Z1,Z,w,x;
    private JTextField T1,T2,T3,T4,T5;
    JButton B2;

public void JavaProject4(String a1, String s2, String gst, int ans, int grossprice)                                                      //////Method///////////
{
    W = new JLabel("Product Name: ");                     //////Label/////
    W.setBounds(50,50,200,40);                     
    W.setFont(new Font("Serif", Font.BOLD, 20));
    f4.add(W);
    X = new JLabel("Net Price: ");
    X.setBounds(50,100,200,40);
    X.setFont(new Font("Serif", Font.BOLD, 20));
    f4.add(X);
    W1 = new JLabel("GST %: ");
    W1.setBounds(50,150,200,40);                    
    W1.setFont(new Font("Serif", Font.BOLD, 20));
    f4.add(W1);
    X1 = new JLabel("GST Amount: ");
    X1.setBounds(50,200,200,40);
    X1.setFont(new Font("Serif", Font.BOLD, 20));
    f4.add(X1);
    w = new JLabel("Gross Price Excluding GST: ");
    w.setBounds(50,250,320,40);                    
    w.setFont(new Font("Serif", Font.BOLD, 20));
    f4.add(w);                                   /////////Label///////////
    
    T1 = new JTextField();              ////////TextField///////
    this.T1.setText(a1);
    T1.setBounds(200,50,200,40);                    
    T1.setFont(new Font("Serif", Font.BOLD, 15));
    f4.add(T1);
    T2 = new JTextField();
    this.T2.setText(s2);
    T2.setBounds(200,100,200,40);
    T2.setFont(new Font("Serif", Font.BOLD, 15));
    f4.add(T2);
    T3 = new JTextField();
    this.T3.setText(gst);
    T3.setBounds(200,150,200,40);                    
    T3.setFont(new Font("Serif", Font.BOLD, 15));
    f4.add(T3);
    T4 = new JTextField();
    this.T4.setText(Integer.toString(ans));
    T4.setBounds(200,200,200,40);
    T4.setFont(new Font("Serif", Font.BOLD, 15));
    f4.add(T4);
    T5 = new JTextField();
    this.T5.setText(Integer.toString(grossprice));
    T5.setBounds(300,250,200,40);
    T5.setBounds(300,250,200,40);
    T5.setFont(new Font("Serif", Font.BOLD, 15));
    f4.add(T5);                                     /////TextField//////
    
    B2 = new JButton("Back");                //////Button////////
    B2.setBounds(250,350,100,40);
    f4.getContentPane().add(B2);
B2.addActionListener(new ActionListener(){    ///Action for SignUp frame Login Button/////
public void actionPerformed(ActionEvent e)
{
    f4.dispose();                           /////SignUp frame will close///////////
    JavaProject2 p3 = new JavaProject2();
    p3.JavaProject2();  
}
});                                      ///////Button//////
        ImageIcon img = new ImageIcon("4.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,600,450);
        f4.add(label);
    f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f4.setLayout(null);
    f4.setSize(600,450);
    f4.setVisible(true);
    
}
}