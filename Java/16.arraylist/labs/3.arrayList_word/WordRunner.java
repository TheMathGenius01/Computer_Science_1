//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word w1 = new Word("chicken");
		out.println(w1);
		out.println("num vowels == " + w1.getNumVowels());
		out.println("num chars == " + w1.getLength() + "\n\n");

		Word w2 = new Word("alligator");
		out.println(w2);
		out.println("num vowels == " + w2.getNumVowels());
		out.println("num chars == " + w2.getLength() + "\n\n");

		Word w3 = new Word("elephant");
		out.println(w3);
		out.println("num vowels == " + w3.getNumVowels());
		out.println("num chars == " + w3.getLength());
	}
}