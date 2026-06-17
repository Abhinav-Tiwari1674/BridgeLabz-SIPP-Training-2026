package JavaMethods.level3;

import java.util.Scanner;

public class CalenderDisplay {
     // Array to store month names
    private static final String[] MONTHS = { 
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December" 
    };

    // Array to store number of days in each month (non-leap year)
    private static final int[] DAYS = { 
        31, 28, 31, 30, 31, 30, 
        31, 31, 30, 31, 30, 31 
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return DAYS[month - 1];
        }
    }

    // Method to get month name
    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Method to get first day of the month (0=Sun, 1=Mon,...6=Sat)
    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int q = 1; // day of month
        int h = (q + (13*(m+1))/5 + k + (k/4) + (j/4) + 5*j) % 7;
        int day = ((h + 6) % 7); // convert 0=Sat to 0=Sun
        return day;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n    " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
    
}
