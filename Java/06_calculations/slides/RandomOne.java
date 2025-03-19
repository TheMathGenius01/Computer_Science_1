//© A+ Computer Science
// www.apluscompsci.com

//random example

import java.lang.Math;
import java.util.Random;
import static java.lang.System.*;

public class RandomOne
{
	public static void main ( String[] args )
	{
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		
		int num = (int)(Math.random()*10);
		System.out.println(num);

		
		
		double decOne;
		int intOne;

		//Math.random()
		decOne = Math.random() * 10;
		intOne = (int)Math.random() * 10;  //this line needs help



		//Random class
		System.out.println("Math.random()");
		System.out.println(decOne);
		System.out.println(intOne);   //why does it always output 0?

		System.out.println("\n\nRandom Class");
		Random rand = new Random();
		intOne = rand.nextInt(256);
		System.out.println(intOne);
		intOne = rand.nextInt(256);
		System.out.println(intOne);
		intOne = rand.nextInt(256);
		System.out.println(intOne);
		System.out.println();
		
		Random r = new Random();
		out.println(r.nextInt());
		out.println(r.nextInt(100));
		out.println(r.nextDouble());
		out.println(r.nextBoolean());
		
		
		r.setSeed(987_654_321L);
		out.println(r.nextInt());//1314001072
		out.println(r.nextInt());//-327325441
		
	}
}