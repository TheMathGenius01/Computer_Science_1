//© A+ Computer Science
// www.apluscompsci.com

//Scanner example three

import java.util.Scanner;
import static java.lang.System.*;

public class ScannerThree
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a list of integers :: ");
		String line = keyboard.nextLine();
		
		Scanner chopper = new Scanner(line);
		while(chopper.hasNextInt())
		{
			out.println(chopper.nextInt());
		}
	}
}