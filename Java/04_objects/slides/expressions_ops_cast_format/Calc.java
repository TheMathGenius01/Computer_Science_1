//© A+ Computer Science
// www.apluscompsci.com

//modifier method example

import static java.lang.System.*;

public class Calc
{
   private int one, two;
   private int answer;

   public void setNums( int n1, int n2 )
   {
      one=n1;
      two=n2;
   }
   // add setters(same as modifers or mutators) for one and two individually

   public void add()
   {
      answer = one + two;
   }
   
   //add more operations - sub, mult, div

   public void print()
   {
      System.out.println(answer);
   }
}