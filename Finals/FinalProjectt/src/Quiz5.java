import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz5{
	private JFrame frame; //container where the content is displayed
	private ImageIcon bg; // storage of the background
	private JLabel myLabel; //storage of the content

	public Quiz5() {

		
		bg = new ImageIcon("images/backgroundbgquiz.png");
		myLabel = new JLabel(bg);
		myLabel.setSize(450,450);
		
        JLabel Speak = new JLabel("Finally, 5th! Leggo!"); // for the message bubble content
        Speak.setBounds (85,340, 150,50);
        Speak.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        myLabel.add(Speak);
        
        JLabel Question = new JLabel("This image starts with letter _____"); //for the question texts
        Question.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        Question.setBounds(80, 50, 290,120);
        myLabel.add(Question);
        
        JRadioButton r1=new JRadioButton("J"); 
        r1.setFont(new Font("Comic Sans MS", Font.BOLD, 13)); //setting font and size
        r1.setBackground(Color.decode("#F6B64A")); // Setting Choices Background Color
    	JRadioButton r2=new JRadioButton("C");
    	r2.setFont(new Font("Comic Sans MS", Font.BOLD, 13)); //setting font and size
    	r2.setBackground(Color.decode("#F6B64A")); // Setting Choices Background Color
    	JRadioButton r3=new JRadioButton("H");
    	r3.setFont(new Font("Comic Sans MS", Font.BOLD, 13)); //setting font and size
    	r3.setBackground(Color.decode("#F6B64A")); // Setting Choices Background Color
    	JRadioButton r4=new JRadioButton("K");
    	r4.setFont(new Font("Comic Sans MS", Font.BOLD, 13)); //setting font and size
    	r4.setBackground(Color.decode("#F6B64A")); // Setting Choices Background Color
    		r1.setBounds(130,255,50,30);    
    		r2.setBounds(130,290,50,30);  
    		r3.setBounds(250,255,50,30);
    		r4.setBounds(250,290,50,30);
    	ButtonGroup bg=new ButtonGroup();   //to group the choices 
    	bg.add(r1); bg.add(r2); bg.add(r3); bg.add(r4);
    	
      ImageIcon NextButton = new ImageIcon("images/NextButton.png"); // for the button "next"	
      JButton btn=new JButton(" ");
      btn.setBackground(Color.decode("#5BDCFF")); // Setting Button Background Color
      btn.setBounds(270,350,130,45); 
      btn.setForeground(Color.decode("#87E7F1")); // Setting Button Foreground Color
      btn.setBorder(new Round(40)); // Setting Border Radius on the button
      btn.addActionListener(new ActionListener() { // an action listener to when this choice is selected
          public void actionPerformed(ActionEvent e) {
        	  frame.dispose(); //to close the frame prior to this one.
        	  Quiz p2=new Quiz(); // directory of where it would go after clicking the button "nexT"
        	  }});
      
      r1.addActionListener(new ActionListener() { // an action listener to when this choice is selected
      public void actionPerformed(ActionEvent e) {
    	  if(r1.isSelected()) {
    		  Speak.setText("Clue: It's not J!");
    		  ;}}});
        
      r2.addActionListener(new ActionListener() { // an action listener to when this choice is selected
      public void actionPerformed(ActionEvent e) {
    	  if(r2.isSelected()) {
    		  Speak.setText("Oops, not this one!");
    		  ;}}});
      
      r3.addActionListener(new ActionListener() { // an action listener to when this choice is selected
      public void actionPerformed(ActionEvent e) {
    	  if(r3.isSelected()) {
    		  Speak.setText("Yay! You got it!");
    		  btn.setIcon(NextButton);
    		  ;}}});
      
      r4.addActionListener(new ActionListener() { // an action listener to when this choice is selected
      public void actionPerformed(ActionEvent e) {
    	  if(r4.isSelected()) {
    		  Speak.setText("   Try again!");
    		  ;}}});
      
      
      myLabel.add(r1); myLabel.add(r2); myLabel.add(r3); myLabel.add(r4);
      myLabel.add(btn);
        
        
        JLabel QuestionImages = new JLabel(" ");
        QuestionImages.setBounds(150, 65, 290, 250);
        ImageIcon QuesImg = new ImageIcon("images/Hat1.png"); // for the question images
        QuestionImages.setIcon(QuesImg); 
        myLabel.add(QuestionImages);
        
        
        JLabel ImageContainer = new JLabel(" ");
        ImageContainer.setBounds(110, 65, 290, 250);
        ImageIcon ImgContainer = new ImageIcon("images/ImageContainer.png"); // for white main image container
        ImageContainer.setIcon(ImgContainer); 
        myLabel.add(ImageContainer);
        
        
        JLabel Character = new JLabel(" ");
        Character.setBounds(0, 240, 250, 250);
        ImageIcon Girl = new ImageIcon("images/Character.png"); // for the character
        Character.setIcon(Girl); 
        myLabel.add(Character);
		
        JLabel QuizContainer = new JLabel(" ");
        QuizContainer.setBounds(55, 1, 320, 350);
        ImageIcon Container = new ImageIcon("images/QuizContainer.png"); // for the quiz container
        QuizContainer.setIcon(Container); 
        myLabel.add(QuizContainer);

		frame = new JFrame("SIMPLE ALPHABET QUIZ");
		frame.add(myLabel);
        
		frame.setSize(450,450);;
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
	
		new Quiz5();



	}
}