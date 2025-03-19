//© A+ Computer Science  -  www.apluscompsci.com

//integer example

public class Integers{

 public static void main(String args[])
 {
 	
  System.out.printf("%d\n", Integer.BYTES);
  System.out.printf("%d\n\n", Integer.SIZE);
 	
  int one = 120;
  int two = 987123;
  int three = 999999999;
  int four = Integer.MAX_VALUE+1;
  byte bite = 99;
  long longInt = 99234423;


  System.out.println(one);
  System.out.println(two);
  System.out.println(bite);
  System.out.println(longInt);


  three = three * 3;   //creates an overflow error at runtime
  System.out.println(three);
  
  System.out.println(four==Integer.MIN_VALUE);
  
  byte score = 95;
  short trip = 250;
  int population = 2_000_000;
  long bezosWorth = 65_000_000_000L;

  System.out.println("\n");
  
  System.out.printf("%d\n", score);
  System.out.printf("%d\n", trip);
  System.out.printf("%d\n", population);
  System.out.printf("%d\n", bezosWorth);

  
 }
}
