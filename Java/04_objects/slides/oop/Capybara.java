public class Capybara {
    // class variables use static(only 1 variable/method)
    public static final String SPECIES = "hydrochaeris";

    public static String getSpecies() {
        return "hydrochaeris";
    }

    // instance variables - every object(instance of a class) has its own instance variables
    private char gender;
    private String name;
    private int age;

    public Capybara() {
        gender = 'F';
        name = "Brenda";
        age = 10;
    }

    public Capybara(char gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    // accessors; aka getters
    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char g) {
        gender = g;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void birthday() {
        age += 1;
    }

    public String toString() {
        return name + " " + gender + " " + age;
    }
}
