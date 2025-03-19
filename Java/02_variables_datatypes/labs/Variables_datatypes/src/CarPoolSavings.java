public class CarPoolSavings {
    public static void main(String[] args) {
        String carType = " 2022 Toyota Tundra";
        byte mpg = 40;
        double gasPrice = 4.60;
        byte miles = 50;
        double dp = 0.16;
        double tolls = 0.00;
        byte pg = 3;
        double cpd = (gasPrice+(gasPrice*0.25)) + (dp*miles) + tolls;

        System.out.println(carType);
        System.out.println("mpg: " + mpg);
        System.out.println("Cost per gallon of gas: $" + gasPrice);
        System.out.println("Miles driven: " + miles);
        System.out.println("Depreciation per mile: $"+ dp);
        System.out.println("Tolls: $" + tolls);
        System.out.println("Number of passengers: " + pg);

        System.out.println("Cost per day to drive: $" + cpd);
        System.out.printf("Savings with " + pg + " drivers per day: $%.2f%n", (cpd - (cpd/pg)));
        System.out.printf("Yearly savings: $%.2f", ((cpd - (cpd/pg)))*52*5);
    }
}
