package JavaMethods.level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {
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

    // method to find sum of digits
    public static int sumOfDigits(int[] d) {
        int sum = 0;
        for (int x : d) sum += x;
        return sum;
    }

    // method to find sum of squares of digits
    public static int sumOfSquares(int[] d) {
        int sum = 0;
        for (int x : d) sum += Math.pow(x, 2);
        return sum;
    }

    // method to check Harshad number
    public static boolean isHarshad(int num, int[] d) {
        int sum = sumOfDigits(d);
        return num % sum == 0;
    }

    // method to find frequency of digits using 2D array
    public static int[][] digitFrequency(int[] d) {
        int[] freq = new int[10]; // digits 0-9
        for (int x : d) freq[x]++;

        // count unique digits
        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        int[][] result = new int[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        int[] digits = getDigits(num);

        System.out.println("\nCount of digits: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSq);

        System.out.println("Harshad Number? " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies (digit : count): ");
        for (int[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }

        sc.close();
    }
    
}
