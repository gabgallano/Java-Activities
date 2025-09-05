import java.awt.*; 
import javax.swing.JFrame;
import javax.swing.JLabel; 
 
public class FinLA4 extends Canvas{ 
 
	public void paint(Graphics g) {  
		int a = 25, b = 50;
		setBackground(Color.WHITE); 
		for (int j = 1; j <= 8; ++j) {
		g.drawRect(170 + a, 150 + a, 350 - b, 350 - b);  
		setForeground(Color.BLACK);
		}
	} 
	public static void main(String[] args){ 
		FinLA4 m=new FinLA4(); 
		JFrame f=new JFrame(); 
		JLabel initial =new JLabel("GJMG");
		initial.setBounds(350, 330, 40, 40);
		f.add(initial);
		f.add(m); 
		f.setSize(750,750); 
		f.setVisible(true); 
	} 
} 