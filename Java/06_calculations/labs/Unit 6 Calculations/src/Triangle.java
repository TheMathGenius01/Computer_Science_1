public class Triangle {

    private int a;
    private int b;
    private int c;
    private double A;
    private double B;
    private double C;

    public Triangle(int a, int b, int c){
        this.c = c;
        this.b = b;
        this.a = a;
        A = lawOfCosines(b, c, a);
        B = lawOfCosines(c, a, b);
        C = lawOfCosines(a, b, c);
    }

    public int perimeter(){
        int a = this.a;
        int b = this.b;
        int c = this.c;
        return (a+b+c);
    }

    public double area(){
        double s = (double)perimeter()/2;
        double radicand = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(radicand);
    }

    public String toString(){
        return String.format("Triangle{a=%d, b=%d, c=%d, A=%.2f, B=%.2f, C=%.2f}\n", a,b, c, A, B, C);
    }

    public static double lawOfCosines(int sideA, int sideB, int sideC){
        // Calculate cos(C)
        double cosC = (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2.0 * sideA * sideB);

        // Calculate angle C in radians
        double angleC = Math.acos(cosC);

        return Math.toDegrees(angleC);
    }

    public void setSides(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        A = lawOfCosines(b, c, a);
        B = lawOfCosines(c, a, b);
        C = lawOfCosines(a, b, c);
    }



    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 3, 3);
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle(3, 4, 5);
        System.out.println(triangle2);

        Triangle triangle3 = new Triangle(7, 8, 9);
        System.out.println(triangle3);
    }


}
