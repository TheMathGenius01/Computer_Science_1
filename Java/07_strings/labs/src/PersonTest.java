import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void affix() {
        Person p = new Person();
        assertFalse(p.affix("in"));
        assertTrue(p.affix("e"));

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertFalse(test.affix("in"));
        assertTrue(test.affix("son"));
    }

    @Test
    public void prefix() {
        Person p = new Person();
        assertFalse(p.prefix("Van"));
        assertFalse(p.prefix("Mac"));

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertFalse(test.prefix("Van"));
        assertFalse(test.prefix("Mac"));
    }

    @Test
    public void hasX() {
        Person p = new Person();
        assertFalse(p.hasX());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertTrue(test.hasX());
    }

    @Test
    public void firstLetter() {
        Person p = new Person();
        assertEquals('J', p.firstLetter());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals('A', test.firstLetter());
    }

    @Test
    public void lastLetter() {
        Person p = new Person();
        assertEquals('e', p.lastLetter());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals('n', test.lastLetter());
    }

    @Test
    public void length() {
        Person p = new Person();
        assertEquals(8, p.length());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals(17, test.length());
    }

    @Test
    public void testEquals() {
        Person p = new Person();
        assertEquals(p, new Person("Jane mary Doe", 27));
        assertNotEquals(p, new Person("Jane Rachel Doe", 26));

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertNotEquals(p, new Person("Jane ary Doe", 27));
        assertNotEquals(p, new Person("Abe Frank VanHanCockson", 26));
        assertNotEquals(p, new Person("Abe Frank VanHanCockSon", 55));
    }

    @Test
    public void toUpperCase() {
        Person p = new Person();
        p.toUpperCase();
        assertEquals("Person{first=JANE, last=DOE, middleInitial=M, age=27}", p.toString());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.toUpperCase();
        assertEquals("Person{first=ABEXEL, last=HANCOCKSON, middleInitial=F, age=55}", test.toString());
    }

    @Test
    public void toLowerCase() {
        Person p = new Person();
        p.toLowerCase();
        assertEquals("Person{first=jane, last=doe, middleInitial=m, age=27}", p.toString());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.toLowerCase();
        assertEquals("Person{first=abexel, last=hancockson, middleInitial=f, age=55}", test.toString());
    }

    @Test
    public void toTitleCase() {
        Person p = new Person();
        p.toTitleCase();
        assertEquals("Person{first=Jane, last=Doe, middleInitial=M, age=27}", p.toString());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals("Person{first=Abexel, last=Hancockson, middleInitial=F, age=55}", test.toString());
    }

    @Test
    public void isSorted() {
        Person p = new Person();
        assertFalse(p.isSorted());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertTrue(test.isSorted());
    }

    @Test
    public void setFirst() {
        Person p = new Person();
        p.setFirst("Chinmay");
        assertEquals("Chinmay", p.getFirst());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.setFirst("Bryce");
        assertEquals("Bryce", test.getFirst());
    }

    @Test
    public void setMiddleInitial() {
        Person p = new Person();
        p.setMiddleInitial('P');
        assertEquals('P', p.getMiddleInitial());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.setMiddleInitial('X');
        assertEquals('X', test.getMiddleInitial());
    }

    @Test
    public void setLast() {
        Person p = new Person();
        p.setLast("Mangalwedhe");
        assertEquals("Mangalwedhe", p.getLast());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.setLast("Hulett");
        assertEquals("Hulett", test.getLast());
    }

    @Test
    public void setAge() {
        Person p = new Person();
        p.setAge(16);
        assertEquals(16, p.getAge());

        Person test = new Person("Abexel Frank Hancockson", 55);
        test.setAge(42);
        assertEquals(42, test.getAge());
    }

    @Test
    public void getFirst() {
        Person p = new Person();
        assertEquals("Jane", p.getFirst());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals("Abexel", test.getFirst());
    }

    @Test
    public void getMiddleInitial() {
        Person p = new Person();
        assertEquals('M', p.getMiddleInitial());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals('F', test.getMiddleInitial());
    }

    @Test
    public void getLast() {
        Person p = new Person();
        assertEquals("Doe", p.getLast());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals("Hancockson", test.getLast());
    }

    @Test
    public void getAge() {
        Person p = new Person();
        assertEquals(27, p.getAge());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals(55, test.getAge());
    }

    @Test
    public void testToString() {
        Person p = new Person();
        assertEquals("Person{first=Jane, last=Doe, middleInitial=M, age=27}", p.toString());

        Person test = new Person("Abexel Frank Hancockson", 55);
        assertEquals("Person{first=Abexel, last=Hancockson, middleInitial=F, age=55}", test.toString());
    }
}