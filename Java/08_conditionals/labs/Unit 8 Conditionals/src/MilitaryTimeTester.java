public class MilitaryTimeTester {
    public static void main(String[] args) {
        MilitaryTime one = new MilitaryTime();
        MilitaryTime two = new MilitaryTime(25, 40); // invalid goes to noon
        System.out.println(one); // 1200 hours
        System.out.println(two); // 1200 hours
        System.out.println(one.equals(two)); // should be true
        System.out.println(one.compareTo(two) + "\n"); // should be 0
        MilitaryTime three = new MilitaryTime(8, 50);
        System.out.println(three); // 0850 hours
        System.out.println(one.equals(three)); // false
        System.out.println(one.compareTo(three)); // 1200 is after 0850 so 1
        System.out.println(three.compareTo(one)); // 0850 is before 1200 so -1
    }
}
