public class Color {
    private int red;
    private int blue;
    private int green;


    public Color(){
        red = 0;
        blue = 0;
        green = 0;
    }

    public Color(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    public int getRed() {
        return red;
    }

    public void setBlue(int b) {
        this.blue = Math.max(0, Math.min(255, b));
    }

    public void setRed(int r) {
        this.red = Math.max(0, Math.min(255, r));
    }

    public void setGreen(int g) {
        this.green = Math.max(0, Math.min(255, g));
    }

    @Override
    public String toString() {
        return String.format("#(%d,%d,%d)", red, green, blue);
    }
}
