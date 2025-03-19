//Scanner example that will redirect input and output 

import java.util.Scanner;
import static java.lang.System.*;

public class Redirection{
 public static void main(String args[]){
  Scanner keyboard = new Scanner(System.in);
  out.print("How many numbers ::");
  int cnt = keyboard.nextInt();
  int sum = 0;
  out.println("\nEnter "+ cnt + " numbers");
  for(int i=0;i<cnt;i++)
   sum=sum+keyboard.nextInt();
  out.println("total == " + sum);
 }
}