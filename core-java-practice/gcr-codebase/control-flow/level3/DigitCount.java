package ControlFlowPractices.level3;

import java.util.Scanner;

public class DigitCount {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        // Loop until number becomes zero
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + num + " = " + count);

        sc.close();
    }
    
}
