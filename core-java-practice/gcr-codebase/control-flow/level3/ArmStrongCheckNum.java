package ControlFlowPractices.level3;

import java.util.Scanner;

public class ArmStrongCheckNum {
        public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Save original number
        int orig = num;
        int sum = 0;

        // Loop to find cube of digits
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        // Check Armstrong condition
        if (sum == orig) {
            System.out.println(orig + " is an Armstrong Number.");
        } else {
            System.out.println(orig + " is NOT an Armstrong Number.");
        }

        // Close Scanner
        sc.close();
    }
    
}
