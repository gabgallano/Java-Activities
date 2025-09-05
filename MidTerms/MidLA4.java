import javax.swing.JOptionPane; 
public class MidLA4
{
    public static void main(String[] args) {
        String passwordString;
        int attempts = 0;
        
        while (attempts < 3){
            passwordString = JOptionPane.showInputDialog(null,
            "Enter password", "Password",
            JOptionPane.INFORMATION_MESSAGE);
            attempts++;
            
            if (!passwordString.equals("gallano")){
                JOptionPane.showMessageDialog(null,"Wrong password, Try again");
            }
            else if (passwordString.equals("gallano")){
                JOptionPane.showMessageDialog(null,
                "Congratulations! You're in");
                break;
            }    
            else{}
            if (attempts > 2){
                JOptionPane.showMessageDialog(null, "Sorry wrong password",
                "Sorry", JOptionPane.ERROR_MESSAGE);
            }
        }     
    }
}        