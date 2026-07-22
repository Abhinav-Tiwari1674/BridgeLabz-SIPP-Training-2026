package ArrayPracticeQuestions.level2;

import java.util.Scanner;

public class FrerquencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();   // using long for large numbers

        // Step 2: Count digits
        String numStr = Long.toString(num);
        int length = numStr.length();

        // Step 3: Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char → int
        }

        // Step 4: Frequency array of size 10
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display frequency
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }

        sc.close();
    }
}
