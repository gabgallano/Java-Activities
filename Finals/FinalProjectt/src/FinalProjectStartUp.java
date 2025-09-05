import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FinalProjectStartUp{
	private JFrame frame; //container where the content is displayed
	private ImageIcon bg; // storage of the background
	private JLabel myLabel; //storage of the content

	public FinalProjectStartUp() {

		
		bg = new ImageIcon("images/backgroundbgquiz.png");
		myLabel = new JLabel(bg);
		myLabel.setSize(450,450);
		
        JLabel StartUp = new JLabel(" ");
        StartUp.setBounds(20, 10, 450, 150);
        ImageIcon Banner = new ImageIcon("images/Startup2.png"); // for the banner
        StartUp.setIcon(Banner); 
        myLabel.add(StartUp);
        
        JLabel Speech = new JLabel(" Hello there, Friend!");
        Speech.setBounds(230, 150, 450, 150);
        Speech.setFont(new Font("Comic Sans MS", Font.BOLD, 15)); 
        myLabel.add(Speech);
        
        JLabel Speech2 = new JLabel("Welcome to Learning");
        Speech2.setBounds(230, 175, 450, 150);
        Speech2.setFont(new Font("Comic Sans MS", Font.BOLD, 15)); 
        myLabel.add(Speech2);
        
        JLabel Speech3 = new JLabel("   the Alphabet!");
        Speech3.setBounds(230, 200, 450, 150);
        Speech3.setFont(new Font("Comic Sans MS", Font.BOLD, 15)); 
        myLabel.add(Speech3);
        
        ImageIcon NextButton = new ImageIcon("images/Hello.png"); // for the button "next"	
        ImageIcon Sure = new ImageIcon("images/Sure.png");
        JButton btn=new JButton(" ");
        btn.setBackground(Color.decode("#5BDCFF")); // Setting Button Background Color
        btn.setBounds(260,335,155,55); 
        btn.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
        btn.setBorder(new Round(40)); // Setting Border Radius on the button
        btn.setIcon(NextButton);
        btn.addActionListener(new ActionListener() { // an action listener to when this choice is selected
            public void actionPerformed(ActionEvent e) {
            	
            	Speech.setText("   We'll learn about");
            	Speech2.setText("Alphabets!, Would you");
            	Speech3.setText("like to say your name?");
            	btn.setIcon(Sure);
                btn.addActionListener(new ActionListener() { // an action listener to when this choice is selected
                    public void actionPerformed(ActionEvent e) {
                  	  frame.dispose(); //to close the frame prior to this one.
                  	  Fin3 p2=new Fin3(); // directory of where it would go after clicking the button "nexT"
                  	  }});
          	  }});
        myLabel.add(btn);
		
        JLabel Character = new JLabel(" ");
        Character.setBounds(1, 120, 450, 400);
        ImageIcon CgGirl = new ImageIcon("images/Startup.png"); // for the character
        Character.setIcon(CgGirl); 
        myLabel.add(Character);

		frame = new JFrame("START UP!");
		frame.add(myLabel);
        
		frame.setSize(450,450);;
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
	
		new FinalProjectStartUp();



	}
}