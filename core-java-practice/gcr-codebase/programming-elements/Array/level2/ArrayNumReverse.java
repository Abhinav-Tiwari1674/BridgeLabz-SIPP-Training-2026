package ArrayPracticeQuestions.level2;

import java.util.Scanner;

public class ArrayNumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        if (num < 0) {
            System.out.println("Invalid! Please enter a positive number.");
            sc.close();
            return;
        }

        // Step 2: Count digits
        long temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 4: Create reverse array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed array
        System.out.print("Reversed number: ");
        for (int d : reversed) {
            System.out.print(d);
        }

        sc.close();
    }    
    
}
