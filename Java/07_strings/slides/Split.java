//© A+ Computer Science
// www.apluscompsci.com

//String split() method

import static java.lang.System.*;
import java.util.Scanner;

public class Split
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter a sentence :: ");
		String s = keyboard.nextLine();

		String[] list = s.split(" ");

	 	for(int j=0; j<list.length; j++)
	 	{
	 	   out.println(list[j]);
		}
		out.println("\n");
	}
}
