// Class methods from the Arrays Utility class

import java.util.Arrays;           // must import!
import static java.lang.System.*;

public class Arrays_Class{
    public static void main(String args[]){
        int[] arr1 = {5,1,4,3,2};
        Arrays.sort(arr1);
        out.println(Arrays.toString(arr1));
        
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 2);  // method is overloaded Arrays.fill(Object[] a, int fromIndex, int toIndex, Object value)
        out.println(Arrays.toString(arr2));       // String representation
        
        out.println(Arrays.equals(arr1, arr2));   // outs false
        
        arr2 = Arrays.copyOf(arr1, arr1.length);  // truncates or pads with zero/nulls to the specified length
        out.println(Arrays.equals(arr1, arr2));   // outs true
        
        arr2 = Arrays.copyOf(arr1, 10);           // pads with zeros (null for objects)
        out.println(Arrays.toString(arr2));
        
        arr2 = Arrays.copyOf(arr1, 3);            // truncates
        out.println(Arrays.toString(arr2));
        
        arr2 = new int[]{0, 1, 2, 3, 4, 6, 7};      // array initializer
        out.println(Arrays.binarySearch(arr2, 3));  // returns the index of the element on a sorted list; 3 is at index 3
        out.println(Arrays.binarySearch(arr2, 6));  // 6 is at index 5
        out.println(Arrays.binarySearch(arr2, 5));  // if not found returns -1 minus the index where it would be to keep the list sorted(-1-5=-6)
        
        
        // System has a copy method as well
        //System.arraycopy(sourceArray, scrPos, distinationArray, destPos, numberOfElements/length);
        Arrays.fill(arr2, 0);
        System.arraycopy(arr1, 1, arr2, 3, 2); // start at index 1 of arr1 and copy 2 elements to arr2 starting at index 3
        out.println(Arrays.toString(arr2));
        
        String[] array = {"g","a","t","q"};
        Arrays.sort(array);
        out.println(Arrays.toString(array));
        
        Cat[] ary = {new Cat(4, "a"), new Cat(2, "b"), new Cat(9, "c")}; // bad names but this is for illlustrative purposes
        Arrays.sort(ary);
        out.println(Arrays.toString(ary));
    }
}
class Cat implements Comparable<Cat>{
    private int lives;
    private String name;
    public Cat(int lives, String name){
     this.lives = lives;   
     this.name = name;
    }
    public int compareTo(Cat other){
       if(lives == other.lives)
           return 0;
       return lives < other.lives ? -1 : 1;
    }
    public String toString(){
        return name + " " + lives;
    }
}