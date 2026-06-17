package ControlFlowPractices.level3;

import java.util.Scanner;

public class DayOfWeek {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year (e.g. 2025): ");
        int y = sc.nextInt();

        // Calculate y0
        int y0 = y - (14 - m) / 12;

        // Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of week
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output result
        System.out.println("Day of Week (0=Sunday, 1=Monday, ..., 6=Saturday): " + d0);

        sc.close();
    }
}
