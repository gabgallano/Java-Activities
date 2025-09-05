import java.util.Scanner; 
public class Prelim2A{
    public static void main(String[] args) { 
        Scanner console = new Scanner(System.in);
    
        System.out.printf("Please enter your grade: "); 
        String grade = console.nextLine();
    
        System.out.printf("Please enter your subject: "); 
        String subject = console.nextLine();
    
        System.out.println("Your subject is " + subject + " and you got " + grade + " grade.");
    }
}    