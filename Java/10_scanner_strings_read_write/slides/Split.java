//© A+ Computer Science
// www.apluscompsci.com

//String split() example

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Split
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner( new File("for.dat"));

		int cnt = file.nextInt();
		file.nextLine();  //need this to clear the \n out of the way

		for(int i=0; i<cnt; i++)
		{
			String[] list = file.nextLine().split(" ");
			for(int j=0; j<list.length; j++)
			{
				out.println(list[j]);
			}
			out.println("\n");
		}
	}
}