import java.util.Scanner;

public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter cyan: ");
            float cyan = sc.nextFloat();

            System.out.print("Enter magenta: ");
            float magenta = sc.nextFloat();

            System.out.print("Enter yellow: ");
            float yellow = sc.nextFloat();

            System.out.print("Enter black: ");
            float black = sc.nextFloat();

            float white = (1 - black);
            float red = 255 * white * (1 - cyan);
            float green = (255 * white * (1 - magenta));
            float blue = (255 * white * (1 - yellow));

            System.out.printf("%-5s = %d\n%-5s = %d\n%-5s = %d\n\n", "red", (int) red, "green", (int) green, "blue", (int) blue);
        }
    }
}
