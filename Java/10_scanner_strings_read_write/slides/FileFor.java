//© A+ Computer Science
// www.apluscompsci.com

//file input using a for loop

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FileFor
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("for.dat"));
		int cnt = file.nextInt();
		for(int i=0; i<cnt; i++)
		{
		   int num = file.nextInt();
		   out.println(num);
		}
	}
}