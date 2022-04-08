import java.util.*;

public class Factorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0; 
        System.out.print("Please enter a number: ");
        num = sc.nextInt();
        boolean perf;
        String facts = "";
        for(int i = 1; i < num; i++) {
            if(num% i == 0) {
                facts = facts + i + ", ";
                count++;
            }
        }

        System.out.println("Factors of " + num + " are: ");
        System.out.println(facts);
        System.out.println(num + " has " + count + " factors");
        perf = perfect(num, facts);
        if(perf) {
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number ");
        }

        if(facts.length() <= 3) { 
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }

    public static boolean perfect(int num, String facts) {
        String[] f = facts.split(", ");
        int total=0;
        for(int i = 0; i < f.length; i++) {
            total += Integer.parseInt(f[i]);
        }
        return total == num ? true : false;
    }
}