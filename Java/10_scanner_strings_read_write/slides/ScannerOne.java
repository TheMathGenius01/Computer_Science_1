//© A+ Computer Science
// www.apluscompsci.com

//Scanner example one

import java.util.Scanner;
import static java.lang.System.*;

public class ScannerOne
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter three numbers :: ");
		int one = keyboard.nextInt(); 
		int two = keyboard.nextInt();
		int three = keyboard.nextInt();
		out.println(one + " " + two + " " + three);


		//have to do something here or the 
		//following nextLine() will not work properly
		
		//keyboard.nextLine();  //pick up left over whitespace
		out.print("Enter a sentence :: ");
		String sentence = keyboard.nextLine(); 
		out.println(sentence);
	}
}