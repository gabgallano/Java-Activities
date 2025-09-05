import java.awt.*;    
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JTextField; 
import javax.swing.JButton;

public class SW1 {  
    public static void main(String args[]){    
   new SW1(); 
        Frame f = new Frame(); 
        JLabel  message = new JLabel("Enter age:");
        message.setBounds(70, 60, 150, 50);
        JTextField age = new JTextField();
        age.setBounds(130, 100, 100, 20); 

        JButton b = new JButton("Clear");
        b.setBounds (130,130,100,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            age.setText("");
            
        }
    }); 
        f.add(message); 
        f.add(age);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        }                 
}    
 
   
    
    