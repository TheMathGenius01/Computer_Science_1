//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class WordsRunner
{
	public static void main( String args[] )
	{
		Words test1 = new Words("one two three four five six seven alligator");
		out.println(test1);
		out.println("word with 2 vowels = "+test1.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test1.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test1.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test1.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test1.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test1.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test1.countWordsWithXChars(5));
		int vowelsRemoved1 = test1.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test1);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved1);
		out.println("\n\n");

		Words test2 = new Words("fun fly four six times ten plus eight");
		out.println(test2);
		out.println("word with 2 vowels = "+test2.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test2.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test2.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test2.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test2.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test2.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test2.countWordsWithXChars(5));
		int vowelsRemoved2 = test2.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test2);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved2);
		out.println("\n\n");

		Words test3 = new Words("alligator chicken dog cat pig buffalo");
		out.println(test3);
		out.println("word with 2 vowels = "+test3.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test3.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test3.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test3.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test3.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test3.countWordsWithXChars(4));
		out.println("word with 9 chars = "+test3.countWordsWithXChars(9));
		int vowelsRemoved3 = test3.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test3);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved3);






	}
}