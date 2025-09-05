import java.awt.event.*;
import javax.swing.*;
public class FinLA1{
    public static void main (String[] args){
        JFrame Q = new JFrame ("Enter Raw Scores");
        JTextField q1 = new JTextField(6);
        q1.setBounds (120,60, 150,20);
        JTextField q2 = new JTextField(6);
        q2.setBounds (120,110, 150,20);
        JTextField q3 = new JTextField(6);
        q3.setBounds (120,160, 150,20);
        JLabel alabel = new JLabel ("Enter Raw score for quiz one");
        alabel.setBounds (113,40, 190,20);
        JLabel blabel = new JLabel ("Enter Raw score for quiz two");
        blabel.setBounds (113,90, 190,20);
        JLabel clabel = new JLabel ("Enter Raw score for quiz three");
        clabel.setBounds (110,140, 190,20);
        JLabel aalabel = new JLabel (" ");
        aalabel.setBounds (87,250, 250,20);
        JLabel bblabel = new JLabel (" ");
        bblabel.setBounds (88,280, 250,20);
        JLabel cclabel = new JLabel (" ");
        cclabel.setBounds (85,310, 250,20);
        JLabel avelabel = new JLabel (" ");
        avelabel.setBounds (97,340, 250,20);
        JButton q = new JButton ("Compute");
        q.setBounds (150,190, 95,30);
        q.addActionListener (new ActionListener(){

    public void actionPerformed (ActionEvent e){
        int a, b, c, a1, b2, c3, ave;
        a = Integer.parseInt(q1.getText());
        a1 = (a / 20) * 50 + 50;
        aalabel.setText ("The equivalent score for quiz one is: " + a1); 
        b = Integer.parseInt(q2.getText());
        b2 = (b / 20) * 50 + 50;
        bblabel.setText ("The equivalent score for quiz two is: " + b2);
        c = Integer.parseInt(q3.getText());
        c3 = (c / 20) * 50 + 50;
        cclabel.setText ("The equivalent score for quiz three is: " + c3);
        ave = (a1 + b2 + c3) / 3;
        avelabel.setText ("The average equivalent score is: " + ave);
            }        
        });
        Q.add (alabel);
        Q.add (q1);
        Q.add (blabel);
        Q.add (q2);
        Q.add (clabel);
        Q.add (q3);
        Q.add (q);
        Q.add (aalabel);
        Q.add (bblabel);
        Q.add (cclabel);
        Q.add (avelabel);
        Q.setSize (400,450);
        Q.setLayout (null);
        Q.setVisible (true);
    }
}