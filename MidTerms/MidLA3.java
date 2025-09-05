import java.util.Scanner;
public class MidLA3
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int price, quantity, amount;
	    char choice;
	    
	do{
	    System.out.print("\tEnter price:        ");
	    price = scan.nextInt();
	    System.out.print("\tEnter quantity:     ");
	    quantity = scan.nextInt();
	    amount = price * quantity;
	    System.out.println("The total for this item is: " + amount);
	    System.out.print("\nDo you want to enter a purchase? (y/n): ");
	    choice = scan.next().charAt(0);
	}
	while (choice != 'n');
	    System.out.print("Thank you!");
	}
}	