//© A+ Computer Science
// www.apluscompsci.com

//String compareTo() method

import static java.lang.System.*;

public class CompareTo
{
   public static void main( String args[] )
   {
		String one = "region";
		String two = "uilstate";

		out.println(one.compareTo(two));
		out.println(two.compareTo(one));

		two = "region";
		out.println(two.compareTo(one));
		
		Integer first = 95;
		Integer second = 60;
		out.println(first.compareTo(second));
	}
}