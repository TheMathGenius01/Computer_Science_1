//© A+ Computer Science  -  www.apluscompsci.com

//real/decimal number examples

public class Reals{

 public static void main(String args[])
 {
  double one = 99.57;
  double two = 3217;
  //float ten = 234.234;  //not legal
  float three = 23.32f;   //F states that 23.32 is a float value

  System.out.println(one);
  System.out.println(two);
  System.out.println(three);

  //int or double values are just fine
  one=125;
  System.out.println(one);
  
  
  float gpa = 3.9f;
  float score = 98.7F;
  double avg = 88.3;
  double pi = 3.14d;

  System.out.println("\n");
  
  System.out.printf("%f\n", gpa);
  System.out.printf("%.2f\n", score);
  System.out.printf("%.2f\n", avg);
  System.out.printf("%.2f\n", pi);
  
  System.out.println(2.1*3); // round off error could result in 6.300000000000001
  double d = 1.;
  d += .0000000000000001;    // round off error results in 1.0
  System.out.println(d);

 }
}
