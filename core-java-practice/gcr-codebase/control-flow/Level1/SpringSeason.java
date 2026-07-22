package ControlFlowPractices.Level1;

import java.util.Scanner;

public class SpringSeason {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int m = sc.nextInt();
        int d = sc.nextInt();

        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
    
}
