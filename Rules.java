package quiz.application;
import java.awt.*;
import javax.swing.*;           // ynha hm rules ke liye ek frame bna rhe h.
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton back,start;
    Rules(String name){
        this.name=name;
        
        getContentPane().setBackground(Color.WHITE);// frame k andar k color set karne ke liye.
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome"+" "+name+" "+"to Simple Minds"); // form ki heading dene ke liye.
        heading.setBounds(70,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28)); // font ki style set karne ke liye.
        heading.setForeground(Color.BLUE);// font k color set karne ke liye.
        add(heading);
        
        JLabel rules = new JLabel(); 
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.BOLD,16)); 
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
);                          // isme <br> tag k use nextLine ke liye kiya h jaise he ek rule print hoga uske baad dusra rule nextLine m print hoga. 
        
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLUE); //
        back.setForeground(Color.WHITE);
        back.addActionListener( this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.BLUE); //
        start.setForeground(Color.WHITE);
        start.addActionListener( this);
        add(start);
        
        setSize(800,650);
        setLocation(300,50);
        setVisible(true);
        
    }
    
 public static void main(String []args){
  new Rules("user"); 
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== start){
           setVisible(false);
           new Quiz(name);
           
       }
       else if(e.getSource()== back){
           setVisible(false);
           new Login();
       }
    }

    
}
