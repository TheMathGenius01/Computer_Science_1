//© A+ Computer Science
// www.apluscompsci.com

//Scanner example four

import java.util.Scanner;
import static java.lang.System.*;

public class ScannerFour
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a sentence :: ");
		String line = keyboard.nextLine();
		
		Scanner chopper = new Scanner(line);
		while(chopper.hasNext())
		{
		   out.println(chopper.next());
		}
	}
}