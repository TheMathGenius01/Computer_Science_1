public class Band{
   // fields or instance variables are listed at the top
   private String name;
   private int yearFounded;
   
   // always assign the instance variables to something meaningful
   public Band(){
       this("The Beatles", 1960); // call the other constructor
   }
   
   public Band(String name, int yearFounded){
       this.name = name;
       this.yearFounded = yearFounded;
   }
   
   public String getName(){
       return name; 
   }
   
   public int getYearFounded(){
       return yearFounded; 
   }
   
   public void setName(String name){
       this.name = name;
   }
   
   public void setYearFounded(int yearFounded){
       this.yearFounded = yearFounded;
   }
   
   // typically return a string representation of the object
   // i.e. all the instance variables
   public String toString(){
     return "\"" + name + "\" was founded in " + yearFounded + "."; 
   }
   
   public static void main(String[] args){
     Band greatest = new Band(); 
     Band fav = new Band("U2", 1976);

     // test toString
     System.out.println(greatest); 
     System.out.println(fav);
     
     // test get
     System.out.println(greatest.getName());
     System.out.println(greatest.getYearFounded());
     
     Band band = new Band("CSIK", 2021);
     
     // test set
     band.setName("HyperText Booleans");  // you can come up with a better name
     band.setYearFounded(2020);
     System.out.println(band);
   }
}