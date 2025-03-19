//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class OddsAndEvens
{
	public static int countEm(int[] array, boolean odd)
	{
		return Arrays.stream(array).filter(odd ? n -> (n%2==1) : n->(n%2==0)).toArray().length;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		return Arrays.stream(array).filter(n -> (n % 2 == 0)).toArray();

	}

	public static int[] getAllOdds(int[] array)
	{
		return Arrays.stream(array).filter(n -> (n % 2 == 1)).toArray();
	}
}