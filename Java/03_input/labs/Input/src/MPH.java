import java.util.Scanner;

public class MPH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the distance: ");
            short dis = sc.nextShort();

            System.out.print("Enter the hours: ");
            short hours = sc.nextShort();

            System.out.print("Enter the minutes: ");
            short mins = sc.nextShort();

            float tt = (hours + ((float) mins / 60));

            System.out.printf("%d miles in %d hours and %d minutes = %.3f MPH\n\n", dis, hours, mins, dis/tt);

        }
    }
}
