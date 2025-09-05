import javax.swing.JOptionPane; 
public class MidLA2
{
    public static void main(String[] args) {

        String nameString, servicetypeString, timeString, whenString;
        int name, servicetype, time, when;
        double fee;
        
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

        name = Integer.parseInt(nameString);
        servicetype = Integer.parseInt(servicetypeString);
        time = Integer.parseInt(timeString);
        when = Integer.parseInt(whenString);

        switch (servicetype){
        case 1:
            if (time < 50){
                fee = 10;
                JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
            }
            else{
                fee = time - 50* (.20);
                JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
            }
        
        case 2:
            if (when == 1){
                if (time < 75){
                    fee = 0;
                    JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
                }
                else{
                    fee = time* 0.10;
                    JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
                }
            }    
            else if (when == 2){
                if(time < 100){
                    fee = 0;
                    JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
                }
                else{
                    fee = time*0.05;
                    JOptionPane.showMessageDialog(null,"Good Day" + name + "your service type is " + servicetype +
        " the number of minutes of your call is " + time + " your amount due is " + fee + " THANK YOU FOR USING OUR SERVICES"); 
                }
            }            
        } 
    }
}