public class Integer {

    private int N;

    public Integer() {
        N = 7;
    }

    public Integer(int num) {
        N = num;
    }

    public int getN() {
        return N;
    }

    public int digitCount(){
        int ret = 0;
        int num= N;
        do {
            num/=10;
            ret++;
        } while(num!=0);
        return ret;
    }

    public int digitSum(){
        int ret = 0;
        int num = Math.abs(N);
        while (num!=0){
            ret+=num%10;
            num/=10;
        }
        return ret;
    }

    public double digitAverage(){
        return (double) digitSum() /digitCount();
    }

    public int digitDivisorSum(){
        int ret = 0;
        int num = Math.abs(N);
        while (num!=0){
            if (N %(num%10)==0) ret+=num%10;
            num/=10;
        }
        return ret;
    }

    public int reverse(){
        int totDigits = this.digitCount();
        int revNumber = 0;
        int num = N;
        while (num>0){
            int digit = num % 10;
            revNumber += (int) (digit * Math.pow(10, totDigits -= 1));
            num /= 10;


        }
        return revNumber;
    }


    public long toBase(int base){
        long ret = 0;
        long multi = 1;
        int num = N;
        while (num>0){
            int remainder = num % base;
            ret+= remainder*multi;
            multi*=10;
            num/=base;
        }
        return ret;
    }

    public int populationCount(){
        long num = toBase(2);
        int count = 0;
        while (num!=0){
            if (num%10==1) count++;
            num/=10;
        }
        return count;
    }

    public boolean isOdious(){
        return populationCount()%2==1;
    }

    public boolean isEvil(){
        return !isOdious();
    }

}
