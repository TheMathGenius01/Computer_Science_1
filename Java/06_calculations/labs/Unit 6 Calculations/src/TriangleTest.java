import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void perimeter() {
        Triangle test = new Triangle(3, 3, 3);
        assertEquals(9, test.perimeter());

        test = new Triangle(7, 8, 9);
        assertEquals(24, test.perimeter());

        test = new Triangle(10, 9, 11);
        assertEquals(30, test.perimeter());

        test = new Triangle(10, 10, 15);
        assertEquals(35, test.perimeter());

        test = new Triangle(3, 4, 5);
        assertEquals(12, test.perimeter());
    }

    @Test
    public void area() {
        Triangle test = new Triangle(3, 3, 3);
        assertEquals(3.897114, test.area(), .0001);

        test = new Triangle(7, 8, 9);
        assertEquals(26.832816, test.area(), .0001);

        test = new Triangle(10, 9, 11);
        assertEquals(42.426407, test.area(), .0001);

        test = new Triangle(10, 10, 15);
        assertEquals(49.607837082461074, test.area(), .0001);

        test = new Triangle(3, 4, 5);
        assertEquals(6.0, test.area(), .0001);
    }

    @Test
    public void testToString() {
        Triangle test = new Triangle(3, 3, 3);
        assertEquals("Triangle{a=3, b=3, c=3, A=60.00, B=60.00, C=60.00}".trim(), test.toString().trim());

        test = new Triangle(7, 8, 9);
        assertEquals("Triangle{a=7, b=8, c=9, A=48.19, B=58.41, C=73.40}".trim(), test.toString().trim());

        test = new Triangle(10, 9, 11);
        assertEquals("Triangle{a=10, b=9, c=11, A=58.99, B=50.48, C=70.53}".trim(), test.toString().trim());

        test.setSides(3, 4, 5);
        assertEquals("Triangle{a=3, b=4, c=5, A=36.87, B=53.13, C=90.00}".trim(), test.toString().trim());

        test.setSides(10, 10, 15);
        assertEquals("Triangle{a=10, b=10, c=15, A=41.41, B=41.41, C=97.18}".trim(), test.toString().trim());
    }


}