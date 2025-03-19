import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import static java.lang.System.*;

public class WriteFile{
  public static void main(String args[]) throws IOException{

    FileWriter file = new FileWriter("example.txt");
    for (char c = 65; c <= 90; c++)
      file.write(c);    // one character at a time
    file.close();       // Don’t forget to close the file
  }
}