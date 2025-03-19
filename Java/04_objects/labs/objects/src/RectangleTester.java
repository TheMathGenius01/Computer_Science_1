public class RectangleTester {
    public static void main(String[] args) {

        // Create a 2x1 rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        // Create a 10x3 rectangle
        Rectangle rectangle2 = new Rectangle(3, 10);
        System.out.println(rectangle2);

        // Create a 4.5 by 1.5 rectangle
        Rectangle rectangle3 = new Rectangle(1.5, 4.5);
        System.out.println(rectangle3);

        // Modify rectangle
        rectangle3.setLength(15);
        rectangle3.setWidth(15);
        System.out.println(rectangle3);

    }
}
