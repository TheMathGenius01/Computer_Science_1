//© A+ Computer Science
// www.apluscompsci.com

//String replaceAll() method

import static java.lang.System.*;

public class ReplaceAll
{
  public static void main ( String[] args )
  {
		String s = "abcdef1xyzabf1";
		s = s.replaceAll("1", "#");
		out.println(s);

		s = "abcdef1xyzabf1";
		s = s.replaceAll("[abcd]", "#");
		out.println(s);

		s = "abcdef1xyzabf1";
		s = s.replaceAll("[^xyz]", "#");
		out.println(s);
  }
}