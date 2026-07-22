package ControlFlowPractices.Level1;

import java.util.Scanner;

public class CountWhile {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int c = sc.nextInt();

        while (c >= 1) {
            System.out.println(c);
            c--;
        }
        sc.close();
    }
}
