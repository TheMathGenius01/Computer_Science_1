//© A+ Computer Science
// www.apluscompsci.com

//OOP example runner

public class TriangleRunner
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle();
    test.setSides(5,6,7);
    test.print();

    test.setSides(4,4,4);
    test.print();

    test.setSides(1,56,22);  // invalid triangle but ok for now
    test.print();
    
    test.setSides(3,4,5);
    System.out.println(test.getA());
    System.out.println(test.getB());

    test.setA(4);
    System.out.println(test.getA() + " == 4);
    System.out.println(test.toString());
    System.out.println(test);  // invokes the toString()
  }
}