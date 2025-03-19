public class Point {

    private int x;

    private int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        x = p.x;
        y = p.y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setLocation(Point p){
        x = p.x;
        y = p.y;
    }

    public double distance(Point p){
     return Math.sqrt(Math.pow((p.x-x), 2) + Math.pow((p.y-y), 2));
    }

    public double slope(Point p){
        return (double) (p.y - y) /(p.x-x);
    }

    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point origin = new Point();
        Point pt1 = new Point(4,7);
        Point pt2 = new Point(-22,13);
        Point clone = new Point(pt1);
        System.out.printf("%s\n", origin);
        System.out.printf("%s\n", pt1);
        System.out.printf("%s\n", clone);
        System.out.printf("%s\n", pt2);
        System.out.println();

        // test slopes
        System.out.printf("Slope: %.2f\n", origin.slope(pt1));
        System.out.printf("Slope: %.2f\n", origin.slope(pt2));
        System.out.printf("Slope: %.2f\n", pt1.slope(pt2));
        System.out.println();

        // test distance
        System.out.printf("Distance: %.2f\n", origin.distance(pt1));
        System.out.printf("Distance: %.2f\n", origin.distance(pt2));
        System.out.printf("Distance: %.2f\n", pt1.distance(pt2));
        System.out.println();

        // add test cases for all methods
        clone.setLocation(origin);
        pt1.setX(7);
        System.out.println(pt2.getY());
    }
}
