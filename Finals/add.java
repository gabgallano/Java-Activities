import java.awt.event.*;
import javax.swing.*;
public class add{
    public static void main (String[] args){
        JFrame f = new JFrame ("Add Numbers");
        JTextField tf1 = new JTextField(6);
        tf1.setBounds (50,50, 150,20);
        JTextField tf2 = new JTextField(6);
        tf2.setBounds (50,110, 150,20);
        JLabel alabel = new JLabel ("Enter First Number");
        alabel.setBounds (50,20, 150,20);
        JLabel blabel = new JLabel ("Enter Second Number");
        blabel.setBounds (50,80, 150,20);
        JLabel clabel = new JLabel (" ");
        clabel.setBounds (50,180, 150,20);
        JButton b = new JButton ("add");
        b.setBounds (50,140,95,30);
        b.addActionListener (new ActionListener(){

    public void actionPerformed (ActionEvent e){
        int a, b, c;
        a = Integer.parseInt(tf1.getText());
        b = Integer.parseInt(tf2.getText());
        c = a + b;
        clabel.setText ("The sum is: " + c);
            }        
        });
        f.add (alabel);
        f.add (tf1);
        f.add (blabel);
        f.add (tf2);
        f.add (b);
        f.add (clabel);
        f.setSize (400,400);
        f.setLayout (null);
        f.setVisible (true);
    }
}