package ControlFlowPractices.level3;

import java.util.Scanner;

public class BmiCalculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double h = sc.nextDouble();

        // Convert height to meters
        double hm = h / 100.0;

        // Calculate BMI
        double bmi = w / (hm * hm);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output results
        System.out.printf("\nBMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
