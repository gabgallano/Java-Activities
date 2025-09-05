import javax.swing.JOptionPane;
public class PreLim1A {

    public static void main(String[] args) {
    String wagestring, advanceString;
    Double wage, weeklyPay;
    int advance;
    double HOURS_IN_WEEK = 37.5;

    wagestring= JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
    advanceString = JOptionPane.showInputDialog(null, "How much is your cash advance?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
    
    wage = Double.parseDouble(wagestring);
    advance = Integer.parseInt(advanceString);
    weeklyPay = wage * HOURS_IN_WEEK;

    JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + " Deductions will be made for "+ advance + " cash advance");
    }
}