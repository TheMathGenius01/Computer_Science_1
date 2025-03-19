//© A+ Computer Science
// www.apluscompsci.com

//File input using a while loop with multiple sentences

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FileWhileLines
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner( new File("whilelines.dat"));
		while(file.hasNext())
		{
			out.println(file.nextLine());
		}
	}
}