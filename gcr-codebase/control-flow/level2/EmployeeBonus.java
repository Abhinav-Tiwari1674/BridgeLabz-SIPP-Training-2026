package ControlFlowPractices.level2;

import java.util.Scanner;

public class EmployeeBonus {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        int yrs = sc.nextInt();

        if (yrs > 5) {
            double bonus = sal * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus");
        }

        sc.close();
    }
    
}
