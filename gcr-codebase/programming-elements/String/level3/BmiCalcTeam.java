package JavaString.level3;

import java.util.Scanner;

public class BmiCalcTeam {
        // Method to take user input of height and weight
    public static double[][] takeInputForTeam(int members) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[members][2]; // [weight, height(cm)]

        for (int i = 0; i < members; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }
        return teamData;
    }

    // Method to calculate BMI value for a person
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100; // convert cm to meters
        return weight / (heightMeters * heightMeters);
    }

    // Method to get BMI status based on BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to compute BMI and status for all members
    public static String[][] computeBMIForTeam(double[][] teamData) {
        String[][] result = new String[teamData.length][4]; // [Weight, Height, BMI, Status]

        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            double bmi = calculateBMI(weight, height);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0); // round to 2 decimals
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }

    // Method to display the final BMI Report
    public static void displayBMIReport(String[][] bmiData) {
        System.out.println("\n--- Team BMI Report ---");
        System.out.println("Weight(kg)  Height(cm)  BMI  Status");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(bmiData[i][0] + "   " + bmiData[i][1] + "   " + bmiData[i][2] + "   " + bmiData[i][3]);
        }
    }

    // Main function
    public static void main(String[] args) {
        int teamMembers = 10;

        // Step 1: Take input
        double[][] teamData = takeInputForTeam(teamMembers);

        // Step 2: Compute BMI and Status
        String[][] bmiReport = computeBMIForTeam(teamData);

        // Step 3: Display result
        displayBMIReport(bmiReport);
    }
    
}
