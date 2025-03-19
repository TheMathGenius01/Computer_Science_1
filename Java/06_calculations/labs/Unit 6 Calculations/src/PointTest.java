import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    /**
     * Test of getX method, of class Point.
     */
    @Test
    public void testGetX() {
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Point.
     */
    @Test
    public void testGetY() {
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Point.
     */
    @Test
    public void testSetX() {
        int x = 14;
        Point instance = new Point();
        instance.setX(x);
        int result = instance.getX();
        assertEquals(x, result);
    }

    /**
     * Test of setY method, of class Point.
     */
    @Test
    public void testSetY() {
        int y = 0;
        Point instance = new Point();
        instance.setY(y);
        int result = instance.getY();
        assertEquals(y, result);
    }

    /**
     * Test of move method, of class Point.
     */
    @Test
    public void testMove() {
        int x = 3;
        int y = 8;
        Point instance = new Point();
        instance.move(x, y);
        assertTrue(instance.getX() == x && instance.getY() == y);
    }

    /**
     * Test of setLocation method, of class Point.
     */
    @Test
    public void testSetLocation() {
        Point p = new Point(3, 8);
        Point instance = new Point(33, 88);
        instance.setLocation(p);
        assertTrue(instance.getX() == 3 && instance.getY() == 8);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance() {
        Point p = new Point(4, 7);
        Point instance = new Point();
        double expResult = 8.06;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance2() {
        Point p = new Point(-22, 13);
        Point instance = new Point();
        double expResult = 25.55;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance3() {
        Point p = new Point(4, 7);
        Point instance = new Point(-22, 13);
        double expResult = 26.68;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of slope method, of class Point.
     */
    @Test
    public void testSlope() {
        Point p = new Point();
        Point instance = new Point(4, 7);
        double expResult = 1.75;
        double result = instance.slope(p);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of slope method, of class Point.
     */
    @Test
    public void testSlope2() {
        Point p = new Point(-22, 13);
        Point instance = new Point(4, 7);
        double expResult = -.23;
        double result = instance.slope(p);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of slope method, of class Point.
     */
    @Test
    public void testSlope3() {
        Point p = new Point(50, 13);
        Point instance = new Point(4, 13);
        double expResult = 0;
        double result = instance.slope(p);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of translate method, of class Point.
     */
    @Test
    public void testTranslate() {
        int dx = -8;
        int dy = 15;
        Point instance = new Point(422, 33);
        instance.translate(dx, dy);
        assertTrue(instance.getX() == 414 && instance.getY() == 48);
    }

    /**
     * Test of translate method, of class Point.
     */
    @Test
    public void testTranslate2() {
        int dx = 100;
        int dy = 150;
        Point instance = new Point(1, 2);
        instance.translate(dx, dy);
        assertTrue(instance.getX() == 101 && instance.getY() == 152);
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        Point instance = new Point();
        String expResult = "Point{x=0, y=0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString02() {
        Point instance = new Point(4, 7);
        String expResult = "Point{x=4, y=7}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
