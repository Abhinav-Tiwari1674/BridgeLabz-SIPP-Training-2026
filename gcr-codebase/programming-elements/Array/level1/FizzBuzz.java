package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class FizzBuzz {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Invalid number!");
            sc.close();
            return;
        }

        String[] res = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) res[i] = "FizzBuzz";
            else if (i % 3 == 0) res[i] = "Fizz";
            else if (i % 5 == 0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Position " + i + " = " + res[i]);
        }

        sc.close();
    }
    
}
