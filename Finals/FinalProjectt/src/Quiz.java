import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz{
	private JFrame frame; //container where the content is displayed
	private ImageIcon bg; // storage of the background
	private JLabel myLabel; //storage of the content

	public Quiz() {

		
		bg = new ImageIcon("images/backgroundbgquiz.png");
		myLabel = new JLabel(bg);
		myLabel.setSize(450,450);
		
        JLabel Congratulatory = new JLabel(" ");
        Congratulatory.setBounds(1, 70, 400, 350);
        ImageIcon CgGirl = new ImageIcon("images/Congrats.png"); // for the quiz container
        Congratulatory.setIcon(CgGirl); 
        myLabel.add(Congratulatory);

		frame = new JFrame("SIMPLE ALPHABET QUIZ");
		frame.add(myLabel);
        
		frame.setSize(450,450);;
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
	
		new Quiz();



	}
}