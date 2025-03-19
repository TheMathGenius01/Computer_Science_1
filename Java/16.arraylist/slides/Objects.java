//© A+ Computer Science
// www.apluscompsci.com

//ArrayList Objects example

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Objects
{
   public static void main(String args[])
	{
		List ray = new ArrayList();
		ray.add("hello");
		ray.add("whoot");
		ray.add("contests");
		out.println(((String)ray.get(0)).charAt(0));
		out.println(((String)ray.get(2)).charAt(0));
	}
}