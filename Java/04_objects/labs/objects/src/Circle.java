public class Circle {

    private double radius;
    private static int numObjects = 0;

    public Circle(){
        radius = 1;
        numObjects++;
    }

    public Circle(double r){
        radius = Math.max(0, r);
        numObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(0, radius);
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public static int getNumberOfObjects(){
        return numObjects;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
