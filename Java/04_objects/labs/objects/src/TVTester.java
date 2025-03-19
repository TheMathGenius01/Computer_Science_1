public class TVTester {
    public static void main(String[] args) {
        TV tv1 = new TV(); // create a TV
        System.out.println(tv1); // The tv is on and is set to channel 5 with a volume of 3.

        // change the volume to 8 and channel 6 then turn off
        tv1.setChannel(6);
        tv1.setVolume(8);
        tv1.power();
        System.out.println(tv1); // The tv is off and is set to channel 6 with a volume of 8.
        TV tv2 = new TV(3, 0, true);
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println(tv2); // The tv is on and is set to channel 5 with a volume of 1.

        // check invalid states and edge cases
        TV badTv = new TV(300, -5, true); // invalid data uses default values
        System.out.println(badTv); // The tv is on, channel set to 5 with a volume of 3.
        badTv.setVolume(0); // Volume is now 0
        badTv.volumeDown(); // Volume still 0
        badTv.setChannel(120); // Channel doesn’t change
        System.out.println(badTv); // The tv is on, channel set to 5 with a volume of 0.
        badTv.setChannel(100); // Channel is now 100
        badTv.channelUp(); // Channel wraps to 0
        System.out.println(badTv); // The tv is on, channel set to 0 with a volume of 0.
        badTv.power(); // turn off the power
        badTv.setChannel(4); // can't change the channel to a tv that is off
        badTv.setVolume(6); // can't change the volume to a tv that is off
        System.out.println(badTv); // The tv is off, channel set to 0 with a volume of 0.
    }
}
