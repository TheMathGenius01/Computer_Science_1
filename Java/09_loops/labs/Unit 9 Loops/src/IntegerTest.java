import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IntegerTest {

    @Test
    public void Test01() {
        Integer test = new Integer(13756);
        int result = test.getN();
        assertEquals(13756, result);

        Integer test1 = new Integer();
        int result1 = test1.getN();
        assertEquals(7, result1);
    }

    @Test
    public void Test02() {
        Integer test = new Integer(-13756);
        int result = test.digitCount();
        assertEquals(5, result);

        Integer test1 = new Integer(0);
        int result1 = test1.digitCount();
        assertEquals(1, result1);
    }


    @Test
    public void Test03() {
        Integer test = new Integer(-9912);
        int result = test.digitSum();
        assertEquals(21, result);
    }


    @Test
    public void Test04() {
        Integer test = new Integer(-1252);
        double result = test.digitAverage();
        assertEquals(2.5, result, .0000001);
    }

    @Test
    public void Test05() {
        Integer test = new Integer(123456789);
        int result = test.digitDivisorSum();
        assertEquals(13, result);

        Integer test1 = new Integer(-135);
        int result1 = test1.digitDivisorSum();
        assertEquals(9,result1);
    }

    @Test
    public void Test06() {
        Integer test = new Integer(2240108);
        int result = test.reverse();
        assertEquals(8010422, result);
    }



    @Test
    public void Test07() {
        Integer test = new Integer(77778);
        long result = test.toBase(9);
        assertEquals(127620, result);


        Integer test2 = new Integer(-0);
        long result2 = test2.toBase(2);
        assertEquals(0, result2);
    }


    @Test
    public void Test08() {
        Integer test = new Integer(63);
        int result = test.populationCount();
        assertEquals(6, result);
    }



    @Test
    public void Test09() {
        Integer test = new Integer(592);
        boolean result = test.isOdious();
        assertEquals(true, result);
    }


    @Test
    public void Test10() {
        Integer test = new Integer(592);
        boolean result = test.isEvil();
        assertEquals(false, result);
    }

    public static void main(String[] args) {
        Integer value = new Integer(1252);
        System.out.println(value.digitCount() + " == 4");
        System.out.println(value.digitSum() + " == 10");
        System.out.println(value.digitAverage() + " == 2.5");
        System.out.println(value.digitDivisorSum() + " == 5");
        System.out.println(value.reverse() + " == 2521");
        System.out.println(value.toBase(4) + " == 103210");
        System.out.println(value.toBase(2) + " == 10011100100");
        System.out.println(value.populationCount() + " == 5");
        System.out.println(value.isOdious() + " == true");
        System.out.println(value.isEvil() + " == false");

    }
}
