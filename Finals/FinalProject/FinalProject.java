import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.Font;

import javax.swing.*;
public class FinalProject{
    public static void main (String[] args){
        JFrame frame = new JFrame ("Learning the Alphabet");
        JLabel title = new JLabel("Learning the Alphabet");
        title.setBounds(270, 10, 400, 50);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        frame.add(title);
        JLabel a1 = new JLabel("");
        a1.setBounds (180,70, 150,130);
        frame.getContentPane().add(a1);
        JTextField a2 = new JTextField(6);
        a2.setBounds (340,70, 175,130);
        a2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        JLabel a3 = new JLabel("");
        a3.setBounds (525,70, 150,130);
        frame.getContentPane().add(a3);

        frame.add(a2); frame.add(a3);
        
        ImageIcon A = new ImageIcon("images/A.png");
        ImageIcon Apple = new ImageIcon("images/Apple.jpg");
        ImageIcon B = new ImageIcon("images/B.png");
        ImageIcon Butterfly = new ImageIcon("images/Butterfly.png");
        ImageIcon C = new ImageIcon("images/C.png");
        ImageIcon Cat = new ImageIcon("images/Cat.jpg");
        ImageIcon D = new ImageIcon("images/D.png");
        ImageIcon Dog = new ImageIcon("images/Dog.png");
        ImageIcon E = new ImageIcon("images/E.png");
        ImageIcon Egg = new ImageIcon("images/Egg.png");
        ImageIcon F = new ImageIcon("images/F.png");
        ImageIcon Flower = new ImageIcon("images/Flower.png");

    JButton a = new JButton ("Aa");
    a.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    a.setBounds (50,230,120,100);
    a.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            a1.setIcon(A);
            a2.setText ("A is for Apple");
            a3.setIcon(Apple);
                }        
            });
    JButton b = new JButton ("Bb");
    b.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    b.setBounds (175,230,120,100);
    b.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
        	a1.setIcon(B);
            a2.setText ("B is for Butterfly");
            a3.setIcon(Butterfly);
                }        
            });  
    JButton c = new JButton ("Cc");
    c.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    c.setBounds (300,230,120,100);
    c.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
        	a1.setIcon(C);
            a2.setText ("C is for Cat");
            a3.setIcon(Cat);
                }        
            });              
    JButton d = new JButton ("Dd");
    d.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    d.setBounds (425,230,120,100);
    d.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
        	a1.setIcon(D);
            a2.setText ("D is for Dog");
            a3.setIcon(Dog);
                }        
            });              
    JButton e = new JButton ("Ee");
    e.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    e.setBounds (550,230,120,100);
    e.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
        	a1.setIcon(E);
            a2.setText ("E is for Egg");
            a3.setIcon(Egg);
                }        
            });              
    JButton f = new JButton ("Ff");
    f.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
    f.setBounds (675,230,120,100);
    f.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
        	a1.setIcon(F);
            a2.setText ("F is for Flower");
            a3.setIcon(Flower);
                }        
            });            

                    

        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(d);
        frame.add(e);
        frame.add(f);
        frame.setSize (870,650);
        frame.setLayout (null);
        frame.setVisible (true);
    }
}