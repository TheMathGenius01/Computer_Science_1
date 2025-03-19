public class FormatSpecifiers{
  public static void main(String[] args){
    System.out.printf("%s, %s, %s%n", "a", "b", "c");
    
    
    System.out.printf("First:%s, Middle:%S\n", "Noah", "e");
    
    
    System.out.printf("Second %2$S, First %1$s","A", "b");

  }
}