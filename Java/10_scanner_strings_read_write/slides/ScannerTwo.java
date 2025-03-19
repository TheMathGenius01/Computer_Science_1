//© A+ Computer Science
// www.apluscompsci.com

//Scanner example two

import java.util.Scanner;
import static java.lang.System.*;

public class ScannerTwo
{
	public static void main(String args[])
	{
		out.println("Chopping a String");
		Scanner chopper = new Scanner("one two fun");
		out.println(chopper.next());
		out.println(chopper.next());
		out.println(chopper.next());


		out.println("\n\nChopping a String with ints");
		//point chopper to a new Scanner
		chopper = new Scanner("21 54 19");
		out.println(chopper.nextInt());
		out.println(chopper.nextInt());
		out.println(chopper.nextInt());
	}
}