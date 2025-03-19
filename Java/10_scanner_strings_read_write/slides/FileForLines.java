//© A+ Computer Science
// www.apluscompsci.com

//file input using a for loop with multiple sentences

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FileForLines
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("forlines.dat"));
		int cnt = file.nextInt();
		file.nextLine();  //clear out whitespace
		for(int i=0; i<cnt; i++)
		{
			String sentence = file.nextLine();
			out.println(sentence);
		}
	}
}
