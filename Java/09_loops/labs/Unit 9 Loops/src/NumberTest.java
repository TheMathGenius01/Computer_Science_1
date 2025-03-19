import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NumberTest {

    @Test
    public void Test01() {
        long result = Number.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void Test02() {
        int result = Number.GCD(100, 24);
        assertEquals(4, result);
    }

    @Test
    public void Test03() {
        int result = Number.sumEvens(1, 10);
        assertEquals(30, result);
    }

    @Test
    public void Test04() {
        int result = Number.sumFactors(8);
        assertEquals(15, result);
    }

    @Test
    public void Test05() {
        int result = Number.sumSquares(10);
        assertEquals(385, result);
    }

    @Test
    public void Test06() {
        boolean result = Number.isPrime(501);
        assertEquals(false, result);
    }


    @Test
    public void Test07() {
        double result = Number.calculatePI(2);
        assertEquals(2.66666666667, result, .0000000001);
        double res1 = Number.calculatePI(3);
        assertEquals(3.46666666667, res1, .00000000001);
    }

    @Test
    public void Test08() {
        boolean result = Number.isPerfect(6);
        assertEquals(true, result);
    }

    public static void main(String[] args) {
        System.out.println(Number.calculatePI(1000));
        System.out.println(Number.factorial(5) + " == 120");
        System.out.println(Number.GCD(100, 24) + " == 4");
        System.out.println(Number.GCD(18, 24) + " == 6");
        System.out.println(Number.sumEvens(1, 10) + " == 30");
        System.out.println(Number.sumSquares(10) + " == 385");
        System.out.println(Number.sumFactors(8) + " == 15");
    }

}
