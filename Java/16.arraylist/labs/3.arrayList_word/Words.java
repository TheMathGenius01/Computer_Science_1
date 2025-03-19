//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		words = new ArrayList<Word>();
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words.clear();
		for (String s : wordList.split(" ")) words.add(new Word(s));
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for (Word i : words) if (i.getLength() == size) count++;
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int numSum = 0;
		for (int i = words.size()-1; i >= 0; i--){
			if (words.get(i).getLength() == size){
				numSum+=words.get(i).getNumVowels();
				words.remove(i);
			}
		}
		return numSum;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for (Word i : words) if (i.getNumVowels() == numVowels) count++;
		return count;
	}
	
	public String toString()
	{
		return "" + words;
	}
}