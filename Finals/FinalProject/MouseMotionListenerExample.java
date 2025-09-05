import java.awt.*;  
import java.awt.event.*;  
public class MouseMotionListenerExample extends Frame implements MouseMotionListener{  
    MouseMotionListenerExample(){  
        addMouseMotionListener(this);     
        setSize(1000,1000);  
        setLayout(null);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),12,12);  
}  
public void mouseMoved(MouseEvent e) {}  
  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}  
}  