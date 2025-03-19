public class MilitaryTime {

    int hours;
    int minutes;

    public MilitaryTime(){
        hours = 12;
        minutes = 0;
    }

    public MilitaryTime(int hours, int minutes){
        if (hours>23 || hours<0 || minutes>59||minutes<0){
            this.hours = 12;
            this.minutes = 0;
        }
        else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    int compareTo(MilitaryTime other){
        if (other.hours < hours){
            return 1;
        }
        else if (other.hours>hours){
            return -1;
        }
        else {
            if (other.minutes< minutes){
                return 1;
            }
            if (other.minutes>minutes){
                return -1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj){
        MilitaryTime other = (MilitaryTime) obj;
        return (other.hours == hours && other.minutes == minutes);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d hours", hours, minutes);
    }
}
