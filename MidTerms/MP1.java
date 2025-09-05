import java.util.Scanner;
public class MP1
{
	public static void main(String[] args) {
	    Scanner order = new Scanner(System.in);
	    
	    int cheeseburger, pepsi, chips, orders, amount;
	    
		System.out.println("\tGallano Restaurant");
		System.out.println("Press 1 for Cheeseburger - 55.00");
		System.out.println("      2 for Pepsi        - 25.00");
		System.out.print("      3 for Chips        - 35.00        - ");
		orders = order.nextInt();
		
		switch(orders){
		    case 0:
		        System.out.print("Your total bill is 0.00");
		        break;
		    case 1:
		        System.out.print("\nEnter the number of orders for Cheeseburger: ");
		        cheeseburger = order.nextInt();
		        amount = cheeseburger * 55;
		        System.out.print("The total amount is: " + amount);
		        break;
		    case 2:
		        System.out.print("\nEnter the number of orders for Pepsi: ");
		        pepsi = order.nextInt();
		        amount = pepsi * 25;
		        System.out.print("The total amount is: " + amount);
		        break;
		    case 3:
		        System.out.print("\nEnter the number of orders for Chips: ");
		        chips = order.nextInt();
		        amount = chips * 35;
		        System.out.print("The total amount is: " + amount);
		        break;
		    default:
                 System.out.println("\nInvalid Input");    
		        
		}
	}
}