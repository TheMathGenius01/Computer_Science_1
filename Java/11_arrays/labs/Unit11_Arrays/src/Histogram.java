//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class Histogram
{
	private final int[] numCount;
    private final String input;

    public Histogram(String str){
        numCount = new int[10];
        input=str;
    }

    public void countNumber(int number) {
        Scanner chopper = new Scanner(input);
        while (chopper.hasNextInt()) {
            int n = chopper.nextInt();
            numCount[n]++;
        }
    }

    public int[] getNumCount() {
        return numCount;
    }
}