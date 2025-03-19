public class TV {
    private int channel;
    private int volume;
    private boolean on;

    public TV(){
        channel = 5;
        volume = 3;
        on = true;
    }

    public TV(int c, int v, boolean on){
        channel = c <= 100 && c >= 1 ? c: 5;
        volume = v >= 0 && v <= 9 ? v : 3;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int c) {
        if (!on){
            return;
        }
        channel = c <= 100 && c >= 1 ? c : 5;
    }

    public void setVolume(int v) {
        if (!on){
            return;
        }
        volume = v >= 0 && v <= 9 ? v : 3;
    }


    public void channelUp(){
        if (!on){
            return;
        }
        if (channel == 100){
            channel = 1;
        }else{
            channel++;
        }
    }

    public void channelDown(){
        if (!on){
            return;
        }
        if (channel == 1){
            channel = 100;
        }else {
            channel--;
        }
    }

    public void volumeUp(){
        if (!on){
            return;
        }
        if (volume == 9){
        }else {
            volume++;
        }
    }

    public void volumeDown(){
        if (!on){
            return;
        }
        if (volume == 0){
        } else{
            volume--;
        }
    }

    public void power(){
        on = on ? !on : on;
    }

    @Override
    public String toString() {
        return String.format("The tv is %s and is set to channel %d with a volume of %d", on ? "on" : "off", channel, volume);
    }

    public static void main(String[] args) {

    }
}
