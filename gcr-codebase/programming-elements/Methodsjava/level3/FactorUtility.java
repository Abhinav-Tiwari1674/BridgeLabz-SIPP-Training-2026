package JavaMethods.level3;

import java.util.Scanner;

public class FactorUtility {
     // Method to return all factors of a number as an array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Second loop: store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor from factors array
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static long getProductOfCubes(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= (long) Math.pow(f, 3); // cube of factor
        }
        return product;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("\nFactors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nGreatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + getProductOfCubes(factors));

        sc.close();
    }
}
