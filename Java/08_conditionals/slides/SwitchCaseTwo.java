//© A+ Computer Science
// www.apluscompsci.com

//switch case example

import static java.lang.System.*;

public class SwitchCaseTwo
{
 public static void main(String args[])
 {
  int num = 30;
  switch (num)
  {
     case 11 :  out.println("num == 11");
     case 22 :  out.println("num == 22");
     case 30 :  out.println("num == 30");
     case 40 :  out.println("num == 40");
     default :  out.println("does not equal");
  }
  
  final String a = "a", b = "b", c = "c"; // compile time contstant
  String s = "c";
  switch (s)
  {
    case a:  out.println(s + "==" + a);break;
    case b:  out.println(s + "==" + b);break;
    case c:  out.println(s + "==" + c);break;
    default:  out.println(s + "!= a, b, or c");
  }
 }
}
