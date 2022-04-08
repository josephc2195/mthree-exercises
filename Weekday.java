import java.util.*;
public class Weekday {
    public enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the current day of the week: ");
        String today = sc.nextLine();

        Days dayTilFriday = Days.valueOf(today.toUpperCase());
        
        
        switch(dayTilFriday) {
            case MONDAY:
                System.out.print("Days until friday: 4");
                break;
            case TUESDAY:
                System.out.print("Days until friday: 3");
                break;
            case WEDNESDAY:
                System.out.print("Days until friday: 2");
                break;
            case THURSDAY:
                System.out.print("Days until friday: 1");
                break;
            case FRIDAY:
                System.out.print("Days until friday: IT IS FRIDAY!!");
                break;
            case SATURDAY:
                System.out.print("Days until friday: 6");
                break;
            case SUNDAY:
                System.out.print("Days until friday: 5");
                break;

        }
        sc.close();
    }
}