// Name:    Jeroo.java
// Date:    March 23, 2016
// Author:  Mr. Cargill
// Purpose: Become familiar with Java constructors by using your knowledge of Jeroo.
//
// Notes:   The idea to use Jeroo to relate constructors to the students came from Mr. Hulett,
//          so... if this helps, thank him for coming up with the idea.

/* Constructors Clarification:

   Java invokes a constructor right after an object is created (via the new keyword).

   No-arg Constructor
   The no-arg constructor is normally used when initial values for the instance variables ARE NOT known.
   The no-arg constructor usually initializes the instance variables to zeros/nulls.
   If you do not define ANY constructors, Java will provide a default no-arg constructor.
   There can only be ONE no-arg constructor in a class.

   Parametrized Constructor (a.k.a. Initialization Constructor)
   A parametrized constructor is normally used when initial values for the instance variables ARE known.
   Parametrized constructors usually initialize the instance variables to the values provided.
   You may have any number of parametrized constructors, within memory constraints of course (as long as
   the constructors have different signatures (order and/or type of parameters)).

*/

public class Jeroo
{
    // Constants

    // Cardinal directions

 private static final byte NORTH = 0;
 private static final byte SOUTH = 1;
 private static final byte EAST  = 2;
 private static final byte WEST  = 3;

 // DIR is used to print the object (defined here so it doesn't have to be recreated each time toString is invoked).

 private static final String[] DIR = {"NORTH","SOUTH","EAST","WEST"};

    // Instance Variables
 //
 // Variables defined inside the class but outside of any methods or constructors have global scope (all of the
 // methods in the class can directly access these variables known as instance variables).  They are called instance
 // variables because each object created from the class (i.e. each instance of the class) has its own copy of these
 // variables.
 //
 // For Geeks Only: If you define variables using the keyword static as I have done above, the variables still have
 // global scope, but are known as class variables (only one copy of the variables are available for the class).  Each
 // object of the class does not have its own copy of class variables. Instead, every object shares a single copy of
 // the class variables.  The class variables I have defined above are not only class variables (a.k.a. static
 // member variables), but are also final (constant) variables and cannot be changed.

 private int x;    // The x coordinate of the Jeroo's current location
 private int y;    // The y coordinate of the Jeroo's current location
 private byte direction;  // The current direction the Jeroo is facing
 private int flowers;  // The number of flowers the Jeroo has in its pouch

 // Jeroo provides six constructors (see Jeroo Constructors.pdf for a list of the constructors).

    // no-arg Constructor

    // The Jeroo no-arg constructor sets the default values 0,0,EAST,0.

    public Jeroo()
    {
        x = 0;       // The x coordinate
        y = 0;       // The y coordinate
        direction = EAST;    // The current direction
        flowers = 0;     // The number of flowers in the pouch
    }

    // Parametrized Constructors

    // The Jeroo constructor that accepts one integer uses the value provided for the number of flowers and uses
    // defaults for everything else.

    public Jeroo(int flowers)
    {
        x = 0;       // The x coordinate
        y = 0;       // The y coordinate
        direction = EAST;    // The current direction
        this.flowers = flowers;   // The number of flowers in the pouch
    }

    // The Jeroo constructor that accepts two integers uses the values for the x,y location for the Jeroo and uses
    // defaults for everything else.

    public Jeroo(int x, int y)
    {
        this.x = x;      // The x coordinate
        this.y = y;      // The y coordinate
        direction = EAST;    // The current direction
        flowers = 0;     // The number of flowers in the pouch
    }

    // The Jeroo constructor that accepts two integers and a byte uses the values for the x,y location for the Jeroo
    // and the current direction and defaults the number of flowers to 0.

    public Jeroo(int xCoord, int yCoord, byte dir)
    {
        x = xCoord;      // The x coordinate
        y = yCoord;      // The y coordinate
        direction = validateDir(dir); // The current direction (ensure the direction is valid)
        flowers = 0;     // The number of flowers in the pouch
    }

    // The Jeroo constructor that accepts three integers uses the first two values for the x,y location for the Jeroo,
    // the third value for the number of flowers, and uses EAST as the default direction.

    public Jeroo(int xCoord, int yCoord, int numFlowers)
    {
        x = xCoord;      // The x coordinate
        y = yCoord;      // The y coordinate
        direction = EAST;    // The current direction
        flowers = numFlowers;   // The number of flowers in the pouch
    }

    // The Jeroo constructor that accepts four values uses the first two values for the x,y location for the Jeroo,
    // the third value for the current direction, and the last value for the number of flowers.

    public Jeroo(int xCoord, int yCoord, byte dir, int numFlowers)
    {
        x = xCoord;      // The x coordinate
        y = yCoord;      // The y coordinate
        direction = validateDir(dir); // The current direction (ensure the direction is valid)
        flowers = numFlowers;   // The number of flowers in the pouch
    }

 // The main method - execution will start here
 //
 // Creates some Jeroos and print them out

 public static void main(String[] args)
 {

  // Create Jeroos using the different constructors.  Yes, I know in Jeroo you
  // can only create four Jeroos at once; but we are not in Jeroo, we are just
  // using your familiarity with Jeroo to help you better understand constructors.
  //
  // The compiler knows which constructor you want to use based on the parameter
  // order and/or type.
  //
  // For Geeks Only: We are using byte for our defined constants NORTH, SOUTH, EAST,
  // WEST; Jeroo uses defined constants also, those constants may be byte, short, int,
  // long, or some other data type, provided the constants aren't the same data type as
  // the x and y coordinates.  We can be sure of this because the compiler needs to be
  // able to distinguish between constructor number four and constructor number five
  // (both have three parameters).  If it were me I would implement the constants behind
  // the scenes as some integer data type: byte, short, int, or long (probably byte as I
  // have done here).  However, Dr. Dorn may have implemented the constants using another
  // data type, perhaps char or String.

  Jeroo bob = new Jeroo();     // All defaults (no-arg)
  System.out.println("bob:\t" + bob);

  Jeroo sue = new Jeroo(12);     // Number of flowers (int)
  System.out.println("sue:\t" + sue);

  Jeroo mary = new Jeroo(7,7);    // x and y coordinate (int, int)
  System.out.println("mary:\t" + mary);

  Jeroo joe = new Jeroo(3,3,NORTH);   // x, y, and direction (int, int, byte)
  System.out.println("joe:\t" + joe);

  Jeroo brad = new Jeroo(11,11,100);   // x, y, and number of flowers (int, int, int)
  System.out.println("brad:\t" + brad);

  Jeroo katie = new Jeroo(2,2,SOUTH,150);  // x, y, and number of flowers (int, int, byte, int)
  System.out.println("katie:\t" + katie);
  
  Jeroo joebob = new Jeroo();
  
 }

 // We will validate the direction provided.  In Jeroo, the compiler would just display an error and
 // not compile the program if the user did not provide a correct direction.

 private byte validateDir(byte dir)
 {
        if(dir >= 0 && dir <=3)
         return dir;    // The direction requested is valid
        else
         return EAST;   // Use the default (Jeroo just wouldn't compile)
 }

 // We will learn about the toString method in Chapter 08.  This method (which is available for ALL
 // classes) gets invoked automatically when you print an object.

 public String toString()
 {
  return x + "," + y + "," + DIR[direction] + "," + flowers;
 }
}