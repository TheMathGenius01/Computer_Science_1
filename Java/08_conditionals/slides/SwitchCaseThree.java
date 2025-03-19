//© A+ Computer Science
// www.apluscompsci.com

//switch case example

import static java.lang.System.*;

public class SwitchCaseThree
{
	public static void main(String args[])
	{
		int num = 22;
		switch (num)
		{
		   case 11 :  out.println("num == 11"); break;
		   case 22 :  out.println("num == 22");
		   case 30 :  out.println("num == 30");
		   case 40 :  out.println("num == 40"); break;
		   default :  out.println("does not equal");
		}
	}
}
