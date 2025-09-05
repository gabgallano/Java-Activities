//Debug the following codes and identify the output:
// DebugThirteen2
// Displays list of payment options
// - credit card, check or cash
// Displays fee for using each - 5%, 2% or 0%
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugThirteen2 extends JFrame implements ItemListener{
    FlowLayout flow = new FlowLayout();
    JComboBox payMethod = new JComboBox();
    JLabel payList = new JLabel("Pay List");
    JTextField totFees = new JTextField(25);
    String pctMsg = new String("per cent will be added to your bill");
    int[] fees = {5,2,0};
    int feePct = 0;
    String output;
    int fee = 0;
public DebugThirteen2(){
    //super("Pay List");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(flow);
    payMethod.addItemListener(this);
    add(payList);
    add(payMethod);
    payMethod.addItem("Credit card");
    payMethod.addItem("Check");
    payMethod.addItem("Cash");
    add(totFees);
 }
 public static void main(String[] arguments){
    JFrame cframe = new DebugThirteen2();
    cframe.setSize(350, 150);
    cframe.setVisible(true);
 }
 public void itemStateChanged(ItemEvent list){
    Object source = list.getSource();
    if(source == payMethod)
    fee = payMethod.getSelectedIndex();
    feePct = fees[fee];
    output = feePct + " " + pctMsg;
    totFees.setText(output);
 }
}