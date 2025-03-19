public class Person {

    private String first;
    private char middleInitial;
    private String last;
    private int age;

    public Person(){
        first = "Jane";
        middleInitial = 'M';
        last = "Doe";
        age = 27;
    }

    public Person(String fullName, int age){
        first = fullName.substring(0, fullName.indexOf(" "));
        middleInitial = fullName.charAt(fullName.indexOf(" ") + 1);
        last = fullName.substring(fullName.lastIndexOf(" ")+1);
        this.age = age;
    }

    public boolean affix(String str){

        return last.toLowerCase().endsWith(str.toLowerCase());
    }

    public boolean prefix(String str){
        return last.toLowerCase().startsWith(str.toLowerCase());
    }

    public boolean hasX(){
        char lowerMiddle = Character.toLowerCase(middleInitial);
        return (first.toLowerCase().contains("x")) || (lowerMiddle == 88) || (last.toLowerCase().contains("x"));
    }

    public char firstLetter(){
        return first.charAt(0);
    }

    public char lastLetter(){
        return last.charAt(last.length()-1);
    }

    public int length(){
        return first.length() + 1 + last.length();
    }

    public boolean equals(Object obj){
        Person other = (Person) obj;
        char objMiddle = other.middleInitial;
        objMiddle = Character.toLowerCase(objMiddle);
        char ourMiddle = Character.toLowerCase(middleInitial);
        return (first.equals(other.first)) && (objMiddle==ourMiddle) && (last.equals(other.last)) && (age == other.age);
    }

    public void toUpperCase(){
        first = first.toUpperCase();
        last = last.toUpperCase();
        middleInitial = Character.toUpperCase(middleInitial);
    }

    public void toLowerCase(){
        first = first.toLowerCase();
        last = last.toLowerCase();
        middleInitial = Character.toLowerCase(middleInitial);
    }

    public void toTitleCase(){
        first = first.substring(0, 1).toUpperCase() + first.substring(1);
        last = last.substring(0, 1).toUpperCase() + last.substring(1);
        middleInitial = Character.toUpperCase(middleInitial);
    }

    public boolean isSorted(){
        return ((int)first.charAt(0) < (int)middleInitial) && (middleInitial < (int)last.charAt(0));
    }

    public int getAge() {
        return age;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    @Override
    public String toString() {
        return String.format("Person{first=%s, last=%s, middleInitial=%c, age=%d}", first, last, middleInitial, age);
    }

    public static void main(String[] args) {

    }
}
