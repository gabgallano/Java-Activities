public class DebugThree
// this class calculates a waitperson's tip
{
 public static void main(String args[])
 {
 double myCheck = 50.00;
 double yourCheck = 19.95;
 double finalRATE = 0.15;
 double tip;
 tip = (myCheck + yourCheck)*finalRATE;
 
 System.out.println("Tips are 15%\n");
 System.out.println("Total bill is " + (myCheck + yourCheck));
 System.out.println("The tip should be at least " + tip);
 }
}