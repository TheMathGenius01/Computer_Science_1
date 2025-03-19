//OOP example - Much can be added to this class to make it useful

public class Triangle {

    private int a, b, c;

    // no-arg or default constructor
    public Triangle(){
        this(3,4,5);       // calls the parameterized constructor
    }
    // parameterized constructor
    // the parameters are local variables that shadow the instance variables
    // we have 3 instance variables declared above(a,b,c) and 3 parameters declared below - also called(a,b,c)
    public Triangle(int a, int b, int c){
        //setSides(a, b, c);                // could call setSides
        this.a = a;              // the word "this" is an explicit reference to the objects attributes 
        this.b = b;       // a refers to the parameter and this.a refers to the instance variable
        this.c = c;
    }

    public void setSides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // prints the sides
    public void print() {
        System.out.println("sides " + a + " " + b + " " + c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    // the toString typically returns a String representation of an object
    // that is return the attributes/fields
    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    public static void main(String[] args) {
        Triangle one = new Triangle();
        System.out.println(one);    // invokes the toString() i.e. one.toString()
        
        one.setSides(9, 10, 17);    // changes all the sides of the object
        System.out.println(one);
        
        one = new Triangle(5,12,13); // assigns one to a new Triangle
        
        // test getters
        System.out.println(one.getA());
        System.out.println(one.getB());
        System.out.println(one.getC());
        
        // test setters
        one.setA(6);
        one.setB(8);
        one.setC(10);
        System.out.println(one);
        
        // declares a new reference and binds it to the instantiated object
        Triangle acute = new Triangle(13,13,10); 
        // test print method
        acute.print();
        
    }
}
