//array output example 23

import static java.lang.System.*;

public class ArrayPrintThree{
   public static void main(String args[]){
       int[] perfects = {1, 4, 9, 16, 25};
       out.println(perfects);
       out.println(new byte[]{1, 4, 9, 16, 25});
       out.println(new double[]{1.0, 2.0, 3.0});
       out.println(new String[]{"a","b"});
       
       out.println(new char[]{'a','b','c'});
       out.println((new char[]{'a','b','c'}).toString());

 }
}