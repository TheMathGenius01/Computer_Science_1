import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class ScannerAnomaly{
 public static void main(String args[]) throws IOException{
  Scanner file = new Scanner(new File("anomaly.in"));
  int cnt = file.nextInt();         // please rewatch the Scanner input video if you don't understand this
  for(int i=0; i<cnt; i++){
     out.print(file.nextLine());    // the first call picks up the \n sitting in the buffer
                                    // and nextLine consumes the \n but does not use it.
  }
  // the output is ab and not "abc"!
 }
}