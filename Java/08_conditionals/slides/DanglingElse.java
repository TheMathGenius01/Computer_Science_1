//© A+ Computer Science
// www.apluscompsci.com

//nested if / dangling else statement example

public class DanglingElse
{
	public static void main(String args[])
	{
		int num=11;		//change the value of num and rerun the program
		if(num>2) 
			if(num<10)
			   System.out.println(">2<10");
		else
			System.out.println("<2");
	}
}

