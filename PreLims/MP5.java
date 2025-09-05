import java.util.Scanner;
public class MP5
{
	public static void main(String[] args) {
	String LC = "The quick brown fox jumps over the lazy dog";
	Scanner name = new Scanner(System.in); 
	System.out.print("Enter a string in upper case: ");  
    String UC = name.nextLine();  

        System.out.print("\nThere are ");
        System.out.print(UC.length());
        System.out.print(" characters in ");
        System.out.println(UC);
        
        UC = UC.replaceAll("\\s", "");
        System.out.println(UC);
        
        System.out.println(UC.toLowerCase());
        
        System.out.println(UC.equalsIgnoreCase(LC));

	
	}
}