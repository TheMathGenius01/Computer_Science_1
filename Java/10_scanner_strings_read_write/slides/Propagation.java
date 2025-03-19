import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
public class Propagation{
  public static void main(String[] args)throws IOException{
       a(); 
  }
  public static void a() throws IOException{
       b();
  }
  public static void b() throws IOException{
       c();
  }
  public static void c() throws IOException{
      Scanner file = new Scanner(new File("while.dat"));
      while(file.hasNextInt())
           out.println(file.nextInt());
  }
}