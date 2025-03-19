import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import static java.lang.System.*;

public class FileOut{
  public static void main(String args[]) throws IOException{

    PrintWriter file = new PrintWriter(new FileWriter("out.dat"));
    for (int i = 0; i <= 100; i++)
      file.printf("%-4d%6.3f\n", i, Math.sqrt(i));
    file.close();  // Don’t forget to close the file
  }
}