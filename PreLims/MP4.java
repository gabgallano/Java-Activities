import java.util.Scanner;
public class MP4
{
	public static void main(String[] args) {
	    Scanner grades = new Scanner(System.in);
	    double PreLims, Pl, Midterms, Mt, Finals, Fs, GenAv;
	    
		System.out.print("            Enter PreLims Grade:                 ");
		PreLims = grades.nextDouble();
		System.out.print("            Enter MidTerm Grade:                 ");
		Midterms = grades.nextDouble();
        System.out.print("            Enter Finals Grade:                  ");
		Finals = grades.nextDouble();
		
		Pl = (PreLims)*.3;
        Mt = (Midterms)*.3;
        Fs = (Finals)*.4;
        GenAv = Pl+Mt+Fs;
		
		System.out.print("\n          The PreLims Grade is:                ");
		System.out.format("%.2f", PreLims);
		System.out.print("\n          The MidTerm Grade is:                ");
		System.out.format("%.2f", Midterms);
		System.out.print("\n          The Finals Grade is:                 ");
		System.out.format("%.2f", Finals);
		System.out.print("\n          General Average  is:                 ");
		System.out.format("%.2f", GenAv);
		System.out.print("\n\n          Programmed by: Gabriel John M. Gallano");
		
	}
}