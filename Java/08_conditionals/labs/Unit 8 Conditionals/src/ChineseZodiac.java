import java.util.Scanner;

public class ChineseZodiac {

    static String chineseZodiac(int year){
        year = year%12;
        return switch (year) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            default -> "Sheep";
        };
    }

    public static void run(Scanner kb){
        System.out.print("Enter a calender year: ");
        int year = kb.nextInt();
        System.out.printf("%d was the year of the %s\n\n", year, chineseZodiac(year));
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        run(kb);
        run(kb);
        run(kb);
        run(kb);
        run(kb);
    }
}
