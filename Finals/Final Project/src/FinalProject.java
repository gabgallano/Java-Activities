import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;  

	public class FinalProject extends Applet implements ActionListener  
	{  
		TextField a1 = new TextField();  
	    TextField a2 = new TextField();  
	    TextField a3 = new TextField();
		Button a = new Button("Aa");
		Button b = new Button("Bb");
		Button c = new Button("Cc");
		Button d = new Button("Dd");
		Button e = new Button("Ee");
		Button f = new Button("Ff");
	
	public void init()  
    {     
		Font myFont = new Font("Serif", Font.BOLD,30);
		a.setFont(myFont); a1.setFont(myFont); a2.setFont(myFont);b.setFont(myFont); 
		c.setFont(myFont); d.setFont(myFont); e.setFont(myFont); f.setFont(myFont);
    		
		setLayout(new GridLayout(3, 3));
		add(a1);add(a2);add(a3);
        add(a);add(b);add(c);add(d);add(e);add(f); 
        
        a.addActionListener(this); b.addActionListener(this);
    }  
	public void actionPerformed(ActionEvent e)
	{ 
		if (e.getSource() == a){
            showStatus("You have chosen letter A");
            a1.setText("Aa");
            a2.setText("A is for Apple");}
        if (e.getSource() == b){
            showStatus("You have chosen letter B");
            a1.setText("Bb");
            a2.setText("B is for Butterfly");}
	}
}  