//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{

	}

	public Word(String wrd)
	{
		word=wrd;
	}

	public void setWord(String wrd)
	{
		word=wrd;
	}
	
	public int getNumVowels()
	{
		return word.length()-word.replaceAll( "[aeiouAEIOU]", "" ).length();
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}