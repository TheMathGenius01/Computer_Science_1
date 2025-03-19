import java.util.Scanner;

public class Numbers {

    static String getSign(double n){
        return n<0 ? "Negative" : n>0 ? "Positive" : "No Sign";
    }

    static boolean isSmall(double n){
        return n<=10 && n >= -10;
    }

    static boolean isLarge(double n){
        return n>=1000000 || n<=-1000000;
    }

    static int getDigits(double n){
        return Double.toString(n).replace(".", "").replace("-", "").length();

    }

    static int getWhole(double n){
        return (int) n;
    }

    static boolean isOdd(double n){
        return Math.abs(n % 2) != 0;
    }

    public static void run(Scanner kb){
        System.out.print("Enter a real number: ");
        double inputDouble = kb.nextDouble();
        System.out.println(getSign(inputDouble));
        if (isSmall(inputDouble)) System.out.println("Small as it is within 10 from zero");
        if (isLarge(inputDouble)) System.out.println("Large as it is at least 1,000,000 from zero");
        System.out.printf("Has %d digits\n", getDigits(inputDouble));
        System.out.printf("The whole part '%d' is %s\n\n", getWhole(inputDouble), isOdd(getWhole(inputDouble))?"odd":"even");
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        run(kb);
        run(kb);
    }
}
