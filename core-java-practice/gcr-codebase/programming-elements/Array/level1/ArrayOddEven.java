package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class ArrayOddEven {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Not a natural number!");
            sc.close();
            return;
        }

        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];
        int oi = 0, ei = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[ei++] = i;
            } else {
                odd[oi++] = i;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");

        sc.close();
    }
    
}
