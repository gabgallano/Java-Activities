/*import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class Sample extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10);  
    Label l1 = new Label("FIRST NO:");  
    Label l2 = new Label("SECOND NO:");  
    Label l3 = new Label("SUM:");  
    Button b = new Button("ADD");  
    public void init()  
    {    
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);  
        add(b);  
        b.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {  
            int n1 = Integer.parseInt(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
            t3.setText(" " + (n1 + n2));  
        }  
    }  
}*/
/*import java.applet.*;
import java.awt.*;

public class Sample extends Applet {
	public void init() {
		setLayout(new BorderLayout());

		Panel p1 = new Panel();
		p1.setBackground(Color.blue);
		p1.add(new Button("1"));
		p1.add(new Button("2"));
		p1.add(new Button("3"));
		add(p1, BorderLayout.NORTH);

		Panel p2 = new Panel();
		p2.setBackground(Color.yellow);
		p2.add(new Button("4"));
		add(p2, BorderLayout.EAST);

		Panel p3 = new Panel();
		p3.setBackground(Color.green);
		p3.setLayout(new GridLayout(2, 0));		// 2 rows, variable columns
		p3.add(new Button("5"));
		p3.add(new Button("6"));
		p3.add(new Button("7"));
		p3.add(new Button("8"));
		p3.add(new Button("9"));
		add(p3, BorderLayout.CENTER);
	}
}*/
/*import java.applet.Applet;  
import java.awt.*;  
  
public class Sample extends Applet{  
  
public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
  
}  
}*/
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class Sample extends Applet implements MouseMotionListener{  
  
public void init(){  
addMouseMotionListener(this);  
setBackground(Color.red);  
}  
  
public void mouseDragged(MouseEvent me){  
Graphics g=getGraphics();  
g.setColor(Color.white);  
g.fillOval(me.getX(),me.getY(),10,10);  
}  
public void mouseMoved(MouseEvent me){}  
  
}
/*import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
  
public class Sample extends Applet implements Runnable {  
  
   int width, height;  
   Thread t = null;  
   boolean threadSuspended;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
  
   public void init() {  
      width = getSize().width;  
      height = getSize().height;  
      setBackground( Color.black );  
   }  
  
   public void start() {  
      if ( t == null ) {  
         t = new Thread( this );  
         t.setPriority( Thread.MIN_PRIORITY );  
         threadSuspended = false;  
         t.start();  
      }  
      else {  
         if ( threadSuspended ) {  
            threadSuspended = false;  
            synchronized( this ) {  
               notify();  
            }  
         }  
      }  
   }  
  
   public void stop() {  
      threadSuspended = true;  
   }  
  
   public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter  
               = new SimpleDateFormat( "hh:mm:ss", Locale.getDefault() );  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            // Now the thread checks to see if it should suspend itself  
            if ( threadSuspended ) {  
               synchronized( this ) {  
                  while ( threadSuspended ) {  
                     wait();  
                  }  
               }  
            }  
            repaint();  
            t.sleep( 1000 );  // interval specified in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
   void drawHand( double angle, int radius, Graphics g ) {  
      angle -= 0.5 * Math.PI;  
      int x = (int)( radius*Math.cos(angle) );  
      int y = (int)( radius*Math.sin(angle) );  
      g.drawLine( width/2, height/2, width/2 + x, height/2 + y );  
   }  
  
   void drawWedge( double angle, int radius, Graphics g ) {  
      angle -= 0.5 * Math.PI;  
      int x = (int)( radius*Math.cos(angle) );  
      int y = (int)( radius*Math.sin(angle) );  
      angle += 2*Math.PI/3;  
      int x2 = (int)( 5*Math.cos(angle) );  
      int y2 = (int)( 5*Math.sin(angle) );  
      angle += 2*Math.PI/3;  
      int x3 = (int)( 5*Math.cos(angle) );  
      int y3 = (int)( 5*Math.sin(angle) );  
      g.drawLine( width/2+x2, height/2+y2, width/2 + x, height/2 + y );  
      g.drawLine( width/2+x3, height/2+y3, width/2 + x, height/2 + y );  
      g.drawLine( width/2+x2, height/2+y2, width/2 + x3, height/2 + y3 );  
   }  
  
   public void paint( Graphics g ) {  
      g.setColor( Color.gray );  
      drawWedge( 2*Math.PI * hours / 12, width/5, g );  
      drawWedge( 2*Math.PI * minutes / 60, width/3, g );  
      drawHand( 2*Math.PI * seconds / 60, width/2, g );  
      g.setColor( Color.white );  
      g.drawString( timeString, 10, height-10 );  
   }  
}*/  
 /*import java.applet.Applet; 
 import java.awt.Graphics; 
 public class Sample extends Applet 
 { 
       public void paint(Graphics g) 
      { 
            g.drawString("Hello Dinesh Thakur!", 100, 90); 
            showStatus("Showing the Status Message in the Applet Window");  //The text in status bar will be shown 
     } 
 }*/
/*import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Sample extends Applet {

  public void init() {

    Frame title = (Frame)this.getParent().getParent();
    title.setTitle("New Title");

    setSize(250, 500);
    JPanel grid = new JPanel();
    grid.setSize(250,500);
    add(grid, BorderLayout. CENTER);


  }

}*/
/*import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Sample extends Applet implements ActionListener {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    double sum = 5;
    Label total, vend, welc;
    TextArea result;

    public void init()
    {
        setLayout(new GridLayout(5, 0));

        welc = new Label ("  Welcome to the Buttons!");
        add(welc);
        vend = new Label ("Please press a button now.");
        add(vend);

        b1 = new Button("Bread");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Butter");
        add(b2);
        b2.addActionListener(this);

        b3 = new Button("Soup");
        add(b3);
        b3.addActionListener(this);

        b4 = new Button("Water");
        add(b4);
        b4.addActionListener(this);

        b5 = new Button("Finish and pay");
        add(b5);
        b5.addActionListener(this);

        cancel = new Button("Cancel");
        add(cancel);
        cancel.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                Object obj=e.getSource();
                if (obj == cancel)
                {
                result.requestFocusInWindow();
                result.selectAll();
                result.setText("");
                num1 = 0; num2 = 0; num3 = 0; num4 = 0;
                }
        }
});

        total = new Label ("     You order total");
        add(total);
        result = new TextArea ( 10, 30);
        add(result);
        result.setEditable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            num1++;
            showStatus("You have chosen " + num1 + " bread");}
        if (e.getSource() == b2){
            num2++;
            showStatus("You have chosen " + num2 + " butter");}
        if (e.getSource() == b3){
            num3++;
            showStatus("You have chosen " + num3 + " soup");}
        if (e.getSource() == b4){
            num4++;
            showStatus("You have chosen " + num4 + " water");}
        if (e.getSource() == b5){
            result.requestFocusInWindow();
            sum = addition(num1, num2, num3, num4);
             result.setText(" Bread: "+ num1 +" selected\n"
            +" Butter: "+ num2 +" selected\n"
            +" Soup: "+ num3 +" selected\n"
            +" Water: "+ num4 +" selected\n"
            + "Total money due is: € " +Double.toString(sum));
            }
}

        public double addition(int x, int y, int z, int t)
            {
                return 1.2*x + 3.1*y + 2*z + 1.5*t;
    }
    Button b1, b2, b3, b4, b5, cancel;

}*/
// importing AWT class  
/*import java.awt.*;   
public class Sample {  
    // main method  
    public static void main(String args[]) {    
    // creating a frame  
    Frame f = new Frame("TextField Example");    
  
    // creating objects of textfield  
    TextField t1, t2;    
    // instantiating the textfield objects  
    // setting the location of those objects in the frame  
    t1 = new TextField("Welcome to Javatpoint.");    
    t1.setBounds(50, 100, 200, 30);    
    t2 = new TextField("AWT Tutorial");    
    t2.setBounds(50, 150, 200, 30);    
    // adding the components to frame  
    f.add(t1);  
    f.add(t2);   
    // setting size, layout and visibility of frame   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);    
}    
}*/
/* Now you will be able to perform actions when a button is clicked
to get and place text in/out a textfield and to get the state of checkboxes.
This example will only let the button do actions.
*/
/*import java.awt.*;
import java.applet.*;
// import an extra class for the ActionListener
import java.awt.event.*;

// Tells the applet you will be using the ActionListener methods.

public class Sample extends Applet implements ActionListener
{

     Button okButton;
     Button wrongButton;
     TextField nameField;
     CheckboxGroup radioGroup;
     Checkbox radio1;
     Checkbox radio2;
     Checkbox radio3;

     public void init() 
     {
  // Now we will use the FlowLayout
          setLayout(new FlowLayout());
          okButton = new Button("Action!");
          wrongButton = new Button("Don't click!");
          nameField = new TextField("Type here Something",35);
          radioGroup = new CheckboxGroup();
          radio1 = new Checkbox("Red", radioGroup,false);
          radio2 = new Checkbox("Blue", radioGroup,true);
          radio3 = new Checkbox("Green", radioGroup,false);
          add(okButton);
          add(wrongButton);
          add(nameField);
          add(radio1);
          add(radio2);
          add(radio3);

  // Attach actions to the components
          okButton.addActionListener(this);
          wrongButton.addActionListener(this);
         }
 // Here we will show the results of our actions
         public void paint(Graphics g)
         {
  // If the radio1 box is selected then radio1.getState() will
  // return true and this will execute
          if (radio1.getState()) g.setColor(Color.red);
  // If it was not red we'll try if it is blue
        else if (radio2.getState()) g.setColor(Color.blue);
  // Since always one radiobutton must be selected it must be green
          else g.setColor(Color.green);

  // Now that the color is set you can get the text out the TextField
  // like this
          g.drawString(nameField.getText(),20,100);
     }

 // When the button is clicked this method will get automatically called
 // This is where you specify all actions.

        public void actionPerformed(ActionEvent evt) 
         {
  // Here we will ask what component called this method
              if (evt.getSource() == okButton) 
   // So it was the okButton, then let's perform his actions
   // Let the applet perform Paint again.
   // That will cause the aplet to get the text out of the textField
   // again and show it.
                   repaint();

  // Actions of the wrongButton
          else if (evt.getSource() == wrongButton) 
          {

   // Change the text on the button for fun
               wrongButton.setLabel("Not here!");
   // Changes the text in the TextField
               nameField.setText("That was the wrong button!");
   // Lets the applet show that message.
               repaint();
          }
     } 

}
 

// That gives you an idea of how to implement actions.
// Note that clicking the radiobuttons only shows it's effect when the
// applet is repainted. That is because no ActionListener is added
// to the radio buttons. You can do that in the same way as the buttons.

// Next example is about MouseListener, a way to let the user interact with mouse-clicks.

// Go to MouseClickExample.java*/

