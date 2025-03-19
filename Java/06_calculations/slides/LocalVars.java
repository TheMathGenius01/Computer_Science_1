//© A+ Computer Science
// www.apluscompsci.com

//scope and local variable example

public class LocalVars
{
   private int fun;   	//instance variable
   	              				//this fun exists throughout the class
   	              				
   public void change()
   {
      int fun = 99;    	//local variable defined inside method change
      							//this fun exists only in method change
   }

   public void print()
   {
      System.out.println(fun);
   }

   public static void main(String args[])
   {
      LocalVars test = new LocalVars();
      test.change();
      test.print();
   }
}