package ControlFlowPractices.level3;

import java.util.Scanner;

public class LeapYearLogic {
        public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get year input from user
        System.out.print("Enter year (>= 1582): ");
        int year = sc.nextInt();

        // Validate year for Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            // Use logical && and || operators in one condition
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        // Close Scanner
        sc.close();
    }
    
}
