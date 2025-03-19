// Review for test over math/calculations/oop

public class Review  
{
 private String s;  // this is an instance variable
 private char grade;  // this is another instance variable
 
 // Constructor!!! -> same name as class and has no return type
 // you should always initialize the instance variables
 public Review(){  
  s = "I want an :: ";
  grade = 'A';
 }
 
 public void setGrade(char g){ // this is a mutator method
  grade = g;     
 }
 
 public char getGrade(){ // this is an accessor method
  return grade;
 }
 
 public String toString(){ // this is also an accessor method
  return s + grade;
 }
 public static void main(String[] args)
 {
  Review review = new Review();
  System.out.println(review.toString()); 
  System.out.println(review);    // invokes the to String method
  System.out.println();
  
  int x = 4;
  System.out.println(++x);  // outs 5 -> pre increments before
  System.out.println(x++);  // outs 5 but x incremented to 6 (post increments afterward)
  System.out.println(x);   // outs 6
  x %= 4;
  System.out.println(x);   // outs 2 -> 6 % 4
  System.out.println();
  
  System.out.println(1/4);  // outs 0 - integer division truncates
  System.out.println((double)1/4);// outs 0.25
  
 }
}