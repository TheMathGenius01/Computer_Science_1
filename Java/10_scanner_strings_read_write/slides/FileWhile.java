//© A+ Computer Science
// www.apluscompsci.com

//file input using a while loop

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FileWhile
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("while.dat"));
		while(file.hasNextInt())
		{
		   int num = file.nextInt();
		   out.println(num);
		}
	}
}