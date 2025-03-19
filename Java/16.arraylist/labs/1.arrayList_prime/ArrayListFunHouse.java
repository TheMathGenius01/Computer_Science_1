//© A+ Computer Science  -  www.apluscompsci.com
//Name - Parth Zanwar
//Date - 5/13/24
//Class - Computer Science 1 K
//Lab  - ArrayListFunHouse

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		//add code here
		ArrayList<Integer> ret = new ArrayList<>();
		for(int i = 1; i < number; i++) if (number%i==0) ret.add(i);
		return ret;
	}
}