import java.util.Scanner;

public class GPA {

    static double numericGrade(String letGrade){
        return switch (letGrade.toUpperCase()) {
            case "A+", "A" -> 4.0;
            case "A-" -> 3.7;
            case "B+" -> 3.3;
            case "B" -> 3.0;
            case "B-" -> 2.7;
            case "C+" -> 2.3;
            case "C" -> 2.0;
            case "C-" -> 1.7;
            case "D+" -> 1.3;
            case "D" -> 1.0;
            case "D-" -> 0.7;
            case "F" -> 0;
            default -> -1;
        };
    }

    public static void run(Scanner kb){
        System.out.print("Enter letter grade: ");
        String letGrade = kb.next();
        System.out.printf(numericGrade(letGrade)==-1?"Invalid letter grade\n\n":("Numeric grade: %.1f\n\n"), numericGrade(letGrade));
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            run(kb);
        }
    }
}