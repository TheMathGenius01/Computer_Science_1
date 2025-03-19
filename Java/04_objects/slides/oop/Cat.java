public class Cat{
  
  // instance variables/fields/attributes go here
  private String name;
  private int lives;
  
  // constructors have same name as class and no return type
  // happens only once when an object is instantiated
  // always initialize the fields in the constructor
  
  public Cat(){       // default constructor or non-parameterized
     name = "Garfield";
     lives = 9;
  }
  
  public Cat(String s, int n){ // Constructor
     name = s;
     setLives(n);
  }

  // parts of a method(missing non access modifiers like static)
  // access modifier _ return type _ name _ (parameters)
  public void talk(){
      System.out.println(name + " says meow"); 
  } 
  
  // mutator method -> ie a setter
  public void setLives(int lives){
    if(lives >=0) 
      this.lives = lives;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  // accessor method or getter
  public String getName(){
    return name;
  }
  
  public int getLives(){
    return lives;
  }
  
  // returns a String representation of the objec(ie the attributes)
  // this method is invoked any time you print a reference variable
  // its also considered an accessor method
  public String toString(){
     return name + " the cat has " + lives + " lives"; 
  }
}