public class Fan {

    private boolean on;
    private int speed;
    public static final int LOW = 1;
    public static final int MEDIUM = 5;
    public static final int HIGH = 10;

    public Fan(){
        speed = 1;
        on = true;
    }

    public Fan(int s, boolean o){
        if (s < 0){
            speed = 1;
        }
        speed=s;
        on=o;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        this.speed = Math.max(1, Math.min(10, s));

    }

    public boolean isOn() {
        return on;
    }

    public void power(){
        on = on != on;
    }

    @Override
    public String toString() {
        return String.format("Fan{speed=%d, on=%b}", speed, on);
    }
}
