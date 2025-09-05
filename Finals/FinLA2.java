import java.awt.event.*;
import javax.swing.*;
public class FinLA2{
    public static void main (String[] args){
        JFrame f = new JFrame ("Compute Numbers");
        JTextField tf1 = new JTextField(6);
        tf1.setBounds (50,50, 150,20);
        JTextField tf2 = new JTextField(6);
        tf2.setBounds (50,110, 150,20);
        JLabel alabel = new JLabel ("Enter First Number");
        alabel.setBounds (50,20, 150,20);
        JLabel blabel = new JLabel ("Enter Second Number");
        blabel.setBounds (50,80, 150,20);
        JLabel clabel = new JLabel (" ");
        clabel.setBounds (50,220, 150,20);
        
    JButton add = new JButton ("add");
    add.setBounds (50,140,95,30);
    add.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            int a, b, c;
            a = Integer.parseInt(tf1.getText());
            b = Integer.parseInt(tf2.getText());
            c = a + b;
            clabel.setText ("The sum is: " + c);
                }        
            });
    JButton sub = new JButton ("subtract");
    sub.setBounds (50,170,95,30);
    sub.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            int a, b, c;
            a = Integer.parseInt(tf1.getText());
            b = Integer.parseInt(tf2.getText());
            c = a - b;
            clabel.setText ("The difference is: " + c);
                }        
            });
    JButton multiply = new JButton ("multiply");
    multiply.setBounds (140,140,95,30);
    multiply.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            int a, b, c;
            a = Integer.parseInt(tf1.getText());
            b = Integer.parseInt(tf2.getText());
            c = a * b;
            clabel.setText ("The product is: " + c);
                }        
            });
    JButton div = new JButton ("divide");
    div.setBounds (140,170,95,30);
    div.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            int a, b, c;
            a = Integer.parseInt(tf1.getText());
            b = Integer.parseInt(tf2.getText());
            c = a / b;
            clabel.setText ("The quotient is: " + c);
                }        
            });
    JButton reset = new JButton ("refresh");
    reset.setBounds (240,170,95,30);
    reset.addActionListener (new ActionListener(){
        public void actionPerformed (ActionEvent e){
            tf1.setText("");
            tf2.setText("");
            clabel.setText("");
                }        
            });                                

        f.add (alabel);
        f.add (tf1);
        f.add (blabel);
        f.add (tf2);
        f.add (add);
        f.add (sub);
        f.add (multiply);
        f.add (div);
        f.add (clabel);
        f.add(reset);
        f.setSize (400,400);
        f.setLayout (null);
        f.setVisible (true);
    }
}