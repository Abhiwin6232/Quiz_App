package quiz.application;
import javax.swing.*;  // to import jframe class in login class.
import java.awt.*; // to import Color class to set the background color of frame.
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField text;
    Login(){
        
        // to make the frame we are using functions.
     
     setVisible(true); // hmare frame ki visibility by default hidden hoti h means hm use dekh nhi skte to dekhne ke liye hm iski visibility true ki h.
     setLocation(100,100);// koi bhi frame ko jb hum run krte h tb wo hmesha top left me khulta h kyoki yeh default m set h to ab hme frame ko center m lana h to uske liye hm function use kr rhe h
     setSize(1200,500);//frame ki hight or width set karne ke liye.
     
     getContentPane().setBackground(Color.WHITE);// frame k andar k color set karne ke liye.
     setLayout(null);
     
     ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("quiz\\application\\login.jpeg")); // frame ke andr image add karne ke liye.
     JLabel image = new JLabel(img);
     image.setBounds(0,0,600,500);
     add(image);
     
     JLabel heading = new JLabel("Simple Minds"); // form ki heading dene ke liye.
     heading.setBounds(750,60,300,45);
     heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40)); // font ki style set karne ke liye.
     heading.setForeground(Color.BLUE);// font k color set karne ke liye.
     add(heading);
     
     JLabel name = new JLabel("Enter Your Name"); 
     name.setBounds(810,150,300,20);
     name.setFont(new Font("Mangolian Baiti",Font.BOLD,18)); 
     name.setForeground(Color.BLUE);
     add(name);
     
     text = new JTextField(); // yh hmne JTextField class k object banaya h jiska use koi box create karne ke liye kiya jata h jisme hm kuch bhi likh ske. 
     text.setBounds(735,200,300,25);
     text.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(text);
     
     rules = new JButton("Rules");// ynha hmne JButton class k object banaya h jiska use button create karne k liye kiya jata h.
     rules.setBounds(735,270,120,25); // means hme button ko knha set karna h isiliye setBounds function k use kiya h.
     rules.setBackground(Color.BLUE); // ise aise bhi likh skte h rules.setBackground(new color(30,144,254));  // color class k object crate karke background m color dal skte h.
     rules.setForeground(Color.WHITE);// text k color ko change karne ke liye .
     rules.addActionListener(this);// yh btata h ki koi action button pe performe hua h.
     add(rules);
                                           
     back = new JButton("Back");
     back.setBounds(915,270,120,25);
     back.setBackground(Color.BLUE); //
     back.setForeground(Color.WHITE);
     back.addActionListener( this);
     add(back);
             
    }
   
    // dono buttons pe koi action perform karne ke liye means click event lgane ke liye hmne actionListener interface ko implement kiya h
    // ar yh interface java ke awt ke event package ke andr rhta h, kyoki hmne actionListener interface ko implements kr rhe h to uski andr
    // ki abstract methods ko bhi implement krenge ar us method ke ande hm define krenge ki button pe kya action perform hua h.
    
     public void actionPerformed(ActionEvent e) { // yhi wo method h jiske andr hm define krenge ki kya action perform krna h.
         if(e.getSource()==rules){
                                                // ynha Actionevent class k object e k use karke hm define kr rhe h ar getSource function k use kr rhe h.
         
          String name = text.getText(); // jo kuch bhi hm box ke andr dal rhe h use hm unha getText() function ke help se string name m store kr rhe h.
          setVisible(false);
          new Rules(name);  // jaise he rules button pe koi click krega to hm frame ko band kr denge ar rules frame ko open krdenge isiliye 
                       // hmne Rules class k object bnaya h Rules frame ko user ko show krne ke liye ar usme hmne name variable ko pass kr diya h 
         }             // jo rules class ke string name m store ho gya h.
         
         else if(e.getSource()== back){
             
             setVisible(false);  // jaise he back button pe click hoga frame bnd ho jayega.
         
    }
     }
     
     
     
     public static void main(String[]args){
     new Login();   
     }

    
   
    }
        

    
    
    











