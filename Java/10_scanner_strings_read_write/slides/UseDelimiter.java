//© A+ Computer Science
// www.apluscompsci.com

//Scanner example usedelimiter

import java.util.Scanner;
import static java.lang.System.*;

public class UseDelimiter{
 public static void main(String args[]){
  Scanner  chop = new Scanner("one-two-three");
  
  chop.useDelimiter("\\-");
  //chop.useDelimiter("[\\-\\+\\?\\^]");
  //chop.useDelimiter("\\p{Punct}");   //Punctuation: One of !”#$%&’( )*+,-./:;<=>?@[\]^_`{ | }
    
  while(chop.hasNext()){
     out.println(chop.next());
  }
  
  chop = new Scanner("1 + 2 + 3 + 4 + 5");
  chop.useDelimiter("\\s\\+\\s");
 
  chop = new Scanner("Comp@Sci@1@k");
  chop.useDelimiter("@");
  
  while(chop.hasNext()){
     out.println(chop.next());
  }

  
  int total = 0; 
  while(chop.hasNextInt()){
    out.println(total += chop.nextInt());
  }

 }
}