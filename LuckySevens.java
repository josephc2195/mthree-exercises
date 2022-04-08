import java.util.Random;
import java.util.Scanner;

/**
 * Play a game of lucky sevens.
 * Once you start you dont finish until you are broke, sorry!
 * @author: Joseph Chica
 */
public class LuckySevens {
    //Main method
    public static void main(String[] args) {
        double bet, max;
        int sum, rollsToFinish = 0, rollsToMax=0; 
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        //input: how much money user is starting with
        System.out.print("How many dollars do you have? ");
        bet = sc.nextDouble();
        max = bet;

        //while user has money, this loop will continue
        while(bet != 0) {
            sum = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
            if(sum == 7) {
                bet += 4;
            }
            else {
                bet -= 1;
            }
            rollsToFinish++;

            if(max < bet) {
                max = bet;
                rollsToMax = rollsToFinish;
            }
    
            
        }

        System.out.println("You are broke after " + rollsToFinish + " rolls");
        System.out.println("You should have quit after " + rollsToMax + " rolls");
        System.out.println("You had $" + max + " at that point");
        
        
        sc.close();
    }
}