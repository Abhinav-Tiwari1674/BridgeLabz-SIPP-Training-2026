package ControlFlowPractices.Level1;

import java.util.Scanner;

public class CountFor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int c = sc.nextInt();

        for (int i = c; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
