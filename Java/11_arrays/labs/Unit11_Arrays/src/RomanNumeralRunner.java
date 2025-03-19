//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class RomanNumeralRunner
{
	public static void main( String args[] )
	{
		RomanNumeral test = new RomanNumeral(10);
		out.println("10 is " + test);

		test.setNumber(5);
		out.println("5 is " + test);

		test.setNumber(1000);
		out.println("1000 is " + test);

		test.setNumber(2500);
		out.println("2500 is " + test);

		test = new RomanNumeral(1500);
		out.println("1500 is " + test);

		test.setNumber(23);
		out.println("23 is " + test);

		test.setNumber(38);
		out.println("38 is " + test);

		test.setNumber(49);
		out.println("49 is " + test);

		test.setRoman("LXXVII");
		out.println("LXXVII is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		out.println("XX is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");
	}
}