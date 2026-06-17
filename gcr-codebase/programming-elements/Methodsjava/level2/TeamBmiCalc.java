package JavaMethods.level2;

import java.util.Scanner;

public class TeamBmiCalc {
     // Method to compute BMI
    public static double calcBMI(double w, double hCm) {
        double hM = hCm / 100.0;   // convert cm → m
        return w / (hM * hM);
    }

    // Method to return BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // col0=weight, col1=height(cm), col2=BMI
        String[] status = new String[10];

        // Input weight & height, compute BMI
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calcBMI(data[i][0], data[i][1]); // store BMI
            status[i] = getStatus(data[i][2]);            // store status
        }

        // Display all results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
    
}
