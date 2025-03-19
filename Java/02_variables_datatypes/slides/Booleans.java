//© A+ Computer Science  -  www.apluscompsci.com

//boolean example

public class Booleans
{
 public static void main(String args[])
 {
  boolean go = true;
  System.out.printf("%b\n", go);
  
  boolean stop = false;
  System.out.printf("%b\n",stop);
  
  //assign the value of variable stop to variable go
  stop = go;

  System.out.println(stop);
  System.out.println(go);  
 }
}
