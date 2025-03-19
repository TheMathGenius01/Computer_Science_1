public class Population {
    public static int year = 1;
    public static double pop = 329500000L;
    public static double seconds = 1314000*24;
    public static void main(String[] args) {
        for (; year < 6; year++) {
            double births = seconds/7;
            double deaths = seconds/13;
            double immi = seconds/45;
            pop += (births-deaths+immi);
            System.out.printf("Population after year %d: %,.0f%n", year, pop);
        }
    }
}
