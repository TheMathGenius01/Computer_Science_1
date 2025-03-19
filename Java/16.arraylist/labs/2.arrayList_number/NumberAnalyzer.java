//© A+ Computer Science  -  www.apluscompsci.com
//Name - Parth Zanwar
//Date - 5/13/24
//Class - Computer Science 1 K
//Lab  - NumberAnalyzer

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{

	}

	public NumberAnalyzer(String numbers)
	{
		list = new ArrayList<Number>();
		setList(numbers);
	}
	
	public void setList(String numbers)
	{
		list.clear();
		for (String s : numbers.split(" ")) {
			int n = Integer.parseInt(s);
			list.add(new Number(n));
		}
	}

	public int countOdds()
	{
      int oddCount=0;
	  for (Number i : list) if (i.isOdd()) oddCount++;
      return oddCount;
	}

	public int countEvens()
	{
      return list.size()-this.countOdds();
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for(Number i : list) if (i.isPerfect()) perfectCount++;
        return perfectCount;
	}
	
	public String toString( )
	{
		return "" + list;
	}
}