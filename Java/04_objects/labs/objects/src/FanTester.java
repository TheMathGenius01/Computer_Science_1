public class FanTester {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1); // invokes toString

        Fan fan2 = new Fan(Fan.HIGH, true);
        System.out.println(fan2);

        fan2.power();
        System.out.println(fan2);
        
        fan2.setSpeed(-5); // invalid range
        System.out.println(fan2);
    }
}
