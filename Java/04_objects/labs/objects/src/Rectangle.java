public class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        length = 2;
        width = 1;
    }

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (length*2) + (width*2);
    }

    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{length="+length+", width="+width+", perimeter="+getPerimeter()+", area=" + getArea() + "}";
    }
}
