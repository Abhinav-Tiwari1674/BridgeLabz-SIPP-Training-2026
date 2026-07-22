package ControlFlowPractices.level3;

import java.util.Scanner;

public class HarshadNum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        // Sum of digits
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check divisibility
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }

        sc.close();
    }
    
}
