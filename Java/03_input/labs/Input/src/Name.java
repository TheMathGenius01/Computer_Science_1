import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = sc.next();

        System.out.print("Enter your middle name: ");
        String second = sc.next();

        System.out.print("Enter your last name: ");
        String last = sc.next();

        System.out.printf("%s %s %s", first, second.charAt(0), last);
    }
}
