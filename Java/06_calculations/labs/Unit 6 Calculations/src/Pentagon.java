import java.util.Scanner;

public class Pentagon {


    static double areaOfPentagon(double r){
        double sideLength = 2 * r * Math.sin(Math.PI / 5);
        return (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length from vertex to center: ");
        double r = kb.nextDouble();

        System.out.printf("The area is %.3f", areaOfPentagon(r));
    }



}
