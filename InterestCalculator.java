import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate, compRate, initial, years, total;
        int userPeriod, period = 0;
        System.out.print("How much money do you want to invest? ");
        initial = sc.nextDouble();
        System.out.print("How many years are you investing? ");
        years = sc.nextDouble();
        System.out.print("What is the annual interest rate growth? ");
        rate = sc.nextDouble();

        System.out.println("Choose your compound periods: ");
        System.out.println("1. Quarterly ");
        System.out.println("2. Monthly");
        System.out.println("3. Daily");
        userPeriod = sc.nextInt();
        switch(userPeriod) {
            case 1:
                period = 4;                
                break;
            case 2:
                period = 12;
                break;
            case 3:
                period = 365;
        }
        compRate = rate / period;
        

        for(int i = 1; i <= years; i++) {
            System.out.println("Year " + i + ": ");
            System.out.println("Began with: $" + (Math.round(initial * 100.0) / 100.0));
            total = profit(compRate, initial, period);
            initial = total;
            System.out.println("***************************************");
        }
        sc.close();
    }

    public static double profit(double cr, double bal, int period ) {
        double initialBalance = bal;
        double total=0;
        for(int i = 0; i < period; i++) {
            total = bal * (1 + (cr / 100));
            bal = total;
        }
        total = (Math.round(total * 100.0) / 100.0);
        initialBalance = (Math.round(initialBalance * 100.0) / 100.0);
        double earned = total - initialBalance;
        System.out.println("Earned $" + (Math.round(earned * 100.0) / 100.0));
        System.out.println("Ended with $" + total);
        return total;
    }
}