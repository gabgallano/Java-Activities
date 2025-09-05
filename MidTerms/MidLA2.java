import javax.swing.JOptionPane; 
public class MidLA2
{
    public static void main(String[] args) {

        String nameString, servicetypeString, timeString, whenString;
        double servicetype, time, when, fee = 0;
        
        nameString = JOptionPane.showInputDialog(null,
        "Enter your name", "Name",
        JOptionPane.INFORMATION_MESSAGE);
        servicetypeString = JOptionPane.showInputDialog(null,
        "Press 1 for Regular; 2 for Premium", "Service Type",
        JOptionPane.INFORMATION_MESSAGE);
        timeString = JOptionPane.showInputDialog(null,
        "Enter the number of minutes", "Time",
        JOptionPane.INFORMATION_MESSAGE);
        whenString = JOptionPane.showInputDialog(null,
        "Press 1 if the call takes place in the morning; 2 for evening", "Day or Night",
        JOptionPane.INFORMATION_MESSAGE);

        servicetype = Double.parseDouble(servicetypeString);
        time = Double.parseDouble(timeString);
        when = Double.parseDouble(whenString);

        if ((servicetype == 1)&&(time < 50))
                fee = 10;
        else if ((servicetype == 1)&&(time > 50))
                fee = Math.round ((time - 50) * 0.20);
        else if ((servicetype == 2)&&(when == 1)&&(time < 75))
                fee = 0;        
        else if ((servicetype == 2)&&(when == 1)&&(time > 75))
                fee = Math.round ((time - 75) * 0.10);    
        else if ((servicetype == 2)&&(when == 2)&&(time < 100))
                fee = 0;            
        else if ((servicetype == 2)&&(when == 2)&&(time > 100))
                fee = Math.round ((time - 100) * 0.05);               

        if(servicetype == 1)
            JOptionPane.showMessageDialog(null,"Good Day! " + nameString + ", your service type is REGULAR" + ", the number of minutes of your call is " 
        + time + ", your amount due is PHP " + fee + ", THANK YOU FOR USING OUR SERVICES!"); 
        else{
            JOptionPane.showMessageDialog(null,"Good Day! " + nameString + ", your service type is PREMIUM" + ", the number of minutes of your call is " 
            + time + ", your amount due is PHP " + fee + ", THANK YOU FOR USING OUR SERVICES!");
        }

    }
}