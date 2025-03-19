import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
public class FileValidation{
  public static void main(String[] args){
      Scanner kb = new Scanner(System.in);

      out.printf("Enter file name :: ");
      File file = new File(kb.next());
      while(!file.exists()){
        out.printf("Invalid file name.\n");
        out.printf("Enter file name :: ");
        file = new File(kb.next());
      }
 
  }
}