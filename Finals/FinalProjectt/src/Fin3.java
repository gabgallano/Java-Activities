import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border; // library for designing the border

public class Fin3{
	
	private JFrame frame; //container where the content is displayed
	private ImageIcon bg; // storage of the background
	private JLabel myLabel; //storage of the content
	
	public Fin3() {

		
		bg = new ImageIcon("images/backgroundbg.png");
		myLabel = new JLabel(bg);
		myLabel.setSize(870,860);

        JLabel title = new JLabel(" ");
        title.setBounds(250, 1, 450, 100);
        ImageIcon Border = new ImageIcon("images/border.png"); // for the title
        title.setIcon(Border); 
        
        String name = JOptionPane.showInputDialog(null,"What is your name?"); // to ask for the user's name
        
        
        JLabel Greeting = new JLabel(" "); // for the greeting character
        Greeting.setBounds(1, 1, 440, 100);
        ImageIcon Greet = new ImageIcon("images/hi.png"); 
        Greeting.setIcon(Greet); 
        
        JLabel Hello = new JLabel("  Hello, " + name+"!"); // for the message bubble content
        Hello.setBounds (85,13, 150,50);
        Hello.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        myLabel.add(Hello);
        JLabel learn = new JLabel("Learn the Alphabet");
        learn.setBounds (85,27, 170,50);
        learn.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        myLabel.add(learn);
        JLabel learnctd = new JLabel("     with me!");
        learnctd.setBounds (85,42, 170,50);
        learnctd.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        myLabel.add(learnctd);
        
        
        JButton Quiz = new JButton("Quiz");
        Quiz.setBounds(645, 25, 55, 55);
        Quiz.setBackground(Color.decode("#6FDFEB")); // Setting Button Background Color
        ImageIcon QuizButton = new ImageIcon("images/quizbutton.png"); //Importing the button background image
        Quiz.setIcon(QuizButton); // Putting the background on the button itself
        Quiz.setBorder(new Round(20)); // Setting Border Radius
        Quiz.setForeground(Color.decode("#6FDFEB")); // Setting Button Foreground Color
        myLabel.add(Quiz);
        
        Quiz.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
 
            	Quiz1 p1=new Quiz1(); // directory of where it would go after clicking the button "nexT"
                    }});
        
        
        
        ImageIcon Border1 = new ImageIcon("images/border1.png"); // for the frame of the textbox
        JLabel borderr = new JLabel(" ");
        borderr.setBounds(55, 90, 800, 175);
        borderr.setIcon(Border1); // for the frame of the textbox

        
        JLabel a1 = new JLabel(""); // for the alphabet image
        a1.setBounds (110,110, 150,130);
        myLabel.add(a1);
        
        JTextField a2 = new JTextField(6); // for the textfield
        a2.setBounds (325,110, 200,130);
        a2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        a2.setBorder(new Round(20)); // Setting Border Radius
        myLabel.add(a2);
        
        JLabel a3 = new JLabel(""); // for the example image
        a3.setBounds (590,110, 150,130);
        myLabel.add(a3);

        ImageIcon A = new ImageIcon("images/A.png"); // for importing the image of the letter
        ImageIcon Apple = new ImageIcon("images/Apple.jpg"); // for importing the sample image
        JButton a = new JButton ("Aa");
        a.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        a.setBounds (60,275,120,105);
        a.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        a.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        a.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Aa = new ImageIcon("images/Aa.png"); //Importing the button background image
        a.setIcon(Aa); // Putting the background on the button itself
        a.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(A);
                a2.setText ("A is for Apple");
                a3.setIcon(Apple);
                    }}); myLabel.add(a);
                    
        ImageIcon B = new ImageIcon("images/B.png"); // for importing the image of the letter
        ImageIcon Butterfly = new ImageIcon("images/Butterfly.png"); // for importing the sample image
        JButton b = new JButton ("Bb");
        b.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        b.setBounds (185,275,120,105);
        b.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        b.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        b.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Bb = new ImageIcon("images/Bb.png"); //Importing the button background image
        b.setIcon(Bb); // Putting the background on the button itself
        b.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(B);
                a2.setText ("B is for Butterfly");
                a3.setIcon(Butterfly);
                    }}); myLabel.add(b);

        ImageIcon C = new ImageIcon("images/C.png"); // for importing the image of the letter
        ImageIcon Cat = new ImageIcon("images/Cat.jpg"); // for importing the sample image
        JButton c = new JButton ("Cc");
        c.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        c.setBounds (310,275,120,105);
        c.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        c.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        c.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Cc = new ImageIcon("images/Cc.png"); //Importing the button background image
        c.setIcon(Cc); // Putting the background on the button itself
        c.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(C);
                a2.setText ("C is for Cat");
                a3.setIcon(Cat);
                    }}); myLabel.add(c); 
                                     
        ImageIcon D = new ImageIcon("images/D.png"); // for importing the image of the letter
        ImageIcon Dog = new ImageIcon("images/Dog.png"); // for importing the sample image
        JButton d = new JButton ("Dd");
        d.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        d.setBounds (435,275,120,105);
        d.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        d.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        d.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Dd = new ImageIcon("images/Dd.png"); //Importing the button background image
        d.setIcon(Dd); // Putting the background on the button itself
        d.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(D);
                a2.setText ("D is for Dog");
                a3.setIcon(Dog);
                    }}); myLabel.add(d);   
                               
        ImageIcon E = new ImageIcon("images/E.png"); // for importing the image of the letter
        ImageIcon Egg = new ImageIcon("images/Egg.png"); // for importing the sample image
        JButton e = new JButton ("Dd");
        e.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        e.setBounds (560,275,120,105);
        e.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        e.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        e.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ee = new ImageIcon("images/Ee.png"); //Importing the button background image
        e.setIcon(Ee); // Putting the background on the button itself
        e.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(E);
                a2.setText ("E is for Egg");
                a3.setIcon(Egg);
                    }}); myLabel.add(e);     
                    
        ImageIcon F = new ImageIcon("images/F.png"); // for importing the image of the letter
        ImageIcon Flower = new ImageIcon("images/Flower.png"); // for importing the sample image
        JButton f = new JButton ("Ff");
        f.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        f.setBounds (685,275,120,105);
        f.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        f.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        f.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ff = new ImageIcon("images/Ff.png"); //Importing the button background image
        f.setIcon(Ff); // Putting the background on the button itself
        f.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(F);
                a2.setText ("F is for Flower");
                a3.setIcon(Flower);
                    }}); myLabel.add(f);   
                                  
        ImageIcon G = new ImageIcon("images/G.png"); // for importing the image of the letter
        ImageIcon Goat = new ImageIcon("images/Goat.jpg"); // for importing the sample image
        JButton g = new JButton ("Gg");
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        g.setBounds (60,385,120,105);
        g.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        g.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        g.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Gg = new ImageIcon("images/Gg.png"); //Importing the button background image
        g.setIcon(Gg); // Putting the background on the button itself
        g.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(G);
                a2.setText ("G is for Goat");
                a3.setIcon(Goat);
                    }}); myLabel.add(g);
                                     
        ImageIcon H = new ImageIcon("images/H.png"); // for importing the image of the letter
        ImageIcon Hat = new ImageIcon("images/Hat.png"); // for importing the sample image
        JButton h = new JButton ("Hh");
        h.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        h.setBounds (185,385,120,105);
        h.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        h.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        h.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Hh = new ImageIcon("images/Hh.png"); //Importing the button background image
        h.setIcon(Hh); // Putting the background on the button itself
        h.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(H);
                a2.setText ("H is for Hat");
                a3.setIcon(Hat);
                    }}); myLabel.add(h);               

        ImageIcon I = new ImageIcon("images/I.png"); // for importing the image of the letter
        ImageIcon Igloo = new ImageIcon("images/Igloo.png"); // for importing the sample image
        JButton i = new JButton ("Ii");
        i.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        i.setBounds (310,385,120,105);
        i.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        i.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        i.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ii = new ImageIcon("images/Ii.png"); //Importing the button background image
        i.setIcon(Ii); // Putting the background on the button itself
        i.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(I);
                a2.setText ("I is for Igloo");
                a3.setIcon(Igloo);
                    }}); myLabel.add(i);   
                    
        ImageIcon J = new ImageIcon("images/J.png"); // for importing the image of the letter
        ImageIcon Jacket = new ImageIcon("images/Jacket.png"); // for importing the sample image
        JButton j = new JButton ("Jj");
        j.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        j.setBounds (435,385,120,105);
        j.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        j.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        j.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Jj = new ImageIcon("images/Jj.png"); //Importing the button background image
        j.setIcon(Jj); // Putting the background on the button itself
        j.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(J);
                a2.setText ("J is for Jacket");
                a3.setIcon(Jacket);
                    }}); myLabel.add(j);   
                    
        ImageIcon K = new ImageIcon("images/K.png"); // for importing the image of the letter
        ImageIcon Key = new ImageIcon("images/Key.png"); // for importing the sample image
        JButton k = new JButton ("Jj");
        k.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        k.setBounds (560,385,120,105);
        k.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        k.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        k.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Kk = new ImageIcon("images/Kk.png"); //Importing the button background image
        k.setIcon(Kk); // Putting the background on the button itself
        k.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(K);
                a2.setText ("K is for Key");
                a3.setIcon(Key);
                    }}); myLabel.add(k);
                
        ImageIcon L = new ImageIcon("images/L.png"); // for importing the image of the letter
        ImageIcon Lion = new ImageIcon("images/Lion.jpg"); // for importing the sample image
        JButton l = new JButton ("Ll");
        l.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        l.setBounds (685,385,120,105);
        l.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        l.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        l.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ll = new ImageIcon("images/Ll.png"); //Importing the button background image
        l.setIcon(Ll); // Putting the background on the button itself
        l.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(L);
                a2.setText ("L is for Lion");
                a3.setIcon(Lion);
                    }}); myLabel.add(l);              
                    
        ImageIcon M = new ImageIcon("images/M.png"); // for importing the image of the letter
        ImageIcon Mouse = new ImageIcon("images/Mouse.jpg"); // for importing the sample image
        JButton m = new JButton ("Mm");
        m.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        m.setBounds (60,495,120,105);
        m.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        m.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        m.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Mm = new ImageIcon("images/Mmpng.png"); //Importing the button background image
        m.setIcon(Mm); // Putting the background on the button itself
        m.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(M);
                a2.setText ("M is for Mouse");
                a3.setIcon(Mouse);
                    }}); myLabel.add(m); 
                    
        ImageIcon N = new ImageIcon("images/N.png"); // for importing the image of the letter
        ImageIcon Nest = new ImageIcon("images/Nest.jpg"); // for importing the sample image
        JButton n = new JButton ("Nn");
        n.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        n.setBounds (185,495,120,105);
        n.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        n.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        n.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Nn = new ImageIcon("images/Nn.png"); //Importing the button background image
        n.setIcon(Nn); // Putting the background on the button itself
        n.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(N);
                a2.setText ("N is for Nest");
                a3.setIcon(Nest);
                    }}); myLabel.add(n); 
                    
        ImageIcon O = new ImageIcon("images/O.png"); // for importing the image of the letter
        ImageIcon Owl = new ImageIcon("images/Owl.png"); // for importing the sample image
        JButton o = new JButton ("Oo");
        o.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        o.setBounds (310,495,120,105);
        o.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        o.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        o.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Oo = new ImageIcon("images/Oo.png"); //Importing the button background image
        o.setIcon(Oo); // Putting the background on the button itself
        o.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(O);
                a2.setText ("O is for Owl");
                a3.setIcon(Owl);
                    }}); myLabel.add(o);  
                    
        ImageIcon P = new ImageIcon("images/P.png"); // for importing the image of the letter
        ImageIcon Panda = new ImageIcon("images/Panda.jpg"); // for importing the sample image
        JButton p = new JButton ("Pp");
        p.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        p.setBounds (435,495,120,105);
        p.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        p.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        p.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Pp = new ImageIcon("images/Pp.png"); //Importing the button background image
        p.setIcon(Pp); // Putting the background on the button itself
        p.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(P);
                a2.setText ("P is for Panda");
                a3.setIcon(Panda);
                    }}); myLabel.add(p);

        ImageIcon Q = new ImageIcon("images/Q.png"); // for importing the image of the letter
        ImageIcon Quilt = new ImageIcon("images/Quilt.png"); // for importing the sample image
        JButton q = new JButton ("Pp");
        q.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        q.setBounds (560,495,120,105);
        q.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        q.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        q.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Qq = new ImageIcon("images/Qq.png"); //Importing the button background image
        q.setIcon(Qq); // Putting the background on the button itself
        q.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(Q);
                a2.setText ("Q is for Quilt");
                a3.setIcon(Quilt);
                    }}); myLabel.add(q);

        ImageIcon R = new ImageIcon("images/R.png"); // for importing the image of the letter
        ImageIcon Rainbow = new ImageIcon("images/Rainbow.png"); // for importing the sample image
        JButton r = new JButton ("Oo");
        r.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        r.setBounds (685,495,120,105);
        r.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        r.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        r.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Rr = new ImageIcon("images/Rr.png"); //Importing the button background image
        r.setIcon(Rr); // Putting the background on the button itself
        r.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(R);
                a2.setText ("R is for Rainbow");
                a3.setIcon(Rainbow);
                    }}); myLabel.add(r);              
                    
        ImageIcon S = new ImageIcon("images/S.png"); // for importing the image of the letter
        ImageIcon Sun = new ImageIcon("images/Sun.jpg"); // for importing the sample image
        JButton s = new JButton ("Ss");
        s.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        s.setBounds (60,605,120,105);
        s.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        s.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        s.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ss = new ImageIcon("images/Ss.png"); //Importing the button background image
        s.setIcon(Ss); // Putting the background on the button itself
        s.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(S);
                a2.setText ("S is for Sun");
                a3.setIcon(Sun);
                    }}); myLabel.add(s);
                    
        ImageIcon T = new ImageIcon("images/T.png"); // for importing the image of the letter
        ImageIcon Tree = new ImageIcon("images/Tree.png"); // for importing the sample image
        JButton t = new JButton ("Tt");
        t.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        t.setBounds (185,605,120,105);
        t.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        t.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        t.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Tt = new ImageIcon("images/Tt.png"); //Importing the button background image
        t.setIcon(Tt); // Putting the background on the button itself
        t.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(T);
                a2.setText ("T is for Tree");
                a3.setIcon(Tree);
                    }}); myLabel.add(t);
                    
        ImageIcon U = new ImageIcon("images/U.png"); // for importing the image of the letter
        ImageIcon Umbrella = new ImageIcon("images/Umbrella.png"); // for importing the sample image
        JButton u = new JButton ("Uu");
        u.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        u.setBounds (310,605,120,105);
        u.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        u.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        u.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Uu = new ImageIcon("images/Uu.png"); //Importing the button background image
        u.setIcon(Uu); // Putting the background on the button itself
        u.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(U);
                a2.setText ("U is for Umbrella");
                a3.setIcon(Umbrella);
                    }}); myLabel.add(u);
                   
        ImageIcon V = new ImageIcon("images/V.png"); // for importing the image of the letter
        ImageIcon Violin = new ImageIcon("images/Violin.jpg"); // for importing the sample image
        JButton v = new JButton ("Vv");
        v.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        v.setBounds (435,605,120,105);
        v.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        v.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        v.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Vv = new ImageIcon("images/Vv.png"); //Importing the button background image
        v.setIcon(Vv); // Putting the background on the button itself
        v.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(V);
                a2.setText ("V is for Violin");
                a3.setIcon(Violin);
                    }}); myLabel.add(v);
                    
        ImageIcon W = new ImageIcon("images/W.png"); // for importing the image of the letter
        ImageIcon Whale = new ImageIcon("images/Whale.png"); // for importing the sample image
        JButton w = new JButton ("Ww");
        w.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        w.setBounds (560,605,120,105);
        w.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        w.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        w.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Ww = new ImageIcon("images/Ww.png"); //Importing the button background image
        w.setIcon(Ww); // Putting the background on the button itself
        w.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(W);
                a2.setText ("W is for Whale");
                a3.setIcon(Whale);
                    }}); myLabel.add(w);
                    
        ImageIcon X = new ImageIcon("images/X.png"); // for importing the image of the letter
        ImageIcon Xylophone = new ImageIcon("images/Xylophone.jpg"); // for importing the sample image
        JButton x = new JButton ("Xx");
        x.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        x.setBounds (685,605,120,105);
        x.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        x.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        x.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Xx = new ImageIcon("images/Xx.png"); //Importing the button background image
        x.setIcon(Xx); // Putting the background on the button itself
        x.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(X);
                a2.setText ("X is for Xylophone");
                a3.setIcon(Xylophone);
                    }}); myLabel.add(x);
                    
        ImageIcon Y = new ImageIcon("images/Y.png"); // for importing the image of the letter
        ImageIcon Yarn = new ImageIcon("images/Yarn.png"); // for importing the sample image
        JButton y = new JButton ("Yy");
        y.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        y.setBounds (310,715,120,105);
        y.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        y.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        y.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Yy = new ImageIcon("images/Yy.png"); //Importing the button background image
        y.setIcon(Yy); // Putting the background on the button itself
        y.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(Y);
                a2.setText ("Y is for Yarn");
                a3.setIcon(Yarn);
                    }}); myLabel.add(y);
                    
        ImageIcon Z = new ImageIcon("images/Z.png"); // for importing the image of the letter          
        ImageIcon Zebra = new ImageIcon("images/Zebra.png"); // for importing the sample image
        JButton z = new JButton ("Zz");
        z.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        z.setBounds (435,715,120,105);
        z.setBackground(Color.decode("#87E7F1")); // Setting Button Background Color
        z.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        z.setBorder(new Round(40)); // Setting Border Radius on the button
        ImageIcon Zz = new ImageIcon("images/Zz.png"); //Importing the button background image
        z.setIcon(Zz); // Putting the background on the button itself
        z.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                a1.setIcon(Z);
                a2.setText ("Z is for Zebra");
                a3.setIcon(Zebra);
                    }}); myLabel.add(z); 
 
        myLabel.add(title);
        myLabel.add(borderr);
        myLabel.add(Greeting);

		frame = new JFrame("LEARNING THE ALPHABET");
		frame.add(myLabel);

		
		frame.setSize(880,860);;
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
	
		new Fin3();



	}
}






class Round implements Border // to implement rounded border
{
    private int r;
    Round(int r) {
        this.r = r;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, 
    int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, r, r);
    }
}
