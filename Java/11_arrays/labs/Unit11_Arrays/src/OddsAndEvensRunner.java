//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		int[] arrayOne = {2, 4, 6, 8, 10, 12, 14};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(arrayOne)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(arrayOne)) + "\n");

		int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(arrayTwo)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(arrayTwo)) + "\n");

		int[] arrayThree = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(arrayThree)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(arrayThree)));
	}
}