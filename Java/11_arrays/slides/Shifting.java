// shifting elements in an array

import static java.lang.System.*;
import java.util.Arrays;

public class Shifting{
   public static void main(String args[]){
       int[] ary = {1, 2, 3, 4, 5};
       out.println(Arrays.toString(ary));
       int temp = ary[0];
       // shift elements 1 left
       for(int i = 1; i < ary.length; i++)
           ary[i-1] = ary[i];
       // move first element to last spot
       ary[ary.length -1] = temp;
       out.println(Arrays.toString(ary));
       
       // shift elements by 'n' left(negative) or right(positive)
       ary = new int[]{1, 2, 3, 4, 5};
       for(int n = 0; n < 20; n++){
           out.println("\nShift by: " + n);
           shiftOutOfPlaceAlgorithm(ary, n);
           out.println(Arrays.toString(ary));
           shiftOutOfPlaceAlgorithm(ary, -n);
           out.println(Arrays.toString(ary));
       }
       
       
       out.println("_____________________________");
       ary = new int[]{1, 2, 3, 4, 5};
       for(int n = 0; n < 5; n++){
           out.println("\nShift left by: " + n);
           shiftLeftInPlaceAlgorithmNTimes(ary, n);
           out.println(Arrays.toString(ary));
           shiftOutOfPlaceAlgorithm(ary, n);
           out.println(Arrays.toString(ary));
       }
       
   }
   // shifts an array by n where a negative shifts left and positive n shifts right
   static void shiftOutOfPlaceAlgorithm(int[]ary, int n){
       int[] copy = new int[ary.length];
       // add your code here
       
       
       
       
       System.arraycopy(copy, 0, ary, 0, ary.length);  // copy all the elements back to ary
   }
   
   // mehtod will repeatedly shift all elements left by 1 n times
   static void shiftLeftInPlaceAlgorithmNTimes(int[]ary, int n){
      // repeat n times
            // code to shift 1 left (same as above in main)
       
       
   }
}