package ControlFlowPractices.Level1;

import java.util.Scanner;

public class SumUntilNon0OrNeg {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double n = sc.nextDouble();
            if (n <= 0) break;
            total += n;
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
    
}
