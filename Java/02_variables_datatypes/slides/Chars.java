//© A+ Computer Science  -  www.apluscompsci.com

//character example

public class Chars
{
 public static void main(String args[])
 {
  char alpha = 'A';
  char ascii = 65;
  char sum = 'B' + 1;

  System.out.println(alpha);
  System.out.println(ascii);
  System.out.println(sum);

  System.out.println('B'+1);   //char is an integer type

  System.out.println('A'+5);
  System.out.println((char)('A'+5));
  
  char grade = 'A';
  char alt = 65;
  char lower = 'a';
  char alt_low = 97;
  char zero = '0', zero_alt = 48;

  System.out.printf("%c %c\n", grade, alt);
  System.out.printf("%c %c\n", lower, alt_low);
  System.out.printf("%c %c\n", zero, zero_alt);
  
  
  

 }
}
