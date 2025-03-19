//© A+ Computer Science  -  www.apluscompsci.com
//Name - Parth Zanwar
//Date - 5/13/24
//Class - Computer Science 1 K
//Lab  - Number

public class Number
{
	private Integer number;

	public Number()
	{
	}

	public Number(int num)
	{
		number=num;
	}

	public void setNumber(int num)
	{
		number=num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		return number%2==1;
	}

	public boolean isPerfect()
	{
		int total=0;
		for (int i = 1; i < number ; i++) if (number%i==0) total+=i;
		return (number==total);
	}
	
	public String toString( )
	{
		return ""+number;
	}
}