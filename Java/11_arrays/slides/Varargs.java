import static java.lang.System.*;
import java.util.NoSuchElementException;

public class Varargs{
    public static void main(String[] args){
        out.println(max(5, -33, 40));
        out.println(max(4,2,4,6,5,4,222,41));
        out.println(max(5,3));
        
        out.println();
        out.println(sum());
        out.println(sum(5,3));
        out.println(sum(0,5,10,20,30));
        out.println(sum(new int[]{1,2,3,4}));

    }
    
    public static int max(int ... numbers){
        if(numbers.length == 0)
            throw  new NoSuchElementException();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++)
            max = Math.max(max, numbers[i]);   
        return max;
    }
    
    public static int sum(int... args){
        int sum = 0;
        for(int n: args)
            sum += n;
        return sum;
    }

}