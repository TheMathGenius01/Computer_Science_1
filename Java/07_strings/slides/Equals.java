//© A+ Computer Science
// www.apluscompsci.com

//String equals and == example

import static java.lang.System.*;

public class Equals
{
  public static void main (String[] arg)
  {
		String one = new String("compsci");
		String two = new String("compsci");

		if(one==two)
			System.out.println("==");
		else
			System.out.println("!==");

		if(one.equals(two))
			System.out.println("equal");
		else
			System.out.println("!equal");
  }
}