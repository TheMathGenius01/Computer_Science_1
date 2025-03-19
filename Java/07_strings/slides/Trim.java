//© A+ Computer Science
// www.apluscompsci.com

//String trim() method

import static java.lang.System.*;

public class Trim
{
  public static void main (String[] arg)
  {
		String s = "     100   ";
		String trimmed = s.trim();
		out.println(trimmed);

		out.println(Integer.parseInt(trimmed)*9);
  }
}