package JavaMethods.level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
      // method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // method to store digits into array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            d[i] = s.charAt(i) - '0';
        }
        return d;
    }

    // method to check Duck number
    public static boolean isDuck(int[] d) {
        for (int i = 1; i < d.length; i++) { // skip first digit
            if (d[i] == 0) return true;
        }
        return false;
    }

    // method to check Armstrong number
    public static boolean isArmstrong(int[] d) {
        int n = d.length;
        int sum = 0;
        for (int x : d) {
            sum += Math.pow(x, n);
        }
        int num = 0;
        for (int x : d) num = num * 10 + x;
        return sum == num;
    }

    // method to find largest and second largest
    public static int[] largestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }
        return new int[]{first, second};
    }

    // method to find smallest and second smallest
    public static int[] smallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second && x != first) {
                second = x;
            }
        }
        return new int[]{first, second};
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        int[] digits = getDigits(num);

        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Duck Number? " + isDuck(digits));
        System.out.println("Armstrong Number? " + isArmstrong(digits));

        int[] largest = largestTwo(digits);
        System.out.println("Largest = " + largest[0] + ", Second Largest = " + largest[1]);

        int[] smallest = smallestTwo(digits);
        System.out.println("Smallest = " + smallest[0] + ", Second Smallest = " + smallest[1]);

        sc.close();
    }
}
