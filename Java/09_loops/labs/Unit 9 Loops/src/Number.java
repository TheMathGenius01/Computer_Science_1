import java.util.Arrays;
import java.util.stream.IntStream;

public class Number {

    public static long factorial(int n){
        return n == 0 ? 1 : n == 1 ? 1 : n * factorial(n-1);
    }

    public static int GCD(int a, int b){
        return a==0? b : b == 0 ? b : GCD(Math.max(a, b) % Math.min(a, b), Math.min(a, b));
    }

    public static int sumEvens(int start, int stop) {
        return start > stop ? 0 : start % 2 == 0 ? start + sumEvens(start + 1, stop) : sumEvens(start + 1, stop);
    }

    public static int sumSquares(int n){
        return n == 0 ? 0 : (n*n) + sumSquares(n-1);
    }

    public static int sumFactors(int n){
        return IntStream.range(1, n).filter(x -> n%x==0).sum()+n;
    }

    public static boolean isPrime(int n){
        return IntStream.range(2, n).filter(x -> n%x==0).toArray().length == 0;
    }

    public static double calculatePI(int n){
        double ret = 4.0;
        int bottom = 3;
        for (int i = 1; i < n; i++) {
            if (i%2==0){
                ret+=(4.0/bottom);
            }
            else {
                ret-=(4.0/bottom);
            }
            bottom+=2;
        }
        return ret;
    }


    public static boolean isPerfect(int n){
        return sumFactors(n)-n == n;
    }

    public static void main(String[] args) {
        System.out.println(Number.calculatePI(1000));
    }
}
