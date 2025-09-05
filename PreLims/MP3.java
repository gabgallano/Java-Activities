import java.util.Scanner;
public class MP3
{
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    double hourrate, hour, basepay, tax, aftertax, bonus, total;
	    
		System.out.print("          Enter the hourly rate:            ");
		hourrate = keyboard.nextDouble();
		
		System.out.print("          Enter the number of hours worked: ");
		hour = keyboard.nextDouble();
		
		basepay = (hour * hourrate);
		
		tax = basepay*(0.15);
		
		aftertax = (basepay - tax);
		
		bonus = aftertax*(0.1);
		
		total = (aftertax + bonus);
		
		System.out.print("\n          The base pay is:                ");
		System.out.format("%.2f", basepay);
		System.out.print("\n          Total tax is:                   ");
		System.out.format("%.2f", tax);
		System.out.print("\n          Total bonus is:                 ");
		System.out.format("%.2f", bonus);
		System.out.print("\n          Total Net Pay is:               ");
		System.out.format("%.2f", total);
		System.out.print("\n\n          Programmed by: Gabriel John M. Gallano");
		
	}
}
