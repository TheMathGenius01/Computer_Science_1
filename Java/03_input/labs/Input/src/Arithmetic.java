import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextShort();

        System.out.print("Enter second number: ");
        int b = sc.nextShort();

        System.out.print("Enter third number: ");
        int c = sc.nextShort();

        System.out.printf("\nNumbers: %d, %d, %d\n", a, b, c);
        System.out.println("Sum: " + (a+b+c));
        System.out.println("Product: " + (a*b*c));
        System.out.println("Average Rounded Down: " + (int) (Math.floor((double) (a + b + c) /3)));

        int min = Math.min(a, b);
        min = Math.min(min, c);
        System.out.println("Smallest: " + min);

        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println("Largest: " + max);


    }
}
