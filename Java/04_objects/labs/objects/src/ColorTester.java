public class ColorTester {
    public static void main(String[] args) {
        Color black = new Color();
        System.out.printf("%s\n", black);
        black.setRed(500);
        black.setGreen(-500);
        black.setBlue(75);
        System.out.printf("%s\n", black.getRed());
        System.out.printf("%s\n", black.getGreen());
        System.out.printf("%s\n", black.getBlue());
        System.out.printf("%s\n\n", black);
        Color hotPink = new Color(255, 105, 180);
        System.out.printf("%s\n", hotPink);
    }
}
