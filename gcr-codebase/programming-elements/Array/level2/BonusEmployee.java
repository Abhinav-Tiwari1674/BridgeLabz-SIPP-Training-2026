package ArrayPracticeQuestions.level2;

import java.util.Scanner;

public class BonusEmployee {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; 
        double[] sal = new double[n];
        double[] yrs = new double[n];
        double[] bon = new double[n];
        double[] newSal = new double[n];

        double sumOld = 0, sumNew = 0, sumBon = 0;

        // input details
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i+1));
            System.out.print("Salary: ");
            double s = sc.nextDouble();
            System.out.print("Years of service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, try again.");
                i--;
                continue;
            }
            sal[i] = s;
            yrs[i] = y;
        }

        // calc bonus and new salary
        for (int i = 0; i < n; i++) {
            if (yrs[i] > 5) {
                bon[i] = sal[i] * 0.05;
            } else {
                bon[i] = sal[i] * 0.02;
            }
            newSal[i] = sal[i] + bon[i];

            sumOld += sal[i];
            sumNew += newSal[i];
            sumBon += bon[i];
        }

        // output
        System.out.println("\n--- Salary Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Emp" + (i+1) + " | Old: " + sal[i] + " | Bonus: " + bon[i] + " | New: " + newSal[i]);
        }

        System.out.println("\nTotal Old Salary: " + sumOld);
        System.out.println("Total Bonus: " + sumBon);
        System.out.println("Total New Salary: " + sumNew);

        sc.close();
    }
}
