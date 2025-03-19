//© A+ Computer Science
// www.apluscompsci.com

//nested if statement example

public class IfNesting
{
	public static void main(String args[])
	{
		int num=7;	//run the program again with num set to 11

		if(num>2)
		{
		   if(num<10)
		      System.out.println(">2<10");
		   if(num>10)
		      System.out.println(">2>10");
		}
	}
}

