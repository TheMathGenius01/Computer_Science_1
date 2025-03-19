//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram counter1 = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3");
		counter1.countNumber(0);
		int[] numCount1 = counter1.getNumCount();
		for (int i = 0; i < numCount1.length; i++) {
			System.out.println(i + " - " + numCount1[i]);
		}
		System.out.println();

		Histogram counter2 = new Histogram("2 3 4 5 6 7 8 9 0 2 3 5 6 8 8 8 9 4 5");
		counter2.countNumber(0);
		int[] numCount2 = counter2.getNumCount();
		for (int i = 0; i < numCount2.length; i++) {
			System.out.println(i + " - " + numCount2[i]);
		}
		System.out.println();

		Histogram counter3 = new Histogram("2 3 4 5 6 7 8 2 bhkl 0 2 3 5 6 8 8 8 9 4 5");
		counter3.countNumber(0);
		int[] numCount3 = counter3.getNumCount();
		for (int i = 0; i < numCount3.length; i++) {
			System.out.println(i + " - " + numCount3[i]);
		}


	}
}