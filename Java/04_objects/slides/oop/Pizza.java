public class Pizza{
   // fields or instance variables are listed at the top
   private String size;
   private int slices;
   
   // always assign the instance variables to something meaningful
   // in a constructor
   public Pizza(){
       size = "Medium";
       slices = 74;
   }
   
   public Pizza(String s, int slices){
       size = s;
       this.slices = slices;
   }
   
   public String getSize(){
       return size; 
   }
   
   public void setSlices(int slices){
     this.slices = slices;
   }
   
   // typically return a string representation of the object
   // i.e. all the instance variables
   public String toString(){
     return "" + slices + " " + size; 
   }
   
   public static void main(String[] args){
      Pizza p = new Pizza();
      System.out.println(p);
      
      p = new Pizza("Small", 6);
      System.out.println(p.toString());
   }
}