import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("nums.dat"));
        int size = file.nextInt(), c = 0;
        for (int i = 1; i <= size; i++) {
            int x = file.nextInt();
            if (x % 2 == 0)
                c++;
        }
        out.println(c);
    }

}
