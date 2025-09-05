import java.util.Scanner;
public class DebugFive2
{
    public static void main(String args[])
    {
    int number;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = input.nextInt();
    if (number % 2 == 0)
    System.out.println("Number is even");
    else
    System.out.println("Number is odd");
    }
} 