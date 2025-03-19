//© A+ Computer Science
// www.apluscompsci.com

//String references

import static java.lang.System.*;

public class StringRef
{
	public static void main (String[] arg)
	{
		String one = new String("compsci");
		String two = new String("compsci");

		if(one==two)
			System.out.println("==");
		else
			System.out.println("!==");
	}
}