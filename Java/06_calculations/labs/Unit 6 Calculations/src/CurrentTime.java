import static java.lang.System.currentTimeMillis;

public class CurrentTime {
    public static void main(String[] args) {
        long time = currentTimeMillis()/1000;
        long hour = time/3600;
        hour %= 24;
        long minute = time/60;
        minute%=60;
        time%=60;
        System.out.printf("Current time %02d:%02d:%02d GMT", hour, minute, time);
    }
}
