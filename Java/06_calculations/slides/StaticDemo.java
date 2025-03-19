// you can copy this code into a visualizer to see the difference betweeen class vars and instance vars - https://cscircles.cemc.uwaterloo.ca/java_visualize/
import static java.lang.System.*;

public class StaticDemo {

    private int a, b;        // instance variables for each object created
    
    private static int cnt;  // class variable - only 1 in memory
    
    private static int MAX_NUBMER = 2147483647; // class variable that cannot be reassigned - only 1 in memory
    
    public StaticDemo(int a, int b){
        this.a = a;
        this.b = b;
        
        cnt++;      // counting the objects created
    }
    
    // instance method
    public int max(){
        return Math.max(a, b);
    }
    
    // class method - use by ClassName.functionName();
    // StaticDemo.max(3, 8);
    // you do not have access to the instance variables without the object
    public static int max(int x, int y) {
        return Math.max(x,y);
    }

    public static void main(String[] args) {
        out.println(StaticDemo.max(4, 8));
        out.println(StaticDemo.MAX_NUBMER);
        out.println(StaticDemo.cnt + "\n");
        
        // create some objects
        StaticDemo one = new StaticDemo(6, -2);
        out.println(one.max());
        out.println(StaticDemo.cnt + "\n");
        
        StaticDemo two = new StaticDemo(12, 1);
        out.println(two.max());
        out.println(two.cnt); // should be StaticDemo.cnt -> the compiler makes this change if you do this
        
        StaticDemo unassigned = null;
        out.println(unassigned.max(3,5)); // the compiler changes this to StaticDemo.cnt -> you should always use ClassName.xx for static methods and vars
        
    }
}
