//© A+ Computer Science  -  www.apluscompsci.com

//character example
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ASCII
{
 public static void main(String args[]) 
 {
  char upper = 65;
  char lower = 97;
  char zero = 48;

  System.out.printf("ASCII VALUES YOU MUST KNOW\n");
  System.out.printf("'%c'- %d\n", upper, (int)upper);
  System.out.printf("'%c'- %d\n", lower, (int)lower);
  System.out.printf("'%c'- %d\n", zero, (int)lower);
  System.out.printf("62 in total\n\n\n");
  
  /*
   * A char is an unsigned integer that stores a 16-bit Unicode character(i.e. just about any 
   * symbol or character you can think of from most languages).They range from 
   * \u0000 (0) to \uffff (65,535).
   * 
   */
  
  
  char a = '\u26D0';
  char b = '\u26D1';
  char c = '\u26D2';
  char d = '\u26D3';
  char e = '\u0041';

  
  // the following might show up as a ? depending on your settings for locale and font group
  System.out.printf("%c\n",a);   // ?
  System.out.printf("%c\n",b);  // ?
  System.out.printf("%c\n",c);  // ?
  System.out.printf("%c\n",d);  // ?
  System.out.printf("%c\n",e);  // A
 
 }
}
