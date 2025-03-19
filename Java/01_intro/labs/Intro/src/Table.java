public class Table {
    public static void main(String[] args) {
        System.out.printf("%6s %6s %6s\n", "x", "x^2", "x^3");
        for (int i = 1; i < 7; i++) {
            System.out.printf("%6s %6s %6s\n", i, i*i, i*i*i);
        }
    }
}
