package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,50,750,650); // hmne ynha setBounds function k use setSize fuction and setLocation function ko ek sath
                                                  // implement karne ke liye kiya h kyoki setBounds function jb kisi bhi component or variable ke 
                                                  // dwara call nhi kiya j rha h isiliye setBounds functin k use hm dono function ko ek sath
                                                  // implement karne ke liye kr sakte h.
        setLayout(null);
        
        setVisible(true);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("quiz\\application\\score.png")); // frame ke andr image add karne ke liye.
        Image img1 = img.getImage().getScaledInstance(400, 300,Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(img1);
        JLabel image = new JLabel(img2);
        image.setBounds(0,0,550,800);
        add(image);
        
        JLabel heading = new JLabel("Thankyou "+name+" for playing Simple Minds"); 
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        add(heading);
        
        JLabel scorecard = new JLabel("Yout score is  "+ score); 
        scorecard.setBounds(350,200,300,30);
        scorecard.setFont(new Font("Tahoma",Font.BOLD,26));
        add(scorecard);
        
                        
       JButton submit = new JButton("Play Again");
       submit.setBounds(390,270,120,30);
       //submit.setFont(new Font("Tahoma",Font.PLAIN,22));
       submit.setBackground(Color.BLUE);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       add(submit);
               
        
    }
    
    public static void main(String [] args){
        
        new Score("user",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
        
    }
    
}
