//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Fibonacci
{
	//instance variable
    private final int nth;
    private long nthTerm;

	//constructors
    public Fibonacci(int n){
        nth=n;
    }

    public static long getNthTerm(int n){
        return n == 0 ? 0 : n <= 2 ? 1 : getNthTerm(n-2) + getNthTerm(n - 1);
    }

    public long getNthTerm() {
        return nthTerm;
    }

    public void setNthTerm(long nthTerm) {
        this.nthTerm = getNthTerm(nth);
    }

}