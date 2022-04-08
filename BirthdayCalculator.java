import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Program shows usage of LocalDate. 
public class BirthdayCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean cont = true;//used to continue with the while loop
        LocalDate userBirthday = LocalDate.now();//gets the current date
        while(cont) {
            try {
                System.out.print("Please enter your birthday: ");
                String bday = sc.nextLine();
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");//hopefully the user enters the date like most americans do
                userBirthday = LocalDate.parse(bday, dateFormat);//get the string of input into a LocalDate
                cont = false;//if they make it this far, while loop is over
            } catch(Exception e) {
                System.out.println("Please enter a date in the following format: dd/mm/yyyy");
            }
        }
        System.out.println("You were born on a " + userBirthday.getDayOfWeek() + "!");

        LocalDate thisYear = userBirthday.withYear(2022);//find the date of the users birthday this year
        System.out.println("This year your birthday falls on a " + thisYear.getDayOfWeek()); //prints the day of the week 
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), thisYear); //days between the users birthday and today.
        int userAge = 0;
        if(daysLeft < 0) {//if their birthday has already passed this year
            daysLeft += 365;
            userAge = 2023 - userBirthday.getYear(); //get users age for next year
        }
        else {
            userAge = 2022 - userBirthday.getYear();//get users age for this years birthday
        }
        System.out.println("And since today is " + LocalDate.now().toString() + 
        ", that means theres only " + daysLeft + " days left!");

        System.out.println("I bet you can't wait to be " + userAge + "! ");

        sc.close();//no resource leaks
    }
}