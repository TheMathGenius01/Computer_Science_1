//© A+ Computer Science
// www.apluscompsci.com

//ternary example

import java.util.Scanner;

public class Ternary {

 public static void main(String args[])
 {
  Scanner keyboard = new Scanner(System.in);
  int num;

  System.out.print("Enter an integer :: ");
  num = keyboard.nextInt();

                   //if    true    false
  String output =(num>100)?">100":"<=100";

  System.out.println("num is " + output );
  
  char c = '1';
  System.out.println("the char " + c + (Character.isDigit(c)?" is ":" is not ")+ "a digit");
  
  int val = 55;
  System.out.println(val + " is " + (val%2==0 ? "even":"odd"));
 }
}
