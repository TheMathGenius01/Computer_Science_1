//© A+ Computer Science  -  www.apluscompsci.com
//Name - Parth Zanwar
//Date - 5/13/24
//Class - Computer Science 1 K
//Lab  - NumberRunner

import static java.lang.System.*;

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7,28,496,1111,199,201,17};
		for( int num : nums )
		{
			Number one = new Number( num );
			out.println( one.isOdd() ? one + " is odd." : one + " is not odd." );
			out.println( one.isPerfect() ? one + " is perfect.\n" : one + " is not perfect.\n" );
		}
	}
}