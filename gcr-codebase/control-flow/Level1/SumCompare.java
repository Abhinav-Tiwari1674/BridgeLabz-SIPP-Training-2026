package ControlFlowPractices.Level1;

import java.util.Scanner;

public class SumCompare {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // Using formula
            int sumFormula = n * (n + 1) / 2;

            // Using while loop
            int sumLoop = 0;
            int i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using loop    = " + sumLoop);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        sc.close();
    }
}
