import javax.swing.JOptionPane; 
public class MP6
{

    public static void main(String[] args) {

        String milkString;
        double milk;
        double totalcost;
        double totalprofit;
        double carton;

        milkString = JOptionPane.showInputDialog(null,
        "Enter the number of liters of milk produced", "Number of milk",
        JOptionPane.INFORMATION_MESSAGE);

        milk = Double.parseDouble(milkString); 
        carton = Math.round (milk / 3.78);
        totalcost = milk * 35;
        totalprofit = carton * 28;

        JOptionPane.showMessageDialog(null,"The number of carton needed to hold milk is "
        + carton); 
        JOptionPane.showMessageDialog(null, "The total cost of producing milk is "
        + totalcost);
        JOptionPane.showMessageDialog(null, "The total profit of producing milk is "
        + totalprofit);

    }
}