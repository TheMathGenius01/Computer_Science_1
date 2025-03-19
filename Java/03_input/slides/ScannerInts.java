//© A+ Computer Science  -  www.apluscompsci.com

//scanner int example

import java.util.Scanner;

// for Dates
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ScannerInts
{
 public static void main(String args[])
 {
  Scanner keyboard = new Scanner(System.in);

  System.out.print("Enter a short (-32768 to 32767) :: ");
  short shortOne = keyboard.nextShort();
  System.out.println(shortOne);

  System.out.print("Enter an int (-2billion to 2billion):: ");
  int intOne = keyboard.nextInt();
  System.out.println(intOne);
  
  Scanner console = new Scanner(System.in);

  System.out.printf("Enter birth year :: ");
  int year = console.nextInt();
  System.out.printf("\nBorn in %d\n\n", year);
  
  
  // don't worry about this code
  // code to calulate the number of milliseconds since DOB
   LocalDateTime dob = LocalDateTime.of(1978, Month.SEPTEMBER, 1, 12, 0, 0);
   LocalDateTime today = LocalDateTime.now();
   long millis = ChronoUnit.MILLIS.between(dob, today);
   //System.out.println(millis);
  
  
  System.out.printf("Enter ms since birth :: ");
  long ms = console.nextLong();
  System.out.printf("\nBorn in %d\n", year);

 }
}
