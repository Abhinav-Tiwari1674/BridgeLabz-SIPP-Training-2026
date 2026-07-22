package ControlFlowPractices.level3;

import java.util.Scanner;

public class LeapYear {
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
            // Apply Leap Year rules using multiple if-else
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        // Close Scanner
        sc.close();
    }
    
}
