//© A+ Computer Science
// www.apluscompsci.com

//Scanner example that will total up all values on a line 

import java.util.Scanner;
import static java.lang.System.*;

public class Total
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		out.print("How many numbers ::");
		int count = keyboard.nextInt();
		int sum = 0;

		for(int i=0;i<count;i++)
		{
			out.print("Enter number " + (i+1) + " :: ");
			sum=sum+keyboard.nextInt();
		}
		out.println("total == " + sum);
	}
}