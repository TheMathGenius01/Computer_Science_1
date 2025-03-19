//© A+ Computer Science
// www.apluscompsci.com

//ArrayList of references as an instance variable example

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Herd_Sol
{
	private List<Creature> list;

	public Herd_Sol()
	{
		list = new ArrayList<Creature>();
	}

	public void add( int creatureSize )
	{
		list.add( new Creature(creatureSize));
	}

	/* method countBigOnes should return the count of
	    big creatures - use the isBig() Creature method
	*/
	public int countBigOnes()
	{
		int cnt = 0;
		for( Creature c : list )
		{
			if( c.isBig() )
				cnt++;
		}
		return cnt;
	}

	public String toString()
	{
		return "" + list;
	}
}