import java.math.*;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal compRate, total, period=new BigDecimal("0");
        int years, userPeriod;
        System.out.print("How much money do you want to invest? ");
        BigDecimal initial = new BigDecimal(sc.next());
        System.out.print("How many years are you investing? ");
        years = sc.nextInt();
        System.out.print("What is the annual interest rate growth? ");
        BigDecimal rate = new BigDecimal(sc.nextDouble());

        System.out.println("Choose your compound periods: ");
        System.out.println("1. Quarterly ");
        System.out.println("2. Monthly");
        System.out.println("3. Daily");
        userPeriod = sc.nextInt();
        switch(userPeriod) {
            case 1:
                period = new BigDecimal("4"); 
                userPeriod = 4;               
                break;
            case 2:
                period = new BigDecimal("12");
                userPeriod = 12;
                break;
            case 3:
                period = new BigDecimal("365");
                userPeriod = 365;
        }
        compRate = rate.divide(period, 2, RoundingMode.HALF_UP);
        MathContext rounder = new MathContext(2);
        for(int i = 1; i <= years; i++) {
            System.out.println("Year " + i + ": ");
            System.out.println("Began with: $" + initial.round(rounder));
            total = profit(compRate, initial, userPeriod);
            initial = total;
            System.out.println("***************************************");
        }
        sc.close();
    }

    public static BigDecimal profit(BigDecimal cr, BigDecimal bal, int period ) {
        BigDecimal initialBalance = bal;
        BigDecimal total= new BigDecimal("0");
        BigDecimal hundred = new BigDecimal("100");
        BigDecimal one = new BigDecimal("1");
        MathContext rounder = new MathContext(2);
        for(int i = 0; i < period; i++) {
            total = cr.divide(hundred);
            total = total.add(one);
            total = total.multiply(bal);
            bal = total;
        }
        BigDecimal earned = total.subtract(initialBalance);
        System.out.println("Earned $" + earned.round(rounder));
        System.out.println("Ended with $" + total.round(rounder));
        return total;
    }
}