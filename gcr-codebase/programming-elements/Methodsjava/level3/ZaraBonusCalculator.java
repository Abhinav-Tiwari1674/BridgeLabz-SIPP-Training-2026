package JavaMethods.level3;

import java.util.Random;

public class ZaraBonusCalculator {
      // Method to generate salary (5-digit) and years of service (1-10)
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, years]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // salary 10000-99999
            data[i][1] = rand.nextInt(10) + 1;        // years 1-10
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] empData) {
        int numEmployees = empData.length;
        double[][] result = new double[numEmployees][2]; // [newSalary, bonus]

        for (int i = 0; i < numEmployees; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display tabular format
    public static void displayResults(int[][] empData, double[][] newData) {
        int numEmployees = empData.length;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "EmpNo", "OldSal", "Years", "Bonus", "NewSal");

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", i+1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("\nTotals:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] empData = generateEmployeeData(numEmployees);
        double[][] newData = calculateNewSalaryAndBonus(empData);
        displayResults(empData, newData);
    }
}
