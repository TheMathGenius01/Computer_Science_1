class CatRunner{
  public static void main(String[] args){
    // create
    Cat felix = new Cat();
    //felix.name = "Felix"; // -> won't compile b/c name is private
    felix.talk();
      
    Cat gar = new Cat("Garfield", 3);
    gar = new Cat("Leo", 9); // binds the variable gar to a new cat.
      
    gar.setLives(3);
    System.out.println(gar.getLives());
    System.out.println(gar); // same as calling gar.toString();
    System.out.println(felix);
      
      
  }
}