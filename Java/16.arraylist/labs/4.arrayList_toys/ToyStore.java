//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		for (String s : toys.split(" ")) toyList.add(new Toy(s));
	}
  
  public Toy getThatToy( String nm )
  {
  	return null;
  }
  
  public String getMostFrequentToy()
  {
  	return "";
  }  
  
  public void sortToysByCount()
  {

  }  
  	  
	public String toString()
	{
	   return "";
	}
}