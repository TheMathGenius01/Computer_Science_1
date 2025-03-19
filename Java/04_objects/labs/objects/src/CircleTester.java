public class CircleTester {
    public static void main(String[] args) {
        // Create a circle with radius 1 using no-arg constructor
        Circle circle1 = new Circle();
        System.out.printf("The circumference is: %.2f\n", circle1.getCircumference());
        System.out.printf("The area of the circle is: %.2f\n", circle1.getArea());
        System.out.printf("%s\n\n", circle1);

        // Create a circle with radius 25 using initialization constructor
        Circle circle2 = new Circle(25);
        System.out.printf("The circumference is: %.2f\n", circle2.getCircumference());
        System.out.printf("The area of the circle is: %.2f\n", circle2.getArea());
        System.out.printf("%s\n\n", circle2);

        // Create a circle with radius 125 using initialization constructor
        Circle circle3 = new Circle(100);
        System.out.printf("The circumference is: %.2f\n", circle3.getCircumference());
        System.out.printf("The area of the circle is: %.2f\n", circle3.getArea());
        System.out.printf("%s\n\n", circle3);

        // Modify circle3 radius by invoking mutator method
        circle3.setRadius(225);
        System.out.printf("Circle 3's radius is now: %s\n", circle3.getRadius());

        // verify negative values aren't allowed
        circle3.setRadius(-25);
        System.out.printf("Circle 3's radius is now: %s\n\n", circle3.getRadius());

        // Check the number of objects that have been created
        System.out.printf("Created %2d objects.\n\n", Circle.getNumberOfObjects());
    }
}