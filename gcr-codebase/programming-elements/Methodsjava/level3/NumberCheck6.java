package JavaMethods.level3;

import java.util.Scanner;

public class NumberCheck6 {
       // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor (for num > 1)
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (num == 1) ? 0 : sum; // Special case for 1
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfDivisors(num) == num;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfDivisors(num) > num;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfDivisors(num) < num;
    }

    // Helper: Factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nChecking number: " + num);
        System.out.println("Perfect Number? " + isPerfect(num));
        System.out.println("Abundant Number? " + isAbundant(num));
        System.out.println("Deficient Number? " + isDeficient(num));
        System.out.println("Strong Number? " + isStrong(num));

        sc.close();
    }
}
