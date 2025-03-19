//© A+ Computer Science
// www.apluscompsci.com

//if statement practice

import java.util.Scanner;

public class IfTwo_Sol
{
	public static void main(String args[])
	{
		//define and instantiate a Scanner named keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//read in a double and save it in a variable named value
		double value  = keyboard.nextDouble();

		//print out ben if value is greater than 1000
		if(value>1000)
			System.out.println("ben");
		
		//print out sam if value is less than -2000
		if(value<-2000)
			System.out.println("sam");		
	}
}

