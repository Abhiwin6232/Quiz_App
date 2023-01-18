package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];// hmne ynha 10 rows liye h kyoki hmare pas 10 questions h and 5 coloums liye jisme se 1 column m question store hoga 
                                             // ar baki 4 column m questions ke options .
    
    String answers[][] = new String [10][2]; // hmne ynha 10 rows liye h kyoki hmare pas 10 questions h ar 1 column liya h kyoki 
                                             // har question k ek answer h to usko store karan ke liye har question ke liye 1 column.
    
    String useranswers [][] = new String [10][1];
    
    JLabel queNo,que;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,lifeline,submit;
    
    public static int timer = 15;  // ynha hmme initially time 15 liya h to agr hme ar adhik lena h to hm ynha se increse kar skte h
    public static int ans_given = 0; // yh hmne yh check karne ke liye bnaya h ki user ne kisi bhi question k answer diya h ki nhi 
                                    // means user ne kisi bhi option ko select kiya h ki nhi agr nhi kiya h to uski value 0 h.
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name){
        
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setBounds(50,0,1260,850); // hmne ynha setBounds function k use setSize fuction and setLocation function ko ek sath
                                                  // implement karne ke liye kiya h kyoki setBounds function jb kisi bhi component or variable ke 
                                                  // dwara call nhi kiya j rha h isiliye setBounds functin k use hm dono function ko ek sath
                                                  // implement karne ke liye kr sakte h.
        setLayout(null);
        
        setVisible(true);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("quiz\\application\\quiz.jpg")); // frame ke andr image add karne ke liye.
        JLabel image = new JLabel(img);
        image.setBounds(0,0,1250,392);
        add(image);
        
        queNo = new JLabel(); // Questions k number dalne ke liye.
        queNo.setBounds(30,450,50,30);
        queNo.setFont(new Font("Tahoma",Font.BOLD,20));
        add(queNo);
               
        que = new JLabel(); // Questions dalne ke liye.
        que.setBounds(70,450,900,30);
        que.setFont(new Font("Tahoma",Font.BOLD,20));
        add(que);
        
        ////////////////////////////////////////////////////////////
        //Please find the Qustions with Options of Quiz Application
        ////////////////////////////////////////////////////////////	

	questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

////////////////////////////////////////////////////////////
//Find below the Answers Array of the above Questions
////////////////////////////////////////////////////////////	
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
       opt1 = new JRadioButton();   
       opt1.setBounds(70,520,700,30);
       opt1.setFont(new Font("Dialog",Font.PLAIN,20));
       opt1.setBackground(Color.WHITE);
       add(opt1);
       
       opt2 = new JRadioButton();
       opt2.setBounds(70,560,700,30);
       opt2.setFont(new Font("Dialog",Font.PLAIN,20));
       opt2.setBackground(Color.WHITE);
       add(opt2);
       
       opt3 = new JRadioButton();
       opt3.setBounds(70,600,700,30);
       opt3.setFont(new Font("Dialog",Font.PLAIN,20));
       opt3.setBackground(Color.WHITE);
       add(opt3);
       
       opt4 = new JRadioButton();
       opt4.setBounds(70,640,700,30);
       opt4.setFont(new Font("Dialog",Font.PLAIN,20));
       opt4.setBackground(Color.WHITE);
       add(opt4);
        
       groupoptions = new ButtonGroup(); // ynha hmne ButtonGroup class k object bnaya h  sari radiobuttons ko group m karne ke liye
                                                   // means jaise he hm ek option select krenge baki options apne aap deselect ho jayenge.
       groupoptions.add(opt1);
       groupoptions.add(opt2);
       groupoptions.add(opt3);
       groupoptions.add(opt4);
       
       
       next = new JButton("Next");
       next.setBounds(965,520,200,40);
       next.setFont(new Font("Tahoma",Font.PLAIN,22));
       next.setBackground(Color.BLUE);
       next.setForeground(Color.WHITE);
       next.addActionListener(this);
       add(next);
       
       lifeline = new JButton("50-50 LifeLine");
       lifeline.setBounds(965,580,200,40);
       lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
       lifeline.setBackground(Color.BLUE);
       lifeline.setForeground(Color.WHITE);
       lifeline.addActionListener(this);
       add(lifeline);
                      
       submit = new JButton("Submit");
       submit.setBounds(965,640,200,40);
       submit.setFont(new Font("Tahoma",Font.PLAIN,22));
       submit.setBackground(Color.BLUE);
       submit.setForeground(Color.WHITE);
       submit.setEnabled(false);    // ynha hmne submit.setEnabled() function k use kiya h jiska use karke ar usme value false pass krke hm kisi bhi button ko 
                                    // disabaled kr skte h kyoki hmne submit button m use kiya h to hmne value false pass karke use disabled kr diya h.
       
       submit.addActionListener(this);                           
       add(submit);
       
       Start(count);

    }
    
    public void paint(Graphics g){ // ab hme timer show karna h to uske liye hmne graphics class k use kiya h ar hme baar baar 
                                  // frame ko update karna pdega har question ke liye to uske liye hmne paint class k use kiya h
                                  // jiske help se hm baar baar frame ko update kar skte h to paint class ek graphics class k objet
                                  // leta h to hmne uska ek object create kiya h graphics g
        super.paint(g);
        
        String time = "Time left - "+ timer +" seconds"; // yh graphics h jise hme frame m show karna h
        
        g.setColor(Color.RED);  // hme time m jo text dala hua h to uske text ke color ko change karne ke liye hme graphics class ke object
                                  // ki help leni pdegi. graphics m color ko change karne ke liye hm setColor() function k use krenge.
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        
        if(timer > 0){
            g.drawString(time, 965, 500); // drawString() function ke help se hm apni string ko knha show karna chahte h, yh kar skte h.
        }
        else{
            g.drawString( "Times up!!",965,500);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000); // ab hme apne timer ko har ek second baad decrease karna h to usko perform karne ke liye 
                                     // Multithreading ki ek calss hoti h Thread class jiske andr thread.sleep() method hoti h jiske andr aap
                                     // jitna bhi time dalne chahe dal skte h yh mili seconds m value leta h isiliye hme 1sec=1000ms to 
                                     // 1000 dala h.
                                     
            repaint();              // paint method ko baar baar call karne ke liye jisse frame har 1sec m update hota rhe to repaint()
                                    // method ko call kiya h.
            
        }  catch(Exception e){
            e.printStackTrace();
    }
        
       if(ans_given == 1){  // means user ne answer diya h.
           ans_given = 0; // next question ke liye check krenge ki user ne answer diya h ki nhi ar timer ki value bhi next question ke
           timer = 15;  // liye update krdenge.
       }
       else if(timer < 0){
           timer = 15;
           
         opt1.setEnabled(true);
           opt2.setEnabled(true);
             opt3.setEnabled(true);
               opt4.setEnabled(true);
               
                 if(count == 8){
                   next.setEnabled(false);
                   submit.setEnabled(true);
         }
                 
                 if(count == 9){
                     if(groupoptions.getSelection() == null){
                         useranswers[count][0] = "";
                         
                         }else{
               
                            useranswers[count][0] = groupoptions.getSelection().getActionCommand();  
                     }
                     for(int i = 0; i<useranswers.length; i++){
                         
                         if(useranswers[i][0].equals(answers[i][1])){
                             score += 10;
                     }
                         
                     }
                     
                     setVisible(false);
                     new Score(name,score);
                 }
                 
                 else{
                 
                   
     
           if(groupoptions.getSelection() == null){ // ynha getselection() method hme user ne kaun s option select kiya h uski valye 
                                                   // lake dega ydi koi option select nhi kiya to uski value null h.
                                                   
              useranswers[count][0] = "";   // means user ne koi answer nhi diya h,question chod diya h.
              
        }else{
               
         useranswers[count][0] = groupoptions.getSelection().getActionCommand();// groupoptions m se getselection method hme option
                                                                                 // ki value lake dega ar getActionCommand method hme option m 
                                                                   //kya answer store tha use lake dega ar use useranswers m store kr dega hr ek question
                                                                   // ke liye ydi answer null h to empty string store hojayegi.
           }    
           
           count++;
           Start(count);
               
           }
       }          
        
    }
        
    
    public void Start(int count){
        
        queNo.setText(""+(count+1)+". "); // question no show karne ke liye. 
        que.setText(questions[count][0]); // question show karne ke liye,
        
        opt1.setText(questions[count][1]);// questions ke options show karne ke liye.
        opt1.setActionCommand(questions[count][1]);// answer ko get karne ke liye.
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection(); // jaise hmne phle question m koi option select kiya to jaise 
                                     // he hm dusre question m jayenge to jo option hmne phle question m select kiya tha wo dusre 
                                     // question m bhi selected hoga to is problem to dur karne ke liye clearSeletion() function k use kiya h.
        
    }
    
    public static void main (String[]args){
        new Quiz("user");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
         repaint();
         
         opt1.setEnabled(true);
           opt2.setEnabled(true);
             opt3.setEnabled(true);
               opt4.setEnabled(true);
               
         ans_given = 1;
         
         
         if(groupoptions.getSelection() == null){ // ynha getselection() method hme user ne kaun s option select kiya h uski valye 
                                                   // lake dega ydi koi option select nhi kiya to uski value null h.
                                                   
              useranswers[count][0] = "";   // means user ne koi answer nhi diya h,question chod diya h.
              
        }else{
               
         useranswers[count][0] = groupoptions.getSelection().getActionCommand();// groupoptions m se getselection method hme option
                                                                                 // ki value lake dega ar getActionCommand method hme option m 
                                                                   //kya answer store tha use lake dega ar use useranswers m store kr dega hr ek question
                                                                   // ke liye ydi answer null h to empty string store hojayegi.
               
           }
         
         if(count == 8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
         
         count++;
         Start(count);
         
         
        }
        else if(e.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        
        }
        else if(e.getSource() == submit){
            ans_given = 1;
            
               if(groupoptions.getSelection() == null){
                         useranswers[count][0] = "";
                         
                         }else{
               
                            useranswers[count][0] = groupoptions.getSelection().getActionCommand();  
                     }
                     for(int i = 0; i<useranswers.length; i++){
                         
                         if(useranswers[i][0].equals(answers[i][1])){
                             score += 10;
                     }
                         
                     }
                     
                     setVisible(false);
                     new Score(name,score); // Score class ko username ar socre pass kar rhe h.
        }
        
    }
    
}
