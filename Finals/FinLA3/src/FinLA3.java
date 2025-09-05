import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class FinLA3 extends Applet implements ActionListener  
{  
    Label title = new Label ("Frontier Equipment Rentals");
	Label p1 = new Label("Product Code");  
    Label p2 = new Label("1");  
    Label p3 = new Label("2");
    Label p4 = new Label("3"); 
    Label d1 = new Label("Description");
    Label d2 = new Label("Truck");  
    Label d3 = new Label("Bulldozer");
    Label d4 = new Label("Bus");
    Label c1 = new Label("Price");  
    Label c2 = new Label("1250.00");  
    Label c3 = new Label("2500.00");
    Label c4 = new Label("4000.00");
    Label q1 = new Label("Quantity");
    TextField q2 = new TextField();  
    TextField q3 = new TextField();  
    TextField q4 = new TextField();
    TextField q5 = new TextField();
    Button t = new Button("Total");  
    public void init()  
    {     
        setLayout(new GridLayout(0, 4));
        add(p1);add(d1);add(c1);add(q1);
        add(p2);add(d2);add(c2);add(q2);
        add(p3);add(d3);add(c3);add(q3);
        add(p4);add(d4);add(c4);add(q4);
        add(t); add(q5); 
        t.addActionListener(this);
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == t)  
        {  
            int tq1 = Integer.parseInt(q2.getText());  
            int tq2 = Integer.parseInt(q3.getText());
            int tq3 = Integer.parseInt(q4.getText());
            q5.setText(" " + (tq1*(1250) + tq2*(2500) + tq3*(4000)));
            showStatus("You're order has been submitted");
        }  
    }  
}  