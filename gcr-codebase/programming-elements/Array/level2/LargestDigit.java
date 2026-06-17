package ArrayPracticeQuestions.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong(); // long in case number is large

        if (num <= 0) {
            System.out.println("Invalid! Enter a positive number.");
            sc.close();
            return;
        }

        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int idx = 0;

        // extract digits
        while (num > 0) {
            int d = (int)(num % 10);

            // expand array if full
            if (idx == maxDigit) {
                maxDigit += 10; // increase size
                int[] temp = new int[maxDigit];
                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i];
                }
                arr = temp; // assign new array
            }

            arr[idx] = d;
            idx++;
            num /= 10;
        }

        // find largest & second largest
        int first = 0, second = 0;
        for (int i = 0; i < idx; i++) {
            int d = arr[i];
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }

        // output
        System.out.println("Largest digit = " + first);
        System.out.println("Second largest digit = " + second);

        sc.close();
    }
    
}
