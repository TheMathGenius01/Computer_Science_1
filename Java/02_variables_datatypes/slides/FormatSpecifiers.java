public class FormatSpecifiers{
  public static void main(String[] args){
    System.out.printf("%b\n", 1 < 5);        // outs true
    System.out.printf("%c\n",'a');           // outs a
    System.out.printf("%C\n",'a');           // outs A
    System.out.printf("int: %d\n",5);        // outs int: 5
    System.out.printf("%e%n",1324.56);       // outs 1.324560e+03 
    System.out.printf("%f%n",.999999f);      // outs 0.999999
    System.out.printf("%f%n",.99999999);     // outs 1.000000
    System.out.printf("%o%n",88);            // outs 130
    System.out.printf("%s%n","Hi CSI");      // outs Hi CSI
    System.out.printf("%x%n",255);           // ff
    System.out.printf("%X%n",255);           // FF
  }
}