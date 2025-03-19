public class LinearEquation2by2 {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    private boolean isSolvable;
    public LinearEquation2by2(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    private void solve(){
        isSolvable = (a * d - b * c == 0);
    }


    double x = (e*d - b*f)/(a*d - b);
    double y = (a*f - e*c)/(a*d - b*c);

    @Override
    public String toString() {
        String s = "";
        s += String.format("%fx + %fy = %f\n", a, b, c);
        s += String.format("%fx + %fy = %f\n", d, e, f);
        s += !isSolvable  ? "Solvable\n" : "Not Solvable\n";
        s += String.format("x = %.1f\n", x);
        s += String.format("y = %.1f\n", y);
        return s;
    }
}

class Tester{
    public static void main(String[] args) {
        LinearEquation2by2 test1 = new LinearEquation2by2(2, -2, 1, 1, 8, 1);
        System.out.println(test1);

        test1 = new LinearEquation2by2(3, 2, -2, -1, 3, -1);
        System.out.println(test1);

        test1 = new LinearEquation2by2(3, 2, 4, -5, -1, 14);
        System.out.println(test1);
    }
}
