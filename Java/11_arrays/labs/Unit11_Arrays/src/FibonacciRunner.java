//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class FibonacciRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner("set size to 50\n" +
				"1\n" +
				"2\n" +
				"3\n" +
				"4\n" +
				"5\n" +
				"6\n" +
				"11\n" +
				"16\n" +
				"21\n" +
				"31\n" +
				"41\n" +
				"50\n" +
				"set size to 1\n" +
				"1\n" +
				"set size to 2\n" +
				"1\n" +
				"2\n" +
				"11");
		int size  = 0;
		while (kb.hasNextLine()){
			String str = kb.nextLine();
			if (str.startsWith("se")){
				size = Integer.parseInt(str.substring(str.lastIndexOf(" ")+1));
				continue;
			}
			if (Integer.parseInt(str)>size){
				System.out.println(-1);
				continue;
			}
			System.out.println(Fibonacci.getNthTerm(Integer.parseInt(str)));
		}
	}
}