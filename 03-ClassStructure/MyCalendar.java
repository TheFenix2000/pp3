import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyCalendar {

    // Static integer fields
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    // Method to return the date as a string in the format yyyy-mm-dd
    public static String myDate() {
        // Using LocalDate to format the date
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatter);
    }

    // Method to return the number of days passed from the beginning of the year
    public static int days() {
        // Using LocalDate to calculate the days
        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate currentDate = LocalDate.of(year, month, day);
        return currentDate.getDayOfYear() - date.getDayOfYear() + 1;
    }

    // Method to return the month name
    public static String monthName() {
        // Using LocalDate to get the month name
        LocalDate date = LocalDate.of(year, month, 1);
        return date.getMonth().name();
    }
}
