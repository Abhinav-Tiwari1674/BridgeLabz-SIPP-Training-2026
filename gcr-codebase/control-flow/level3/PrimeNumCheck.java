package ControlFlowPractices.level3;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Prime check variable
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit if divisible
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        // Close Scanner
        sc.close();
    }
    
}
