
import java.util.*;

public class TestDate {
    // Scanner object for which entire class needs access
    private static Scanner keyboard = new Scanner(System.in);

    // ask user to enter Date and return it
    public static Date enterDate(String text) {
        System.out.print("Enter " + text + " date, year-space-month-space-day: ");
        int year = keyboard.nextInt();
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        Date dateObject = new Date(1, 1, 1);
        dateObject.setYear(year);
        dateObject.setMonth(month);
        dateObject.setDay(day);
        return dateObject;
    }

    public static void main(String[] args) {
        // use date of final exam to test constructor and getter/toString() methods
        Date finalDate = new Date(2032, 2, 29);

        System.out.println("Date of final: " + finalDate);
        System.out.println("Date in European style: " + finalDate.toStringEuro());
        System.out.println("Date in long form: " + finalDate.toStringLong());
        // try "getter" methods and put the answers together for printing
        int gotMonth = finalDate.getMonth();
        int gotDay = finalDate.getDay();
        int gotYear = finalDate.getYear();
        Date testGetDate = new Date(gotYear, gotMonth, gotDay);
        System.out.println("After using \"getters\", date of final is " + testGetDate);

        // Ask the user for 2 days, and test equals each time
        // Loop runs twice
        System.out.println("Testing equals() method ...");
        for (int i = 0; i < 2; i++) {
            Date firstDate = enterDate("first");
            Date secondDate = enterDate("second");
            if (firstDate.equals(secondDate))
                System.out.println("The two dates are equal");
            else
                System.out.println("The two dates are different");
        }

        // test adding days to an original date
        System.out.println("Testing adding days to a date ...");
        Date inputDate = enterDate("original");

        // ask how many days to add
        System.out.print("Enter # of days to add to this date (must be positive): ");
        int daysToAdd = keyboard.nextInt();

        Date afterAdded = inputDate.plus(daysToAdd);
        System.out.println(daysToAdd + " days added to " + inputDate + " is " + afterAdded);
    }
}
