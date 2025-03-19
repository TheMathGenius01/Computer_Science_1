import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        long mins = sc.nextLong();

        long years = mins/525600;
        long remdays = (mins/1440) % 365;

        System.out.printf("%,d minutes is %d years and %d days", mins, years, remdays);
    }
}
