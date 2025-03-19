public class Pen{ 
     private String color;
     private boolean erasable;
     public Pen(){ 
         this("black", false);
     }
     
     public Pen(String color, boolean erasable){
         this.color = color;
         this.erasable = erasable;
     }
     
     public String getColor(){
         return color;
     }
    
     public boolean isErasable(){ // sometimes for booleans use “is” instead of “get”
         return erasable;
     }

     public void setColor(String color){ 
         this.color = color;
     }
     
     public void setErasable(boolean erasable){  
         this.erasable = erasable;  
     }

     public String toString(){ 
        return "Pen is " + color + " and erasable is " + erasable;
     }

     public static void main(String[] args) {
        Pen a = new Pen();
        Pen b = new Pen("red", true);
        
        System.out.println(a);
        System.out.println(b);
        
        a.setColor("pink");
        a.setErasable(false);
        System.out.println(a);
        System.out.println(a.isErasable());
        System.out.println(a.getColor());
        System.out.println(a);
}

}
