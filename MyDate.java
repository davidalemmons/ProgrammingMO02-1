import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor for the current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // Constructor with specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Getter method for month
    public int getMonth() {
        return month;
    }

    // Getter method for day
    public int getDay() {
        return day;
    }

    // Method to set a new date based on elapsed time
    public void setDate(long elapsedTime) {
        // Create a GregorianCalendar object
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        // Extract year, month, and day from the GregorianCalendar object
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Test program
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: " + currentDate.getYear() + "-"
                + (currentDate.getMonth() + 1) + "-" + currentDate.getDay());

        // Create a MyDate object with specified elapsed time
        MyDate customDate = new MyDate(34355555133101L);
        System.out.println("Custom Date: " + customDate.getYear() + "-"
                + (customDate.getMonth() + 1) + "-" + customDate.getDay());
    }
}
